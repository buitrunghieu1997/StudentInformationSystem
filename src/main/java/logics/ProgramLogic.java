/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logics;

import entities.TblProgram;

import java.util.List;

/**
 * @author vuduchiep
 */
public interface ProgramLogic {
	
	/**
	 * Hàm xử lý logic thêm chương trình đào tạo
	 *
	 * @param idProgram
	 * @param idDepartment
	 * @param length
	 * @param credit
	 * @param optionalCredit
	 * @param description
	 * @return true (nếu thêm thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean insertProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description);
	
	/**
	 * Hàm xử lý logic cập nhật chương trình đào tạo
	 *
	 * @param idProgram
	 * @param idDepartment
	 * @param length
	 * @param credit
	 * @param optionalCredit
	 * @param description
	 * @return true (nếu cập nhật thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Cần validate
	 */
	boolean updateProgram(int idProgram, int idDepartment, Integer length, Integer credit, int optionalCredit, String description);
	
	/**
	 * Hàm xử lý logic xóa chương trình đào tạo
	 *
	 * @param idProgram
	 * @return true (nếu xóa thành công) hoặc false (nếu ngược lại)
	 * <p>
	 * Không cần validate
	 */
	boolean deleteProgram(int idProgram);
	
	/**
	 * Hàm lấy thông tin chương trình đào tạo
	 *
	 * @param idProgram
	 * @return danh sách thông tin về chương trình đào tạo
	 * <p>
	 * Không cần validate
	 */
	List<TblProgram> displayProgram(int idProgram);
}
