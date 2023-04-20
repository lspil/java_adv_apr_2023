package main;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public long countBankAccountsForClient(List<BankAccount> bankAccounts, String email) {
    return bankAccounts.stream()
        .filter(ba -> ba.getClient().getEmail().equals(email))
        .count();
  }

  public void printClientDetailsForAccounts(List<BankAccount> bankAccounts) {
    bankAccounts.stream()
        .map(ba -> ba.getClient())
        .distinct()
        .forEach(c -> System.out.println(c.getName() + " " + c.getEmail()));
  }

  public void printSavingsBankAccountsDetailsOrdered(List<BankAccount> bankAccounts) {
    Comparator<BankAccount> comp = (ba1, ba2) -> {
      if (ba1.getBalance() > ba2.getBalance()) return -1;
      if (ba1.getBalance() < ba2.getBalance()) return 1;
      return 0;
    };

    bankAccounts.stream()
        .filter(ba -> ba instanceof SavingsBankAccount)
        .sorted(comp)
        .forEach(ba -> System.out.println(ba));
  }

  public Map<Client, Long> countBankAccountsPerClient(List<BankAccount> bankAccounts) {
    return bankAccounts.stream()
        .collect(Collectors.groupingBy(ba -> ba.getClient(),
                  Collectors.counting()));
  }

  public void printClientDetails(List<BankAccount> bankAccounts) {
    bankAccounts.stream()
        .map(BankAccount::getClient) // ba -> ba.getClient()
        .distinct()
        .sorted(Comparator.comparing(Client::getName))   // c -> c.getName()
        .forEach(System.out::println);  // c -> System.out.println(c)
  }

  // ::
}
