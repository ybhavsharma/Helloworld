package org.studyeasy;
import java.util.*;
//To Remove the specific elements in the array using ArrayList
public class Array6 {

public static void main(String[] args) {
//TODO Auto-generated method stub
ArrayList<integer>list=new ArrayList<integer>();
list.add(1);
list.add(2);
list.add(42);
list.add(88);
list.add(99);
list.remove(2);
Iterator<integer> itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

}

}