package goods;

import behaviours.ISell;

public class MusicGoods implements ISell {

    private String description;

    public MusicGoods(String description) {
        this.description = description;
    }

    @Override
    public double calculateMarkup() {
        return 2;
    }
}
