package com.serdar.rickandmorty_graphql.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.serdar.rickandmorty_graphql.databinding.FragmentHomeBinding
import com.serdar.rickandmorty_graphql.utility.notShow
import com.serdar.rickandmorty_graphql.utility.show
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel by viewModels<HomeViewModel>()
    private val adapter by lazy { HomeAdapter(emptyList()) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        viewState()
        return binding.root
    }

    private fun viewState() {
        viewModel.character.observe(viewLifecycleOwner) {
            when (it) {
                is HomeUiState.Loading -> {
                    binding.loading.show()
                }
                is HomeUiState.Error -> {
                    Toast.makeText(requireContext(), "Something Went Wrong", Toast.LENGTH_SHORT).show()
                }
                is HomeUiState.Success -> {
                    binding.loading.notShow()
                    binding.rcvCharacter.adapter = adapter
                    it.data?.let { it1 -> adapter.updateData(it1) }
                }
            }
        }
    }

}