package zhongqiu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import zhongqiu.interceptor.AuthCheck;
import zhongqiu.po.Items;
import zhongqiu.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@Resource
	private ItemsService itemsService;

	// 欢迎
	@AuthCheck(type = "user", write = false)
	@RequestMapping("hello")
	public String hello() {
		System.out.println("11111111111111");
		return "hello";
	}

	@RequestMapping(value = "manager/login.do", method = RequestMethod.GET)
	public ModelAndView login(HttpSession httpSession) {
		httpSession.setAttribute("manager", "manager");
		return new ModelAndView(new RedirectView("../admin/main.jsp"));
	}

	@RequestMapping(value = "manager/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.getAttribute("manager");
		return "success";
	}

	// 查询所有商品
	@RequestMapping("list")
	public String list(Model model) {
		System.out.println("11111111111111");
		List<Items> list = itemsService.findAll();

		model.addAttribute("itemsList", list);

		return "itemsList";

	}

	// 跳转到修改页面
	@RequestMapping("edit")
	public String edit(Integer id, Model model) {

		// 根据Id查询商品
		Items items = itemsService.findByID(id);
		// 页面回显
		model.addAttribute("item", items);

		return "editItem";
	}

	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(Items items) {
		itemsService.saveOrUpdate(items);

		return "redirect:list.do";
	}

	// 根据Id进行删除
	@RequestMapping("deleteByID")
	public String deleteByID(Integer id) {
		itemsService.deleteByID(id);

		return "redirect: list.do";
	}

	// 批量删除
	@RequestMapping("deleteByIds")
	public String deleteByIds(Integer[] id) {
		if (id != null && id.length > 0) {
			for (Integer ids : id) {

				itemsService.deleteByID(ids);
			}
		}
		return "redirect:list.do";
	}
}