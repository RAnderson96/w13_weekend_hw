package goods;

import instrument_types.InstrumentType;
import instruments.Drums;
import instruments.Guitars;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProductTest {
    Drums drums;
    Guitars guitar;
    Product guitarToSell;
    Product drumToSell;
    Product sheetMusicToSell;
//    InstrumentType instrType;
    MusicGoods sheetMusic;

    @Before
   public void setUp() {

        guitar = new Guitars(InstrumentType.STRING, "Blue", "Wood", 6);
        drums = new Drums(InstrumentType.PERCUSSION, "Red", "Metal", 6);
        sheetMusic = new MusicGoods("Smash Mouth: Rockstar");

        guitarToSell = new Product(guitar,100);
        drumToSell = new Product(drums, 200);
        sheetMusicToSell = new Product(sheetMusic, 2.50);

    }

    @Test
    public void getProduct() {
        assertEquals(guitar, guitarToSell.getProduct());
    }

    @Test
    public void setProduct() {
        guitarToSell.setProduct(drums);
        assertEquals(drums, guitarToSell.getProduct());


    }
    @Test
    public void getPriceSoldOfGuitar() {
        assertEquals(135, guitarToSell.getPriceSold() , 0.01);

    }
    @Test
    public void getPriceSoldOfDrums() {
        assertEquals(270, drumToSell.getPriceSold() , 0.01);

    }
    @Test
    public void setPriceSold() {
        guitarToSell.setPriceSold(200);
        assertEquals(200, guitarToSell.getPriceSold(), 0.01 );
    }

    @Test
    public void canGetPriceOfNonMusicalGood(){
        assertEquals(5, sheetMusicToSell.getPriceSold(), 0.01);

    }
}