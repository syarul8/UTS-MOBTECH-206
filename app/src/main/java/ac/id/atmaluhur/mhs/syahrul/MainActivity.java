package ac.id.atmaluhur.mhs.syahrul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nilaiab;
    EditText nilaitu;
    EditText nilaiut;
    EditText nilaiua;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilaiab = (EditText) findViewById(R.id.nilaiab);
        nilaitu = (EditText) findViewById(R.id.nilaitu);
        nilaiut = (EditText) findViewById(R.id.nilaiut);
        nilaiua = (EditText) findViewById(R.id.nilaiua);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void hitung (View View){
        Integer a = Integer.parseInt(nilaiab.getText().toString());
        Integer b = Integer.parseInt(nilaitu.getText().toString());
        Integer c = Integer.parseInt(nilaiut.getText().toString());
        Integer d = Integer.parseInt(nilaiua.getText().toString());
        Integer e = a * 10/100 + b * 20/100 + c * 30/100 + d * 40/100;
        hasil.setText("HASIL NILAI AKHIR = "+e);
    }
}