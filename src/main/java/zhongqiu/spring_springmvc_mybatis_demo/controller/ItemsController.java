package zhongqiu.spring_springmvc_mybatis_demo.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zhongqiu.spring_springmvc_mybatis_demo.po.Items;
import zhongqiu.spring_springmvc_mybatis_demo.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@Resource
	private ItemsService itemsService;

	// 欢迎
	@RequestMapping("hello")
	public String hello() {
		System.out.println("11111111111111");
		return "hello";
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
		return "redirect: list.do";
	}
}