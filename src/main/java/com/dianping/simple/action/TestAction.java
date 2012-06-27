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
package com.dianping.simple.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.dianping.simple.service.TestService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * TODO Comment of TestAction
 * @author wenwei.li
 *
 */
public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

    @Autowired
    private TestService testService;
    
    public String execute(){
            System.out.println("TestAction SUCCESS");
            testService.say();
            return SUCCESS;
    }
}
