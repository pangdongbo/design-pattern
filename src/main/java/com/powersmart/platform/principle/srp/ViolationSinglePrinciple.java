package com.powersmart.platform.principle.srp;

/**
 * @description: 违反单一职责原则的示例：所有员工的职责都集中在一个类中
 * @author: 庞东博
 * @create: 2020-10-26 17:37
 **/
public class ViolationSinglePrinciple {

	public static void main(String[] args) {
		Employee xiaoqi = new Employee("肖琪");
		xiaoqi.onDuty();
		xiaoqi.schedule();
		xiaoqi.offDuty();

		Employee dufeilong = new Employee("杜飞龙");
		dufeilong.onDuty();
		dufeilong.exec();
		dufeilong.offDuty();
	}

}

/**
 * 员工类
 */
class Employee {

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

	/**
	 * 领导安排任务
	 */
	public void schedule() {
		System.out.println(this.name + "安排任务给下属");
	}

	/**
	 * 员工执行任务
	 */
	public void exec() {
		System.out.println(this.name + "执行领导安排的任务");
	}

}