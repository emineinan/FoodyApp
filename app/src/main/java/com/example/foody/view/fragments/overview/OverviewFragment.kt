package com.example.foody.view.fragments.overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import coil.load
import com.example.foody.R
import com.example.foody.bindingadapters.RecipesRowBinding
import com.example.foody.databinding.FragmentOverviewBinding
import com.example.foody.models.Result
import com.example.foody.util.Constants.Companion.RECIPE_RESULT
import org.jsoup.Jsoup

class OverviewFragment : Fragment() {
    private var _binding: FragmentOverviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOverviewBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result = args!!.getParcelable<Result>(RECIPE_RESULT) as Result

        binding.imageViewMain.load(myBundle.image)
        binding.textViewOverviewTitle.text = myBundle.title
        binding.textViewOverviewFavorites.text = myBundle.aggregateLikes.toString()
        binding.textViewOverviewDuration.text = myBundle.readyInMinutes.toString()
        RecipesRowBinding.parseHtml(binding.textViewSummary, myBundle.summary)

        updateColors(
            myBundle.vegetarian,
            binding.textViewOverviewVegetarian,
            binding.imageViewOverviewVegetarian
        )
        updateColors(myBundle.vegan, binding.textViewOverviewVegan, binding.imageViewOverviewVegan)
        updateColors(myBundle.cheap, binding.textViewOverviewCheap, binding.imageViewOverviewCheap)
        updateColors(
            myBundle.dairyFree,
            binding.textViewOverviewDairyFree,
            binding.imageViewOverviewDairyFree
        )
        updateColors(
            myBundle.glutenFree,
            binding.textViewOverviewGlutenFree,
            binding.imageViewOverviewGlutenFree
        )
        updateColors(
            myBundle.veryHealthy,
            binding.textViewOverviewHealthy,
            binding.imageViewOverviewHealthy
        )

        return binding.root
    }

    private fun updateColors(stateIsOn: Boolean, textView: TextView, imageView: ImageView) {
        if (stateIsOn) {
            imageView.setColorFilter(ContextCompat.getColor(requireContext(), R.color.green))
            textView.setTextColor(ContextCompat.getColor(requireContext(), R.color.green))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}