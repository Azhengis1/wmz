package lifeGame;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Control {
	 final static public int x=64;
	    final static public int y=64;
    Control() {
    	JFrame jframe=new JFrame();
    	jframe.setSize(700,700);
    	JPanel jpanel=new JPanel();
    	jpanel.setBounds(0,0,400,400);
    	int count=0;
    	Cell [][]cell=new Cell[x][y];
    	cell=Map.initial();
    	Map.getLiving(cell);
    	jframe.setTitle("第"+count+"次演化");
    	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jframe.setLocationRelativeTo(null);
    	jframe.add(jpanel);
    	jframe.setVisible(true);
    	Graphics g=jpanel.getGraphics();
    	for(int i=0;i<x;i++) {
    		for(int j=0;j<y;j++) {
    			g.drawRect(i*10, j*10, 10, 10);
    		}
    	}
    	for(int i=0;i<x;i++) {
    		for(int j=0;j<y;j++) {
    			if(cell[i][j].getStatus()==1) {
    				g.fillRect(i*10, j*10, 10, 10);
    			}
    			else {
    				g.drawRect(i*10, j*10, 10, 10);
    			}
    		}
    	}
    	long d1= System.currentTimeMillis();
    	while(true) {
    		long d2= System.currentTimeMillis();
    		if(d2-d1>200) {
    			int change;
    			d1=d2;
    			jframe.repaint();
    			change=Map.update(cell);
    			Map.getLiving(cell);
    			for(int i=0;i<x;i++) {
    	    		for(int j=0;j<y;j++) {
    	    			g.drawRect(i*10, j*10, 10, 10);
    	    		}
    	    	}
    			for(int i=0;i<x;i++) {
    				for(int j=0;j<y;j++) {
    					if(cell[i][j].getStatus()==1) {
    	    				g.fillRect(i*10, j*10, 10, 10);
    	    			}
    	    			else {
    	    				g.drawRect(i*10, j*10, 10, 10);
    				    }
    				}
    			}
    		    count++;
    		    jframe.setTitle("第"+count+"次演化");
    			if(change==x*y) break;
    			if(count>5000) break;
    	    }	    	
      }
    	JOptionPane.showMessageDialog(jframe, "在第"+count+"次演化达到平衡", "提示", JOptionPane.PLAIN_MESSAGE);
    }
}


