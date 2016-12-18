package cn.edu.henu.personnelManager.service.abs;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.henu.personnelManager.model.TimeCard;

public class TestTimeCarService {
	static ClassPathXmlApplicationContext ctx;
	static TimeCardService timeCardService;
	
	@BeforeClass
	public static void beforeClass(){
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		timeCardService = (TimeCardService) ctx.getBean("timecardService");
		
	}
	@AfterClass
	public static void afterClass(){
		ctx.close();
	}
	@Test
	public void testAdd(){
		AccountService accountService = (AccountService) ctx.getBean("accountService");
		RecordService recordService = (RecordService) ctx.getBean("recordService");
		TimeCard card = new TimeCard();
		card.setAccountItem(accountService.getAccount(221));
		card.setStart_date(new Date());
		card.setEnd_date(new Date());
		card.setExplain("人事管理系统项目");
		card.setRatifier_date(new Date());
		card.setRetifierRecord(recordService.getRecordbyId(226));
		card.setRecord(recordService.getRecordbyId(213));
		
		boolean b = timeCardService.addTimecard(card);
		System.out.println(b);
	}
}
