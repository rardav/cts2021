package ro.ase.cts.classes;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.utils.Utils;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = AngajatReader.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}