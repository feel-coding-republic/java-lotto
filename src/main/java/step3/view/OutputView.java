package step3.view;

import step3.domain.BuyLotto;
import step3.domain.ResultInfo;

import java.util.Iterator;

public class OutputView {

    public void printBuyList(BuyLotto buyLotto) {
        System.out.println(buyLotto.getBuyLottoList().size() + "개를 구매했습니다.");
        Iterator iterator = buyLotto.getBuyLottoList().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printResult(ResultInfo resultInfo) {
        System.out.println("당첨통계");
        System.out.println("--------");
        System.out.println(resultInfo.getResultSentence());
    }
}
