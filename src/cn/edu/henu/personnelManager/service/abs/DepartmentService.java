package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import cn.edu.henu.personnelManager.model.Department;
import cn.edu.henu.personnelManager.model.Dept;

public interface DepartmentService {
	public boolean addDepartMentByNameAndUpDept(Dept dept,Department department);
	public boolean deleteDepartmentById(int id);
	public List<Department> getDepartmentsByDept(Dept dept);
	public Department getDepartmentById(int id);
	public List<Department> getAllDepartment();
	public List<Department> getAllDepartmentByName(String name);
	public boolean addDepartmentByNameAndUpDept(String name,Department department);
}
