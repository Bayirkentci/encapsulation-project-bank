# پروژه کپسوله سازی: بانک
این پروژه نموه ای از کابرد کپسوله سازی در جاوا میباشد که در یک سیستم بانکی ساده اعمال شده است.
## توضیحات

پروژه «پروژه کپسوله سازی: بانک» یک مدل ساده سیستم بانکی ارائه می‌کند، که کاربرد کپسوله سازی در محافظت از اطلاعات و کنترل دسترسی به داده ها را نمایش میدهد. این برنامه شامل کلاس‌هایی برای «مشتری»، «بانک» و دو نوع حساب بانکی است که این کلاسها شامل متدهایی برای واریز، برداشت و انتقال وجه میباشند.

## نصب و پیاده سازی

1.  **ابتدا سورس کد را با دستور زیر کلون کنید:**

    ```
    git clone https://github.com/Bayirkentci/encapsulation-project-bank.git
    ```

2. **سپس برای اجرای آن یکی از روشهای زیر را در پیش بگیرید**

   * پروژه را در ide مورد نظر خود اجرا کرده و سپس کلاس main را اجرا کنید.
   * ترمینال را باز کرده و به دیرکتوری root پروژه بروید. سپس کد را با دستورات زیر کامپایل کرده و اجرا کنید:

   ```
    javac -d bin -sourcepath src src/Main.java
    java -cp bin Main
   ``` 

## ساختار پروژه

```
encapsulation-project-bank/
    ├── src/ 
    │   ├── BankAccount.java/ #Represents a bank account, with methods for deposit, withdrawal, and balance inquiry.
    |   ├── BankCustomers.java/ #Manages the accounts of users and have the methods to add accounts, find accounts and show balances.
    |   ├── SavingAccount.jav #Extends BankAccount class and has the method to calculate interest of saving type accounts.
    |   ├── TransactionAccount.java #Extends BankAccount class and has the method to calculate interest of transaction type accounts.
    |   └──  Main.java # Main entry poin
    └── README.md
```  
