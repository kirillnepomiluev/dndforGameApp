package com.example.dnd.dndplus;

public class BattleItem extends Item {

    private int durability;
    private int mainmaterial;


    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getMainmaterial() {
        return mainmaterial;
    }

    public void setMainmaterial(int mainmaterial) {
        this.mainmaterial = mainmaterial;
    }
}
