package cn.edu.henu.personnelManager.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.JobDao;
import cn.edu.henu.personnelManager.dao.abs.SuperDao;
import cn.edu.henu.personnelManager.model.Department;
import cn.edu.henu.personnelManager.model.Job;

@Component("jobDao")
public class JobDaoImpl extends SuperDao implements JobDao{

	@Override
	public boolean addJob(Job job) {
		try{
			this.getHibernateTemplate().save(job);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public Job getJob(int id) {
		Job job = null;
		try{
			job = this.getHibernateTemplate().get(Job.class, id);
		}catch(Exception e){
			return null;
		}
		return job;
	}

	@Override
	public boolean deleteJob(int id) {
		try{
			Job job = this.getHibernateTemplate().get(Job.class, id);
			this.getHibernateTemplate().delete(job);
		}catch(Exception e ){
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Job> getAllJob() {
		List<Job> jobs = null;
		try{
			jobs = this.getHibernateTemplate().find("from cn.edu.henu.personnelManager.model.Job");
			
		}catch(Exception e){
			return null;
		}
		return jobs;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Job> getAllJobByDeptName(String deptName) {
		List<Job> jobs = null;
		try{
			Department dept = new Department();
			dept.setDept_name(deptName);
			dept = (Department) this.getHibernateTemplate().findByExample(dept).get(0);
			String hql = "from cn.edu.henu.personnelManager.model.Job as job where job.department=:dept";
			jobs = this.getHibernateTemplate().findByNamedParam(hql, "dept", dept);
		}catch(Exception e){
			return null;
		}
		return jobs;
	}

}
