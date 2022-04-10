import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void should_return_return_zero_balance_for_new_account(){
//        //given
//        Account account = new Account();
//        final int expectedBalance = 0;
//        //when
//        int balance = account.getBalance();
//        //then
//        assertEquals(expectedBalance, balance);

        //given
        Account account = new Account();
        //then
        assertEquals(0,account.getBalance()); //to jest czytelniejsze

    }

    @Test
    void should_return_balnce_of_100_after_deposit_of_100(){
        //given
        Account account = new Account();
        //when
        account.deposit(100);
        //then
        assertEquals(100, account.getBalance());
//        assertTrue(100 == account.getBalance()); //to nie jest dobry kierunek. Gdzie się da pchajmy assertEquals
    }

    @Test
    void should_return_valid_amount_after_withdraw() {

    }

    @Test
    void should_not_complete_transaction_exceeding_maximus_debit_of_1000(){

    }

    @Test
    void should_not_complete_transaction_with_negative_amoint(){

    }

    @Test
    void should_transaction_money_between_accounts(){

    }

}