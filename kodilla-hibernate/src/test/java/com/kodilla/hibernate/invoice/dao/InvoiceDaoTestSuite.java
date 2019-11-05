package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product pro1 = new Product("Sand");
        Product pro2 = new Product("Concrete");

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item(pro1, new BigDecimal("1200"), 100, new BigDecimal("1100")));
        itemList.add(new Item(pro1, new BigDecimal("800"), 80, new BigDecimal("700")));
        itemList.add(new Item(pro2, new BigDecimal("1500"), 10, new BigDecimal("1300")));

        Invoice invoice = new Invoice("005/2019", itemList);

        //When
        //invoiceDao.save(invoice);
    }
}
