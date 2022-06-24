package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Clock");
        Product product2 = new Product("Phone");

        Item item = new Item(product, new BigDecimal(200), 2, new BigDecimal(400));
        Item item2 = new Item(product2, new BigDecimal(1000), 1, new BigDecimal(1000));

        Invoice invoice = new Invoice("021022");

        invoice.getItems().add(item);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int invoiceSize = invoice.getItems().size();

        //Then
        assertEquals(2, invoiceSize);

        //CleanUp
        invoiceDao.deleteById(invoiceId);
    }
}
