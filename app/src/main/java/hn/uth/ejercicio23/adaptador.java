package hn.uth.ejercicio23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adaptador extends ArrayAdapter<Fotografia> {
    ArrayList<Fotografia> listaImagenes = new ArrayList<>();

    public adaptador(Context context, int textViewResourceId, ArrayList<Fotografia> objects) {
        super(context, textViewResourceId, objects);
        listaImagenes = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.activity_listado, null);
        ImageView imageView = (ImageView) v.findViewById(R.id.Img);
        imageView.setImageBitmap(listaImagenes.get(position).getImagen());
        TextView textView = (TextView) v.findViewById(R.id.txtD);
        textView.setText(listaImagenes.get(position).getDescripcion());
        return v;
    }
}
