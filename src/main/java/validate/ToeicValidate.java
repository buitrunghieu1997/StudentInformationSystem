package validate;

import dao.impl.ToeicDaoImpl;

/**
 * @author buiminhhieu
 */
public class ToeicValidate {
	/**
	 * Kiem tra xem diem toeic nhap vao co dung khong
	 *
	 * @param point diem toeic
	 * @return boolean neu diem toeic nam dung khoang thi ket qua tra ve se la true nguoc lai ket qua tra ve se la false
	 */
	public boolean checkPoint(int point) {
		return point >= 0 && point <= 990;
	}
	
	/**
	 * Kiem tra xem co ton tai sinh vien khong
	 *
	 * @param idStudent ma so sinh vien
	 * @return boolean neu co sinh vien ket qua tra ve se la true ngươc lai ket qua tra ve se la false
	 */
	public boolean checkStudent(int idStudent) {
		return new ToeicDaoImpl().searchToeic(idStudent) != null;
	}

	/**
	 * Kiểm tra xem giá trị idStudent nhập vào có khác rỗng hay không
	 * @param idStudent mã số sinh viên
	 * @return boolean kết quả trả về true nếu mã số sinh viên truyền vào là rỗng ngược lại trả về false
	 */
	public boolean checkIdStudent(String idStudent){
		if(idStudent.equals(""))return true;
		return false;
	}

	/**
	 * Hàm kiểm tra giá trị nhập vào có phải số hay không
	 * @param idStudent mã số sinh viên
	 * @return boolean kết quả trả về true nếu mã số sinh viên nhập vào là số ngược lại thì trả về giá trị là false
	 */
	public boolean checkTypeIdStudent(String idStudent){
		try{
			Integer.parseInt(idStudent);
			return true;
		}catch (Exception ex){
			return false;
		}
	}
}
