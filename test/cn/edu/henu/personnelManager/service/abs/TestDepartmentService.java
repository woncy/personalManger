package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.henu.personnelManager.model.Department;

public class TestDepartmentService {
	static ClassPathXmlApplicationContext ctx;
	static DepartmentService deptService;
	
	@BeforeClass
	public static void beforeClass(){

		ctx = new ClassPathXmlApplicationContext("beans.xml");
		deptService = (DepartmentService) ctx.getBean("departmentService");
	}
	@AfterClass
	public static void afterClass(){
		ctx.close();
	}
	@Test
	public void testAddDepartmentByNameAndUpdept(){
		
		
//		deptService.addDepartmentByNameAndUpDept("开发部", null);
//		deptService.addDepartmentByNameAndUpDept("人事部", null);
//		deptService.addDepartmentByNameAndUpDept("销售部", null);
//		deptService.addDepartmentByNameAndUpDept("经理办公室", null);
		Department dept =deptService.getDepartmentById(61);
		deptService.addDepartmentByNameAndUpDept("JAVA", dept);
		deptService.addDepartmentByNameAndUpDept("C++", dept);
		deptService.addDepartmentByNameAndUpDept("软件工程", dept);
		deptService.addDepartmentByNameAndUpDept("软件测试", dept);
		
		
		
	}
	@Test
	public void testDeleteDepartmentById(){
		deptService.deleteDepartmentById(29);
	}
	@Test
	public void testGetAllDepartment(){
		List<Department>depts = deptService.getAllDepartment();
		System.out.println(depts);
	}
	@Test
	public void testGetDepartmentsByName(){
		String name="开发部";
		List<Department>depts = deptService.getAllDepartmentByName(name);
		System.out.println(depts);
	}
	
}
