package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель банковского сервиса
 */
public class BankService {
    /**
     * Поле содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему, принимает один параметр
     * @param user
     * Выполняет проверку что пользователя еще нет в системе
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет пользователя из системы, идентификация пользователя через
     * @param passport
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Метод добавляет новый счет к пользователю
     * Вначале находит пользователя по
     * @param passport
     * После получения всех счетов пользователя, проверяем что
     * такого счета у пользователя нет, добавляем новый счет
     * @param account
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> acc = users.get(user);
            if (!acc.contains(account)) {
                acc.add(account);
            }
        }
    }

    /**
     * Метод ищет нового пользователя по
     * @param passport
     * Если не находит, возвращаем null
     * @return
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(f -> f.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод поиска пользователя по реквизитам
     * Находим нового пользователя по
     * @param passport ,проверяем что поиск вернул не null
     * Получаем список счетов и в нем по
     * @param requisite
     * находим нужный счет
     * @return
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user)
                .stream()
                .filter(acc -> acc.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод для перечисления денег с одного счета на другой
     * Если счет не найден или не хватает денег на счете srtAccount, возвращаем false
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
                destAccount.setBalance(destAccount.getBalance() + amount);
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                return true;
        }
        return false;
    }

    /**
     * Метод предназначенный для тестов
     * @param user
     * @return
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
