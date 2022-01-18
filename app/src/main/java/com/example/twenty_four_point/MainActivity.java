package com.example.twenty_four_point;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Card> cardList=new ArrayList<>();
    private float[] fourNumber=new float[]{0,0,0,0};       //存放四个数据
    private List<String> cardName=new ArrayList<String>(){
        {
            this.add("A");
            this.add("2");
            this.add("3");
            this.add("4");
            this.add("5");
            this.add("6");
            this.add("7");
            this.add("8");
            this.add("9");
            this.add("10");
            this.add("J");
            this.add("Q");
            this.add("K");

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initCards();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager=new GridLayoutManager(this,4,GridLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        CardAdapter adapter=new CardAdapter(this,fourNumber,cardList);
        recyclerView.setAdapter(adapter);




        //下面开始逻辑操作
        TextView result=findViewById(R.id.result);
        result.setMovementMethod(ScrollingMovementMethod.getInstance());
        Button button1=findViewById(R.id.operate);        //计算按钮
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(fourNumber[0]);
                System.out.println(fourNumber[1]);
                System.out.println(fourNumber[2]);
                System.out.println(fourNumber[3]);
                if(fourNumber[0]*fourNumber[1]*fourNumber[2]*fourNumber[3]==0){
                    result.setText("请完整地选择四个卡牌");
                }
                else{
                    System.out.println(111);
                    Controller controller=new Controller(fourNumber);
                    System.out.println(222);
                    controller.compute();  //有问题
                    System.out.println(333);
                    List<String> compute_result = controller.getResult();
                    String text="";
                    for(int i=0;i<compute_result.size();i++){
                        text=text+compute_result.get(i)+'\n';
                    }
                    result.setText(text);
                }
            }
        });
        Button button2=findViewById(R.id.clear);       //
        ImageView card1=findViewById(R.id.card1);
        ImageView card2=findViewById(R.id.card2);
        ImageView card3=findViewById(R.id.card3);
        ImageView card4=findViewById(R.id.card4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //此处添加逻辑
                fourNumber[0]=0;   //数据也需要清除
                fourNumber[1]=0;
                fourNumber[2]=0;
                fourNumber[3]=0;
                result.setText("");
                card1.setImageDrawable(null);
                card2.setImageDrawable(null);
                card3.setImageDrawable(null);
                card4.setImageDrawable(null);
            }
        });

    }
    private void initCards(){
        Card card=new Card("c01",R.drawable.c01);
        cardList.add(card);
        card=new Card("d01",R.drawable.d01);
        cardList.add(card);
        card=new Card("h01",R.drawable.h01);
        cardList.add(card);
        card=new Card("s01",R.drawable.s01);
        cardList.add(card);

        card=new Card("c02",R.drawable.c02);
        cardList.add(card);
        card=new Card("d02",R.drawable.d02);
        cardList.add(card);
        card=new Card("h02",R.drawable.h02);
        cardList.add(card);
        card=new Card("s02",R.drawable.s02);
        cardList.add(card);

        card=new Card("c03",R.drawable.c03);
        cardList.add(card);
        card=new Card("d03",R.drawable.d03);
        cardList.add(card);
        card=new Card("h03",R.drawable.h03);
        cardList.add(card);
        card=new Card("s03",R.drawable.s03);
        cardList.add(card);

        card=new Card("c04",R.drawable.c04);
        cardList.add(card);
        card=new Card("d04",R.drawable.d04);
        cardList.add(card);
        card=new Card("h04",R.drawable.h04);
        cardList.add(card);
        card=new Card("s04",R.drawable.s04);
        cardList.add(card);

        card=new Card("c05",R.drawable.c05);
        cardList.add(card);
        card=new Card("d05",R.drawable.d05);
        cardList.add(card);
        card=new Card("h05",R.drawable.h05);
        cardList.add(card);
        card=new Card("s05",R.drawable.s05);
        cardList.add(card);

        card=new Card("c06",R.drawable.c06);
        cardList.add(card);
        card=new Card("d06",R.drawable.d06);
        cardList.add(card);
        card=new Card("h06",R.drawable.h06);
        cardList.add(card);
        card=new Card("s06",R.drawable.s06);
        cardList.add(card);

        card=new Card("c07",R.drawable.c07);
        cardList.add(card);
        card=new Card("d07",R.drawable.d07);
        cardList.add(card);
        card=new Card("h07",R.drawable.h07);
        cardList.add(card);
        card=new Card("s07",R.drawable.s07);
        cardList.add(card);

        card=new Card("c08",R.drawable.c08);
        cardList.add(card);
        card=new Card("d08",R.drawable.d08);
        cardList.add(card);
        card=new Card("h08",R.drawable.h08);
        cardList.add(card);
        card=new Card("s08",R.drawable.s08);
        cardList.add(card);

        card=new Card("c09",R.drawable.c09);
        cardList.add(card);
        card=new Card("d09",R.drawable.d09);
        cardList.add(card);
        card=new Card("h09",R.drawable.h09);
        cardList.add(card);
        card=new Card("s09",R.drawable.s09);
        cardList.add(card);

        card=new Card("c10",R.drawable.c10);
        cardList.add(card);
        card=new Card("d10",R.drawable.d10);
        cardList.add(card);
        card=new Card("h10",R.drawable.h10);
        cardList.add(card);
        card=new Card("s10",R.drawable.s10);
        cardList.add(card);

        card=new Card("c11",R.drawable.c11);
        cardList.add(card);
        card=new Card("d11",R.drawable.d11);
        cardList.add(card);
        card=new Card("h11",R.drawable.h11);
        cardList.add(card);
        card=new Card("s11",R.drawable.s11);
        cardList.add(card);

        card=new Card("c12",R.drawable.c12);
        cardList.add(card);
        card=new Card("d12",R.drawable.d12);
        cardList.add(card);
        card=new Card("h12",R.drawable.h12);
        cardList.add(card);
        card=new Card("s12",R.drawable.s12);
        cardList.add(card);

        card=new Card("c13",R.drawable.c13);
        cardList.add(card);
        card=new Card("d13",R.drawable.d13);
        cardList.add(card);
        card=new Card("h13",R.drawable.h13);
        cardList.add(card);
        card=new Card("s13",R.drawable.s13);
        cardList.add(card);

        /*for(int i=0;i<13;i++){
            Card card=new Card(cardName.get(i),R.drawable.club);
            cardList.add(card);
            Card card1=new Card(cardName.get(i),R.drawable.diamond);
            cardList.add(card1);
            Card card2=new Card(cardName.get(i),R.drawable.heart);
            cardList.add(card2);
            Card card3=new Card(cardName.get(i),R.drawable.spade);
            cardList.add(card3);
        }*/
    }

}