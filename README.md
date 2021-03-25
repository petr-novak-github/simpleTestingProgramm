# simpleTestingProgramm
My first programm using testing methods for testing methods. See read.me for my notes ..

Simple testing. In this program is simple class with two simple methods. And there is another class, testing class, which is testing this two methods.

private static final double DELTA = 0.000001;

- tohle je v tom testovacim programu kvuli tomuze se to da pouzit
v metode assertEquals pro presnost u typu double

@BeforeEach
- ty anotace pred metodama znaci kdy se dana metoda provede
- takze before each se provede pred kazdou testovaci metodou
- v tomhle pripade jsme nahore na zacatku tridy Signum2Test vytvorili
datovou slozku Signum2 s; coz je vytvoreni datove slozky tridy
Signum2, kde jsou napsany metody, ktere testujem ..
... a v metode ktera je pod beforeEach vytvorim instanci,
teto datove slozky s=new Signum2() ... abychom pak na tuto instanci
mohli aplikovat testovaci metody

-no a pak si vymyslime nejake testovaci metody, ktere oznacime 
anotaci @test
v techto testovacich metodach pouzivame metodu assertEquals,
ktera muze mit dva nebo tri parametry. Asi i vic .. ale my pro jednoduchost
pro pochopeni pouzivali jen dva, resp tri
prvni parametr metody assertEqual je jakou hodnotu ocekavame,
kdyz do testovane metody zadame hodnotu druheho parametru, zde actual
actual deklarujeme nad touto metodou jako promennou do ktere ulozime
hodnotu, kterou nam vyplivne testovana metoda na instanci tridy s parametrem,
ktery uzname za vhodne testovat

testovaci vs testovana metoda

- testovaci metoda ve tride Signum2Test:
@Test
	void znamenkoProNuluJe0() {
		
		int actual = s.znamenko2(0);
		assertEquals(0,actual);
		
		
	}

- testovana metoda ve tride Signum2:

public int znamenko2(int cislo) {
		
		if (cislo<0) {
			return -1;
		}
		else if (cislo>0) {
			return 1;
		}
		else {
			return 0;
		}
			
		
	}
- je pretizena takze jeste:

public double znamenko2(String s) {
		double cislo = Double.parseDouble(s);
		
		if (cislo<0) {
			return -1;
		}
		else if (cislo>0) {
			return 1;
		}
		else {
			return 0;
		}

