package com.example.vick.mtaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class UserDashboardActivity extends AppCompatActivity {
    CardView cardHomes, cardPlots, cardApartments, cardSales, cardAbout, cardSignout;
      FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);
        //Join UI to Logic
        cardHomes = findViewById(R.id.cardHomes);
        cardPlots = findViewById(R.id.cardPlots);
        cardApartments = findViewById(R.id.cardApartments);
        cardSales = findViewById(R.id.cardSales);
               cardAbout = findViewById(R.id.cardAbout);
        cardSignout = findViewById(R.id.cardsignout);


        //Method calls
        cardHomesClicked();
        cardPlotsClicked();
        cardApartmentsClicked();
        cardSalesClicked();
        cardAboutClicked();
        cardSignoutClicked();
       // imagemenuClicked();

        mAuth = FirebaseAuth.getInstance();


    }

    public void cardHomesClicked() {
        cardHomes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardHomes.setCardElevation(15);
                // cardHomes.animate().rotationBy(360);
                cardHomes.animate().alphaBy(10);
                cardHomes.setRadius(20);
                cardHomes.setPadding(2, 2, 2, 2);

                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
               cardSignout.setCardElevation(0);
                cardSignout.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

                startActivity(new Intent(UserDashboardActivity.this, Homes.class));

            }
        });
    }

    public void cardPlotsClicked() {
        cardPlots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardPlots.setCardElevation(15);
                cardPlots.animate().rotationBy(360);
                cardPlots.setRadius(20);

                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
                cardSignout.setCardElevation(0);
                cardSignout.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

                Intent i = new Intent(getApplicationContext(), AssetsViewActivity.class);
                startActivity(i);

            }
        });
    }

    public void cardApartmentsClicked() {
        cardApartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardApartments.setCardElevation(15);
                // cardApartments.animate().rotationBy(360);
                cardApartments.animate().alphaBy(10);
                cardApartments.setRadius(20);

                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
                cardSignout.setCardElevation(0);
               cardSignout.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

                Intent i = new Intent(getApplicationContext(), Apartments.class);
                startActivity(i);


                //startActivity(new Intent(UserDashboardActivity.this, Apartments.class));

            }
        });
    }

    public void cardSalesClicked() {
        cardSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardSales.setCardElevation(15);
                // cardSales.animate().rotationBy(360);
                cardSales.animate().alphaBy(10);
                cardSales.setRadius(20);

                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSignout.setCardElevation(0);
                cardSignout.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

                //  Intent i = new Intent(getApplicationContext(),AssetsViewActivity.class);
                //startActivity(i);

            }
        });
    }


   public void cardSignoutClicked() {
        cardSignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardSignout.setCardElevation(15);
                //cardSignout.animate().rotationBy(360);
                cardSignout.animate().alphaBy(10);
                cardSignout.setRadius(20);

                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
                cardAbout.setCardElevation(0);
                cardAbout.setRadius(0);

                Intent i = new Intent(getApplicationContext(),LOGIN.class);
                 startActivity(i);
               // mAuth.signOut();

            }
        });
    }


    public void cardAboutClicked() {
        cardAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardAbout.setCardElevation(15);
                //cardAbout.animate().rotationBy(360);
                cardAbout.animate().alphaBy(10);
                cardAbout.setRadius(20);

                cardHomes.setCardElevation(0);
                cardHomes.setRadius(0);
                cardPlots.setCardElevation(0);
                cardPlots.setRadius(0);
                cardApartments.setCardElevation(0);
                cardApartments.setRadius(0);
                cardSales.setCardElevation(0);
                cardSales.setRadius(0);
               cardSignout.setCardElevation(0);
                cardSignout.setRadius(0);

                Intent i = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(i);

            }
        });

    }

}
