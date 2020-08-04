package com.matchdetails;

public class MatchBO {
	public Match createMatch(String data, Team[] teamList) {
		String [] arr=data.split(",");
		Team team1=null,team2=null;
		for(Team team : teamList) {
			if(team.getName().equals(arr[1]))
				team1= team;
			if(team.getName().equals(arr[2]))
				team2= team;
		}
		
		return new Match(arr[0], team1, team2, arr[3]);
		
	}
	
	public void findTeam(String matchDate, Match[] matchList) {
		for(Match match : matchList) {
			if( match.getDate().equals(matchDate) )
					System.out.println(match.getTeamone().getName()+","+match.getTeamtwo().getName());
				
		}
	}
	
	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		for(Match match : matchList) {
			if( (match.getTeamone().getName().equals(teamName)) || (match.getTeamtwo().getName().equals(teamName)) )
				System.out.println(
						match.getDate()+" "+match.getTeamone().getName()+" "+match.getTeamtwo().getName()+" "+match.getVenue());
			
		}
		
	}
	


}
