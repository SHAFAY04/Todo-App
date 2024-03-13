package com.mycompany.todolist;
public class Tasks{
    
    String name;
    String dis;
    String dueDate;
    String assignedBy;
    Tasks next;
    String username;
    
    Tasks(String username,String taskname,String dis, String dueDate, String assignedBy){
        System.out.println("taskname: " + taskname);
        this.username=username;
        this.name=name;
        this.dis=dis;
        this.dueDate=dueDate;
        this.assignedBy=assignedBy;
        this.next=null;
        
    }
    
}
