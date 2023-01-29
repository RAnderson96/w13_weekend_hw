import behaviours.ISell;
import goods.MusicGoods;
import goods.Product;
import instrument_types.InstrumentType;
import instruments.Drums;
import instruments.Guitars;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MusicShopTests {

    Drums drums;
    Guitars guitar;
    Product guitarToSell;
    Product drumToSell;
    Product sheetMusicToSell;
    //    InstrumentType instrType;
    MusicGoods sheetMusic;
    ArrayList<Product> stock;

    MusicShop musicShop;
    @Before
    public void setUp() {

        guitar = new Guitars(InstrumentType.STRING, "Blue", "Wood", 6);
        drums = new Drums(InstrumentType.PERCUSSION, "Red", "Metal", 6);
        sheetMusic = new MusicGoods("Smash Mouth: Rockstar");

        guitarToSell = new Product(guitar,100);
        drumToSell = new Product(drums, 200);
        sheetMusicToSell = new Product(sheetMusic, 2.50);

        stock = new ArrayList<>(Arrays.asList(guitarToSell, guitarToSell, drumToSell, drumToSell, sheetMusicToSell));
        musicShop = MusicShop.getInstance();
        musicShop.setStock(stock);


    }

    @Test
    public void canAddStock(){
        musicShop.addToStock(drumToSell);
        assertEquals(6, musicShop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        musicShop.removeFromStock(drumToSell);
        musicShop.getStock().stream().map(v -> v.getProduct()).forEach(System.out::println);
        assertEquals(4, musicShop.getStock().size());
    }

    @Test
    public void canCalculateTotalPotentialProfits(){
        assertEquals(135+135+270+270+5, musicShop.getPotentialProfits(),0.01);
    }



}
