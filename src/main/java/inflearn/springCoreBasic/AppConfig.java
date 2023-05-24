package inflearn.springCoreBasic;

import inflearn.springCoreBasic.discount.DiscountPolicy;
import inflearn.springCoreBasic.discount.FixDiscountPolicy;
import inflearn.springCoreBasic.member.MemberRepository;
import inflearn.springCoreBasic.member.MemberService;
import inflearn.springCoreBasic.member.MemberServiceImpl;
import inflearn.springCoreBasic.member.MemoryMemberRepository;
import inflearn.springCoreBasic.order.OrderService;
import inflearn.springCoreBasic.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
