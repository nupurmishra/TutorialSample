package com.deosample;

public class Service {

	public int findById(Dao dao) {
		try {
			return dao.getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
