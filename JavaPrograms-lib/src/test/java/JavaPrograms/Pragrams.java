package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class Pragrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateCharCount();
		removeDuplicates();
	}
	public static void duplicateCharCount()
	{
		String str ="abeade67era";
		char [] chArray= str.toCharArray();
		Map<Character,Integer>map = new HashMap<Character,Integer>();
		for(char ch:chArray)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
				
			}
		}
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{
			System.out.println(entry.getKey() +"  : " + entry.getValue());
		}
	}
	public static void removeDuplicates()
	{
		//HashSet is an unordered & unsorted collection of the data set, 
		//whereas the LinkedHashSet is an ordered and sorted collection of HashSet
		int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
		LinkedHashSet<Integer>lhashSet = new LinkedHashSet<Integer>();
		for(int i=0; i < arr.length;i++)
		{
			lhashSet.add(arr[i]);
		}
		System.out.println(lhashSet);
		
		HashSet<Integer>set = new HashSet<Integer>();
		
		for(int i=0; i < arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);
	}

}
