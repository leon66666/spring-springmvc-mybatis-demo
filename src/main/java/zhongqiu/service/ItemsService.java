package zhongqiu.service;

import java.util.List;

import zhongqiu.po.Items;


public interface ItemsService {

	List<Items> findAll();

	Items findByID(Integer id);

	void saveOrUpdate(Items items);

	void deleteByID(Integer id);

}
