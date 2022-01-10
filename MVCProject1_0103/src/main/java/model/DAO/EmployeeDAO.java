package model.DAO;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.DTO.EmployeeDTO;
import model.DTO.MemberDTO;

public class EmployeeDAO extends DataBaseInfo{
	final String COLUMNS = "emp_num, emp_name, emp_id,"
			+ " emp_pw, emp_hire_date, emp_email, emp_salary, emp_phone";
	public String selectEmpNum(String empId) {
		String empNum = null;
		con = getConnection();
		String sql = "select emp_num from employees where emp_id = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				empNum = rs.getString(1);
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {close();}
		
		return null;
	}
	
	public EmployeeDTO selectUser(String memId) {
		EmployeeDTO dto = new EmployeeDTO();
		con = getConnection();
		String sql = "select " + COLUMNS + " from member"
				+ " where MEM_ID = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memId);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setEmpNum(rs.getInt("emp_num"));
				dto.setEmpName(rs.getString("emp_name"));
				dto.setEmpId(rs.getString("emp_id"));
				dto.setEmpPw(rs.getString("emp_pw"));
				dto.setEmpEmail(rs.getString("emp_email"));
				dto.setEmpSalary(rs.getInt("emp_salary"));
				dto.setEmpPhone(rs.getString("emp_phone"));
				dto.setEmpHireDate(new java.util.Date(rs.getDate("emp_hire_date").getTime()));
				//넣을때는 sql로 변환
			}
		}catch (Exception e) {e.printStackTrace();
		}finally {close();}
		return dto;
	}
	
	public void employeeUpdate(EmployeeDTO dto) {
		con = getConnection();
		String sql = " update employees "
				+ "    set emp_name = ?, "
				+ "        emp_id = ?, "
				+ "        emp_hire_date =?, emp_email =? ,"
				+ "		   emp_salary = ?, emp_phone = ? "
				+ "    where emp_NUM = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getEmpName());
			pstmt.setString(2, dto.getEmpId());
			pstmt.setDate(3, new java.sql.Date(dto.getEmpHireDate().getTime()));
			pstmt.setString(4, dto.getEmpEmail());
			pstmt.setInt(5, dto.getEmpSalary());
			pstmt.setString(6, dto.getEmpPhone());
			pstmt.setInt(7, dto.getEmpNum());
			
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 수정되었습니다.");
		}catch (Exception e) {e.printStackTrace();
		}finally {close();}
	}
	public void empDelete(String num) {
		con = getConnection();
		String sql = " delete from employees where emp_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삭제되었습니다.");
		}catch (Exception e) {e.printStackTrace();
		}finally {close();}
	}
	
	public EmployeeDTO selectOne(String num){
		EmployeeDTO dto = new EmployeeDTO();
		con = getConnection();
		String sql = "select " + COLUMNS + " from employees "
				+ " where emp_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setEmpNum(rs.getInt("emp_num"));
				dto.setEmpName(rs.getString("emp_name"));
				dto.setEmpId(rs.getString("emp_id")); //이름대신 번호 쓰는 것도 가능, 컬럼 순서대로
				dto.setEmpPhone(rs.getString("emp_phone"));
				dto.setEmpEmail(rs.getString("emp_email"));
				dto.setEmpHireDate(new java.util.Date(rs.getDate("emp_hire_date").getTime()));
				dto.setEmpPw(rs.getString("emp_pw"));
				dto.setEmpSalary(rs.getInt("emp_salary"));
			}
		}catch (Exception e) {e.printStackTrace();
		}finally {close();}
		return dto;
	}
	
	public List<EmployeeDTO> selectAll(){
		List<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		con = getConnection();
		String sql = " select " + COLUMNS + " FROM employees "
				+ " order by emp_num desc";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) { //rs가 레코드 하나
				//rs에 있는 컬럼 값을 dto의 멤버 필드에 저장
				EmployeeDTO dto = new EmployeeDTO(); //행 만들어서
				dto.setEmpEmail(rs.getString("emp_email"));
				//sql.datae ==> util.date
				dto.setEmpHireDate(new java.util.Date(rs.getDate("emp_hire_date").getTime()));
				dto.setEmpId(rs.getString("emp_id"));
				dto.setEmpName(rs.getString("emp_name"));
				dto.setEmpNum(rs.getInt("emp_num"));
				dto.setEmpPhone(rs.getString("emp_phone"));
				dto.setEmpPw(rs.getString("emp_pw"));
				dto.setEmpSalary(rs.getInt("emp_salary"));
				
				list.add(dto); //저장 //dto는 레코드(행) 하나이다
			}
		}catch (Exception e) {e.printStackTrace();
		}finally {close();}
		
		return list;
	}
	public void employeeInsert(EmployeeDTO dto) {
		con = getConnection();
		String sql = "insert into employees("+ COLUMNS + ")" +
				" values(?,?,?,?,?,?,?,?)"; //받아오는 갯수만큼 ?를 적기
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getEmpNum());
			pstmt.setString(2, dto.getEmpName());
			pstmt.setString(3, dto.getEmpId());
			pstmt.setString(4, dto.getEmpPw());
			//util.Date를 sql.Date로 변환
			pstmt.setDate(5, new Date(dto.getEmpHireDate().getTime()));
			pstmt.setString(6, dto.getEmpEmail());
			pstmt.setInt(7, dto.getEmpSalary());
			pstmt.setString(8, dto.getEmpPhone());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삽입되었습니다.");
		}catch (Exception e) {e.printStackTrace();
		}finally {close();}
		
	}
}
