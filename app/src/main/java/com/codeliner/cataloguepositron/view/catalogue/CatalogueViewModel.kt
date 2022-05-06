package com.codeliner.cataloguepositron.view.catalogue

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codeliner.cataloguepositron.data.repository.Repository
import com.codeliner.cataloguepositron.model.CatalogueModel
import kotlinx.coroutines.launch
import retrofit2.Response

class CatalogueViewModel: ViewModel() {

    var repository = Repository()
    val catalogue: MutableLiveData<Response<CatalogueModel>> = MutableLiveData()

    fun getCatalogue() {
        viewModelScope.launch {
            catalogue.value = repository.getCatalogueRepo()
        }
    }

}