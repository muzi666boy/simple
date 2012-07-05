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

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

/**
 * TODO Comment of TestBeanFactoryPostProcessor
 * @author wenwei.li
 *
 */
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	private static Logger logger = LoggerFactory.getLogger(TestBeanFactoryPostProcessor.class);
	
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanFactoryPostProcessor#postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory)
	 */
	@Override
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		BeanDefinition bd = beanFactory.getBeanDefinition("testServiceTarget");
		bd.getPropertyValues().addPropertyValue("name", "no monkey");
		logger.info("postProcessBeanFactory "+bd.getBeanClassName());
	}

}
