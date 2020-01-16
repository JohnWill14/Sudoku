package br.com.william.sudoku;

import br.com.william.sudoku.controller.Controller;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class Main{
	public static void main(String[] args) {
		lookAndFeel();
		Controller programa=new Controller();
		programa.start();
	}
	private static void lookAndFeel() {

    	try {
    	    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
    	        if ("Nimbus".equals(info.getName())) {
    	            UIManager.setLookAndFeel(info.getClassName());
    	            break;
    	        }
    	    }
    	} catch (UnsupportedLookAndFeelException e) {
    	    // handle exception
    	} catch (ClassNotFoundException e) {
    	    // handle exception
    	} catch (InstantiationException e) {
    	    // handle exception
    	} catch (IllegalAccessException e) {
    	    // handle exception
    	}
    	
    }
}