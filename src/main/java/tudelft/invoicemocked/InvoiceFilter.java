package tudelft.invoicemocked;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class InvoiceFilter {

    private IssuedInvoices issuedInvoices;

    public InvoiceFilter (IssuedInvoices issuedInvoices) {
        this.issuedInvoices = issuedInvoices;
    }

    public List<Invoice> lowValueInvoices() {
        return issuedInvoices.all().stream()
                .filter(invoice -> invoice.value < 100)
                .collect(toList());

    }
}