package day3;

public class MultiDimensional {
	public static void main(String[] args) {
		
	
	String str1[][]= {
			{"tony","java","c","c++"}
			,{"thomas","java","unix"}
			,{"denil","linux","oracle"}
			,{"delvin","rdbms","c","oracle"}
			};
	for(int i=0;i<str1.length;i++) {
		if(str1[i][0].equals("denil")) {
			System.out.print(" details of denil \n");
			for(int j=1;j<str1[i].length;j++) {
				System.out.println(str1[i][j]);
			}
			System.out.println();
			break;
		}
	}
	}
}
