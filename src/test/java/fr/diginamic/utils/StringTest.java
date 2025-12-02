package fr.diginamic.utils;

import fr.diginamic.enumerations.Saison;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {


    @Test
    // test pour vérifier que la methode supprimés les espaces
    void testLevenshteinEspace() {
        // Espaces
        assertEquals(0, StringUtils.levenshteinDistance("chat ", "chat"));
        assertEquals(0, StringUtils.levenshteinDistance(" bonjour ", "bonjour"));
    }


    @Test
    // test avec null
    void testLevenshteinDistanceAvecNull() {

        // Cas ou lhs est null
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance(null, "chat");
        });

        // Cas ou rhs est null
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance("chat", null);
        });

        // Cas ou les deux sont null
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtils.levenshteinDistance(null, null);
        });
    }

    @Test
    // Test poyr chaine vide
    void testLevenshteinVide() {

         //Cas ou lhs est vide
        assertEquals(4, StringUtils.levenshteinDistance("","chat"));

        // Cas ou rhs est vide
        assertEquals(4, StringUtils.levenshteinDistance("Chat",""));

        }


    }





