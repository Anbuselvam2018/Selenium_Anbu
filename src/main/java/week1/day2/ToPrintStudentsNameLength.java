package week1.day2;



public class ToPrintStudentsNameLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentList = {"Rajassss","Raniiiiiii","Siva","James","John"};
		int[] ageList = {23,24,25,26,27,23};
		char[][] gradeList = {
				{'A','B','C','D','E'},
				{'A','c','d','c','E'},
				{'A','B','C','D','E'},
				{'A','B','B','D','E'},
				{'A','B','B','D','E'}
		};

		// To display the student name length
		for(int i=0;i<=4;i++)
		{
			System.out.println(studentList[i].length());
		}

	}
}


