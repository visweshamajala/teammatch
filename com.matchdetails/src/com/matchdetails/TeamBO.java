package com.matchdetails;

public class TeamBO {
	public Team createTeam(String data, Player[] playerList) {
		PlayerBO p = new PlayerBO();
		String [] arr=data.split(",");
		Player player=null;
		for(Player plar : playerList) {
			if(plar.getName().equals(arr[1]))
				player= plar;
		}
		return new Team(arr[0], player);
	}

}
