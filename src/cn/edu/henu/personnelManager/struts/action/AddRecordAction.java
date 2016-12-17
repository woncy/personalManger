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

import cn.edu.henu.personnelManager.model.DutyInfo;
import cn.edu.henu.personnelManager.model.Job;
import cn.edu.henu.personnelManager.model.PersonalInfo;
import cn.edu.henu.personnelManager.model.Record;
import cn.edu.henu.personnelManager.service.abs.JobService;
import cn.edu.henu.personnelManager.service.abs.RecordService;
import cn.edu.henu.personnelManager.struts.formbean.RecordForm;


public class AddRecordAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		RecordForm recordForm = (RecordForm)form;
		//获取档案信息
		Record record = recordForm.getRecord();
		PersonalInfo info = recordForm.getPersonalInfo();
		DutyInfo duty = recordForm.getDuty();
		
		//获取日期信息
		String birth = recordForm.getBirthDay();
		String acce = recordForm.getAccession_date();
		String dimi = recordForm.getDimission_date();
		String first = recordForm.getFirst_pact_date();
		String end = recordForm.getPact_end_date();
		String start = recordForm.getPact_start_date();
		String party_member = recordForm.getParty_member_date();
		
		//转化为Date格式
		SimpleDateFormat format = new SimpleDateFormat("yyyy-DD-MM");
		if(birth!=null && !birth.equals("")){
			Date birthDay = format.parse(birth);
			record.setBirthDay(birthDay);
		}
		if(acce!=null && !acce.equals("")){
			Date acceDate = format.parse(acce);
			duty.setAccession_date(acceDate);
		}
		if(dimi!=null && !dimi.equals("")){
			Date dimiDate = format.parse(dimi);
			duty.setDimission_date(dimiDate);
		}
		if(first!=null && !first.equals("")){
			Date firstDate = format.parse(first);
			duty.setFirst_pack_date(firstDate);
		}
		if(start!=null && !start.equals("")){
			Date startDate = format.parse(start);
			duty.setPact_start_date(startDate);
		}
		if(end!=null && !end.equals("")){
			Date endDate = format.parse(end);
			duty.setPact_end_date(endDate);
		}
		if(party_member!=null && !party_member.equals("")){
			Date party_member_date = format.parse(party_member);
			info.setParty_member_date(party_member_date);
		}
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		RecordService service = (RecordService) ctx.getBean("recordService");
		
		String jobName = recordForm.getJobName();
		int jobId = Integer.parseInt(jobName);
		JobService jobService = (JobService) ctx.getBean("jobService");
		Job job = jobService.getJob(jobId);
		duty.setJob(job);
		service.addRecord(record, info, duty);

		ctx.close();
		return mapping.findForward("main");
	}
}
