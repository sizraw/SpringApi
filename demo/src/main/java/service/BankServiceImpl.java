package service;

import model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.Bank;

import java.util.List;
@Service

public class BankServiceImpl implements BankService{

    @Autowired
    private Bank Bankrepo;
    @Override
    public List<Account> getAllAccount() {
        return Bankrepo.findAll();
    }


}
