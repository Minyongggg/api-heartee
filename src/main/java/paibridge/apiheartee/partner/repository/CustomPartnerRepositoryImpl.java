package paibridge.apiheartee.partner.repository;

import static paibridge.apiheartee.partner.entity.QPartner.partner;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;
import paibridge.apiheartee.counsel.entity.CategoryType;
import paibridge.apiheartee.partner.entity.Partner;

@RequiredArgsConstructor
public class CustomPartnerRepositoryImpl implements CustomPartnerRepository {

    private final JPAQueryFactory queryFactory;

    private static BooleanExpression memberIdEq(Long memberId) {
        if (memberId == null) {
            return null;
        }
        return partner.member.id.eq(memberId);
    }

    private static BooleanExpression dtypeLike(String dtype) {
        // null or ""
        if (!StringUtils.hasText(dtype)) {
            return null;
        }

        if (Boolean.FALSE.equals(CategoryType.validateDtype(dtype))) {
            return Expressions.FALSE.isTrue();
        }

        return partner.dtype.eq(dtype);
    }


    public List<Partner> findAll(Long memberId, String dtype) {

        return queryFactory
            .select(partner)
            .from(partner)
            .where(memberIdEq(memberId), dtypeLike(dtype))
            .fetch();
    }
}
