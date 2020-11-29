package demos;

import java.util.List;

public class dataReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readCSV();
		readXLS();
	}
	
	public static void readCSV() {
		List <String[]> records = utilities.CSV.get("C:\\Users\\ychan\\Desktop\\automation\\original.csv");
		
		for(String[] record : records) {
			for(String field : record) {
				System.out.println(field);
			}
		}
	}
	
	public static void readXLS() {
		String[][] dataa = utilities.Excel.get("C:\\Users\\ychan\\Desktop\\automation\\original.xls");
	
		for(String[] record : dataa) {
			System.out.println("\n");
			System.out.println(record[0]);
			System.out.println(record[1]);
			System.out.println(record[2]);
		}
	}

}
