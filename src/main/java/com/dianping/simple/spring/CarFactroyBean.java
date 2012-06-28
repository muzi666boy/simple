/**
 * Project: simple
 * 
 * File Created at 2012-6-28
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.simple.spring;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.FactoryBean;

/**
 * TODO Comment of CarFactroyBean
 * @author wenwei.li
 *
 */
public class CarFactroyBean implements FactoryBean {

	private String carInfo;
	
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	@Override
	public Object getObject() throws Exception {
		// TODO Auto-generated method stub
		Car car = new Car();
		String[] infos = StringUtils.split(carInfo,",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.parseInt(infos[1]));
		car.setPrice(Double.parseDouble(infos[2]));
		return car;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	/**
	 * @param carInfo the carInfo to set
	 */
	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	/**
	 * @return the carInfo
	 */
	public String getCarInfo() {
		return carInfo;
	}

}
