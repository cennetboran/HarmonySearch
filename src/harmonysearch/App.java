/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonysearch;

/**
 *
 * @author lenovo
 */
public class App 
{
    public static void main( String[] args )
    {
    	int iter = 10000;
    	int UpLevel = 100;
    	int LowLevel = -100; 
    	int searchAgent = 50;
    	int dimension = 10;
    	
    	//Harmony Search Algoritm
		//HMCR = 0.9;
		//PAR = 0.4;
		//BW = 0.2;
		double HMCRValue = 0.99;
		double PARValue = 0.5;
		double BWValue = 0.5;
	    HarmonySearchAlgoritms HSA = new HarmonySearchAlgoritms(iter, UpLevel, LowLevel, searchAgent, dimension, HMCRValue, PARValue, BWValue);
		double[][] best1 = HSA.solution();
		System.out.println("Optimized value = " + best1[0][0]);
		for(int i = 0; i < dimension; i++) {
			System.out.println("x["+i+"] = " + best1[1][i]);
		}
    }
}
