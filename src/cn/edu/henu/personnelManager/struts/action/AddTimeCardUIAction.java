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
import cn.edu.henu.personnelManager.service.abs.DepartmentService;
import cn.edu.henu.personnelManager.service.abs.RecordService;

public class AddTimeCardUIAction extends Action {
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<Department> depts;
		ClassPathXmlApplicationContext ctx = null;
		try{
			ctx = new ClassPathXmlApplicationContext("beans.xml");
			DepartmentService departmentService = (DepartmentService) ctx.getBean("departmentService");
			RecordService recordService = (RecordService) ctx.getBean("recordService");
			depts = departmentService.getAllDepartment();
			request.setAttribute("depts",depts);
			
		}catch(Exception e){
			return mapping.findForward("faild");
		}finally{
			if(ctx!=null)
				ctx.close();
		}
		
		return mapping.findForward("success");
	}

}
