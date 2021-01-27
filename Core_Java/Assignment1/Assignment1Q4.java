import java.lang.*;
import java.util.*;

class ResultDeclaration {
	public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {

		if ((subject1Marks + subject2Marks + subject3Marks) > 60) {
			if (subject1Marks > 60 && subject2Marks < 60 && subject2Marks < 60) {
				return "failed";
			} else if (subject1Marks < 60 && subject2Marks > 60 && subject2Marks < 60) {
				return "failed";
			} else if (subject1Marks < 60 && subject2Marks < 60 && subject2Marks > 60) {
				return "failed";
			} else if ((subject1Marks + subject2Marks) > 60 || (subject2Marks + subject3Marks) > 60
					|| (subject3Marks + subject1Marks) > 60) {
				return "passed"+"\n"+"promoted";
			}
		}

		if ((subject1Marks + subject2Marks + subject3Marks) < 60) {
			return "failed";
		}

		if ((subject1Marks + subject2Marks) > 60 || (subject2Marks + subject3Marks) > 60
				|| (subject3Marks + subject1Marks) > 60) {
			return "promoted";
		}
		return "passed";
	}

}

public class Assignment1Q4 {
	public static void main(String[] args) {

		double m1 , m2 , m3;
		Scanner src = new Scanner(System.in);
		m1 = src.nextDouble();
		m2 = src.nextDouble();
		m3 = src.nextDouble();
		System.out.println(new ResultDeclaration().declareResults(m1,m2,m3));
	}
}
