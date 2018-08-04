package week1.day2;



public class ToPrintTestCAse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentList = {"Raja","Rani","Siva","James","John"};
		int[] ageList = {23,24,25,26,27,23};
		char[][] gradeList = {
				{'A','B','C','D','E'},
				{'A','c','d','c','E'},
				{'A','B','C','D','E'},
				{'A','B','B','D','E'},
				{'A','B','B','D','E'}
		};

		// To print Students Name and Age
		for(int i=0;i<=4;i++)
		{
			//	System.out.println(studentList[index] +  "  who is  " + ageList[index]+"  Grades are " + gradeList[index][0]+ ","+ gradeList[index][1]+ ","+ gradeList[index][2]+ ","+ gradeList[index][3]+ ","+ gradeList[index][4] );
			//	System.out.println(studentList[i] +  "  who is  " + ageList[i]+"  Grades are " + gradeList[i][0]+ ","+ gradeList[i][1]+ ","+ gradeList[i][2]+ ","+ gradeList[i][3]+ ","+ gradeList[i][4] );
			System.out.println(studentList[i] +  "  who is  " + ageList[i] +  "  old");
		}

	}
}


