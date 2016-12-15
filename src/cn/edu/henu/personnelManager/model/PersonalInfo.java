package cn.edu.henu.personnelManager.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.format.annotation.DateTimeFormat;
@Entity(name="tb_personal_info")
public class PersonalInfo implements Serializable{
	/**
	 * 个人资料
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Record record;					//档案
	private String QQ;						//qq
	private String hand_set;				//固定电话
	private String Email;					//邮箱	
	private String telephone;				//手机号
	private String address;					//地址
	private String postalcode;				//邮箱
	private String second_school_age;		//毕业学校
	private String second_specilaty;		//专业
	private String graduate_school;			//学历
	private Date graduate_date;				//毕业日期
	private Date party_member_date;			//入党日期
	private String computer_grade;			//计算机水平
	private String likes;					//爱好
	private String ones_strong_suit;		//特长
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@PrimaryKeyJoinColumn
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	@Column(length=20)
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	@Column(length=15)
	public String getHand_set() {
		return hand_set;
	}
	public void setHand_set(String hand_set) {
		this.hand_set = hand_set;
	}
	@Column(length=30)
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	@Column(length=15,nullable=false)
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	@Column(length=10)
	public String getSecond_school_age() {
		return second_school_age;
	}
	public void setSecond_school_age(String second_school_age) {
		this.second_school_age = second_school_age;
	}
	@Column(length=40)
	public String getSecond_specilaty() {
		return second_specilaty;
	}
	public void setSecond_specilaty(String second_specilaty) {
		this.second_specilaty = second_specilaty;
	}
	@Column(length=40)
	public String getGraduate_school() {
		return graduate_school;
	}
	public void setGraduate_school(String graduate_school) {
		this.graduate_school = graduate_school;
	}
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getGraduate_date() {
		return graduate_date;
	}
	public void setGraduate_date(Date graduate_date) {
		this.graduate_date = graduate_date;
	}
	@DateTimeFormat(pattern="yyyy-DD-MM")
	public Date getParty_member_date() {
		return party_member_date;
	}
	public void setParty_member_date(Date party_member_date) {
		this.party_member_date = party_member_date;
	}
	@Column(length=10)
	public String getComputer_grade() {
		return computer_grade;
	}
	public void setComputer_grade(String computer_grade) {
		this.computer_grade = computer_grade;
	}
	@Column(length=50)
	public String getLikes() {
		return likes;
	}
	public void setLikes(String likes) {
		this.likes = likes;
	}
	@Column(length=50)
	public String getOnes_strong_suit() {
		return ones_strong_suit;
	}
	public void setOnes_strong_suit(String ones_strong_suit) {
		this.ones_strong_suit = ones_strong_suit;
	}
	
	
}
