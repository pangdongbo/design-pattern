package com.powersmart.platform.principle.lsp.improve;

/**
 * @description:
 * @author: 庞东博
 * @create: 2020-11-03 20:22
 **/
public class LiskovSubstitutionPrinciple {

	public static void main(String[] args) {
		JavaCoder coder = new JavaCoder();
		coder.onDuty();
		coder.outputExtraSum5(1, 1);  // JavaCoder 已经没有 1 +1 = 2 的能力了
		coder.getCoder().outputSum(1,1);
		coder.offDuty();
	}

}

/**
 * 工作者
 */
class Worker {

	public void onDuty() {
		System.out.println("上班");
	}

	public void offDuty() {
		System.out.println("下班");
	}
}

/**
 * 程序员
 */
class Coder extends Worker {


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

class JavaCoder extends Worker {

	private Coder coder = new Coder();

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

	public Coder getCoder() {
		return coder;
	}
}