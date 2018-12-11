package dao.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * author bui minh hieu
 */
public class DetailRegisterSubjectDaoImplTest {
    /**Phuong thuc nay dung de test them dang ki lop
     *
     */
    @Test
    public void testAddDetailRegisterSubject(){
        boolean result= new DetailRegisterSubjectDaoImpl().addDetailRegisterSubject(2,"IT4440");
        Assert.assertEquals(true,result);
    }
    /**
     * Phuong thuc nay dung de test viex xoa cac dang ki hoc phan
     */
    @Test
    public void testDeleteRegisterSubject(){
        boolean result=new DetailRegisterSubjectDaoImpl().deleteDetailRegisterSubject(2);
        Assert.assertEquals(true, result);
    }
}
