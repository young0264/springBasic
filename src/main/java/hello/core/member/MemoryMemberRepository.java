package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository { // option + Enter. 메서드구현
    private static Map<Long, Member> store = new HashMap<>();   // 실무에선 concurrent Hashmap을 써야되
    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
