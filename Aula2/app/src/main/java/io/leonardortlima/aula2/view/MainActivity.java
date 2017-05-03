package io.leonardortlima.aula2.view;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.leonardortlima.aula2.R;
import io.leonardortlima.aula2.model.DiaSemana;
import io.leonardortlima.aula2.model.Programa;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        carregarProgramacao();
    }

    private void carregarProgramacao() {
        List<DiaSemana> dias = new ArrayList<>();

        List<Programa> programasSeg = Arrays.asList(
                new Programa("07:00-08:00", "Jornal"),
                new Programa("08:00-10:00", "Programa de entretenimento"),
                new Programa("10:00-12:00", "Programa interessante"),
                new Programa("12:00-13:00", "Jornal Esporte")
        );
        dias.add(new DiaSemana("Segunda", programasSeg));

        List<Programa> programasTer = Arrays.asList(
                new Programa("07:00-09:30", "Jogo Internacional"),
                new Programa("09:30-12:00", "Programa informativo"),
                new Programa("12:00-13:00", "Jornal Esporte"),
                new Programa("13:00-14:00", "Jornal Informativo"),
                new Programa("14:00-16:00", "Filme Repetido")
        );
        dias.add(new DiaSemana("Terça", programasTer));

        List<Programa> programasQua = Arrays.asList(
                new Programa("07:00-09:00", "Desenhos animados"),
                new Programa("09:00-11:00", "Programa informativo"),
                new Programa("12:00-13:00", "Jornal Esporte")
        );
        dias.add(new DiaSemana("Quarta", programasQua));

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), dias);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }
}
