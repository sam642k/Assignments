class Account{
    constructor(id, name, balance){
        this.id=id;
        this.name=name;
        this.balance= balance;
    }
}

class SavingsAccount extends Account{
    interest=500;
    getTotalBalance(){
        return this.balance+this.interest;
    }
}

class CurrentAccount extends Account{
    cashCredit=800;
    getTotalBalance(){
        return this.balance+this.cashCredit;
    }
}

function totalBalance(...accounts: any){
    let sum=0
    for(let acc of accounts){
        sum+=acc.getTotalBalance();
    }
    return sum;
}

let tony= new SavingsAccount(101, "Tony", 874545);
let thor= new SavingsAccount(102, "Thor", 654954);
let steve= new CurrentAccount(103, "Steve", 78452);

console.log("Total balance in bank is: "+totalBalance(tony, thor, steve));
