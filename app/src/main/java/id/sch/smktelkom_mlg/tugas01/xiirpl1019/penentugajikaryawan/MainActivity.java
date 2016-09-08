package id.sch.smktelkom_mlg.tugas01.xiirpl1019.penentugajikaryawan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button btOK;
    TextView tvHasil;
    Spinner spTahun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        btOK = (Button) findViewById(R.id.buttonOK);
        spTahun = (Spinner) findViewById(R.id.spinnerTahun);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        /*btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });*/


        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
        String nama = etNama.getText().toString();
        int tahun = Integer.parseInt(spTahun.getSelectedItem().toString());
        int usia = 2016 - tahun;

        tvHasil.setText("Nama anda : " + nama + "\nAnda lahir tahun : " + spTahun.getSelectedItem().toString() + "\nUmur Anda " + usia);
    }
}
