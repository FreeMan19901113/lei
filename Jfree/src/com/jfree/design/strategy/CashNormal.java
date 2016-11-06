package com.jfree.design.strategy;

/**
 * @Title: DiscountNormal
 * @Description: 无折扣
 * @CreateTime：Nov 2, 20154:03:39 PM
 * @author leizhenyang
 */
public class CashNormal extends CashStrategy {

	@Override
	public double algorithmInterface(double pay, double cost) {
		// TODO Auto-generated method stub
		return pay - cost;
	}

}
