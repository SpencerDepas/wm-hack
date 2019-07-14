package clearfaun.com.wm_hackathon

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.test.*

class MainActivity : AppCompatActivity() {

    val animals: ArrayList<String> = ArrayList()
    val restaurants: ArrayList<Restaurant> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        addRestaurants()


        rv_animal_list.layoutManager = LinearLayoutManager(this)

        rv_animal_list.adapter = RestaurantsAdapter(restaurants, this)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


    fun addRestaurants() {


        val l1 = Restaurant()
        l1.deepLink = "http://www.dianping.com/shop/69843107"
        l1.restaurantName = "Myeongdong State KOREAN FOOD"
        l1.restaurantGreenRating = "4.8 WM Green rating"
        l1.distance = "1.2 miles"
        l1.foodType = "Korean"
        l1.imageURL =
            "http://qcloud.dpfile.com/pc/37JS2I6Sw1UqA-mmsOGKjko-_hcplv0LziN9YjYAgFifmYbFgDvGla7ZFu3eeOLXuzFvxlbkWx5uwqY2qcjixFEuLYk00OmSS1IdNpm8K8twhW7bzr4O88Ivp4FuDG0SfCF2ubeXzk49OsGrXt_KYDCngOyCwZK-s3fqawWswzk.jpg"

        val l2 = Restaurant()
        l2.deepLink =
            "http://www.dianping.com/shop/130153350?_fb_=sver%3D2%26ad_ci%3DdxsKiCWy4FHTIOvT_1aZvc63d20dQq83KtLrrIDQLt6TbL4qQipcdO2jpG4eXNtvBMj7k8o19vb8yJ4apAjAcAbNUEBDr7rSVA%26ad_v%3D1%26ad_cj%3DdxsKiCWgPO2DftMoFX2a7BgAmV7f_HTPCdrP2TDLyubqdpYo0LBQp9wwNrggNptXLlizIRA1GriW1wKQL9NS516G8iWZzkQfgD1CfWk-1bWPIM9DBNFxx_DKGCQyZKHfFi2QySfmdrPzyRY5nm34DS46zZAeOP8f4Rd5a09zPrbqTnvNDIjBfAt5PBCHMSRfq0GueBu0GKVvgTtCLIA0pfoAD8HK_n7SiIfapT_hi3x3Oi7TYcMqQIQW0960jt31ECO3vy6jspmWayrVuDdthMsMVJUV7kcpae72x2wqTsvD7x2miwOgUtSqPOQjXMpeRHrOBfkmjjIH3jGm56wKbywc3wmG4KfxQqav1ZHFFrkz3vwtIseD6aFIDeJICYQ8eCzetBLnDqe8Yaq4dC14oGqSToC1lkEMbOCiDE1dSeLBvBAPuJE"
        l2.restaurantName = "马路边边串串香"
        l2.restaurantGreenRating = "4.1 WM Green rating"
        l2.distance = "2.2 miles"
        l2.foodType = "Fire"
        l2.imageURL =
            "http://qcloud.dpfile.com/pc/2VY8AwwGGCIhmOilEHrnB9Fh9N5YlPN9-h9ewt7AODhJ1d-UaiACIbCESM9tlXdTuzFvxlbkWx5uwqY2qcjixFEuLYk00OmSS1IdNpm8K8twhW7bzr4O88Ivp4FuDG0SfCF2ubeXzk49OsGrXt_KYDCngOyCwZK-s3fqawWswzk.jpg"


        val l3 = Restaurant()
        l3.deepLink =
            "http://www.dianping.com/shop/130283599"
        l3.restaurantName = "Merci French Food"
        l3.restaurantGreenRating = "4.0 WM Green rating"
        l3.distance = "1.1 miles"
        l3.foodType = "French"
        l3.imageURL =
            "http://qcloud.dpfile.com/pc/sl1JCzjO73UPJxXz7j-X5Q0jX4M2YjfXTuYgAiqErrV6eareAFcb2uM-5onsOtRDuzFvxlbkWx5uwqY2qcjixFEuLYk00OmSS1IdNpm8K8twhW7bzr4O88Ivp4FuDG0SfCF2ubeXzk49OsGrXt_KYDCngOyCwZK-s3fqawWswzk.jpg"

        val l4 = Restaurant()
        l4.deepLink =
            "http://www.dianping.com/shop/69447104"
        l4.restaurantName = "STA FOOD"
        l4.restaurantGreenRating = "3.5 WM Green rating"
        l4.distance = "2.1 miles"
        l4.foodType = "Noodles"
        l4.imageURL =
            "http://qcloud.dpfile.com/pc/r7aGsT46ewaTsGTeUpOV5FW4odqbpqtY0XFdZkvGfmOS0ObEd69xzr4GE8FwsjxouzFvxlbkWx5uwqY2qcjixFEuLYk00OmSS1IdNpm8K8twhW7bzr4O88Ivp4FuDG0SfCF2ubeXzk49OsGrXt_KYDCngOyCwZK-s3fqawWswzk.jpg"

        val l5 = Restaurant()
        l5.deepLink =
            "http://www.dianping.com/shop/71389625"
        l5.restaurantName = "Myeongdong State"
        l5.restaurantGreenRating = "4.8 WM Green rating"
        l5.distance = "2.7 miles"
        l5.foodType = "Korean"
        l5.imageURL =
            "http://qcloud.dpfile.com/pc/IdAlO2g7h4yL6M-fV-Dt6nck7miQvJfJVyMLvSUVG4kiWckIbiCo3OTQ4xPEhrctuzFvxlbkWx5uwqY2qcjixFEuLYk00OmSS1IdNpm8K8twhW7bzr4O88Ivp4FuDG0SfCF2ubeXzk49OsGrXt_KYDCngOyCwZK-s3fqawWswzk.jpg"

        val l6 = Restaurant()
        l6.deepLink =
            "http://www.dianping.com/shop/122364097"
        l6.restaurantName = "Food by Feas "
        l6.restaurantGreenRating = "5 WM Green rating"
        l6.distance = ".3 miles"
        l6.foodType = "Western"
        l6.imageURL =
            "http://qcloud.dpfile.com/pc/YK1ZB8JC9ZjLiyLT464mZnXPCZ2pKzej-fQbfATwkC65Pv7t-93aTa-KZ8SNGZEojoJrvItByyS4HHaWdXyO_DrXIaWutJls2xCVbatkhjUNNiIYVnHvzugZCuBITtvjski7YaLlHpkrQUr5euoQrg.jpg"


        val l7 = Restaurant()
        l7.deepLink =
            "http://www.dianping.com/shop/59239578"
        l7.restaurantName = "Food bran  "
        l7.restaurantGreenRating = "4.5 WM Green rating"
        l7.distance = ".9 miles"
        l7.foodType = "American"
        l7.imageURL =
            "http://qcloud.dpfile.com/pc/4QM4PJKHHqBhL5kxuPTdS3Mlq-xB5KLukvUbwb3tGEBmFsP-B-YPEFaHRXptTprHjoJrvItByyS4HHaWdXyO_DrXIaWutJls2xCVbatkhjUNNiIYVnHvzugZCuBITtvjski7YaLlHpkrQUr5euoQrg.jpg"

        val l8 = Restaurant()
        l8.deepLink =
            "http://www.dianping.com/shop/2647597"
        l8.restaurantName = "大食代(富力广场店"
        l8.restaurantGreenRating = "3.9 WM Green rating"
        l8.distance = "1.1 miles"
        l8.foodType = "Dumplings"
        l8.imageURL =
            "http://qcloud.dpfile.com/pc/QkyX3Bxpowc1fP0wkxUXGzniHexthbL7l41I5_fy8krYCMX9GcqM8WqJs9_-0BbpjoJrvItByyS4HHaWdXyO_DrXIaWutJls2xCVbatkhjUNNiIYVnHvzugZCuBITtvjski7YaLlHpkrQUr5euoQrg.jpg"



        val l9 = Restaurant()
        l9.deepLink =
            "http://www.dianping.com/shop/44363579"
        l9.restaurantName = "LUCKY FOOD  "
        l9.restaurantGreenRating = "3 WM Green rating"
        l9.distance = ".22 miles"
        l9.foodType = "Fast"
        l9.imageURL =
            "http://p0.meituan.net/mogu/8424cb96d9e09f0920c85ff0a9cfc6df441644.jpg%40700w_700h_0e_1l%7Cwatermark%3D1%26%26r%3D1%26p%3D9%26x%3D2%26y%3D2%26relative%3D1%26o%3D20"



        restaurants.add(l1)
        restaurants.add(l2)
        restaurants.add(l3)
        restaurants.add(l4)
        restaurants.add(l5)
        restaurants.add(l6)
        restaurants.add(l7)
        restaurants.add(l8)
        restaurants.add(l9)

    }
}
