package lifeGame;


import org.junit.Before;
import org.junit.Test;

public class CellTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetStatus() {
		Cell cell=new Cell();
		int status=cell.getStatus();
		System.out.println(status);
		//fail("Not yet implemented");
	}

	@Test
	public void testSetStatus() {
		Cell cell=new Cell();
		int status=0;
		cell.setStatus(status);
		System.out.println(cell.getStatus());
		//fail("Not yet implemented");
	}

	@Test
	public void testGetLiving() {
		Cell cell=new Cell();
		int living=cell.getLiving();
		System.out.println(living);
		//fail("Not yet implemented");
	}

	@Test
	public void testSetLiving() {
		Cell cell=new Cell();
		int living=8;
		cell.setLiving(living);
		System.out.println(cell.getLiving());
		//fail("Not yet implemented");
	}

	@Test
	public void testUpdateStatus() {
	    Cell cell1=new Cell(1,0);
	    if(cell1.getLiving()>3||cell1.getLiving()<2) cell1.setStatus(0);
		else if(cell1.getLiving()==3) cell1.setStatus(1);
		else cell1.setStatus(cell1.getStatus());
		System.out.println(cell1.getStatus());
		
		Cell cell2=new Cell(1,1);
		if(cell2.getLiving()>3||cell2.getLiving()<2) cell2.setStatus(0);
		else if(cell2.getLiving()==3) cell2.setStatus(1);
		else cell2.setStatus(cell2.getStatus());
		System.out.println(cell2.getStatus());
		
		Cell cell3=new Cell(1,2);
		if(cell3.getLiving()>3||cell3.getLiving()<2) cell3.setStatus(0);
		else if(cell3.getLiving()==3) cell3.setStatus(1);
		else cell3.setStatus(cell3.getStatus());
		System.out.println(cell3.getStatus());
		
		Cell cell4=new Cell(1,3);
		if(cell4.getLiving()>3||cell4.getLiving()<2) cell4.setStatus(0);
		else if(cell4.getLiving()==3) cell4.setStatus(1);
		else cell4.setStatus(cell4.getStatus());
		System.out.println(cell4.getStatus());
		
		Cell cell5=new Cell(1,4);
		if(cell5.getLiving()>3||cell5.getLiving()<2) cell5.setStatus(0);
		else if(cell5.getLiving()==3) cell5.setStatus(1);
		else cell5.setStatus(cell5.getStatus());
		System.out.println(cell5.getStatus());
		
		Cell cell6=new Cell(1,8);
		if(cell6.getLiving()>3||cell6.getLiving()<2) cell6.setStatus(0);
		else if(cell6.getLiving()==3) cell6.setStatus(1);
		else cell6.setStatus(cell6.getStatus());
		System.out.println(cell6.getStatus());
	}
	
}
