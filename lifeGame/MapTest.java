package lifeGame;


import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class MapTest {
	private static Cell [][]cell=new Cell[4][4];
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testGetLiving() {
		int x=4,y=4;
		for(int i=0;i<x;i++) {
    		for(int j=0;j<y;j++) {
    			cell[i][j]=new Cell();
    			cell[i][j].setStatus(1);}}
		System.out.println("测试用例输出：");
    	for(int i=0;i<x;i++) {
    		for(int j=0;j<y;j++) {
    			int living=0;
    			if(i>0&&j>0) living+=cell[i-1][j-1].getStatus();
    			if(i>0) living+=cell[i-1][j].getStatus();
    			if(j>0) living+=cell[i][j-1].getStatus();
    			if(i<x-1&&j<x-1) living+=cell[i+1][j+1].getStatus();
    			if(i<x-1) living+=cell[i+1][j].getStatus();
    			if(j<x-1) living+=cell[i][j+1].getStatus();
    			if(i<x-1&&j>0) living+=cell[i+1][j-1].getStatus();
    			if(i>0&&j<x-1) living+=cell[i-1][j+1].getStatus();
    			cell[i][j].setLiving(living);
    			System.out.print(cell[i][j].getLiving()+" ");
    		}
    		System.out.println("");
    	}
    	System.out.println("预期输出：");
    	System.out.println("3 5 5 3");
    	System.out.println("5 8 8 5");
    	System.out.println("5 8 8 5");
    	System.out.println("3 5 5 3");
	}

 @Test
	public void testUpdate() {
		int x=4,y=4;
		for(int i=0;i<x;i++) {
    		for(int j=0;j<y;j++) {
    			cell[i][j]=new Cell();
    			cell[i][j].setStatus(1);}}
		//getLiving方法
		for(int i=0;i<x;i++) {
    		for(int j=0;j<y;j++) {
    			int living=0;
    			if(i>0&&j>0) living+=cell[i-1][j-1].getStatus();
    			if(i>0) living+=cell[i-1][j].getStatus();
    			if(j>0) living+=cell[i][j-1].getStatus();
    			if(i<x-1&&j<x-1) living+=cell[i+1][j+1].getStatus();
    			if(i<x-1) living+=cell[i+1][j].getStatus();
    			if(j<x-1) living+=cell[i][j+1].getStatus();
    			if(i<x-1&&j>0) living+=cell[i+1][j-1].getStatus();
    			if(i>0&&j<x-1) living+=cell[i-1][j+1].getStatus();
    			cell[i][j].setLiving(living);}}
		System.out.println("测试用例输出：");
    	for(int i=0;i<x;i++) 
    	{
    		for(int j=0;j<y;j++)
    		{
    			cell[i][j].UpdateStatus();
    			System.out.print(cell[i][j].getStatus()+" ");
    		}
    		System.out.println();
    	}
    	System.out.println("预期输出：");
    	System.out.println("1 0 0 1");
    	System.out.println("0 0 0 0");
    	System.out.println("0 0 0 0");
    	System.out.println("1 0 0 1");
	}
}
 