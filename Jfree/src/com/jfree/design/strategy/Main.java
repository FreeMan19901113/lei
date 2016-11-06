package com.jfree.design.strategy;

/**
 * @Title: 文件名
 * @Description: 策略模式
 * @CreateTime：Nov 2, 20154:08:41 PM
 * @author leizhenyang
 */
public class Main {
	public static void main(String[] args) {
		CashContext discount;
		double pay = 300.0;
		double cost = 300;
		discount = new CashContext(CashStrategyConstants.Normal);
		discount.convert(pay, cost);
		discount = new CashContext(CashStrategyConstants.Rebate);
		discount.convert(pay, cost);
		discount = new CashContext(CashStrategyConstants.Return);
		discount.convert(pay, cost);
	}
}
