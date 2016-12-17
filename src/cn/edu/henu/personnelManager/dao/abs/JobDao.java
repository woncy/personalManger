package cn.edu.henu.personnelManager.dao.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.Job;

public interface JobDao {
	public Job getJob(int id);
	public boolean deleteJob(int id);
	public List<Job> getAllJob();
	public List<Job> getAllJobByDeptName(String deptName);
	public boolean addJob(Job job);
}
