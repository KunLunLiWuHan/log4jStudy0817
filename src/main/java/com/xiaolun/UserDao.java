package com.xiaolun;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class UserDao {
	private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(UserDao.class); //log4j
//	private static Logger logger1 = LoggerFactory.getLogger(UserDao.class); //log4j

	public static void main(String[] args) {
		logger.debug("hello 0817");
		logger.info("hello 0817");
		logger.warn("hello 0817");
		logger.error("hello 0817");

//		int age = 0;
//		try {
//			logger.debug("11111111");
//			age = 10/0;
//			logger.debug("22222222");
//		}catch (Exception e){
//			e.printStackTrace();
//			logger.error(e.getMessage(),e.getCause());
//		}
	}
}
