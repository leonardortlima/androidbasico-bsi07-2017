package io.leonardortlima.aula2.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import io.leonardortlima.aula2.model.DiaSemana;

/**
 * @author leonardortlima
 * @since 2017-05-03
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private List<DiaSemana> dias;

    public SectionsPagerAdapter(FragmentManager fm, List<DiaSemana> dias) {
        super(fm);
        this.dias = dias;
    }

    @Override
    public Fragment getItem(int position) {
        return DiaFragment.newInstance(dias.get(position));
    }

    @Override
    public int getCount() {
        return dias.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return dias.get(position).getNome();
    }
}
