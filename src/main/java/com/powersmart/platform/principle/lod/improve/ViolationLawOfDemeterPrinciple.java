package com.powersmart.platform.principle.lod;

/**
 * @description: 违反迪米特原则的示例：
 * @author: 庞东博
 * @create: 2020-11-10 19:45
 **/
public class ViolationLawOfDemeterPrinciple {

	public static void main(String[] args) {

	}

}

/**
 * 领导
 */
class Leader {

	public void schedule() {
		Coder coder = new Coder();
		TeamLeader teamLeader = new TeamLeader();
		teamLeader.work(coder);

	}

}

class TeamLeader {

	public void work(Coder coder) {
		// 安排工作
		coder.code();
	}

}

/**
 * 程序员
 */
class Coder {

	public void code() {
		System.out.println("写代码");
	}

}