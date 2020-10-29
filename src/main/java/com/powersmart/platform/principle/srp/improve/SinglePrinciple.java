package com.powersmart.platform.principle.srp.improve;

/**
 * @description: 单一职责原则示例
 * @author: 庞东博
 * @create: 2020-10-26 17:37
 **/
public class SinglePrinciple {

	public static void main(String[] args) {
		User user = new User();
		user.addUser();
		user.deleteUser();

		Dept dept = new Dept();
		dept.addDept();
		dept.deleteDept();
	}

}

/**
 * 员工类
 */
class User {

	public void addUser() {
		System.out.println("添加用户");
	}

	public void deleteUser() {
		System.out.println("删除用户");
	}

}

/**
 * 部门类
 */
class Dept {

	public void addDept() {
		System.out.println("添加部门");
	}

	public void deleteDept() {
		System.out.println("删除部门");
	}

}