package com.mycompany.unicafe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RuinWall
 */
public class KassapaateTest {
    
    Kassapaate kassa;
    Maksukortti rikas;
    Maksukortti opiskelija;
    
    @Before
    public void setUp() {
        kassa = new Kassapaate();
        rikas = new Maksukortti(1000);
        opiskelija = new Maksukortti(10);
    }

    @Test
    public void luotuRahaOikein() {
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void luotuEdullisetOikein() {
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void luotuMaukkaatOikein() {
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void maukasKateisostoPalauttaaOikein() {
        assertEquals(100, kassa.syoMaukkaasti(500));
    }
    
    @Test
    public void maukasKateisostoLisaaRahaaOikein() {
        kassa.syoMaukkaasti(500);
        assertEquals(100400, kassa.kassassaRahaa());
    }
    
    @Test
    public void maukasKateisostoLisaaOstojaOikein() {
        kassa.syoMaukkaasti(500);
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void maukasKateisostoPalauttaaOikeinKunEiVaraa() {
        assertEquals(300, kassa.syoMaukkaasti(300));
    }
    
    @Test
    public void maukasKateisostoLisaaRahaaOikeinKunEiVaraa() {
        kassa.syoMaukkaasti(300);
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void maukasKateisostoLisaaOstojaOikeinKunEiVaraa() {
        kassa.syoMaukkaasti(300);
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void edullinenKateisostoPalauttaaOikein() {
        assertEquals(260, kassa.syoEdullisesti(500));
    }
    
    @Test
    public void edullinenKateisostoLisaaRahaaOikein() {
        kassa.syoEdullisesti(500);
        assertEquals(100240, kassa.kassassaRahaa());
    }
    
    @Test
    public void edullinenKateisostoLisaaOstojaOikein() {
        kassa.syoEdullisesti(500);
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void edullinenKateisostoPalauttaaOikeinKunEiVaraa() {
        assertEquals(200, kassa.syoEdullisesti(200));
    }
    
    @Test
    public void edullinenKateisostoLisaaRahaaOikeinKunEiVaraa() {
        kassa.syoEdullisesti(200);
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void edullinenKateisostoLisaaOstojaOikeinKunEiVaraa() {
        kassa.syoEdullisesti(200);
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaastiKortillaPalauttaaTrue() {
        assertTrue(kassa.syoMaukkaasti(rikas));
    }
    
    @Test
    public void edullisestiKortillaPalauttaaTrue() {
        assertTrue(kassa.syoEdullisesti(rikas));
    }
    
    @Test
    public void maukkaastiKortillaOttaaRahatOikein() {
        kassa.syoMaukkaasti(rikas);
        assertEquals(600, rikas.saldo());
    }
    
    @Test
    public void edullisestiKortillaOttaaRahatOikein() {
        kassa.syoEdullisesti(rikas);
        assertEquals(760, rikas.saldo());
    }
    
    @Test
    public void maukkaastiKortillaKasvattaaMyytyja() {
        kassa.syoMaukkaasti(rikas);
        assertEquals(1, kassa.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void edullisestiKortillaKasvattaaMyytyja() {
        kassa.syoEdullisesti(rikas);
        assertEquals(1, kassa.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaastiKortillaPalauttaaFalseKunEiRahaa() {
        assertTrue(!kassa.syoMaukkaasti(opiskelija));
    }
    
    @Test
    public void edullisestiKortillaPalauttaaFalseKunEiRahaa() {
        assertTrue(!kassa.syoEdullisesti(opiskelija));
    }
    
    @Test
    public void maukkaastiKortillaOttaaRahatOikeinKunEiRahaa() {
        kassa.syoMaukkaasti(opiskelija);
        assertEquals(10, opiskelija.saldo());
    }
    
    @Test
    public void edullisestiKortillaOttaaRahatOikeinKunEiRahaa() {
        kassa.syoEdullisesti(opiskelija);
        assertEquals(10, opiskelija.saldo());
    }
    
    @Test
    public void maukkaastiKortillaEiKasvattaMyytyjaKunEiRahaa() {
        kassa.syoMaukkaasti(opiskelija);
        assertEquals(0, kassa.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void edullisestiKortillaEiKasvataMyytyjaKunEiRahaa() {
        kassa.syoEdullisesti(opiskelija);
        assertEquals(0, kassa.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaastiKortillaEiMuutaRahaa() {
        kassa.syoMaukkaasti(rikas);
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void edullisestiKortillaEiMuutaRahaa() {
        kassa.syoEdullisesti(rikas);
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void maukkaastiKortillaEiMuutaRahaaKunEiRahaa() {
        kassa.syoMaukkaasti(opiskelija);;
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void edullisestiKortillaEiMuutaRahaaKunEiRahaa() {
        kassa.syoEdullisesti(opiskelija);
        assertEquals(100000, kassa.kassassaRahaa());
    }
    
    @Test
    public void lataaKortilleOikeanSumman() {
        kassa.lataaRahaaKortille(rikas, 1000);
        assertEquals(2000, rikas.saldo());
    }
    
    @Test
    public void ladatessaKortilleLisääOikeanSumman() {
        kassa.lataaRahaaKortille(rikas, 1000);
        assertEquals(101000, kassa.kassassaRahaa());
    }
    
    @Test
    public void eiLataaKortilleNegatiivista() {
        kassa.lataaRahaaKortille(rikas, -1000);
        assertEquals(1000, rikas.saldo());
    }
    
    @Test
    public void ladatessKortilleNegatiivistaEiMuutaRahaa() {
        kassa.lataaRahaaKortille(rikas, -1000);
        assertEquals(100000, kassa.kassassaRahaa());
    }
}
