package inflearn.springCoreBasic;

import inflearn.springCoreBasic.discount.FixDiscountPolicy;
import inflearn.springCoreBasic.member.MemberService;
import inflearn.springCoreBasic.member.MemberServiceImpl;
import inflearn.springCoreBasic.member.MemoryMemberRepository;
import inflearn.springCoreBasic.order.OrderService;
import inflearn.springCoreBasic.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
