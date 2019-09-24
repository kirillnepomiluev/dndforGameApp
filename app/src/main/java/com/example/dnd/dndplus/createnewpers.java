package com.example.dnd.dndplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class createnewpers extends AppCompatActivity {

    private EditText strenghttext;
    private EditText agilitytext;
    private EditText bodytext;
    private EditText intellecttext;
    private EditText wisdomtext;
    private EditText charismatext;
    private EditText leveltext;
    private EditText nickNametext;
    private EditText rassatext;
    private EditText classtext;
    private EditText hptext;
    private EditText armortext;
    private EditText foodtext;
    private EditText speedtext;
    private Button savebutton;
    private  UserPers mypers;
    private EditText historytext;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createnewpers);

        strenghttext =(EditText) findViewById(R.id.power_tv);
        agilitytext=(EditText) findViewById(R.id.agility_tv);
        bodytext =(EditText) findViewById(R.id.body_tv);
        intellecttext=(EditText) findViewById(R.id.intellect_tv);
        wisdomtext=(EditText) findViewById(R.id.wisdom_tv);
        charismatext=(EditText) findViewById(R.id.charisma_text);
        leveltext=(EditText) findViewById(R.id.level);
        nickNametext=(EditText) findViewById(R.id.nickName_tv);
        rassatext=(EditText) findViewById(R.id.rassa_edit);
        classtext=(EditText) findViewById(R.id.classEdit);
        hptext=(EditText) findViewById(R.id.hp);
        armortext=(EditText) findViewById(R.id.armor_tv);
        foodtext=(EditText) findViewById(R.id.food_tv);
        speedtext=(EditText) findViewById(R.id.speed_tv);
        historytext=(EditText) findViewById(R.id.historytext);
        savebutton=(Button) findViewById(R.id.savebutton);
        savebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createpers();
            }
        });

    }

    private void createpers() {
        String nickName= nickNametext.getText().toString();
         int level = Integer.parseInt(leveltext.getText().toString());
        int speed = Integer.parseInt(speedtext.getText().toString());
         int strenght= Integer.parseInt(strenghttext.getText().toString());
        int agility= Integer.parseInt(agilitytext.getText().toString());
         int body =Integer.parseInt(bodytext.getText().toString());
         int intellect=Integer.parseInt(intellecttext.getText().toString());
         int wisdom=Integer.parseInt(wisdomtext.getText().toString());
          int charisma=Integer.parseInt(charismatext.getText().toString());
          int armor = Integer.parseInt(armortext.getText().toString());
        int maxhp=Integer.parseInt(hptext.getText().toString());
        int hp=Integer.parseInt(hptext.getText().toString());
        int attackplus=0;
        String history= historytext.getText().toString();
        String classpers=classtext.getText().toString();
        String rassa=rassatext.getText().toString();
        int food=Integer.parseInt(leveltext.getText().toString());
        int mana=((Collections.max(Arrays.asList(strenght,agility,body,wisdom,charisma))-10)/2)+((intellect-10)/2)+level*2;
        int maxmana=mana;
        int passiveattention=wisdom;


        int hplevelup=hp;
        int exp=0;

        mypers = new UserPers(nickName,level,speed, strenght,agility,body,intellect,wisdom,charisma,armor,maxhp,hp,attackplus,history,classpers,rassa,food,mana,maxmana,passiveattention,true,hplevelup,exp);
        Buffer.mypers=mypers;



    }
}

