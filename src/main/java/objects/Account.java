package objects;

public class Account {

  String owner;
  float amount;

  public Account(String owner, float amount){
    this.owner = owner;
    this.amount = amount;
  }

  public String getOwner(){
    return owner;
  }

  public float getAmount(){
    return amount;
  }

  public void deposit(float amount){
    this.amount += amount;
  }

  public void withdraw(float amount){
    this.amount -= amount;
  }
    
}
