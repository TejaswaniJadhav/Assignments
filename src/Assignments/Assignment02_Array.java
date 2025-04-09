package Assignments;

public class Assignment02_Array {

	public static void main(String[] args) {
		
		//3D Array
		String [] [] [] Semesters = { //Semester 1
				{{"Math1","78"},{"Physics","85"},{"Chemistry","91"},{"Computer Programming","74"},{"Engineering drawing","88"},{"Basic Electrical Eng.","79"}
				
				},
				//Semester 2
				{{"Math2","82"},{"Mechanics","77"},{"Environmental Sci.","93"},{"Basic Electronics","69"},{"Engineering Physics","84"},{"Engineering Graphics","90"}
				
				},
				//Semester 3
				{{"Data Structure","88"},{"Discrete Maths","81"},{"Digital Electronics","76"},{"Operating System","92"},{"Signals and Systems","85"},{"Object Oriented Prg.","78"}
				
				},
				//Semester 4
				{{"Algorithms","91"},{"Computer Networks","73"},{"Database System","89"},{"Microprocessors","80"},{"Communication Eng.","76"},{"Software Engineering","87"}
				
				},
				//Semester 5
				{{"Probability and Stats","86"},{"Machine Learning","88"},{"Compiler Design","84"},{"Theory of Computation","95"},{"Embedded Systems","73"},{"Computer Graphics","90"}
				
				}
				
				
				
				

		};
	
		System.out.println("names of 3rd semesters 4th subject:"+ Semesters [2][3][0] +" and" +" 5th subject:" + Semesters [2][4][0] );   
		
	    System.out.println("marks of 5th semesters 3rd subject:"+ Semesters [4][2][1] +" and" +" 6th subject:" + Semesters [4][5][1]);
				
	} 	
	   
}
