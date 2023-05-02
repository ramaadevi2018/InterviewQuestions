public class BankAccount {
    String type;
    Integer accountNo;
    Long accountBalance;

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public BankAccount( String type, Integer accountNo){
        this.type =type;
        this.accountNo= accountNo;
    }
}
