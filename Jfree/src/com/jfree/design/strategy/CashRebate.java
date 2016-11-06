package com.jfree.design.strategy;

/**
 * @Title: DiscountRebate
 * @Description: 总价折算
 * @CreateTime：Nov 2, 20154:03:39 PM
 * @author leizhenyang
 */
public class CashRebate extends CashStrategy {

	private double rebate;

	/**
	 * 折扣
	 * 
	 * @param rebate
	 */
	public CashRebate(double rebate) {
		// TODO Auto-generated constructor stub
		this.rebate = rebate;
	}

	@Override
	public double algorithmInterface(double pay, double cost) {
		// TODO Auto-generated method stub
		System.out.print("消费折扣：" + rebate + ",");
		return pay - cost * rebate;
	}
}
