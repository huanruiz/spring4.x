package com.smart.injectfun;
public class Boss1 implements MagicBoss {

	@Override
	public Car getCar() {
		Car car = new Car();
		car.setBrand("宝马Z4");
		return car;
	}
}
