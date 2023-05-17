package inflearn.springCoreBasic.order;

import inflearn.springCoreBasic.discount.DiscountPolicy;
import inflearn.springCoreBasic.discount.FixDiscountPolicy;
import inflearn.springCoreBasic.member.Member;
import inflearn.springCoreBasic.member.MemberRepository;
import inflearn.springCoreBasic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
