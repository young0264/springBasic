package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) { //command + shift + t //테스트 클래스 만들기
        if (member.getGrade()==Grade.VIP){
            return price * discountPercent / 100;
        }else{
            return 0;
        }
    }
}
