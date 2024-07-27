package com.example.rickmorty_paging_3.presentation

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.example.rickmorty_paging_3.data.RickRepository
import com.example.rickmorty_paging_3.presentation.model.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


@HiltViewModel
class RickListViewModel @Inject constructor(rickRepository: RickRepository) : ViewModel() {

    val characters: Flow<PagingData<CharacterModel>> = rickRepository.getAllCharacters()

}