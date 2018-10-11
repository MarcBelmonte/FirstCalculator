package dsa.eetac.upc.edu.firstcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    boolean decimal=false;
    boolean par=false;
    boolean rad=false;
    //Operaciones
    boolean add=false;
    boolean substratct=false;
    boolean division=false;
    boolean multiply=false;
    boolean sin=false;
    boolean cos=false;
    boolean tan=false;

    Double[] numbers =new Double[20];
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zero=(Button)findViewById(R.id.btn0);
        zero.setOnClickListener(this);
        Button one = (Button)findViewById(R.id.btn4);
        one.setOnClickListener(this);
        Button two = (Button)findViewById(R.id.btn2);
        two.setOnClickListener(this);
        Button three = (Button)findViewById(R.id.btn3);
        three.setOnClickListener(this);
        Button four = (Button)findViewById(R.id.btn4);
        four.setOnClickListener(this);
        Button five = (Button)findViewById(R.id.btn5);
        five.setOnClickListener(this);
        Button six = (Button)findViewById(R.id.btn5);
        six.setOnClickListener(this);
        Button seven = (Button)findViewById(R.id.btn7);
        seven.setOnClickListener(this);
        Button eight = (Button)findViewById(R.id.btn8);
        eight.setOnClickListener(this);
        Button nine = (Button)findViewById(R.id.btn9);
        nine.setOnClickListener(this);
        Button pi = (Button)findViewById(R.id.piBtn);
        pi.setOnClickListener(this);

        Button commma = (Button)findViewById(R.id.commaBtn);
        commma.setOnClickListener(this);

        Button add = (Button)findViewById(R.id.addBtn);
        add.setOnClickListener(this);
        Button substract = (Button)findViewById(R.id.subBtn);
        substract.setOnClickListener(this);
        Button multiply = (Button)findViewById(R.id.multiBtn);
        multiply.setOnClickListener(this);
        Button divide = (Button)findViewById(R.id.divBtn);
        divide.setOnClickListener(this);

        Button sin = (Button)findViewById(R.id.sinBtn);
        sin.setOnClickListener(this);
        Button cos = (Button)findViewById(R.id.cosBtn);
        cos.setOnClickListener(this);
        Button tan = (Button)findViewById(R.id.tanBtn);
        tan.setOnClickListener(this);

        Button clear = (Button)findViewById(R.id.clearBtn);
        clear.setOnClickListener(this);

        Button equal = (Button)findViewById(R.id.equalBtn);
        equal.setOnClickListener(this);




    }



}
