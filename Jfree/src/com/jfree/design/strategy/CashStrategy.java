package com.jfree.design.strategy;

/**
 * @Title: DiscountStrategy
 * @Description: 折算策略
 * @CreateTime：Nov 2, 20154:02:43 PM
 * @author leizhenyang
 */
public abstract class CashStrategy {

	/**
	 * 
	 * @param pay
	 *            实收
	 * @param cost
	 *            应收
	 * @return
	 * 
	 * @Author leizhenyang
	 * @Date Nov 2, 2015
	 */
	public abstract double algorithmInterface(double pay, double cost);
}
