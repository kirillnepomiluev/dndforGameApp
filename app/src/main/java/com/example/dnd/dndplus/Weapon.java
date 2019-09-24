package com.example.dnd.dndplus;

public class Weapon extends BattleItem {

    private int damage;
    private int penetration;
    private int damagetype;
    private int hitrange;
    private int throwrange;


    public Weapon (){}

    public Weapon (String name, double weight,int size,int basecost,int rarity,boolean magic,boolean reusable,String photourl,String description){

        this.setName(name);
        this.setWeight(weight);
        this.setSize(size);
        this.setBasecost(basecost);
        this.setRarity(rarity);
        this.setMagic(magic);
        this.setReusable(reusable);
        this.setPhotourl(photourl);
        this.setDescription(description);
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPenetration() {
        return penetration;
    }

    public void setPenetration(int penetration) {
        this.penetration = penetration;
    }

    public int getDamagetype() {
        return damagetype;
    }

    public void setDamagetype(int damagetype) {
        this.damagetype = damagetype;
    }

    public int getHitrange() {
        return hitrange;
    }

    public void setHitrange(int hitrange) {
        this.hitrange = hitrange;
    }

    public int getThrowrange() {
        return throwrange;
    }

    public void setThrowrange(int throwrange) {
        this.throwrange = throwrange;
    }
}
