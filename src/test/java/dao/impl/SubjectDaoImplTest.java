package dao.impl;

import entities.TblSubject;
import entities.TblToeic;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author DangNgocHieu
 */
public class SubjectDaoImplTest {
    /**
     * Phuong thuc nay dung de test viec them subject
     */
    @Test
    public void testAddSubject(){
        String idSubject="";
        int idGenre=0;
        String name="";
        int creditSubject=0;
        int creditTuition=0;
        int length=0;
        boolean result= new SubjectDaoImpl().addSubject(idSubject,idGenre,name,creditSubject,creditTuition,length);
        Assert.assertEquals(true, result);
    }

    /**
     * Phuong thuc nay dung de test viec update subject
     */
    @Test
    public void testUpdateSubject(){
        String idSubject="";
        int idGenre=0;
        String name="" ;
        int creditSubject=0;
        int creditTuition=0;
        int length=0;
        boolean result= new SubjectDaoImpl().upateSubject(idSubject,idGenre,name,creditSubject,creditTuition,length);
        Assert.assertEquals(true,result);
    }

    /**
     * Phuong thuc nay dung de test viec tim kiem subject
     */
    @Test
    public void testSearchSubject(){
        String idSubject="";
        TblSubject tblSubject=null;
        TblSubject subject = new SubjectDaoImpl().searchSubject(idSubject);
        Assert.assertNotEquals(tblSubject,subject);
    }

    /**
     * Phuong thuc nay dung de xoa subject
     */
    @Test
    public void testDeleteSubject(){
        boolean result= new SubjectDaoImpl().deleteSubject("IT4440");
        Assert.assertEquals(true,result);
    }
}
