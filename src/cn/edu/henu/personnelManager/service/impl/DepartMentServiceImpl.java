package cn.edu.henu.personnelManager.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.DepartmentDao;
import cn.edu.henu.personnelManager.model.Department;
import cn.edu.henu.personnelManager.model.Dept;
import cn.edu.henu.personnelManager.service.abs.DepartmentService;
@Component("departmentService")
public class DepartMentServiceImpl implements DepartmentService{
	DepartmentDao departmentDao;

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	@Resource(name="departmentDao")
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	@Override
	public boolean addDepartMentByNameAndUpDept(Dept dept, Department department) {
		
		return departmentDao.addDepartmentByNameAndUpDept(dept, department);
	}

	@Override
	public boolean deleteDepartmentById(int id) {
		
		return departmentDao.deleteDepartmentById(id);
	}

	@Override
	public List<Department> getDepartmentsByDept(Dept dept) {
		// TODO 自动生成的方法存根
		return departmentDao.getDepartmentsByDept(dept);
	}

	@Override
	public Department getDepartmentById(int id) {
	
		return departmentDao.getDepartmentById(id);
	}

	@Override
	public List<Department> getAllDepartment() {
		
		return departmentDao.getAllDepartment();
	}

	@Override
	public List<Department> getAllDepartmentByName(String name) {
		return departmentDao.getAllDepartmentByName(name);
	}

	@Override
	public boolean addDepartmentByNameAndUpDept(String name,
			Department department) {
		
		return departmentDao.addDepartmentByNameAndUpDept(name, department);
	}
	
}
