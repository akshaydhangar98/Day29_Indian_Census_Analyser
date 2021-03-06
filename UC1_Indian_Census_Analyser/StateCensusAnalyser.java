package UC1_Indian_Census_Analyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;


public class StateCensusAnalyser {
	
	public static int LoadIndiaCensusData(String csvPath) throws IOException   {
		
		Reader reader;
			reader = Files.newBufferedReader(Paths.get(csvPath));
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		CsvToBean <IndianCensusCSV> csvToBean = new CsvToBeanBuilder(reader)
                                      .withType(IndianCensusCSV.class)
                                      .withIgnoreLeadingWhiteSpace(true)
                                      .build();
		Iterator<IndianCensusCSV> censusCSVIterator = csvToBean.iterator();;
		int entries = 0;
		while(censusCSVIterator.hasNext()) {
			entries++;
			IndianCensusCSV censusData = censusCSVIterator.next();
		}
		System.out.println("Number of Entries in File"+entries);
		return entries;	
		
	}
	
	public static void main(String[] args) throws IOException {
		String csvPath =

}
