package com.smart.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

public class LogHelper {
	public static Logger logger = LogManager.getLogger("AsyncFileLogger");
}
