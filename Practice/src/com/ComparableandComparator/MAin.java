package com.ComparableandComparator;
import java.util.*;
import java.util.stream.Collectors;


class User  implements Comparator<User>{
	
    private String name;
    
    public User() {
		// TODO Auto-generated constructor stub
	}
    
    public User(String name) {
        this.name = name;
    }
    
    

    public String getName() {
        return name;
    }
       
    


	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return  o1.getName().compareTo(o2.getName());
	}
    
}

// class UserComparator implements Comparator<User>{
//	 
//	 @Override
//	public int compare(User o1, User o2) {
//		// TODO Auto-generated method stub
//		return  o1.getName().compareTo(o2.getName());
//	}
	 
	 
	 
 //}
 
 public class MAin {
	 
	// @Override
//	public int compare(User o1, User o2) {
//		// TODO Auto-generated method stub
//		return  o1.getName().compareTo(o2.getName());
//	}
	 public static void main(String [] args) {
		 
			
		 List<User> li = new ArrayList<User>();
		 li.add(new User("abhi"));
		 li.add(new User("chalie"));
		 li.add(new User("bob"));
		 li.add(new User("anand"));
		 
		 // Collections.sort(li, new UserComparator());
		// Collections.sort(li,new UserComparator());
		// Collections.sort(li, (a1,a2)->a1.getName().compareTo(a2.getName()));
		// Collections.sort(li, new User());
		 
		 li.sort(Comparator.comparing(User::getName));
		//List<User> ls= li.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
		    
		
		  for(User u:li) {
			  System.out.println(u);
		  }
	}
 }
  

 