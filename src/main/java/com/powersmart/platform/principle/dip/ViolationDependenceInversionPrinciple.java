package com.powersmart.platform.principle.dip;

import jdk.nashorn.internal.objects.Global;

/**
 * @description: 违反依赖倒置原则的示例：一个只会Java的软件公司
 * @author: 庞东博
 * @create: 2020-10-29 20:02
 **/
public class ViolationDependenceInversionPrinciple {

	public static void main(String[] args) {
		SoftCompany company = new SoftCompany();
		company.buildSoft(new JavaCoder());
	}

}

/**
 * Java程序员
 */
class JavaCoder {

	public void code() {
		System.out.println("使用Java语言实现");
	}

}

/**
 * 软件公司
 */
class SoftCompany {

	public void buildSoft(JavaCoder coder) {
		System.out.println("需要开发一个OA软件");
		coder.code();
	}

}