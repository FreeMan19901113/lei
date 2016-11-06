package com.jfree.design.strategy;

/**
 * @Title: DiscountReturn
 * @Description: 返利
 * @CreateTime：Nov 2, 20154:03:39 PM
 * @author leizhenyang
 */
public class CashReturn extends CashStrategy {

	private int reach;
	private int back;

	/**
	 * 满N返N
	 * 
	 * @param reach
	 *            满
	 * @param back
	 *            返
	 */
	public CashReturn(int reach, int back) {
		// TODO Auto-generated constructor stub
		this.reach = reach;
		this.back = back;
	}

	@Override
	public double algorithmInterface(double pay, double cost) {
		// TODO Auto-generated method stub
		if (cost >= reach) {
			System.out.print("消费满" + reach + "立减" + back + ",");
			cost = cost - back;
		}
		return pay - cost;
	}
}
