package io.leonardortlima.aula2.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import io.leonardortlima.aula2.R;
import io.leonardortlima.aula2.model.DiaSemana;

/**
 * @author leonardortlima
 * @since 2017-05-03
 */
public class DiaFragment extends Fragment {

    private static final String DIA_SEMANA = "dia_semana";

    public DiaFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static DiaFragment newInstance(DiaSemana diaSemana) {
        DiaFragment fragment = new DiaFragment();
        Bundle args = new Bundle();
        args.putSerializable(DIA_SEMANA, diaSemana);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Bundle arguments = getArguments();
        DiaSemana diaSemana = (DiaSemana) arguments.getSerializable(DIA_SEMANA);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(new ProgramaAdapter(diaSemana.getProgramas()));
        listView.setDivider(null);

        return rootView;
    }
}
