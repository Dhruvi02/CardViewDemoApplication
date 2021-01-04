package com.example.cardviewdemoapp;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class NatureModel {

    private int img_id,price;
    private String product_name;
    //get and set image
    public int getImg_id(){return img_id;
    }
    public void setImg_id(int img_id){ this.img_id = img_id; }

    //get and set product_name
    public String get_product_name(){
        return product_name;
    }
    public void set_product_name(String product_name){
        this.product_name = product_name;
    }

    //get and set price
    public String getPrice(){return "Price"+ price;
    }
    public void set_price(int price){
        this.price = price;
    }

    //returns object list
    public static List<NatureModel> getObjectList()
    {
        List<NatureModel> dataList = new ArrayList<>();
        int[] images = getImage();
        for (int i=0; i<images.length; i++){
            NatureModel natureModel = new NatureModel();
            natureModel.setImg_id(images[i]);
            natureModel.set_product_name("Pictures" + i);
            natureModel.set_price(i);
            dataList.add(natureModel);
        }
        return dataList;
    }
    private static int[] getImage(){
        int[] images = {
                R.drawable.img_card_1, R.drawable.img_card_2, R.drawable.img_card_3,
                R.drawable.img_card_4, R.drawable.img_card_5,

                R.drawable.img_card_1, R.drawable.img_card_2, R.drawable.img_card_3,
                R.drawable.img_card_4, R.drawable.img_card_5,

                R.drawable.img_card_1, R.drawable.img_card_2, R.drawable.img_card_3,
                R.drawable.img_card_4, R.drawable.img_card_5,

                R.drawable.img_card_1, R.drawable.img_card_2, R.drawable.img_card_3,
                R.drawable.img_card_4, R.drawable.img_card_5,

                R.drawable.img_card_1, R.drawable.img_card_2, R.drawable.img_card_3,
                R.drawable.img_card_4, R.drawable.img_card_5,

        };
        return images;
    }
}