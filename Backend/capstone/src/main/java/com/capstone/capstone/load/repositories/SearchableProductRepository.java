package com.capstone.capstone.load.repositories;

import com.capstone.capstone.load.entities.SearchableProduct;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface SearchableProductRepository extends ElasticsearchRepository<SearchableProduct, String> {

    List<SearchableProduct> searchSearchableProductByNameContainsOrAddressContainingOrShopContainingOrDescriptionContainingOrIgnoreCase(
            String namePart,
            String addressPart,
            String shopPart,
            String descriptionPart
    );

    default List<SearchableProduct> searchProduct(
            String namePart,
            String addressPart,
            String shopPart,
            String descriptionPart
    ){

        return searchSearchableProductByNameContainsOrAddressContainingOrShopContainingOrDescriptionContainingOrIgnoreCase(
                namePart,
                addressPart,
                shopPart,
                descriptionPart
        );

    }


}