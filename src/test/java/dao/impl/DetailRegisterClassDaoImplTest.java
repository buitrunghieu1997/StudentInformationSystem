package dao.impl;

import entities.TblStudent;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DetailRegisterClassDaoImplTest {
    /**
     * Phuong thuc nay kiem tra xem danh sach sinh vien trong lop
     */
    @Test
    public void testShowListStudent(){
        String classCode="";
        List<TblStudent> listStudent=new DetailRegisterClassDaoImpl().showListStudent(classCode);
        List<TblStudent> ds=null;
        Assert.assertEquals(ds,listStudent);
    }
}
