package com.example.twenty_four_point;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

    public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder>{
    private List<Card> cardList;
    private Activity main_activity;
    private float[] fourNumber;  //需要传递的数据，四个计算数据
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView cardImage;
        //TextView cardName;
        public ViewHolder(View view){
            super(view);
            cardImage=view.findViewById(R.id.card_image);
            //cardName=view.findViewById(R.id.card_name);
        }
    }
    public CardAdapter(Activity ac,float[] list,List<Card> mcardList){
        main_activity=ac;
        fourNumber=list;
        cardList=mcardList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        System.out.println("main_view:"+main_activity);
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        ImageView card1=main_activity.findViewById(R.id.card1);
        ImageView card2=main_activity.findViewById(R.id.card2);
        ImageView card3=main_activity.findViewById(R.id.card3);
        ImageView card4=main_activity.findViewById(R.id.card4);
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position =holder.getAdapterPosition();
                Card card =cardList.get(position);
                //Toast.makeText(v.getContext(),"you click view"+card.name,Toast.LENGTH_SHORT).show();
                //System.out.println("cardname:"+card1);
                if(card.name.charAt(0)=='c'){
                    fourNumber[0]=Integer.parseInt(card.name.substring(1));
                    if(card.name=="c01"){
                        card1.setImageResource(R.drawable.c01);
                    }
                    else if(card.name=="c02"){
                        card1.setImageResource(R.drawable.c02);
                    }
                    else if(card.name=="c03"){
                        card1.setImageResource(R.drawable.c03);
                    }
                    else if(card.name=="c04"){
                        card1.setImageResource(R.drawable.c04);
                    }
                    else if(card.name=="c05"){
                        card1.setImageResource(R.drawable.c05);
                    }
                    else if(card.name=="c06"){
                        card1.setImageResource(R.drawable.c06);
                    }
                    else if(card.name=="c07"){
                        card1.setImageResource(R.drawable.c07);
                    }
                    else if(card.name=="c08"){
                        card1.setImageResource(R.drawable.c08);
                    }
                    else if(card.name=="c09"){
                        card1.setImageResource(R.drawable.c09);
                    }
                    else if(card.name=="c10"){
                        card1.setImageResource(R.drawable.c10);
                    }
                    else if(card.name=="c11"){
                        card1.setImageResource(R.drawable.c11);
                    }
                    else if(card.name=="c12"){
                        card1.setImageResource(R.drawable.c12);
                    }
                    else if(card.name=="c13"){
                        card1.setImageResource(R.drawable.c13);
                    }
                }
                else if(card.name.charAt(0)=='d'){
                    fourNumber[1]=Integer.parseInt(card.name.substring(1));
                    if(card.name=="d01"){
                        card2.setImageResource(R.drawable.d01);
                    }
                    else if(card.name=="d02"){
                        card2.setImageResource(R.drawable.d02);
                    }
                    else if(card.name=="d03"){
                        card2.setImageResource(R.drawable.d03);
                    }
                    else if(card.name=="d04"){
                        card2.setImageResource(R.drawable.d04);
                    }
                    else if(card.name=="d05"){
                        card2.setImageResource(R.drawable.d05);
                    }
                    else if(card.name=="d06"){
                        card2.setImageResource(R.drawable.d06);
                    }
                    else if(card.name=="d07"){
                        card2.setImageResource(R.drawable.d07);
                    }
                    else if(card.name=="d08"){
                        card2.setImageResource(R.drawable.d08);
                    }
                    else if(card.name=="d09"){
                        card2.setImageResource(R.drawable.d09);
                    }
                    else if(card.name=="d10"){
                        card2.setImageResource(R.drawable.d10);
                    }
                    else if(card.name=="d11"){
                        card2.setImageResource(R.drawable.d11);
                    }
                    else if(card.name=="d12"){
                        card2.setImageResource(R.drawable.d12);
                    }
                    else if(card.name=="d13"){
                        card2.setImageResource(R.drawable.d13);
                    }
                }
                else if(card.name.charAt(0)=='h'){
                    fourNumber[2]=Integer.parseInt(card.name.substring(1));
                    if(card.name=="h01"){
                        card3.setImageResource(R.drawable.h01);
                    }
                    else if(card.name=="h02"){
                        card3.setImageResource(R.drawable.h02);
                    }
                    else if(card.name=="h03"){
                        card3.setImageResource(R.drawable.h03);
                    }
                    else if(card.name=="h04"){
                        card3.setImageResource(R.drawable.h04);
                    }
                    else if(card.name=="h05"){
                        card3.setImageResource(R.drawable.h05);
                    }
                    else if(card.name=="h06"){
                        card3.setImageResource(R.drawable.h06);
                    }
                    else if(card.name=="h07"){
                        card3.setImageResource(R.drawable.h07);
                    }
                    else if(card.name=="h08"){
                        card3.setImageResource(R.drawable.h08);
                    }
                    else if(card.name=="h09"){
                        card3.setImageResource(R.drawable.h09);
                    }
                    else if(card.name=="h10"){
                        card3.setImageResource(R.drawable.h10);
                    }
                    else if(card.name=="h11"){
                        card3.setImageResource(R.drawable.h11);
                    }
                    else if(card.name=="h12"){
                        card3.setImageResource(R.drawable.h12);
                    }
                    else if(card.name=="h13"){
                        card3.setImageResource(R.drawable.h13);
                    }
                }
                else{
                    fourNumber[3]=Integer.parseInt(card.name.substring(1));
                    if(card.name=="s01"){
                        card4.setImageResource(R.drawable.s01);
                    }
                    else if(card.name=="s02"){
                        card4.setImageResource(R.drawable.s02);
                    }
                    else if(card.name=="s03"){
                        card4.setImageResource(R.drawable.s03);
                    }
                    else if(card.name=="s04"){
                        card4.setImageResource(R.drawable.s04);
                    }
                    else if(card.name=="s05"){
                        card4.setImageResource(R.drawable.s05);
                    }
                    else if(card.name=="s06"){
                        card4.setImageResource(R.drawable.s06);
                    }
                    else if(card.name=="s07"){
                        card4.setImageResource(R.drawable.s07);
                    }
                    else if(card.name=="s08"){
                        card4.setImageResource(R.drawable.s08);
                    }
                    else if(card.name=="s09"){
                        card4.setImageResource(R.drawable.s09);
                    }
                    else if(card.name=="s10"){
                        card4.setImageResource(R.drawable.s10);
                    }
                    else if(card.name=="s11"){
                        card4.setImageResource(R.drawable.s11);
                    }
                    else if(card.name=="s12"){
                        card4.setImageResource(R.drawable.s12);
                    }
                    else if(card.name=="s13"){
                        card4.setImageResource(R.drawable.s13);
                    }
                }
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Card card=cardList.get(position);
        holder.cardImage.setImageResource(card.imageId);
        //holder.cardName.setText(card.name);
    }

    @Override
    public int getItemCount(){
        return cardList.size();
    }

    public float[] getFourNumber(){
        return fourNumber;
    }
}

