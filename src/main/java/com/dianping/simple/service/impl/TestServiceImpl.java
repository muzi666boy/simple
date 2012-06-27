/**
 * Project: simple
 * 
 * File Created at 2012-6-27
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
package com.dianping.simple.service.impl;

import com.dianping.simple.service.TestService;

/**
 * TODO Comment of TestServiceImpl
 * @author wenwei.li
 *
 */
public class TestServiceImpl implements TestService {

	private String name;
	
	
	/* (non-Javadoc)
	 * @see com.dianping.simple.service.TestService#say()
	 */
	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("TestService say: my name is" + name);
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
