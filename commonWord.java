package com.datastructure;

import java.util.HashMap;

public class commonWord 
{
	public static void main(String[] args) 
	{
	  String[] user1 = new String[] {"/start","/green","/green","/blue","/register","/orange","/two","/orange","/blue"};
	
	 
	 
	  HashMap<String,Integer> hm = new HashMap<>();
      for(String tempString:user1)
        {
    	  if(hm.get(tempString) == null)
    	    {
    		  hm.put(tempString,1);
    		 
    	    }
    	  else
  	        {
    		  hm.put(tempString,hm.get(tempString)+1);
  	        }
        }
	 System.out.println(hm);

	}
}
