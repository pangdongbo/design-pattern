package com.powersmart.platform.principle.isp;

/**
 * @description: 违反接口隔离示例
 * @author: 庞东博
 * @create: 2020-10-26 18:51
 **/
public class ViolationInterfaceSepraratePrinciple {


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
	 * 开始工作
	 */
	void doWork();

	/**
	 * 打卡
	 * @param type：打卡类型，1：上班  2：下班
	 */
	void clock(String type);

}