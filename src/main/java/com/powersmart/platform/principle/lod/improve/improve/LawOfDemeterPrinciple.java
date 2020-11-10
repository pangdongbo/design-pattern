package com.powersmart.platform.principle.lod;

/**
 * @description: 迪米特原则的示例：
 * @author: 庞东博
 * @create: 2020-11-10 19:45
 **/
public class LawOfDemeterPrinciple {

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
		teamLeader.work();

	}

}

class TeamLeader {

	public TeamLeader(String name) {

	}

	public void work() {
		System.out.println("组长分配任务");
		Coder coder = new Coder("杜飞龙");
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