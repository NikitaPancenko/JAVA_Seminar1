package service;

import java.util.Arrays;

/**
 * @author s20pancniki
 * @version
 * MainService class for JAVA basics
 * 
 */

public class MainService {

	private static String name;
	private static int age;
	private static float height;
	private static boolean hasExperienceInJAVA;
	private static char sex;
	
	
	
	
	
	public static void main(String[] args) {

		//----------------------------Mainigo piemeri--------------------//
		//System.out.println("Sveiciens JAVA pasaule!");
		name = "Karina";  //name = new String("Karina"); garais pieraksts
		age = 18;
		height = 1.76f;
		hasExperienceInJAVA = true;
		sex = 'F'; //var ari sex = 70; jo pec ASCII panems
		
		String surname = "Skirmante"; //nav ieteicams izmantot var apmacibu procesa
		
		
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(hasExperienceInJAVA);
		System.out.println(sex);
		System.out.println(surname);
		
		System.out.println(name + " " + surname + " (" + age + ") " + height + " m, ir pieredze JAVA: " + hasExperienceInJAVA + " dzimums: " + sex);
		
		//--------------------------Masivu piemeri---------------------//
		
		
		int [] grades = {3, 5, 8, 1, 7, 9, 10};
		System.out.println(grades[3]); //grades[100] <- izmetis kludu
		System.out.println(grades); // ipzrintes tikai adresi
		
		
		//izprintes visus elementus
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i] + " ");
		}
		System.out.println();
		System.out.println("hei");
		
		System.out.println(Arrays.toString(grades));
		
		//foreach cikls
		
		for(int temp : grades) {
			System.out.println(temp + " ");
		}
		System.out.println();
		
		//--------------------------string piemeri---------------------//
		
		String animal = "Cat";
		String city = "Liepaja";
		String fruits = "Banana";
		
		String courseTitle = "Programmesana timekli JAVA";
		String facultyTitle = "Itf";
		String studyProgram = "Datorzinatnes";
		
		String email = "s20pancniki@venta.lv";
		String accountNo = "LV03HABA0551002144730";
		
		System.out.println("Kursa nosaukuma garums: " + courseTitle.length());
		System.out.println(facultyTitle.charAt(0) + " " + facultyTitle.charAt(1) + " " + facultyTitle.charAt(2));
		System.out.println("Sakas ar D: " + studyProgram.startsWith("D"));
		
		System.out.println("Programma atbilst formatejumam: " + studyProgram.matches("[A-Z]{1}[a-z ]{4,30}")); //regex101
		System.out.println("Konts atbilst formatejumam: " + accountNo.matches("[A-Z]{2}[0-9]{2}[A-Z]{4}[0-9]{13}$"));
		
		
		//--------------------------datu tipu maians piemeri---------------------//
		
		double EX = 3000.14765782658;
		float EXf = (float)EX;
		byte EXb = (byte)EX;
		short EXs = (short)EX;
		long EXl = (long)EX;
		
		System.out.println(EX);
		System.out.println(EXf);
		System.out.println(EXb);
		System.out.println(EXl);
		
		String price = "2.34";
		
		float pricef = Float.parseFloat(price);
		System.out.println("Cena ir " + pricef + " eur");
		int agei = Integer.parseInt("18");
		System.out.println("vecums ir: " + agei);
		
	}

}
