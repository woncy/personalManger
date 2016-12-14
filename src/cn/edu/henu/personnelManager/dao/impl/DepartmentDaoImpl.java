package cn.edu.henu.personnelManager.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.edu.henu.personnelManager.dao.abs.DepartmentDao;
import cn.edu.henu.personnelManager.dao.abs.SuperDao;
import cn.edu.henu.personnelManager.model.Department;
import cn.edu.henu.personnelManager.model.Dept;
@Component("departmentDao")
public class DepartmentDaoImpl extends SuperDao implements DepartmentDao {

	@Override
	public boolean addDepartmentByNameAndUpDept(Dept dept,
			Department department) {
		String dept_name = "";
		if(dept == Dept.DEVELOP_DEPT){
			dept_name="开发部";
		}else if(dept == Dept.SALES_DEPT){
			dept_name="销售部";
		}else if(dept == Dept.MANA_OFICE){
			dept_name="经理办公室";
		}else if(dept == Dept.PERSON_DEPT){
			dept_name="人事部";
		}else{
			return false;
		}
		
		return this.addDepartmentByNameAndUpDept(dept_name, department);
		
	}

	@Override
	public boolean deleteDepartmentById(int id) {
		try{
			Department dept = this.getHibernateTemplate().get(Department.class, id);
			this.getHibernateTemplate().delete(dept);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getDepartmentsByDept(Dept dept) {

		List<Department> depts = null;
		String dept_name = "";
		if(dept == Dept.DEVELOP_DEPT){
			dept_name="开发部";
		}else if(dept == Dept.SALES_DEPT){
			dept_name="销售部";
		}else if(dept == Dept.MANA_OFICE){
			dept_name="经理办公室";
		}else if(dept == Dept.PERSON_DEPT){
			dept_name="人事部";
		}else{
			return null;
		}
		Department department = new Department();
		department.setDept_name(dept_name);
		try{
			depts = this.getHibernateTemplate().findByExample(department);
		}catch(Exception e){
			return null;
		}
		
		return depts;
	}

	@Override
	public Department getDepartmentById(int id) {
		Department department = null;
		try{
			department = this.getHibernateTemplate().get(Department.class, id);
		}catch(Exception e){
			return null;
		}
		return department;
	}

	@Override
	public boolean addDepartmentByNameAndUpDept(String name,
			Department department) {
		Department department2 = new Department();
		if(department!=null)
			department2.setDepartment(department);
		department2.setDept_name(name);
		
		try{
			this.getHibernateTemplate().save(department2);
		}catch(Exception e){
			return false;
		}
		
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getAllDepartment() {
		List<Department> depts = null;
		try{
			depts = this.getHibernateTemplate().find("from cn.edu.henu.personnelManager.model.Department");
		}catch(Exception e){
			return null;
		}
		return depts;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Department> getAllDepartmentByName(String name) {
		List<Department> depts = null;
		Department deptment = new Department();
		deptment.setDept_name(name);
		
		try{
			List<Department> depts2 = this.getHibernateTemplate().findByExample(deptment);
			if(depts2 != null){
				Department department3 = new Department();
				department3.setDepartment(depts2.get(0));
				depts = this.getHibernateTemplate().findByExample(department3);
			}
		}catch(Exception e){
			return null;
		}
		return depts;
	}


}
