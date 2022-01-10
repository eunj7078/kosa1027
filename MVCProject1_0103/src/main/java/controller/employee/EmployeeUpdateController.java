package controller.employee;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import model.DAO.EmployeeDAO;
import model.DTO.EmployeeDTO;

public class EmployeeUpdateController {
	public void execute(HttpServletRequest request) {
		String empNum = request.getParameter("empNum");
		String empName = request.getParameter("empName");
		String empId = request.getParameter("empId");
		String empPhone = request.getParameter("empPhone");
		String empSalary = request.getParameter("empSalary");
		String empEmail = request.getParameter("empEmail");
		
		//문자열을 date로 변경
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String empHireDate = request.getParameter("empHireDate");
		Date hdate = null;
		try {
			hdate = sdf.parse(empHireDate);
		}catch (Exception e) {e.printStackTrace();}
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpNum(Integer.parseInt(empNum));
		dto.setEmpName(empName);
		dto.setEmpId(empId);
		dto.setEmpPhone(empPhone);
		dto.setEmpSalary(Integer.parseInt(empSalary));
		dto.setEmpEmail(empEmail);
		dto.setEmpHireDate(hdate);
		
		EmployeeDAO dao = new EmployeeDAO();
		dao.employeeUpdate(dto);
	}
}
