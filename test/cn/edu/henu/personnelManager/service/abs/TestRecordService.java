package cn.edu.henu.personnelManager.service.abs;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.henu.personnelManager.model.Department;
import cn.edu.henu.personnelManager.model.DutyInfo;
import cn.edu.henu.personnelManager.model.PersonalInfo;
import cn.edu.henu.personnelManager.model.Record;

public class TestRecordService  {
	static ClassPathXmlApplicationContext ctx;
	static RecordService recordService;
	
	@BeforeClass
	public static void beforeClass(){

		ctx = new ClassPathXmlApplicationContext("beans.xml");
		recordService = (RecordService) ctx.getBean("recordService");
	}
	@AfterClass
	public static void afterClass(){
		ctx.close();
	}
	@Test
	public void testAddRecord(){
		Record record = new Record();
		record.setAddress("北京");
		record.setBirthDay(new Date());
		record.setForeign_language("English");
		record.setGrade("Grade");
		record.setID_card("412822199602061232");
		record.setMarriaged("未婚");
		record.setName("王曦");
		record.setParty_member("4");
		record.setPhoto("wangxi.jpg");
		record.setPostalcode("222222");
		record.setRecord_number("50");
		record.setSchool_age("四");
		record.setSex("男");
		record.setSpecialty("Specialty");
		
		
		recordService.addRecord(record);
		
	
	
	}
	@Test
	public void testGetAllRecords(){
		List<Record> records = recordService.getALLRecords();
		System.out.println(records);
	}
	
	@Test
	public void testUpdateRecord(){
		Record record = new Record();
		record.setId(14);
		record.setAddress("北京");
		record.setBirthDay(new Date());
		record.setForeign_language("English");
		record.setGrade("Grade");
		record.setID_card("412822199602061232");
		record.setMarriaged("未婚");
		record.setName("王曦2");
		record.setParty_member("4");
		record.setPhoto("wangxi.jpg");
		record.setPostalcode("222222");
		record.setRecord_number("50");
		record.setSchool_age("四");
		record.setSex("男");
		record.setSpecialty("Specialty");
		recordService.updateRecord(record);
		
	}
	@Test
	public void testGetRecordbyId(){
		Record record = recordService.getRecordbyId(14);
		System.out.println(record);
	}
	@Test
	public void testGetRecordByRecordNum(){
		Record record = recordService.getRecordByRecordNum("50");
		System.out.println(record);
	}
	public void testGetRecordsByHql(){
		
	}
	@Test
	public void testDeleteRecord(){
		Record record = recordService.getRecordbyId(22);
		System.out.println(recordService.deleteRecord(record));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testAddRecord2(){
		Record record = new Record();
		record.setAddress("北京");
		record.setBirthDay(new Date());
		record.setForeign_language("English");
		record.setGrade("Grade");
		record.setID_card("412822199602061233");
		record.setMarriaged("未婚");
		record.setName("张三");
		record.setParty_member("4");
		record.setPhoto("zhang.jpg");
		record.setPostalcode("222222");
		record.setRecord_number("51");
		record.setSchool_age("四");
		record.setSex("男");
		record.setSpecialty("Specialty");

		PersonalInfo info = new PersonalInfo();
		info.setAddress("河南省开封市");
		info.setComputer_grade("86");
		info.setEmail("13323659953@163.com");
		Date graduate_Date = new Date();
		graduate_Date.setYear(2016);
		graduate_Date.setMonth(6);
		graduate_Date.setDate(1);
		info.setGraduate_date(graduate_Date);
		info.setHand_set("7650221");
		info.setTelephone("13323659953");
		info.setLikes("象棋、跳棋");
		info.setOnes_strong_suit("suit");
		info.setPostalcode("463700");
		DepartmentService deptService = (DepartmentService) ctx.getBean("departmentService");
		
		DutyInfo duty = new DutyInfo();
		duty.setAccession_date(new Date());
		duty.setAccumulation_fund_NO("2222222");
		duty.setBank_name("建设银行");
		duty.setBank_NO("6217002490002291081");
		duty.setComopo_safety_No("22121515444");
		Department dept = deptService.getDepartmentById(5);
		duty.setDept(dept);
		duty.setDimission_date(new Date());
		duty.setDimission_reason("不想干了");
		duty.setDole_safety_NO("1154231564545");
		duty.setFirst_pack_date(new Date());
		duty.setMediocate_safety_NO("4541687169445451");
		duty.setPact_end_date(new Date());
		duty.setPact_start_date(new Date());
		duty.setSociety_safety_NO("2222222145648");
		boolean b = recordService.addRecord(record,info,duty);
		System.out.println(b);
	}
}
