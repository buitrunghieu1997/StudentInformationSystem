/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.TblProgram;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface ProgramDAO {
	
	/**
	 * @param idProgram: mã chương trình đào tạo
	 * @param idDepartment: mã khoa/viện
	 * @param length: thời lượng
	 * @param credit: tín chỉ
	 * @param optionalCredit: tín chỉ tự chọn
	 * @param description: chi tiết
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 */
	boolean insertProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description);
	
	/**
	 * @param idProgram: mã chương trình đào tạo
	 * @param idDepartment: mã khoa/viện
	 * @param length: thời lượng
	 * @param credit: tín chỉ
	 * @param optionalCredit: tín chỉ tự chọn
	 * @param description: chi tiết
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 */
	boolean updateProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description);
	
	/**
	 * @param idProgram: mã chương trình đào tạo
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 */
	boolean deleteProgram(int idProgram);
	
	/**
	 * @param idProgram: mã chương trình đào tạo
	 * @return danh sách thông tin chương trình đào tạo (nếu tìm thấy) hoặc trả về null (nếu không tìm thấy)
	 */
	List<TblProgram> displayProgram(int idProgram);
	
}
