package com.geometry.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import com.geometry.main.Circle;
import com.geometry.main.Geometry;
import com.geometry.main.ListGeometry;
import com.geometry.main.Rectangle;
import com.geometry.main.Triangle;

public class ListGeometryTest {
	
	@Test
	public void testAdd(){
		
		ListGeometry listGeometry = new ListGeometry();
		
		listGeometry.add(new Circle(5));
		listGeometry.add(new Rectangle(2,3));
		listGeometry.add(new Triangle(3));
		Assert.assertEquals(1, listGeometry.size());
	}
	
	@Test
	public void testSortByArea(){
		ListGeometry listGeometry = new ListGeometry();
		
		Geometry[] expected = new Geometry[]{
				new Circle(5),
				new Rectangle(2,3),
				new Triangle(3),
				new Circle(1)
		};
		listGeometry.add(expected[3]);
		listGeometry.add(expected[2]);
		listGeometry.add(expected[1]);
		listGeometry.add(expected[0]);
		ArrayList<Geometry> listResult = listGeometry.sortByArea();
		
		
		/*Geometry[] arrayResult = new Geometry[4];
		result.toArray(arrayResult);
		
		Assert.assertEquals(expected, arrayResult);*/
		
		Assert.assertEquals(expected[0], listResult.get(0));
		Assert.assertEquals(expected[1], listResult.get(1));
		Assert.assertEquals(expected[2], listResult.get(2));
		Assert.assertEquals(expected[3], listResult.get(3));
		
		
	}

}
