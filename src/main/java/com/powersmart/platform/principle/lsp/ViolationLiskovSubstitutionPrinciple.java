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
		coder.outputExtraSum5(1, 1);  // JavaCoder 已经没有 1 +1 = 2 的能力了
		coder.outputSum(1,1);
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

	/**
	 * 求和
	 * @param a
	 * @param b
	 * @return
	 */
	public int sum(int a, int b) {
		return a + b;
	}

	/**
	 * 输出求和结构
	 * @param a
	 * @param b
	 */
	public void outputSum(int a, int b) {
		System.out.println("求和：" + this.sum(a, b));
	}
	
}

class JavaCoder extends Coder {

	/**
	 * 求和，然后+5
	 * @param a
	 * @param b
	 */
	public void outputExtraSum5(int a, int b) {
		System.out.println("开始工作");
		System.out.println(a +" + "+ b +" + 5 = "+ sum(a, b));
	}

	/**
	 * 求和+5
	 */
	public int sum(int a, int b) {
		return a + b + 5;
	}
}