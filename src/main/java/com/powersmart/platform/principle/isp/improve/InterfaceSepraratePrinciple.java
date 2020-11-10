package com.powersmart.platform.principle.isp.improve;

/**
 * @description: 符合依赖倒置原则
 * @author: 庞东博
 * @create: 2020-10-29 19:31
 **/
public class InterfaceSepraratePrinciple {

	public static void main(String[] args) {
		Leader xiaoqi = new Leader("肖琪");
		xiaoqi.onDuty();
		xiaoqi.schedule();
		xiaoqi.offDuty();

		Subordinate dufeilong = new Subordinate("杜飞龙");
		dufeilong.onDuty();
		dufeilong.doWork();
		dufeilong.offDuty();
	}

}

/**
 * 员工类
 */
interface Employee {

	/**
	 * 上班
	 */
	void onDuty();

	/**
	 * 下班
	 */
	void offDuty();

}

/**
 * 领导的职责
 */
interface ILeader {
	void schedule();
}

/**
 * 领导的职责
 */
interface ISubordinate {
	void doWork();
}

/**
 * 领导
 */
class Leader implements ILeader {

	/**
	 * 姓名
	 */
	String name;

	public Leader(String name) {
		this.name = name;
	}

	/**
	 * 上班
	 */
	public void onDuty() {
		System.out.println(this.name + "上班了");
	}

	/**
	 * 下班
	 */
	public void offDuty() {
		System.out.println(this.name + "下班了");
	}

	/**
	 * 安排任务
	 */
	public void schedule() {
		System.out.println(this.name + "安排任务给下属");
	}

}

/**
 * 下属
 */
class Subordinate implements ISubordinate {

	/**
	 * 姓名
	 */
	String name;

	public Subordinate(String name) {
		this.name = name;
	}

	/**
	 * 上班
	 */
	public void onDuty() {
		System.out.println(this.name + "上班了");
	}

	/**
	 * 下班
	 */
	public void offDuty() {
		System.out.println(this.name + "下班了");
	}

	/**
	 * 员工执行任务
	 */
	public void doWork() {
		System.out.println(this.name + "执行领导安排的任务");
	}
}