package fr.diginamic.enumeration;

import fr.diginamic.enumerations.Saison;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SaisonTest {

    @Test
    // test cas normaux
    void testValueOfLibelleCasNominaux() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE,       Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE,   Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER,     Saison.valueOfLibelle("Hiver"));
    }

    @Test
    // test si null
    void testValueOfLibelleNull() {
        assertNull(Saison.valueOfLibelle(null));
    }

    @Test
    // Test avec des valeurs différentes
    void testValueOfLibelleInconnu() {
        assertNull(Saison.valueOfLibelle("Saison inexistante"));
        assertNull(Saison.valueOfLibelle("il fait froid"));
    }

    @Test
    // Test si vide
    void testValueOfLibelleVide() {
        assertNull(Saison.valueOfLibelle(""));
    }

    @Test
    // Test pour sensible à la casse
    void testValueOfLibelleSensibiliteCasse() {
        assertNull(Saison.valueOfLibelle("printemps"));
    }

}
