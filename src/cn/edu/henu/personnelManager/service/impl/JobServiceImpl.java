package cn.edu.henu.personnelManager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.JobDao;
import cn.edu.henu.personnelManager.model.Job;
import cn.edu.henu.personnelManager.service.abs.JobService;
@Component("jobService")
public class JobServiceImpl implements JobService {

	JobDao jobDao;
	
	public JobDao getJobDao() {
		return jobDao;
	}
	@Resource
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	@Override
	public Job getJob(int id) {
		return jobDao.getJob(id);
	}

	@Override
	public boolean deleteJob(int id) {
		return jobDao.deleteJob(id);
	}

	@Override
	public List<Job> getAllJob() {
		return jobDao.getAllJob();
	}

	@Override
	public List<Job> getAllJobByDeptName(String deptName) {
		return jobDao.getAllJobByDeptName(deptName);
	}

	@Override
	public boolean addJob(Job job) {
		return jobDao.addJob(job);
	}

}
