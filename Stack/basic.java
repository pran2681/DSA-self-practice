package Stack;

import java.util.Iterator;
import java.util.Stack;

public class basic {
    public static void main(String args[]){
        Stack<Integer> stk=new Stack<>(); ///creation of the stack
        boolean result = stk.isEmpty();///use of empty
        System.out.println("Is the stack is empty"+result);
        
        //push operation
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.out.println(stk);
        result=stk.isEmpty();
        System.out.println("Is the stack is empty"+result);

        //pop operation
        stk.pop();
        System.out.println(stk);

        //using peek opration
        int top=stk.peek();
        System.out.println(" Top of the stack is "+top);

        //using search opration
        int location=stk.search(1);
        System.out.println("location of the searched element is: "+location);

        //using size opration
        int SIZE=stk.size();
        System.out.println("Size of the stack is: "+SIZE);

        //using iterator opration
        Iterator iterator=stk.iterator();
        while(iterator.hasNext()){
            Object values=iterator.next();
            System.out.println("values on the stack is: "+values);
        }

    }
}
