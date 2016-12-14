package cn.edu.henu.personnelManager.dao.abs;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;

public abstract class SuperDao {
	private HibernateTemplate hibernateTemplate;

	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
