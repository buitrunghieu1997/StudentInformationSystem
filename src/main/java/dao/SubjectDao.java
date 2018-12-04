package dao;

import entities.TblSubject;

/**
 *
 * @author buiminhhieu
 */
public interface SubjectDao {

    /**
     * Phuong thuc nay de them hoc phan vao trong db
     * @param idSubject ma hoc phan
     * @param idGenre khoa vien
     * @param name ten hoc phan
     * @param creditSubject tin chi hoc tap
     * @param creditTuition tin chi hoc phi
     * @param length
     * @return boolean neu them hoc phan thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    public boolean addSubject(String idSubject, int idGenre, String name, Integer creditSubject, Integer creditTuition, int length);

    /**
     * Phuong thuc nay de danh dau xoa hoc phan tam thoi bang cach cho thuoc tinh stt='DELETE'
     * @param idSubject ma hoc phan
     * @return boolean neu xoa hoc phan thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    public boolean deleteSubject(String idSubject);

    /**
     * Phuong thuc nay dung de xoa han cac hoc phan
     * @param idSubject ma hoc phan
     * @return boolean neu xoa hoc phan thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    public boolean ermanentlyDeleteSubject(String idSubject);

    /**
     * Phuong thuc nay dung de update cac thong tin cua hoc phan
     * @param idSubject ma hoc phan
     * @param idGenre ma khoa vien
     * @param name ten hoc phan
     * @param creditSubject tin chi hoc phan
     * @param creditTuition tin chi hoc phi
     * @param length
     * @return boolean neu update hoc phan thanh cong ket qua tra ve la true nguoc lai ket qua tra ve la false
     */
    public boolean upateSubject(String idSubject, int idGenre, String name, Integer creditSubject, Integer creditTuition, int length);

    /**
     * Phuong thuc nay tra ve thong tin cua subject can tim
     * @param idSubject ma hoc phan
     * @return TblSubject ket qua tra ve la doi tuong tblSubject
     */
    public TblSubject searchSubject(String idSubject);

}
