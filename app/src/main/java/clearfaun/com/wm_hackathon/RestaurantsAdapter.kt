package clearfaun.com.wm_hackathon

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.view_green_restaurant.view.*


class RestaurantsAdapter(val items : ArrayList<Restaurant>, val context: Context) : RecyclerView.Adapter<ViewHolderTwo>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolderTwo {
        return ViewHolderTwo(LayoutInflater.from(context).inflate(R.layout.view_green_restaurant, p0, false))
    }

    override fun onBindViewHolder(viewHolderTwo: ViewHolderTwo, p1: Int) {

        viewHolderTwo?.nameOfRestaurant?.text = items.get(p1).restaurantName
        viewHolderTwo?.rating?.text = items.get(p1).restaurantGreenRating
        viewHolderTwo?.distance?.text = items.get(p1).distance
        viewHolderTwo?.foodType?.text = items.get(p1).foodType

        Glide
            .with(viewHolderTwo?.restaurantImage.context)
            .load(items.get(p1).imageURL)
            .centerCrop()
            .placeholder(R.drawable.abc_ab_share_pack_mtrl_alpha)
            .into(viewHolderTwo?.restaurantImage);



        viewHolderTwo?.cardRestaurant?.setOnClickListener { view ->
            launchWebsitee(viewHolderTwo?.cardRestaurant, items.get(p1).deepLink!! );
        }
    }

    fun launchWebsitee(view: View, deepLink: String){
        val url = "http://www.dianping.com/shop/69843107"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))


        val pm = view.context.getPackageManager();

        if (intent.resolveActivity(pm) != null) {
            view.context.startActivity(intent)
        }
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

}

class ViewHolderTwo (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val nameOfRestaurant = view.restaurantName
    val rating = view.greenRating
    val distance = view.distance
    val foodType = view.foodType
    val cardRestaurant = view.cardRestaurant
    val restaurantImage = view.restaurantImage


}