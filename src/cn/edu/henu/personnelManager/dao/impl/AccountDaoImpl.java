package cn.edu.henu.personnelManager.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.AccountDao;
import cn.edu.henu.personnelManager.dao.abs.SuperDao;
import cn.edu.henu.personnelManager.model.AccountItem;
@Component("accountDao")
public class AccountDaoImpl extends SuperDao implements AccountDao{

	@Override
	public boolean addAccount(AccountItem item) {
		try{
			this.getHibernateTemplate().save(item);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteAccount(AccountItem item) {
		try{
			this.getHibernateTemplate().delete(item);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteAccount(int id) {
		try{
			HibernateTemplate ht = this.getHibernateTemplate();
			ht.delete((AccountItem)ht.get(AccountItem.class, id));
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public AccountItem getAccount(int id) {
		AccountItem item ;
		try{
			item = this.getHibernateTemplate().get(AccountItem.class, id);
		}catch(Exception e){
			return null;
		}
		return item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AccountItem> getAllAccount() {
		List<AccountItem> items;
		try{
			String hql = "from cn.edu.henu.personnelManager.model.AccountItem";
			items = this.getHibernateTemplate().find(hql);
		}catch(Exception e){
			return null;
		}
		return items;
	}

}
