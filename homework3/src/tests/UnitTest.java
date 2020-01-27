package tests;

import javax.naming.spi.ResolveResult;

import homework3.Student;

public class UnitTest {

	public static void Speciality(Student student) {

		String inputSpec = "BIT";
		String outputSpec = student.getSpeciality();

		if (assertString(inputSpec, outputSpec)) {

			System.out.println("The student follows  BIT. ");
		} else {
			System.out.println(" The student is not flowing " + inputSpec + " but he flowing  " + outputSpec);
		}
	}

	private static boolean assertString(String inputSpec, String outputSpec) {
		// TODO Auto-generated method stub
		return inputSpec.equals(outputSpec);
	}

}
