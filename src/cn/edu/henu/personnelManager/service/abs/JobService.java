package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.Job;

public interface JobService {
	public Job getJob(int id);
	public boolean deleteJob(int id);
	public List<Job> getAllJob();
	public List<Job> getAllJobByDeptName(String deptName);
	public boolean addJob(Job job);
}
