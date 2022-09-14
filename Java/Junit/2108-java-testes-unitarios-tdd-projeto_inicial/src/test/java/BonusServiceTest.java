import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioSalarioAlto() {
        BonusService service = new BonusService();
        Funcionario funcionario = new Funcionario("Jose", LocalDate.now(), new BigDecimal("25000"));

        //Tipo 1
        Assertions.assertThrows( IllegalArgumentException.class, () -> service.calcularBonus(funcionario));

        //Tipo 2
        try {
            service.calcularBonus(funcionario);
            Assertions.fail("Não deu Exception");
        } catch (Exception e) {
            Assertions.assertEquals("Funcionario com Salaŕio Maior que R$10.000 não pode ter Bonus",e.getMessage());
        }

    }

    @Test
    void bonusDeveriaSerDezPorCentoSalarioAlto() {
        BonusService service = new BonusService();
        Funcionario funcionario = new Funcionario("Jose", LocalDate.now(), new BigDecimal("2500"));
        BigDecimal bonuns = service.calcularBonus(funcionario);

        Assertions.assertEquals(new BigDecimal("250.00"), bonuns);
    }



}
