package com.bridgelabz.logicalprograms;

public class CouponNumber {
    public static void main(String[] args) {
		
		char[] chars = "123456789".toCharArray();
		int num = 100000000;
		int random = (int) (Math.random()*num);
		StringBuffer b = new StringBuffer();
		
		while(random>0) {
			b.append(chars[random%chars.length]);
			random /= chars.length;
		}
		String couponCode = b.toString();
		System.out.println("Coupon Numbers : "+couponCode);
	}
}
