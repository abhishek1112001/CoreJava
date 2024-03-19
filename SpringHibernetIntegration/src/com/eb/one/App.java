package com.eb.one;

import org.springframework.context.ApplicationContext;

import com.eb.beans.Student;
import com.eb.context.ContextProvider;
import com.eb.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
    ApplicationContext ctx= ContextProvider.provideContext();
    StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
    //insert
    Student ss=new Student();
    /*Student s=new Student(106,"dev");
    studentDao.insert(s);
    studentDao.getAllStudent();
    System.out.println(ss.getName()+" "+ss.getId());*/
    
    //studentDao.delete(104);
    /*studentDao.getAllStudent();
    System.out.println(ss.getName()+" "+ss.getId());*/
    
    Student s1=new Student();
    s1.setName("Abhishek");
    s1.setId(105);
    studentDao.update(s1);
    studentDao.getAllStudent();
    System.out.println(ss.getName()+" "+ss.getId());
    }
    
}
