package com.example.rickmorty_paging_3.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.rickmorty_paging_3.presentation.model.CharacterModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RickRepository @Inject constructor(val api: RickMortyApiService) {

    companion object{
        const val MAX_ITEMS = 10 //Items to load
        const val PREFETCH_ITEMS = 3 // te last values to reload the next batch
    }


    fun getAllCharacters(): Flow<PagingData<CharacterModel>>{
       return Pager(config = PagingConfig(pageSize = MAX_ITEMS, prefetchDistance = PREFETCH_ITEMS),
           pagingSourceFactory = {
               CharacterPagingSource(api)
           }).flow
    }
}