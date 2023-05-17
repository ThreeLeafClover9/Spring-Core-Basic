package inflearn.springCoreBasic.discount;

import inflearn.springCoreBasic.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
