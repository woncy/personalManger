package cn.edu.henu.personnelManager.service.abs;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.henu.personnelManager.model.AccountItem;
import cn.edu.henu.personnelManager.model.Reckoning;
import cn.edu.henu.personnelManager.model.ReckoningInfo;
import cn.edu.henu.personnelManager.model.ReckoningList;
import cn.edu.henu.personnelManager.model.Record;

public class TestReckoninManager {
	static ClassPathXmlApplicationContext ctx;
	static ReckoningService service;
	@BeforeClass
	public static void beforeClass(){
		ctx = new ClassPathXmlApplicationContext("beans.xml");
		service = (ReckoningService) ctx.getBean("reckoningService");
	}
	@AfterClass
	public static void afterClass(){
		ctx.close();
	}
	@Test
	public void testAdd(){
		AccountService accountService = (AccountService) ctx.getBean("accountService");
		RecordService recordService = (RecordService) ctx.getBean("recordService");
		List<AccountItem> items = accountService.getAllAccount();
		Record record = recordService.getRecordbyId(226);
		for(AccountItem item:items){
			Reckoning reckoning = new Reckoning();
			reckoning.setName(item.getName());
			reckoning.setExplain(item.getName());
			
			ReckoningInfo info = new ReckoningInfo();
			info.setAccountItem(item);
			info.setReckoning(reckoning);
			
			ReckoningList list = new ReckoningList();
			list.setReckoning(reckoning);
			list.setRecord(record);
			service.addReckoning(info, reckoning, list);
		}
	}
}
