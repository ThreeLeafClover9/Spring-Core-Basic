package inflearn.springCoreBasic;

import inflearn.springCoreBasic.discount.DiscountPolicy;
import inflearn.springCoreBasic.discount.RateDiscountPolicy;
import inflearn.springCoreBasic.member.MemberRepository;
import inflearn.springCoreBasic.member.MemberService;
import inflearn.springCoreBasic.member.MemberServiceImpl;
import inflearn.springCoreBasic.member.MemoryMemberRepository;
import inflearn.springCoreBasic.order.OrderService;
import inflearn.springCoreBasic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
