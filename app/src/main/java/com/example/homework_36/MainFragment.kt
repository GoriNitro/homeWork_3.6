package com.example.homework_36

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.homework_36.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = GameAdapter(
            arrayListOf(
                GameModel("left4dead2","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.nicepng.com%2Fourpic%2Fu2w7r5u2i1y3e6w7_left-4-dead-2-steam-account-left-for%2F&psig=AOvVaw1yM0v7EFbVo_m-MEm7wx5A&ust=1701713695671000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCND_rtXv84IDFQAAAAAdAAAAABAH"),
                GameModel("cs:go","https://www.google.com/url?sa=i&url=https%3A%2F%2Ficonape.com%2Fcsgo-logo-logo-icon-svg-png.html&psig=AOvVaw1CstSy1JD47UuwokBa4lrm&ust=1701713644117000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCODaz7vv84IDFQAAAAAdAAAAABAD"),
                GameModel("valorant","https://www.google.com/url?sa=i&url=https%3A%2F%2Fseeklogo.com%2Fvector-logo%2F379976%2Fvalorant&psig=AOvVaw26FopKznGdhnfNNBAV1gAU&ust=1701713606360000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCODs_6nv84IDFQAAAAAdAAAAABAD"),
                GameModel("minecraft","https://www.google.com/url?sa=i&url=https%3A%2F%2Ficon-icons.com%2Ficon%2Fminecraft-logo%2F168974&psig=AOvVaw1I10cezQBVhi8OteZs2zz-&ust=1701713742925000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJD7rOvv84IDFQAAAAAdAAAAABAD"),
                GameModel("genshin impact","https://www.google.com/url?sa=i&url=https%3A%2F%2F1000logos.net%2Fgenshin-impact-logo%2F&psig=AOvVaw30QeTa4U-vnA1fdVCVw_AW&ust=1701713785890000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCLjMl__v84IDFQAAAAAdAAAAABAD"),
                GameModel("world of tanks","https://www.google.com/url?sa=i&url=https%3A%2F%2Flogowik.com%2Fworld-of-tanks-vector-logo-5312.html&psig=AOvVaw17rivA1fle0bAKcNxhQZhb&ust=1701713851085000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKDryqPw84IDFQAAAAAdAAAAABAY"),
                GameModel("geometry dash","https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FGeometry_Dash&psig=AOvVaw2Ezp-9ALiHq23ILWKj_-iW&ust=1701713884269000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCKCi7q3w84IDFQAAAAAdAAAAABAD"),
                GameModel("mobile legends","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.esports.net%2Fnews%2Fmobile-games%2Fmobile-legends-mlbb-new-logo-2023%2F&psig=AOvVaw2HuFC5LWZrnw3FUT-fDqBw&ust=1701713941940000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCPC3jM3w84IDFQAAAAAdAAAAABAe"),
                GameModel("free fire","https://www.google.com/imgres?imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fen%2Fc%2Fc5%2FLogo_of_Garena_Free_Fire.png&tbnid=ui9nLxnv2KUdSM&vet=12ahUKEwjCrfnW8POCAxUcIRAIHQTvAqkQMygAegQIARBP..i&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FFile%3ALogo_of_Garena_Free_Fire.png&docid=HHyX8eBSh-PtPM&w=4167&h=2084&q=logo%20free%20fire&ved=2ahUKEwjCrfnW8POCAxUcIRAIHQTvAqkQMygAegQIARBP"),
                GameModel("pubg","https://www.google.com/url?sa=i&url=https%3A%2F%2Fseeklogo.com%2Fvector-logo%2F384290%2Fpubg-mobile&psig=AOvVaw0H3eKRMIRDRy_En8yMh9Vh&ust=1701713993937000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCOD8meLw84IDFQAAAAAdAAAAABAH"),
            )
        )
        binding.rvGame.adapter = adapter
    }
}
