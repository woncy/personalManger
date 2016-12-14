package cn.edu.henu.personnelManager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="tb_dept")
public class Department implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String dept_name;
	private Department department;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	
	@Column(nullable=false,length=60)
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	@ManyToOne(fetch=FetchType.EAGER)
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Department [dept_name=" + dept_name + "]";
	}
	
	
	

}
