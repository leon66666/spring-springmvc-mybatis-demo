package zhongqiu.spring_springmvc_mybatis_demo.service;

import java.util.List;

import zhongqiu.spring_springmvc_mybatis_demo.po.Items;


public interface ItemsService {

	List<Items> findAll();

	Items findByID(Integer id);

	void saveOrUpdate(Items items);

	void deleteByID(Integer id);

}
