package validate;

import dao.impl.ToeicDaoImpl;

/**
 * @author buiminhhieu
 */
public class ToeicValidate {
    /**
     * Kiem tra xem diem toeic nhap vao co dung khong
     * @param point diem toeic
     * @return boolean neu diem toeic nam dung khoang thi ket qua tra ve se la true nguoc lai ket qua tra ve se la false
     */
    public boolean checkPoint(int point){
        if(point>=0 && point <=990)return true;
        return false;
    }

    /**
     * Kiem tra xem co ton tai sinh vien khong
     * @param idStudent ma so sinh vien
     * @return boolean neu co sinh vien ket qua tra ve se la true ngươc lai ket qua tra ve se la false
     */
    public boolean checkStudent(int idStudent){
       if(new ToeicDaoImpl().searchToeic(idStudent)!=null)return true;
       return false;
    }
}
