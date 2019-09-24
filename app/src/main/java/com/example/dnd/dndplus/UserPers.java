package com.example.dnd.dndplus;

import java.util.HashMap;
import java.util.Map;

public class UserPers extends Pers {

   public int passiveattention;
    public boolean insperation;
    public int plusk20;
    public int hplevelup;
    public int exp;

    public UserPers () {

    }

    public UserPers (String nickName1, int level1, int speed1, int strenght1, int agility1, int body1, int intellect1, int wisdom1, int charisma1, int armor1, int maxhp1, int hp1, int attackplus1, String history1, String classpers1, String rassa1, int food1, int mana1, int maxmana1, int passiveattention, boolean insperation,  int hplevelup, int exp) {
        this.nickName = nickName1;
        this.level = level1;
        this.speed = speed1;
        this.strenght = strenght1;
        this.agility = agility1;
        this.body = body1;
        this.intellect = intellect1;
        this.wisdom = wisdom1;


        this.charisma = charisma1;
        this.armor = armor1;
        this.maxhp = maxhp1;
        this.hp = hp1;
        this.attackplus = attackplus1;
        this.history = history1;
        this.classpers = classpers1;
        this.rassa = rassa1;
        this.food = food1;
        this.mana = mana1;
        this.maxmana = maxmana1;
        this.exp=exp;
        this.hplevelup=hplevelup;
        this.plusk20=0;
        this.insperation=true;
        this.passiveattention=passiveattention;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("nickName", nickName);
        result.put("level", level);
        result.put("speed", speed);
        result.put("strenght", strenght);
        result.put("agility",agility);
        result.put("body", body);
        result.put("intellect", intellect);
        result.put("wisdom", wisdom);
        result.put("charisma", charisma);
        result.put("armor", armor);
        result.put("maxhp", maxhp);
        result.put("hp",hp);
        result.put("attackplus", attackplus);
        result.put("history", history);
        result.put("classpers", classpers);
        result.put("rassa", rassa);
        result.put("food", food);
        result.put("mana", mana);
        result.put("maxmana",maxmana);
        result.put("exp", exp);
        result.put("hplevelup", hplevelup);
        result.put("plusk20",plusk20);
        result.put("insperation", insperation);
        result.put("passiveattention", passiveattention);


        return result;
    }











}
