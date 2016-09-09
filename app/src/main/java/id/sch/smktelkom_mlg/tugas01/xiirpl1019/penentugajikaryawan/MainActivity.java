package id.sch.smktelkom_mlg.tugas01.xiirpl1019.penentugajikaryawan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
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
    RadioButton rbM, rbBM, rbD, rbJ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        btOK = (Button) findViewById(R.id.buttonOK);
        spTahun = (Spinner) findViewById(R.id.spinnerTahun);
        spJabatan = (Spinner) findViewById(R.id.spinnerJabatan);
        rbM = (RadioButton) findViewById(R.id.radioButtonM);
        rbBM = (RadioButton) findViewById(R.id.radioButtonBM);
        rbD = (RadioButton) findViewById(R.id.radioButtonD);
        rbJ = (RadioButton) findViewById(R.id.radioButtonJ);
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

        int gaji1 = 0;
        if (spJabatan.getSelectedItem().toString().equals("Customer Service"))
        {
            gaji1 = 2000000;
        }
        else if (spJabatan.getSelectedItem().toString().equals("Technical Support"))
        {
            gaji1 = 2500000;
        }
        else if (spJabatan.getSelectedItem().toString().equals("Web Programmer"))
        {
            gaji1 = 4000000;
        }
        else if (spJabatan.getSelectedItem().toString().equals("Finance and Accounting Officer"))
        {
            gaji1 = 3000000;
        }
        else if (spJabatan.getSelectedItem().toString().equals("Sales and Marketing Officer"))
        {
            gaji1 = 2800000;
        }
        else
        {
            gaji1 = 3500000;
        }

        int gaji2 = 0;
        String status = null;
        String ket = null;
        if (rbM.isChecked())
        {
            gaji2 = 500000;
            status = rbM.getText().toString();
            ket = " Anda mendapat gaji tambahan ";
        }
        else if (rbBM.isChecked())
        {
            status = rbBM.getText().toString();
            ket = " Anda mendapat gaji tambahan ";
        }
        else if (rbD.isChecked())
        {
            gaji2 = 200000;
            status = rbD.getText().toString();
            ket = " Anda mendapat gaji tambahan ";
        }
        else if (rbJ.isChecked())
        {
            gaji2 = 200000;
            status = rbJ.getText().toString();
            ket = " Anda mendapat gaji tambahan ";
        }

        int total = gaji1+gaji2;

        tvHasil.setText("Nama anda : " + nama +
                "\nAnda lahir tahun : "+ spTahun.getSelectedItem().toString() +
                "\nUmur Anda " + usia +
                "\nGaji 1 :" + String.valueOf(gaji1) +
                "\nStatus Anda " + status + ket + String.valueOf(gaji2) +
                "\nTotal Gaji : " + String.valueOf(total));
    }
}
