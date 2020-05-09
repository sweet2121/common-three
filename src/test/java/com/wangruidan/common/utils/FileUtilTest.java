package com.wangruidan.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void test() {
		//给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”
		String hh=FileUtil.getExtendName("521.jpg");
		System.out.println(hh);
	}

}
