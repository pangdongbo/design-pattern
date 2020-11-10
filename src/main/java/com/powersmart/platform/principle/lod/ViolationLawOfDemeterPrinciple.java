package com.powersmart.platform.principle.lod;

/**
 * @description: 违反迪米特原则的示例：
 * @author: 庞东博
 * @create: 2020-11-10 19:45
 **/
public class ViolationLawOfDemeterPrinciple {

	public static void main(String[] args) {
		new Leader().schedule();
	}

}

/**
 * 领导
 */
class Leader {

	public void schedule() {
		System.out.println("领导提出需求");
		TeamLeader teamLeader = new TeamLeader("肖琪");
		Coder coder = new Coder("杜飞龙");
		teamLeader.work(coder);

	}

}

class TeamLeader {

	public TeamLeader(String name) {

	}

	public void work(Coder coder) {
		System.out.println("组长分配任务");
		coder.code();
	}

}

/**
 * 程序员
 */
class Coder {

	public Coder(String name) {

	}

	public void code() {
		System.out.println("码农熬夜写代码");
	}

}