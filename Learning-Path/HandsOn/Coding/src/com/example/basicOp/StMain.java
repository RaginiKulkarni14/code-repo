package com.example.basicOp;

public class StMain {

	public static void main(String[] args) {

		 Student[] starray=new Student[3];
		 
		 starray[0]=new Student();
		 starray[0].setName("hj");
		 starray[0].marks=99;
		 
		 starray[1]=new Student();
		 starray[1].setName("hk");
		 starray[1].marks=90;
		 
		 starray[2]=new Student();
		 starray[2].setName("hk");
		 starray[2].marks=90;
		 
		 for(Student k:starray)
		 {
			// String h=k;
			 System.out.println(k);
		 }
		 
		 for(int i=0;i<starray.length;i++)
		 {
			 System.out.println("name:"+starray[i].getName()+"::"+"rn:"+starray[i].getName());
		 }
	}

}
