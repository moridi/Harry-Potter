package seviceTest;

import service.*;

import java.io.IOException;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

import entities.*;

	public class HouseServiceTest {
		
		@Test
		public void getAndSetHouseDataTest() throws IOException{
			House Rave = new House("Ravenclaw");
			HouseService ravenclaw = new HouseService(Rave);
			
			ravenclaw.getData("HouseDB.txt");
			
			Vector<House> allHouses = ravenclaw.getAllHouses();
			String actual = allHouses.get(0).toString();
			String expected = "House [name=Ravenclaw, school=Hogwarts]";
			Assert.assertEquals(expected, actual);	
			
			ravenclaw.setData();//Check HouseDB.txt
		
		}
}
