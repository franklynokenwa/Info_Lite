package com.example.infolite;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitMaps();
    }
    private void initImageBitMaps(){

        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/Sisi-Yemmie.png");
        mNames.add("Sisi Yemmie is a lifestyle blogger and her blog features beauty & style, gist, news and events, food recipes, and everything in between.");

        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/Linda-Ikeji.png");
        mNames.add("Sisi Yemmie is a lifestyle blogger and her blog features beauty & style, gist, news and events, food recipes, and everything in between.");

        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/Laila-Blog.png");
        mNames.add("Laila blog is a source for entertainment news, celeb news, juicy gossips and every ‘happening things’ in Nigeria.");

        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/olu-famous.png");
        mNames.add("Olu Famous blogs features videos, pictures, breaking and interesting news – lifestyle, politics and social issues from around the web.");


        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/ThatIgbochick.png");
        mNames.add("That Igbo Chick blog provides daily dose of beauty tips and best-kept-beauty secrets that will make any woman glow.");

        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/Jobberman.png");
        mNames.add("Jobberman Blog provides jobs and career tips, tricks and news. Whether you are searching for a job or you already have  one, you can catch up on latest industry trends, interview hints, job search tips and career advice on Jobberman Blog.");


        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/Ynaija.png");
        mNames.add("YNaija.com is an Internet newspaper blog for Nigerians, featuring local, state and national news, world news, politics, business, technology and science.");

        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/360nobs.png");
        mNames.add("360nobs is a fantastic blog featuring fashion news, style tips, events, reviews, movies & TV, music and breaking news and other entertaining content.");

        mImageUrls.add("http://www.travelstart.com.ng/blog/wp-content/uploads/2014/03/Kisses-hugga.png");
        mNames.add("Huggs and Kisses club is a great blog for relationship tips and advice, personal values and lifestyle tips to help you work through any relationship problems.");

            initRecyclerView();
        }

    private  void  initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mImageUrls,mNames);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager gridLayoutManager = new LinearLayoutManager(this);
        // Set layout manager.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
