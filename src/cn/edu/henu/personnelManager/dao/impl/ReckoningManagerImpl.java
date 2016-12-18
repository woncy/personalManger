package cn.edu.henu.personnelManager.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.ReckoningManager;
import cn.edu.henu.personnelManager.dao.abs.SuperDao;
import cn.edu.henu.personnelManager.model.Reckoning;
import cn.edu.henu.personnelManager.model.ReckoningInfo;
import cn.edu.henu.personnelManager.model.ReckoningList;
@Component("reckoningDao")
public class ReckoningManagerImpl extends SuperDao implements ReckoningManager {

	@Override
	public boolean addReckoning(ReckoningInfo info, Reckoning reckoning,
			ReckoningList list) {
		Session session = null;
		
		boolean b = false;
		try{
			Configuration config = new AnnotationConfiguration().configure();
			SessionFactory sf = config.buildSessionFactory();
			session = sf.openSession();
			session.beginTransaction();
			session.save(reckoning);
			session.save(list);
			session.save(info);
			session.getTransaction().commit();
			b = true;
		}catch(Exception e){
			return false;
		}finally{
			if(!b){
				if(session!=null){
					session.getTransaction().rollback();
				}
			}
			if(session!=null)
				session.close();
		}
		return true;
	}

	@Override
	public boolean updateReckoning(ReckoningInfo info, Reckoning reckoning,
			ReckoningList list) {
		Session session = null;
		
		boolean b = false;
		try{
			Configuration config = new AnnotationConfiguration().configure();
			SessionFactory sf = config.buildSessionFactory();
			session = sf.openSession();
			session.beginTransaction();
			session.update(reckoning);
			session.update(list);
			session.update(info);
			session.getTransaction().commit();
			b = true;
		}catch(Exception e){
			return false;
		}finally{
			if(!b){
				if(session!=null){
					session.getTransaction().rollback();
				}
			}
			if(session!=null)
				session.close();
		}
		return true;
	}

	@Override
	public ReckoningInfo getReckoningInfoById(int id) {
		ReckoningInfo  info =null;
		try{
			info = this.getHibernateTemplate().get(ReckoningInfo.class, id);
		}catch(Exception e){
			return null;
		}
		return info;
	}

	@Override
	public Reckoning getReckoningById(int id) {
		Reckoning info =null;
		try{
			info = this.getHibernateTemplate().get(Reckoning.class, id);
		}catch(Exception e){
			return null;
		}
		return info;
	}

	@Override
	public ReckoningList getReckoningListById(int id) {
		ReckoningList  info =null;
		try{
			info = this.getHibernateTemplate().get(ReckoningList.class, id);
		}catch(Exception e){
			return null;
		}
		return info;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reckoning> getAllReckoning() {
		List<Reckoning> recks ;
		try{
			String hql = "from cn.edu.henu.personnelManager.model.Reckoning";
			recks = this.getHibernateTemplate().find(hql);
		}catch(Exception e){
			return null;
		}
		return recks;
	}

}
