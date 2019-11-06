package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Transactional
    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product pro1 = new Product("Sand");
        Product pro2 = new Product("Concrete");

        Item item1 = new Item(pro1, new BigDecimal("1200"), 100, new BigDecimal("1100"));
        Item item2 = new Item(pro1, new BigDecimal("800"), 80, new BigDecimal("700"));
        Item item3 = new Item(pro2, new BigDecimal("1500"), 10, new BigDecimal("1300"));

        List<Item> pro1ItemList = new ArrayList<>();
        pro1ItemList.add(item1);
        pro1ItemList.add(item2);
        pro1.setItems(pro1ItemList);

        List<Item> pro2ItemList = new ArrayList<>();
        pro2ItemList.add(item3);
        pro2.setItems(pro2ItemList);

        List<Item> invoiceItemList = new ArrayList<>();
        invoiceItemList.add(item1);
        invoiceItemList.add(item2);
        invoiceItemList.add(item3);

        Invoice invoice = new Invoice("005/2019", invoiceItemList);

        //When
        productDao.save(pro1);
        productDao.save(pro2);

        invoiceDao.save(invoice);

        List<Item> itemList1 = invoice.getItems();
        List<Item> itemList2 = pro1.getItems();
        List<Item> itemList3 = pro2.getItems();

        //Then
        Assert.assertEquals(3, itemList1.size());
        Assert.assertEquals(2, itemList2.size());
        Assert.assertEquals(1, itemList3.size());
    }
}
