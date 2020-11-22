package laparrokia.mallos.repasocasa2;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.Holder> {

    private Activity act;
    private List<Producto> items = new ArrayList<Producto>();

    public ProductoAdapter(Activity act, List<Producto> items) {
        this.act = act;
        this.items = items;
    }

    public ProductoAdapter(AdaterActivity act, Class<ProductoAdapter> productoAdapterClass) {

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate( R.layout.producto_adapter, parent, false);
        Log.i("ADAPTER", "onCreateViewHolder");
        return new Holder(itemView);
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView txt;
        public ImageButton imgBtn;

        public ConstraintLayout linRoot;

        void initView(View v){
            txt = v.findViewById(R.id.producto_item_adapter_txt);
            imgBtn = v.findViewById(R.id.producto_item_adapter_imgbtn);
        }

        public Holder(View v) {
            super(v);
            initView(v);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        final Producto item = items.get(position);

        String textoPrevi = holder.txt.getText().toString();
        Log.d("ADAPTER", "TExto PRevio: "+textoPrevi);

        String texto = item.getName();
        holder.txt.setText(texto);

        holder.imgBtn.setImageDrawable(item.img);

        String textoPost = holder.txt.getText().toString();
        Log.w("ADAPTER", "Texto Post: "+textoPost);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}