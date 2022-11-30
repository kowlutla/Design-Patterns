package com.kowlutla.creational.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		if (type.equalsIgnoreCase("emp")) {
			return new DBEmpDao();
		} else {
			return new DBDeptDao();
		}
	}

}
