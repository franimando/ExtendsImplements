package com.geometry.main;

import java.util.ArrayList;

public class ListGeometry {
	
	private ArrayList<Geometry> list;
	
	public ListGeometry() {
		this.list = new ArrayList<Geometry>();
	}
	
	public void add(Geometry item){
		list.add(item);
	}	
	public void remove(Geometry item){
		list.remove(item);
	}
	public Geometry get(int index){
		return list.get(index);
	}
	
	public int size(){
		return list.size();
	}
	
	
	// sort methods
	
	public ArrayList<Geometry> sortByArea(){
		ArrayList<Geometry> listResult = new ArrayList<>();
		listResult.addAll(this.list);
		int size = list.size();
		
		 for(int k=0; k<size-1; k++){
			 for(int i =k+1; i<size; i++){
				 if(listResult.get(k).computeArea()<listResult.get(i).computeArea()){
					 Geometry tem = listResult.get(k);//int tem = array[k];
					 listResult.set(k, listResult.get(i));//array[k]= array[i];
					 listResult.set(i, tem);//array[i]= tem;
				 }
			 }
		 }
		
		
		
		
		return listResult;
		
	}
	
	public ArrayList<Geometry> sortByPerimeter(){
		return null;
		
	}
	
	public ArrayList<Geometry> sortBySize(){
		ArrayList<Geometry> listResult = new ArrayList<>(this.list);
		listResult.addAll(this.list);
		int size = listResult.size();
		
		 for(int k=0; k<size-1; k++){
			 for(int i =k+1; i<size; i++){
				 if(listResult.get(k).getSide()<listResult.get(i).getSide()){
					 Geometry tem = listResult.get(k);//int tem = array[k];
					 listResult.set(k, listResult.get(i));//array[k]= array[i];
					 listResult.set(i, tem);//array[i]= tem;
				 }
			 }
		 }		
		return listResult;		
	}

}
