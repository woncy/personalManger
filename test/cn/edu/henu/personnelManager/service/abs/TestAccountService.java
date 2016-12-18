package cn.edu.henu.personnelManager.service.abs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAccountService {
	static ClassPathXmlApplicationContext ctx;
	static AccountService accountService;
	
	@BeforeClass
	public static void beforeClass(){
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		accountService = (AccountService) ctx.getBean("accountService");
		
	}
	@AfterClass
	public static void afterClass(){
		ctx.close();
	}
	@Test
	public void testAdd(){
		
//		AccountItem item = new AccountItem();
//		item.setIs_timecard("是");
//		item.setName("正班");
//		item.setType("zb");
//		item.setUnit("u");
//		accountService.addAccount(item);
	
//		AccountItem item = new AccountItem();
//		item.setIs_timecard("是");
//		item.setName("加班");
//		item.setType("jb");
//		item.setUnit("u");
//		accountService.addAccount(item);
//		
//		
//		AccountItem item2 = new AccountItem();
//		item2.setIs_timecard("是");
//		item2.setName("迟到");
//		item2.setType("cd");
//		item2.setUnit("u");
//		accountService.addAccount(item2);
//		
//		AccountItem item3 = new AccountItem();
//		item3.setIs_timecard("是");
//		item3.setName("早退");
//		item3.setType("zt");
//		item3.setUnit("u");
//		accountService.addAccount(item3);
//		
//		AccountItem item4 = new AccountItem();
//		item4.setIs_timecard("是");
//		item4.setName("请假");
//		item4.setType("qj");
//		item4.setUnit("u");
//		accountService.addAccount(item4);
	}
}
