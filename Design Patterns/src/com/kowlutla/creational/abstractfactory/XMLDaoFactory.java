package com.kowlutla.creational.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {

		if (type.equalsIgnoreCase("emp")) {
			return new XMLEmpDao();
		} else {
			return new XMLDeptDao();
		}
	}

}
