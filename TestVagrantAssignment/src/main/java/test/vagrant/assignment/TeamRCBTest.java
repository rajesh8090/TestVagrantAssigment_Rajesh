package test.vagrant.assignment;

import java.io.File;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class TeamRCBTest {

	@Test
	public void gettest() {
		
		File file= new File("./data/input.json");
		JsonPath path=new JsonPath(file);
		
		List<String> foreignplayerlist = path.getList("player.findAll{it.country !='India'}.name");
		System.out.println(foreignplayerlist);
		Assert.assertEquals(foreignplayerlist.size(), 4);
		
		List<String> wicketkeeperlist = path.getList("player.findAll{it.role =='Wicket-keeper'}.name");
		System.out.println(wicketkeeperlist);
		Assert.assertEquals(wicketkeeperlist.size(), 1);


		
	
	}
}
