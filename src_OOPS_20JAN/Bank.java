package src_OOPS_20JAN;

public class Bank {

    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws CustomException {
        if (!(bankName.currency.equalsIgnoreCase("INR"))){
            throw new CustomException("USD to INR not supported!");
            //throw new ArithmeticException("Arithmetic");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }
}
