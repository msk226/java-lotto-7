package lotto.view;

import static lotto.utils.Messages.*;

import java.util.List;
import lotto.model.Lotto;
import lotto.model.LottoMachine;
import lotto.model.LottoResultManager;
import lotto.model.enums.LottoResult;
import lotto.utils.Messages;

public class OutputView {

    public static void printBoughtLotto(LottoMachine lottoMachine){
        System.out.println(lottoMachine.getCount() + BOUGHT_LOTTO);
        for (Lotto lotto : lottoMachine.getLottos())
            System.out.println(OPEN_BRACKET + lotto.getFormattedNumbers() + CLOSE_BRACKET);
    }

    public static void printLottoResult(){
        printResultHeader();
        for (LottoResult lottoResult : LottoResult.values()){
            System.out.printf((lottoResult.getMessage()) + "%n", lottoResult.getCount());
        }
    }

    private static void printResultHeader() {
        System.out.println(LOTTO_RESULT);
        System.out.println(DASH);
    }

    public static void printLottoProfit(LottoResultManager lottoResultManager) {
        System.out.println(PROFIT + lottoResultManager.calculateProfit() + PERCENT);
    }
}
