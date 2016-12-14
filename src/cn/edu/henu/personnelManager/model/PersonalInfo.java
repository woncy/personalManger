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
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Record record;
	private String QQ;
	private String Email;
	private String handset;
	private String telephone;
	private String address;
	private String postalcode;
	private String second_school_age;
	private String second_specilaty;
	private String graduate_school;
	private Date graduate_date;
	private Date party_member_date;
	private String computer_grade;
	private String likes;
	private String ones_strong_suit;
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
	@Column(length=30)
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Column(length=15)
	public String getHandset() {
		return handset;
	}
	public void setHandset(String handset) {
		this.handset = handset;
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
