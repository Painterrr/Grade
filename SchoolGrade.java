import java.util.Arrays;
import java.util.Scanner;
import java.lang.Float;

class SchoolGrade {
	public static void main(String[] args) {
		System.out.println("put scores of subjects");
		Scanner in = new Scanner(System.in);
		
		String name[] = new String[3];
		String subject[] = {
				"Kor",
				"Eng",
				"Math"
		};
		int score[][] = {
				{0, 0, 0},
				{0, 0, 0},
				{0, 0, 0}
		};
		
		int sum[] = {0, 0, 0};
		float avg[] = {0.0f, 0.0f, 0.0f};
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("Name[%d]: ", i);
			name[i]= in.next();
			for(int j=0; j<score[i].length; j++) {
				System.out.println("order: " + subject[j]);
				System.out.printf("[%d] : ", j+1);
				score[i][j]= in.nextInt();
			}
			System.out.println("===================================");
		}		
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d\n", i, j, score[i][j]);
				sum[i] += score[i][j];
			}
			avg[i] = sum[i]/(float)score[i].length;
		}

		System.out.println("===================================");
		System.out.println("Name[Kor, Eng, Math] Sum, Avg");
		System.out.println("===================================");
		
		for(int i=0; i<score.length; i++) {
			System.out.printf(name[i]+ " " + Arrays.toString(score[i])+ ", " + "%3d, " + "%3.2f" + "\n", sum[i], avg[i]);
		}
	}
}