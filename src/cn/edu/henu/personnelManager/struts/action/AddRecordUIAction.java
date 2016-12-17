package cn.edu.henu.personnelManager.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.henu.personnelManager.model.Department;
import cn.edu.henu.personnelManager.model.Job;
import cn.edu.henu.personnelManager.service.abs.DepartmentService;
import cn.edu.henu.personnelManager.service.abs.JobService;

public class AddRecordUIAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		DepartmentService service = (DepartmentService) ctx.getBean("departmentService");
		JobService jobservice = (JobService) ctx.getBean("jobService");
		List<Department> depts = service.getAllDepartment();
		String [][] s = new String[depts.size()][];
		int[][] jobIds = new int[depts.size()][];
		for (int i=0;i<depts.size();i++) {
			Department dept = depts.get(i);
			List<Job> jobs = jobservice.getAllJobByDeptName(dept.getDept_name());
			s[i] = new String[jobs.size()];
			jobIds[i] = new int[jobs.size()];
			for(int j=0;j<s[i].length; j++){
				s[i][j] = jobs.get(j).getJob_name();
				jobIds[i][j] = jobs.get(j).getId();
			}
			
		}
		request.setAttribute("job_id", jobIds);
		request.setAttribute("depts", depts);
		request.setAttribute("jobs", s);
		ctx.close();
		return mapping.findForward("success");
	}
}
