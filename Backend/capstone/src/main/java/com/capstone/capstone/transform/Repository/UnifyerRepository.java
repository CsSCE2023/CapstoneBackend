package com.capstone.capstone.transform.Repository;

import com.capstone.capstone.transform.Entity.UnifiedProduct;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public class UnifyerRepository {


    @Autowired
    public EntityManager entityManager;

    public void save(UnifiedProduct unifiedProduct){
        entityManager.persist(unifiedProduct);
    }


    @Transactional
    public void saveAll(List<UnifiedProduct> unifiedProduct)
    {
        for (UnifiedProduct product : unifiedProduct) {
            entityManager.persist(product);
        }

    }



}
