package com.capstone.capstone.transform.Service;


import com.capstone.capstone.transform.Entity.UnifiedProduct;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class UnifyerService {

    /* Function to read csv, map to UnifiedProduct objects and save into a Database*/
    public List<UnifiedProduct> transform(File csv) {


        CsvMapper csvMapper = new CsvMapper(); // csv mapper object
        csvMapper.enable(CsvParser.Feature.IGNORE_TRAILING_UNMAPPABLE); // Prevent error associated with unmapped fields in csv file

        List<UnifiedProduct> products;
        try {

            /* Schema object */
            CsvSchema csvSchema = csvMapper
                    .typedSchemaFor(UnifiedProduct.class)
                    .withUseHeader(true)
                    .withColumnSeparator(',');

            /* Iterating over mapped object  */
            MappingIterator<UnifiedProduct> itr = csvMapper
                    .readerWithTypedSchemaFor(UnifiedProduct.class)
                    .with(csvSchema)
                    .readValues(csv);

            //while (itr.hasNext()) { System.out.println(itr.getParserSchema()); } // For Debugging

            /*Reading and storing all mapped elements into a List*/
            products = itr.readAll();

          // products.forEach(System.out::println); // for debugging
        } catch (Exception e) {
            throw new RuntimeException(e);

        }

        return products;
    }



}
