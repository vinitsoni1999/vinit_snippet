class MainActivity : AppCompatActivity() {

    private lateinit var etNumber1: EditText
    private lateinit var etNumber2: EditText
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber1 = findViewById(R.id.et_number1)
        etNumber2 = findViewById(R.id.et_number2)
        tvResult = findViewById(R.id.tv_result)

        findViewById<Button>(R.id.btn_add).setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()
            val result = number1 + number2
            tvResult.text = result.toString()
        }

        findViewById<Button>(R.id.btn_subtract).setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()
            val result = number1 - number2
            tvResult.text = result.toString()
        }

        findViewById<Button>(R.id.btn_multiply).setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()
            val result = number1 * number2
            tvResult.text = result.toString()
        }

        findViewById<Button>(R.id.btn_divide).setOnClickListener {
            val number1 = etNumber1.text.toString().toDouble()
            val number2 = etNumber2.text.toString().toDouble()
            val result = number1 / number2
            tvResult.text = result.toString()
        }
    }
}
