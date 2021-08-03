package service;

import model.Account;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BankService {
    List<Account> getAllAccount();
}
