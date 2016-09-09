package id.sch.smktelkom_mlg.tugas01.xiirpl1019.penentugajikaryawan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button btOK;
    TextView tvHasil;
    Spinner spTahun, spJabatan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        btOK = (Button) findViewById(R.id.buttonOK);
        spTahun = (Spinner) findViewById(R.id.spinnerTahun);
        spJabatan = (Spinner) findViewById(R.id.spinnerJabatan);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        /*btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });*/



        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                doClick();
            }
        });
    }

    private void doClick() {
        String nama = etNama.getText().toString();
        int tahun = Integer.parseInt(spTahun.getSelectedItem().toString());
        int usia = 2016 - tahun;

        String gaji = "";
        if (spJabatan.getSelectedItem().toString().equals("Customer Service"))
        {
            gaji = "2.000.000";
        }
        else if (spJabatan.getSelectedItem().toString().equals("Technical Support"))
        {
            gaji = "2.500.000";
        }
        else if (spJabatan.getSelectedItem().toString().equals("Web Programmer"))
        {
            gaji = "4.000.000";
        }
        else if (spJabatan.getSelectedItem().toString().equals("Finance and Accounting Officer"))
        {
            gaji = "3.000.000";
        }
        else if (spJabatan.getSelectedItem().toString().equals("Sales and Marketing Officer"))
        {
            gaji = "2.800.000";
        }
        else
        {
            gaji = "3.500.000";
        }

        tvHasil.setText("Nama anda : " + nama + "\nAnda lahir tahun : "+ spTahun.getSelectedItem().toString() +"\nUmur Anda " + usia
        + "\nGaji :" + gaji);
    }
}
