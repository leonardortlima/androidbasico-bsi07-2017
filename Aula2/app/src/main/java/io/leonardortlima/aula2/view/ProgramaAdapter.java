package io.leonardortlima.aula2.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import io.leonardortlima.aula2.R;
import io.leonardortlima.aula2.model.Programa;

/**
 * @author leonardortlima
 * @since 2017-05-02
 */
public class ProgramaAdapter extends BaseAdapter {

    private List<Programa> values;

    public ProgramaAdapter(List<Programa> values) {
        this.values = values;
    }

    @Override
    public int getCount() {
        return values.size();
    }

    @Override
    public Programa getItem(int position) {
        return values.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_programa, parent, false);

            holder = new ViewHolder();
            holder.horario = (TextView) convertView.findViewById(R.id.horario);
            holder.descricao = (TextView) convertView.findViewById(R.id.descricao);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Programa programa = getItem(position);
        holder.horario.setText(programa.getHorario());
        holder.descricao.setText(programa.getDescricao());

        return convertView;
    }

    private static class ViewHolder {
        private TextView horario;
        private TextView descricao;
    }
}
