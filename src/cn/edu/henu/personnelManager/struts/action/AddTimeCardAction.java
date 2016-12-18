package cn.edu.henu.personnelManager.struts.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.henu.personnelManager.model.AccountItem;
import cn.edu.henu.personnelManager.model.Record;
import cn.edu.henu.personnelManager.model.TimeCard;
import cn.edu.henu.personnelManager.service.abs.TimeCardService;
import cn.edu.henu.personnelManager.struts.formbean.TimecardForm;

public class AddTimeCardAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		TimecardForm cardForm = (TimecardForm) form;
		String accountId = cardForm.getAccountId();
		String explain = cardForm.getExplain();
		String ratDate = cardForm.getRatifierDate();
		String ratId = cardForm.getRatifierId();
		String recordId = cardForm.getRecordId();
		String start = cardForm.getStart_date();
		String end = cardForm.getEnd_date();
		ClassPathXmlApplicationContext ctx = null;
		try{
			ctx = new ClassPathXmlApplicationContext("beans.xml");
		
			TimeCardService service = (TimeCardService) ctx.getBean("timecardService");
			
			int a = Integer.parseInt(accountId);
			int r = Integer.parseInt(recordId);
			int rat = Integer.parseInt(ratId);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date start_date = format.parse(start);
			Date end_date = format.parse(end);
			Date rat_date = format.parse(ratDate);
			AccountItem item = new AccountItem();
			item.setId(a);
			Record record = new Record();
			record.setId(r);
			Record ratifierd = new Record();
			ratifierd.setId(rat);
			
			TimeCard card = new TimeCard();
			card.setAccountItem(item);
			card.setExplain(explain);
			card.setRecord(record);
			card.setRetifierRecord(ratifierd);
			card.setStart_date(start_date);
			card.setEnd_date(end_date);
			card.setRatifier_date(rat_date);
			
			service.addTimecard(card);
			
		}catch(Exception e){
			request.setAttribute("rPage", "AddTimeCard.do");
			return mapping.findForward("addFaild");
		}finally{
			if(ctx!=null){
				ctx.close();
			}
		}
		
		
		return mapping.findForward("addSuccess");
	}
}
