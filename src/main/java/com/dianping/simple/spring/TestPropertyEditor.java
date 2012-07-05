/**
 * Project: simple
 * 
 * File Created at 2012-6-29
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

import java.beans.PropertyEditorSupport;

import org.apache.commons.lang.StringUtils;

/**
 * TODO Comment of TestPropertyEditor
 * @author wenwei.li
 *
 */
public class TestPropertyEditor extends PropertyEditorSupport {

	
	public void setAsText(String text){
		if(StringUtils.isEmpty(text)){
			throw new IllegalArgumentException("error text formatter");
		}
		String[] infos = text.split(",");
		Test test = new Test();
		test.setName(infos[0]);
		test.setAge(Integer.parseInt(infos[1]));
		setValue(test);
	}
}
