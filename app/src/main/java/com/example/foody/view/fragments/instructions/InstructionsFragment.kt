package com.example.foody.view.fragments.instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.foody.databinding.FragmentInstructionsBinding
import com.example.foody.models.Result
import com.example.foody.util.Constants
import com.example.foody.util.Constants.Companion.RECIPE_RESULT

class InstructionsFragment : Fragment() {
    private var _binding: FragmentInstructionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInstructionsBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result? = args?.getParcelable(RECIPE_RESULT)

        binding.webViewInstructions.webViewClient = object : WebViewClient() {}
        val websiteUrl: String = myBundle!!.sourceUrl
        binding.webViewInstructions.loadUrl(websiteUrl)

        return binding.root
    }
}