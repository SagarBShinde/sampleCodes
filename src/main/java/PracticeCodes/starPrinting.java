package PracticeCodes;

public class starPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String star= "";
		
		
		for (int i=0; i<5; i++){
			
			for (int j=0; j<i; j++){
				
				star += "*";
				
			}
			
			star += "\n";
		}
		
		//System.out.println(star);
		diamondStar(10);

	}

	
	public static void diamondStar(int level){
		
		StringBuilder sb = new StringBuilder();
		int i;
		int a;
		
		for (i=0; i<= level/2;i++){
				for (int k=0; k< (level/2)-i;k++){
					sb.append(' ');
			}
			
		for (int j= (level/2)-i; j<=(level/2)+i;j++){
			sb.append('*');
		}
			sb.append('\n');
	
	}
		System.out.println(i);
	//	System.out.println(sb);
		
		for (a=i; a > 0;a--){
			
			for(int b=0;b<=i-a;b++){
				sb.append(' ');
				
			}
			sb.append('\n');
			
		}
		System.out.println(sb);
	}	
}