package PracticeCodes;

public class MatricsTranspose {

	public static void main(String[] args) {
		
		int[][] test={ 
			{1,2,3},
			{4,5,6},	
			{7,8,9}
	};

		int [][] testTranspose= new int[3][3];
		
		
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				testTranspose[i][j]= test[j][i];
				
				
			}
			
		}
		
	for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				System.out.print(testTranspose[i][j]);
				System.out.print(",");
				
				
			}
			System.out.println("\n");
		}
	
	}
	
	
}
