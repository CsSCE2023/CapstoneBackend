package com.capstone.capstone.load.repositories;

import com.capstone.capstone.load.entities.SearchableProduct;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

public interface SearchableProductRepository extends ElasticsearchRepository<SearchableProduct, String> , CrudRepository<SearchableProduct,String> {

    @Query()
    List<SearchableProduct> searchSearchableProductByNameContains(//OrAddressContainingOrShopContainingOrDescriptionContainingOrIgnoreCase(
            String namePart//,
            //String addressPart,
            //String shopPart,
            //String descriptionPart
    );

}