package com.powersmart.platform.principle.dip.improve;

/**
 * @description: 违反依赖倒置原则
 * @author: 庞东博
 * @create: 2020-10-29 20:03
 **/
public class DependenceInversionPrinciple {
	public static void main(String[] args) {

		SoftCompany company = new SoftCompany();
		company.buildSoft(new JavaCoder());
		company.buildSoft(new GoCoder());
	}
}

interface Coder {
	void code();
}

/**
 * Java程序员
 */
class JavaCoder implements Coder {

	public void code() {
		System.out.println("使用Java语言实现");
	}
}

/**
 * Go程序员
 */
class GoCoder implements Coder {

	public void code() {
		System.out.println("使用Goland语言实现");
	}
}

/**
 * 软件公司
 */
class SoftCompany {

	public void buildSoft(Coder coder) {
		System.out.println("需要开发一个OA软件");
		coder.code();
	}

}