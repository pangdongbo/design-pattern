package com.powersmart.platform.principle.isp;

/**
 * @description: 违反接口隔离示例：一个员干了不应该干的事情
 * @author: 庞东博
 * @create: 2020-10-26 18:51
 **/
public class ViolationInterfaceSepraratePrinciple {

	public static void main(String[] args) {
		Leader xiaoqi = new Leader("肖琪");
		xiaoqi.onDuty();
		xiaoqi.schedule();
		xiaoqi.execute();
		xiaoqi.offDuty();

		Subordinate dufeilong = new Subordinate("杜飞龙");
		dufeilong.onDuty();
		dufeilong.schedule();
		dufeilong.execute();
		dufeilong.offDuty();
	}

}

/**
 * 员工接口
 */
interface IEmployee {

	/**
	 * 上班
	 */
	void onDuty();

	/**
	 * 下班
	 */
	void offDuty();

	/**
	 * 给下属安排任务
	 */
	void schedule();

	/**
	 * 执行领导安排的任务
	 */
	void execute();
}

/**
 * 领导类
 */
class Leader implements IEmployee {

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

	/**
	 * 员工执行任务
	 */
	public void execute() {
		System.out.println(this.name + "是领导，不需要执行任务");
	}
}

/**
 * 领导类
 */
class Subordinate implements IEmployee {

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
	 * 安排任务
	 */
	public void schedule() {
		System.out.println(this.name + "是下属，不需要安排任务");
	}

	/**
	 * 员工执行任务
	 */
	public void execute() {
		System.out.println(this.name + "执行领导安排的任务");
	}
}