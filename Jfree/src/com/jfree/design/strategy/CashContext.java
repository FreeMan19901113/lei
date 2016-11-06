package com.jfree.design.strategy;

/**
 * @Title:Discount
 * @Description: 应收折算控制器
 * @CreateTime：Nov 2, 20154:05:03 PM
 * @author leizhenyang
 */
public class CashContext {
	/**
	 * 策略
	 */
	private CashStrategy strategy;

	public CashContext(int type) {
		// TODO Auto-generated constructor stub
		switch (type) {
		case 0:
			this.strategy = new CashNormal();
			break;
		case 1:
			this.strategy = new CashRebate(0.88);
			break;
		default:
			this.strategy = new CashReturn(300, 100);
			break;
		}
	}

	/**
	 * 折算
	 * 
	 * @param pay
	 * @param cost
	 * 
	 * @Author leizhenyang
	 * @Date Nov 2, 2015
	 */
	public void convert(double pay, double cost) {
		// "实收：" + pay + " 消费：" + cost + " 找零："
		System.out.println("找零：" + strategy.algorithmInterface(pay, cost));
		System.out.println();
	}
}
