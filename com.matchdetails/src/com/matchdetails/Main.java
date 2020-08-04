package com.matchdetails;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	PlayerBO playerBO= new PlayerBO();
	TeamBO teamBO= new TeamBO();
	MatchBO matchBO= new MatchBO();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the player count "); 
	int noOfPlayers=sc.nextInt();
	sc.nextLine();
	Player[] playerList= new Player[noOfPlayers];
	
	for(int i=0; i<noOfPlayers; i++) {
		System.out.println("Enter player "+(i+1)+" details");
		playerList[i]=playerBO.createPlayer(sc.nextLine());
	}
	
	System.out.println("Enter the Team count "); 
	int noOfTeams=sc.nextInt();
	sc.nextLine();
	Team[] teamList= new Team[noOfTeams];
	
	for(int i=0; i<noOfTeams; i++) {
		System.out.println("Enter team "+(i+1)+" details");
		teamList[i]=teamBO.createTeam(sc.nextLine(),playerList);
	}
	System.out.println("Enter the Match count "); 
	int noOfMatches=sc.nextInt();
	sc.nextLine();
	Match[] matchList= new Match[noOfMatches];
	
	for(int i=0; i<noOfMatches; i++) {
		System.out.println("Enter match "+(i+1)+" details");
		matchList[i]=matchBO.createMatch(sc.nextLine(), teamList);
	}
		System.out.println("Menu");
		System.out.println("1) Find Team  \n" + 
				"2) Find All Matches In A Specific Venue");
		System.out.println("enter 1or2");
		switch(sc.nextInt()){
		case 1: 
			System.out.println("Enter match date");
			matchBO.findTeam(sc.next(), matchList);
			break;
		case 2:
			System.out.println("Enter Team name");
			matchBO.findAllMatchesOfTeam(sc.next(), matchList);
			break;
		default:
			System.out.println("Enter a valid input");
		}
		
	
}
}
