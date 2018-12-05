package fr.uga.projet1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;

import fr.uga.projet1.genericite.ExportTools;
import fr.uga.projet1.poo.Contact;
import fr.uga.projet1.poo.abstraction.CompSoldeDec;
import fr.uga.projet1.poo.heritage.CompteB;

public class App {
	public static void main(String[] args) {
		try {
			
			CompteB cb1 = new CompteB("AAA", 400);
			CompteB cb2 = new CompteB("BBB", 300);
			int resComp = cb1.compareTo(cb2);
			System.out.println("resComp = "+resComp);
			List<CompteB> lc = new ArrayList<>();
			lc.add(cb1);
			lc.add(cb2);
			
			List<CompteB> lc2 = Arrays.asList(cb1, cb2);
			Collections.sort(lc2);
			System.out.println("Apres tri croissant :");
			for (CompteB cb: lc2) {
				System.out.println(cb);
			}
			
			lc2.sort(new CompSoldeDec());
			System.out.println("Apres tri décroissant :");
			for (CompteB cb: lc2) {
				System.out.println(cb);
			}
			
			List<Contact> contacts = 
					Arrays.asList(new Contact(1,"toto",45), 
								  new Contact(2,"titi",1));
			ExportTools.exportCsv("contacts.csv", contacts);
			System.out.println("Export OK");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//Date nouvelleDate = new Date ();
		//System.out.println(nouvelleDate);
//java 8
		LocalDateTime loDate1 = LocalDateTime.now();
		DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/mm/YYYY");
		System.out.println(loDate1.format(dtf));
		
		LocalDate loDate2 = LocalDate.parse("05/12/1996", dtf);
		System.out.println(loDate2);
	}
	

}
