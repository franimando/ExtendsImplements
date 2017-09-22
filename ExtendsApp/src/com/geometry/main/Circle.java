package com.geometry.main;

public class Circle extends Geometry {
	
	private static final float PI = 3.1416f;
	private float r;
	
	public Circle(int r) {
		super(Integer.MAX_VALUE);
		this.r = r;
	}
	
	@Override
	public float computeArea(){
		return PI*r*r/2;
	}

	@Override //creado con Shift + Alt + S --> Create /implement Methods
	public float computePerimeter() {
		return 2*PI*r;
	}

}
