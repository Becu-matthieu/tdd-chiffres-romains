package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }

    public String en_romain() {
		
		String[] tab = new String[6];
		tab[0] = "";
		tab[1] = "I";
		tab[2] = "II";
		tab[3] = "III";
		tab[4] = "IV";
		tab[5] = "V";
		return tab[valeur];
    }
}
