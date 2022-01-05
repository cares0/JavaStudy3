package com.cares.s1.same;

public class Square {
	
	int width;
	int height;
	
	
	public boolean same(Square square) {
		// 멤버변수 width 값과 인자값으로 받은 객체의 width가 같고,
		// 멤버변수 height 값과 인자값으로 받은 객체의 height가 같으면 true
		// 둘중 하나라도 다르면 false
		boolean check = false;
		if (this.width == square.width && this.height == square.height) {
			check = true;
		}
		
		return check;
		
	}
}
