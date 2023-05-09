package com.capstone.capstone.load;

import com.capstone.capstone.load.entities.SearchableProduct;
import com.capstone.capstone.load.repositories.SearchableProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Optional;

public class ProductSearchServiceImp implements ProductSearchService {

    private static SearchableProductRepository searchableProductRepository;

    @Autowired
    public ProductSearchServiceImp(SearchableProductRepository searchableProductRepository) {
        this.searchableProductRepository = searchableProductRepository;
    }


    @Scheduled(fixedDelay = 20000)
    //@Override
    public void createProductIndex(/*final SearchableProduct product*/) {
        SearchableProduct p = new SearchableProduct();
        p.setId("111111111");
        p.setAddress("Bremen");
        p.setDescription("Ja Milk");
        p.setShop("Rewe");
        p.setName("Milk");
        p.setPrice(1.3);
        p.setImage(0L);
        searchableProductRepository.save(p);

        Optional<SearchableProduct> pp = searchableProductRepository.findById("111111111");
    }




}

