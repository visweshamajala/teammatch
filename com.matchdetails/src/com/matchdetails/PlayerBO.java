package com.matchdetails;

public class PlayerBO {
	//Player player =new Player(null, null, null);
	Player createPlayer (String data) {
		String [] arr=data.split(",");
		return new Player(arr[0], arr[1], arr[2]) ;
		
		
		
	}

}
