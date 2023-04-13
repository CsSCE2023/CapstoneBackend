package com.capstone.capstone.load.repositories;

import com.capstone.capstone.load.entities.SearchableProduct;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface SearchableProductRepository extends ElasticsearchRepository<SearchableProduct, String> {


}