package edu.wit.desn.comp2000.queueapp;

import java.util.ArrayList;

import com.pearson.carrano.ArrayQueue;

public class TrainRoute
{
	private ArrayList<Train> inboundTracks = new ArrayList<Train>(30);
	private ArrayList<Train> outboundTracks = new ArrayList<Train>(30);
	private int location;
	private int destinationID;
	private int arrivalID;
	
	public TrainRoute (int arrivalID1, int destinationID1)
	{
		destinationID = destinationID1;
		arrivalID = arrivalID1;
	}
	/**
	 * this method will reverse the direction of 
	 * any train which has reached the end of the route. 
	 * @param location
	 * @return
	 */
	public int reverseDirection(int location)
	{
		return location;
		
	}
	
}
