package com.edubridge.jan31;

class CC
{
   public void disp1()
   {
	System.out.println("This is class CC");
   }
}

class AA extends CC
{
   public void disp2()
   {
	System.out.println("This is class AA");
   }
}

class BB extends CC
{
   public void disp3()
   {
	System.out.println("This is class BB");
   }
	
}

class D extends AA
{
   public void disp4()
   {
	System.out.println("This is class D");
   }
  
}
