package com.edubridge.generics;
/* Program t demonstrate generic class by passing multiple parameters of different types  */
class Dictionary<K,V>
{
	//where k ,v defines any kind of Type-values
	K key;
	V value;
	
	void print(K key,V value) 
	{
		this.key = key;
		this.value = value;
		System.out.println("The value is : "+key +" "+value);
	}
}

public class GenericClassForMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary<Character,String> obj = new Dictionary<>();
		obj.print('c', "Cyclone");
		obj.print('d', "DoomsDay");

	}

}
