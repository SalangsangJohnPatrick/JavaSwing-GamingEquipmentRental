public class CustomerInfo
{
    private String customerName, address, contactNumber;
    
    public void setCustomer(String cN, String add, String contN){
        customerName = cN;
        address = add;
        contactNumber = contN;
    }
    
    public String getCustomerName()
    {
        return customerName;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getContactNumber()
    {
        return contactNumber;
    }
}
