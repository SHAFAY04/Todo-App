

package com.mycompany.todolist;

public class TodoList {

    String organization;
    
    public TodoList(String organization) {
        this.organization=organization;
    }

    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
