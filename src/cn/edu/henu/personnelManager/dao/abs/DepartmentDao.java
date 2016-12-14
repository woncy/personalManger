package cn.edu.henu.personnelManager.dao.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.Department;
import cn.edu.henu.personnelManager.model.Dept;

public interface DepartmentDao{
	public boolean addDepartmentByNameAndUpDept(Dept dept,Department department);
	public boolean deleteDepartmentById(int id);
	public List<Department> getDepartmentsByDept(Dept dept);
	public Department getDepartmentById(int id);
	public List<Department> getAllDepartment();
	public List<Department> getAllDepartmentByName(String name);
	public boolean addDepartmentByNameAndUpDept(String name,Department department);
}
