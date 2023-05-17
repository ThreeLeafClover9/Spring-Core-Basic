package inflearn.springCoreBasic;

import inflearn.springCoreBasic.member.Grade;
import inflearn.springCoreBasic.member.Member;
import inflearn.springCoreBasic.member.MemberService;
import inflearn.springCoreBasic.member.MemberServiceImpl;
import inflearn.springCoreBasic.order.Order;
import inflearn.springCoreBasic.order.OrderService;
import inflearn.springCoreBasic.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
    }
}
