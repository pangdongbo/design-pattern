package com.powersmart.platform.principle.srp;

/**
 * @description: 违反单一职责原则的示例：所有员工的职责都集中在一个类中
 * @author: 庞东博
 * @create: 2020-10-26 17:37
 **/
public class ViolationSinglePrinciple {

	public static void main(String[] args) {
		User user = new User();
		user.addUser();
		user.deleteUser();
		user.addDept();
		user.deleteDept();
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
	
	public void addDept() {
		System.out.println("添加部门");
	}
	
	public void deleteDept() {
		System.out.println("删除部门");
	}

}