package cn.edu.henu.personnelManager.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name="tb_record")
public class Record implements Serializable{

	/**
	 * 档案实体类
	 */
	private static final long serialVersionUID = 1L;
	private int id;                      //id
	private String record_number;		 //档案编号
	private String name;				 //姓名
	private String sex;					 //性别
	private Date birthDay;               //生日
	private String photo;				 //照片地址
	private String ID_card;				 //身份证号
	private String marriaged;			 //婚姻
	private String address;				 //地址
	private String postalcode;			 //邮政编号
	private String party_member;		 //党员
	private String school_age;			 //学厉
	private String specialty;			 //专业
	private String foreign_language;	 //外语语种
	private String grade;				 //外语水平
	private String nation;				 //民族
	private String origin;				 //籍贯
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(nullable=false,columnDefinition="char(6)")
	public String getRecord_number() {
		return record_number;
	}
	public void setRecord_number(String record_number) {
		this.record_number = record_number;
	}
	@Column(nullable=false,length=10)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(nullable=false,columnDefinition="char(2)")
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	@Column(length=10,columnDefinition="char(10)")
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Column(length=20,nullable=false,unique=true)
	public String getID_card() {
		return ID_card;
	}
	public void setID_card(String iD_card) {
		ID_card = iD_card;
	}
	@Column(nullable=false,columnDefinition="char(4)")
	public String getMarriaged() {
		return marriaged;
	}
	public void setMarriaged(String marriaged) {
		this.marriaged = marriaged;
	}
	@Column(length=100,nullable=false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column(nullable=false,columnDefinition="char(6)")
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	@Column(nullable=false,columnDefinition="char(10)")
	public String getParty_member() {
		return party_member;
	}
	public void setParty_member(String party_member) {
		this.party_member = party_member;
	}
	@Column(length=10,nullable=false)
	public String getSchool_age() {
		return school_age;
	}
	public void setSchool_age(String school_age) {
		this.school_age = school_age;
	}
	@Column(length=40,nullable=false)
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	@Column(length=10)
	public String getForeign_language() {
		return foreign_language;
	}
	public void setForeign_language(String foreign_language) {
		this.foreign_language = foreign_language;
	}
	@Column(length=10)
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Column(length=40,nullable=true)
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	@Column(length=40,nullable=true)
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
}
