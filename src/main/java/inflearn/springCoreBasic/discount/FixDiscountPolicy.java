package inflearn.springCoreBasic.discount;

import inflearn.springCoreBasic.annotation.SubDiscountPolicy;
import inflearn.springCoreBasic.member.Grade;
import inflearn.springCoreBasic.member.Member;
import org.springframework.stereotype.Component;

@Component
@SubDiscountPolicy
public class FixDiscountPolicy implements DiscountPolicy {
    private final int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
