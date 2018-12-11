package dao.impl;

import entities.TblToeic;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;

/**
 * author bui minh hieu
 */
public class ToeicDaoImplTest {
	/**
	 * Phuong thuc nay dung de test them diem toeic
	 */
	@Test
	public void testAddToeic() {
		ToeicDaoImpl toeic  = new ToeicDaoImpl();
		boolean      result = toeic.addToeic(100, "2018", new Date(2 / 3 / 2018).toString(), 450);
		Assert.assertEquals(true, result);
	}
	
	/**
	 * Phuong thuc nay dung de test update diem toeic
	 */
	@Test
	public void testUpdateToeic() {
		ToeicDaoImpl toeic  = new ToeicDaoImpl();
		boolean      result = toeic.updateToeic(100, "2018", new Date(4 / 5 / 2015).toString(), 465);
		Assert.assertEquals(true, result);
	}
	
	/**
	 * Phuong thuc nay dung de tim kiem diem toeic
	 */
	@Test
	public void testSearchToeic() {
		TblToeic toeic = new ToeicDaoImpl().searchToeic(100);
		Assert.assertNotEquals(null, toeic);
		Assert.assertEquals(465.0, (long) toeic.getPoint());
	}
	
	/**
	 * Phuong thuc nay dung de xoa diem toeic
	 */
	@Test
	public void testDeletetoiec() {
		boolean result = new ToeicDaoImpl().deleteToeic(100);
		Assert.assertEquals(true, result);
	}
}
