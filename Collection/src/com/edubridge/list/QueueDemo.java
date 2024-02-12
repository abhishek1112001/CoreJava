package com.edubridge.list;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>obj=new PriorityQueue <>();
		obj.add(11);
		obj.add(22);
		obj.add(33);
		obj.add(44);
		System.out.println(obj);
		for(int i:obj) 
		{
			System.out.print(i+" ");
		}
		
		Deque<Integer>d=new LinkedList <>();
		d.add(11);
		d.add(22);
		d.add(33);
		d.add(44);
		System.out.println(d);
		d.addFirst(10);
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peek());
		/*do not throw exception even if we use the pollLast method more times then the elements present in LinkedList
		 * d.pollLast();
		 * d.pollLast();
		 * d.pollLast();
		 * d.pollLast();
		 * d.pollLast();
		 * d.pollLast();*/
		/* It will throw exception even if we use the removeLast method more times then the elements present in LinkedList
		 * d.removeLast();
		 * d.removeLast();
		 * d.removeLast();
		 * d.removeLast();
		 * d.removeLast();
		 * d.removeLast();*/
		d.pollLast();
		System.out.println(d);
	}

}
