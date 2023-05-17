package info.simple.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import info.simple.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
//    lateinit var tilNum1:TextInputLayout
//    lateinit var tilNum2:TextInputLayout
//    lateinit var etNum1:TextInputEditText
//    lateinit var etNum2:TextInputEditText
//    lateinit var btAdd:Button
//    lateinit var btSubtract:Button
//    lateinit var btMultiply:Button
//    lateinit var btDivide:Button
//    lateinit var tvResult:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


//    fun castViews(){
//        tilNum1= findViewById(R.id.tilNum1)
//        tilNum2= findViewById(R.id.tilNum2)
//        etNum1= findViewById(R.id.etNum1)
//        etNum2= findViewById(R.id.etNum2)
//        btAdd=findViewById(R.id.btAdd)
//        btSubtract=findViewById(R.id.btSubtract)
//        btMultiply=findViewById(R.id.btMultiply)
//        btDivide=findViewById(R.id.btDivide)
//        tvResult=findViewById(R.id.tvResult)
//    }
    fun clearErrorsOnType(){
        binding.etNum1.addTextChangedListener(object :TextWatcher){
            override fun beforeTextChanged(s: CharSequence?,start: Int,count:Int, after:Int){

            }
            override fun onTextChanged(s: CharSequence, start:Int ,count:Int, after:Int){

            }

        }

        }
    }


    override fun onResume() {
        super.onResume()
        binding.btAdd.setOnClickListener { it
        calculations(+)
    }
binding.btSubtract.setOnClickListener{

}


    fun calculations(operator:Char){
        tilNum1.error= null
        tilNum2.error=null
        val num1= etNum1.text.toString().toDouble()
        val num2= etNum1.text.toString().toDouble()
        var error =false

if (num1.isBlank()){
  tilNum1.error= getString(R.string.num_1_required)
    error=true
}
        if (num2.isBlank()){
            tilNum2.error=  getString("Num2 required")
            error=true
        }


        if (!error){
            var result= when (operator){
                '+' -> num1+num2
                '-' -> num1-num2
                '*' -> num1*num2
                '/' -> num1/num2
                else -> throw Exception("Invalid Operator")

            }
            tvResult.text = result.toString()
        }

    }


