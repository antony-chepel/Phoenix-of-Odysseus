package com.tocaboca.tocalifeworldo.wwsasd
import android.net.Uri
import com.tocaboca.tocalifeworldo.mxuhcx.Gqwoskxijuhcx
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.cpld
import java.io.IOException
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.os.Bundle
import org.koin.core.qualifier.named
import java.io.File
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.feprel
import com.tocaboca.tocalifeworldo.wwsasd.ucixj.Uwowosixcs.fokrdslpasd
import android.content.Intent
import java.text.SimpleDateFormat
import android.widget.Toast
import android.webkit.*
import android.os.Environment
import android.os.Handler
import org.koin.androidx.viewmodel.ext.android.viewModel







class Saokxkkcuhuhvcc : AppCompatActivity() {
    private var yetdyhu: String? = null
    lateinit var ncoxkxcjixcijuhdhu: WebView
    private var cbxsaosdk = false
    private var buhhuvcij: ValueCallback<Array<Uri>>? = null
    private  val trieiooeks = 1
    var pwpqksokooxczjizxcj = ""
    private val xuxiijis by viewModel<Gqwoskxijuhcx>(
        named("BeamModel")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ncoxkxcjixcijuhdhu = WebView(this)
        setContentView(ncoxkxcjixcijuhdhu)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(ncoxkxcjixcijuhdhu, true)
        xuxiijis.tplrlpepllkodkosokjicxuhvhgyd(ncoxkxcjixcijuhdhu)

        ncoxkxcjixcijuhdhu.webViewClient = Uqqqoqsijxjiczuhchux()
        ncoxkxcjixcijuhdhu.webChromeClient = Eqoqokkoksjixcjiz()
        ncoxkxcjixcijuhdhu.loadUrl(flpdlplsplokxzokc())
    }

    fun tcyuxijiivdokdkos(nvjjicjicuh: String?) {
        if (!nvjjicjicuh!!.contains("t.me")) {

            if (pwpqksokooxczjizxcj == "") {
                pwpqksokooxczjizxcj = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    nvjjicjicuh
                ).toString()

                val ksisodkkox = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val cjixjiijvji = ksisodkkox.edit()
                cjixjiijvji.putString("SAVED_URL", nvjjicjicuh)
                cjixjiijvji.apply()
            }
        }
    }


    override fun onBackPressed() {

        if (ncoxkxcjixcijuhdhu.canGoBack()) {
            if (cbxsaosdk) {
                ncoxkxcjixcijuhdhu.stopLoading()
                ncoxkxcjixcijuhdhu.loadUrl(pwpqksokooxczjizxcj)
            }
            this.cbxsaosdk = true
            ncoxkxcjixcijuhdhu.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                cbxsaosdk = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }



    inner class Eqoqokkoksjixcjiz : WebChromeClient() {

        override fun onShowFileChooser(
            cgcxij: WebView?,
            wwpwllwpoksijd: ValueCallback<Array<Uri>>?,
            vicjji: FileChooserParams?
        ): Boolean {
            buhhuvcij?.onReceiveValue(null)
            buhhuvcij = wwpwllwpoksijd
            var bcooxjiijdkof: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (bcooxjiijdkof!!.resolveActivity(packageManager) != null) {
                var fokrkookds: File? = null
                try {
                    fokrkookds = vododiiuxhhxuzc()
                    bcooxjiijdkof.putExtra("PhotoPath", yetdyhu)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (fokrkookds != null) {
                    yetdyhu = "file:" + fokrkookds.absolutePath
                    bcooxjiijdkof.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(fokrkookds)
                    )
                } else {
                    bcooxjiijdkof = null
                }
            }
            val hctcxuudjisij = Intent(Intent.ACTION_GET_CONTENT)
            hctcxuudjisij.addCategory(Intent.CATEGORY_OPENABLE)
            hctcxuudjisij.type = "image/*"
            val mvmccjivijd: Array<Intent?> = bcooxjiijdkof?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val dqpqllpqlpskokod = Intent(Intent.ACTION_CHOOSER)
            dqpqllpqlpskokod.putExtra(Intent.EXTRA_INTENT, hctcxuudjisij)
            dqpqllpqlpskokod.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            dqpqllpqlpskokod.putExtra(Intent.EXTRA_INITIAL_INTENTS, mvmccjivijd)
            startActivityForResult(dqpqllpqlpskokod, trieiooeks)
            return true
        }

        fun vododiiuxhhxuzc(): File? {
            val ydisj = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val cnbxjijivdfoko = "JPEG_" + ydisj + "_"
            val lplpqlpskoksdkox = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                cnbxjijivdfoko,
                ".jpg",
                lplpqlpskoksdkox
            )
        }
    }


    private fun flpdlplsplokxzokc(): String {
        val wplelpwlsa = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val cjjxuhvgyygdgy = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val spslapls = wplelpwlsa.getString(cpld, null)
        val nnccjxjkokokokoxvjid = wplelpwlsa.getString(fokrdslpasd, null)
        val sokdwko = wplelpwlsa.getString(feprel, null)
        when (wplelpwlsa.getString("WebInt", null)) {
            "campaign" -> {
                xuxiijis.delpwpl(nnccjxjkokokokoxvjid.toString())
            }
            "deepLink" -> {
                xuxiijis.delpwpl(nnccjxjkokokokoxvjid.toString())
            }
            "deepLinkNOApps" -> {
                xuxiijis.delpwpl(spslapls.toString())
            }
            "geo" -> {
                xuxiijis.delpwpl(spslapls.toString())
            }
        }
        return cjjxuhvgyygdgy.getString("SAVED_URL", sokdwko).toString()
    }

    inner class Uqqqoqsijxjiczuhchux: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (xuxiijis.uwwooqkokskosa(url)) {

                    val chxjijixcijd = Intent(Intent.ACTION_VIEW)
                    chxjijixcijd.data = Uri.parse(url)
                    startActivity(chxjijixcijd)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            tcyuxijiivdokdkos(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Saokxkkcuhuhvcc, description, Toast.LENGTH_SHORT).show()
        }
    }


    override fun onActivityResult(dosoooxzck: Int, wplslp: Int, ncxjijivjid: Intent?) {

        if (dosoooxzck != trieiooeks || buhhuvcij == null) {
            super.onActivityResult(dosoooxzck, wplslp, ncxjijivjid)
            return
        }
        var jjxnjnc: Array<Uri>? = null

        if (wplslp == RESULT_OK) {
            if (ncxjijivjid == null) {
                if (yetdyhu != null) {
                    jjxnjnc = arrayOf(Uri.parse(yetdyhu))
                }
            } else {
                val qpllpslpsdko = ncxjijivjid.dataString
                if (qpllpslpsdko != null) {
                    jjxnjnc = arrayOf(Uri.parse(qpllpslpsdko))
                }
            }
        }
        buhhuvcij!!.onReceiveValue(jjxnjnc)
        buhhuvcij = null
        return
    }






}

