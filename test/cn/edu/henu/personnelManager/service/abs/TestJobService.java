package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.henu.personnelManager.model.Department;
import cn.edu.henu.personnelManager.model.Job;

public class TestJobService {
	static ClassPathXmlApplicationContext ctx;
	static JobService jobService;
	
	@BeforeClass
	public static void beforeClass(){

		ctx = new ClassPathXmlApplicationContext("beans.xml");
		jobService = (JobService) ctx.getBean("jobService");
	}
	@AfterClass
	public static void afterClass(){
		ctx.close();
	}
	
	@Test
	public void testAdd(){
		DepartmentService deptService = (DepartmentService) ctx.getBean("departmentService");
		List<Department> depts = deptService.getAllDepartment();
		for(Department dept:depts){
			Job j = new Job();
			j.setDepartment(dept);
			j.setJob_name("经理");
			jobService.addJob(j);
			
			Job j2 = new Job();
			j2.setDepartment(dept);
			j2.setJob_name("职员");
			jobService.addJob(j2);
			
			if(dept.getDepartment() != null){
				Job job = new Job();
				job.setDepartment(dept);
				job.setJob_name(dept+"初级");
				
				Job job2 = new Job();
				job2.setDepartment(dept);
				job2.setJob_name(dept+"中级");
				
				Job job3 = new Job();
				job3.setDepartment(dept);
				job3.setJob_name(dept+"高级");
				
				Job job4 = new Job();
				job4.setDepartment(dept);
				job4.setJob_name(dept+"实习生");
				
				
				jobService.addJob(job);
				jobService.addJob(job2);
				jobService.addJob(job3);
				jobService.addJob(job4);
			}
			
			

			System.out.println(dept);
		}
		
	}
	@Test
	public void testGetAllJobByDeptName(){
		String name="JAVA";
		List<Job> jobs = jobService.getAllJobByDeptName(name);
		System.out.println(jobs);
	}
}
