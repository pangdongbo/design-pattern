package com.powersmart.platform.principle.srp.improve;

/**
 * @description: 单一职责原则示例
 * @author: 庞东博
 * @create: 2020-10-26 17:37
 **/
public class SinglePrinciple {

	public static void main(String[] args) {
		LeaderImpl xiaoqi = new LeaderImpl("肖琪");
		xiaoqi.onDuty();
		xiaoqi.schedule();
		xiaoqi.offDuty();

		SubordinateImpl dufeilong = new SubordinateImpl("杜飞龙");
		dufeilong.onDuty();
		dufeilong.doWork();
		dufeilong.offDuty();
	}

}


/**
 * 员工类
 */
abstract class Employee {

	/**
	 * 姓名
	 */
	String name;

	public Employee(String name) {
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
class LeaderImpl extends Employee implements ILeader {

	public LeaderImpl(String name) {
		super(name);
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
class SubordinateImpl extends Employee implements ISubordinate {

	public SubordinateImpl(String name) {
		super(name);
	}

	/**
	 * 员工执行任务
	 */
	public void doWork() {
		System.out.println(this.name + "执行领导安排的任务");
	}
}