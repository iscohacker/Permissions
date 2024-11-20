package uz.iskandarbek.permissions

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import uz.iskandarbek.permissions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.location.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                binding.joylashuvinfo.text = "Joylashuv ruxsatnomasi: Bor"
            } else {
                binding.joylashuvinfo.text = "Joylashuv ruxsatnomasi: Bor"
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                    1
                )
            }
        }
        binding.contact.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.READ_CONTACTS
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                binding.kontaktinfo.text = "Kontakt ruxsatnomasi: Bor"
            } else {
                binding.kontaktinfo.text = "Kontakt ruxsatnomasi: Bor"
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.READ_CONTACTS),
                    2
                )
            }
        }
        binding.sms.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.READ_SMS
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                binding.smsinfo.text = "SMS ruxsatnomasi: Bor"
            } else {
                binding.smsinfo.text = "SMS ruxsatnomasi: Bor"
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.READ_SMS),
                    3
                )
            }
        }
        binding.kalendar.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.READ_CALENDAR
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                binding.kalendarinfo.text = "Kalendar ruxsatnomasi: Bor"
            } else {
                binding.kalendarinfo.text = "Kalendar ruxsatnomasi: Bor"
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.READ_CALENDAR),
                    4
                )
            }
        }
        binding.telefon.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.CALL_PHONE
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                binding.telefoninfo.text = "Telefon ruxsatnomasi: Bor"
            } else {
                binding.telefoninfo.text = "Telefon ruxsatnomasi: Bor"
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    5
                )
            }
        }
        binding.mikrofon.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.RECORD_AUDIO
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                binding.mikrofoninfo.text = "Mikrofon ruxsatnomasi: Bor"
            } else {
                binding.mikrofoninfo.text = "Mikrofon ruxsatnomasi: Bor"
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.RECORD_AUDIO),
                    6
                )
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) {
            if (grantResults.size == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                binding.joylashuvinfo.text = "Joylashuv ruxsatnomasi: Bor"
            } else {
                binding.joylashuvinfo.text = "Joylashuv ruxsatnomasi: Bor"
            }
        }
        if (requestCode == 2) {
            if (grantResults.size == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                binding.kontaktinfo.text = "Kontakt ruxsatnomasi: Bor"
            } else {
                binding.kontaktinfo.text = "Kontakt ruxsatnomasi: Bor"
            }
        }
        if (requestCode == 3) {
            if (grantResults.size == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                binding.smsinfo.text = "SMS ruxsatnomasi: Bor"
            } else {
                binding.smsinfo.text = "SMS ruxsatnomasi: Bor"
            }
        }
        if (requestCode == 4) {
            if (grantResults.size == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                binding.kalendarinfo.text = "Kalendar ruxsatnomasi: Bor"
            } else {
                binding.kalendarinfo.text = "Kalendar ruxsatnomasi: Bor"
            }
        }
        if (requestCode == 5) {
            if (grantResults.size == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                binding.telefoninfo.text = "Telefon ruxsatnomasi: Bor"
            } else {
                binding.telefoninfo.text = "Telefon ruxsatnomasi: Bor"
            }
        }
        if (requestCode == 6) {
            if (grantResults.size == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                binding.mikrofoninfo.text = "Mikrofon ruxsatnomasi: Bor"
            } else {
                binding.mikrofoninfo.text = "Mikrofon ruxsatnomasi: Bor"
            }
        }
    }


}