package dao;

/**
 * @author buiminhhieu
 */
public interface DetailRegisterSubjectDao {
	/**
	 * Phuong thuc nay dung de them cac hoc phan ma hoc sinh dang ki trong 1 ki
	 *
	 * @param idRegister ma dang ki
	 * @param idSubject  ma hoc phan
	 * @return boolean neu them du lieu thanh cong ket qua tra ve se la true nguoc lai ket qua tra ve se la fasle
	 */
	boolean addDetailRegisterSubject(int idRegister, String idSubject);
	
	/**
	 * Phuong thuc nay dung de xoa tat cac cac hoc phan ma sinh vien dang ki trong mot ki thong qua id register
	 *
	 * @param idRegister ma dang ki
	 * @return boolean neu xoa thanh cong ket qua tra ve la true nguoc lai la false
	 */
	boolean deleteDetailRegisterSubject(int idRegister);
	
	/**
	 * Phuong thuc nay dung de xoa cac dang ki hoc phan ma sinh vien dang ki trong 1 ki
	 *
	 * @param idRegister ma dang ki
	 * @param idSubject  ma hoc phan
	 * @return boolean neu xoa thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
	 */
	boolean ermanentlyDeleteDetailSubject(int idRegister, String idSubject);
}
