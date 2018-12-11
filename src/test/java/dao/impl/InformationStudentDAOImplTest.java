package dao.impl;

import org.junit.Assert;
import org.junit.Test;

public class InformationStudentDAOImplTest {
	@Test
	public void testUpdateInfoStudent() {
		int     idStudent   = 0;
		String  fullName    = "";
		String  address     = "";
		String  phone       = "";
		String  dateOfBirth = "";
		String  email       = "";
		boolean result      = new InformationStudentDAOImpl().update(idStudent, fullName, address, phone, dateOfBirth, email);
		Assert.assertEquals(true, result);
	}
}
