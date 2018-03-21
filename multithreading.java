import java.io.*;
import java.lang.*;
class thread1 extends Thread
{
	int i;
	public void run()
	{
		for(i=0;i<5;i++)
		{
			System.out.println("i="+i);
			//sleep(1000);
		}
	}
}
 class thread2 extends Thread
{
	int j;
	public void run()
	{
		for(j=0;j<10;j++)
		{
			System.out.println("j="+j);
			//wait();
		}
	}
}
 class thread3 extends Thread
{
	int z;
	public void run()
	{
		for(z=0;z<20;z++)
		{
			System.out.println("z="+z);
			//sleep(500);
		}
	}
}
class multithreading
{
	public static void main(String args[])
	{
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		thread3 t3=new thread3();
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}