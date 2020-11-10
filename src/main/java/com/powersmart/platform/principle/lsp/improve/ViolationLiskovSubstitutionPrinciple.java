package com.powersmart.platform.principle.lsp;

/**
 * @description: 违反里氏代换原则的示例：一个粗心的Java程序员
 * @author: 庞东博
 * @create: 2020-11-03 20:22
 **/
public class ViolationLiskovSubstitutionPrinciple {

	public static void main(String[] args) {
		JavaCoder coder = new JavaCoder();
		coder.onDuty();
		coder.work();
		coder.offDuty();
	}
	
}

/**
 * 程序员
 */
class Coder {
	
	public void onDuty() {
		System.out.println("上班");
	}
	
	public void offDuty() {
		System.out.println("下班");
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
}

class JavaCoder extends Coder {
	
	public void work() {
		System.out.println("开始工作");
		int a = 1;
		int b = 1;
		System.out.println(a +" + "+ b +" = "+ sum(a, b));
	}

	/**
	 * 我一不小心就写了个bug
	 */
	public int sum(int a, int b) {
		return a + b + 5;
	}
}