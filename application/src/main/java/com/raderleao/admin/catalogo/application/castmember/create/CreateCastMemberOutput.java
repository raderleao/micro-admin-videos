package com.raderleao.admin.catalogo.application.castmember.create;

import com.raderleao.admin.catalogo.domain.castmember.CastMember;
import com.raderleao.admin.catalogo.domain.castmember.CastMemberID;

public record CreateCastMemberOutput(
        String id
) {
    public static CreateCastMemberOutput from(final CastMemberID anId) {
        return new CreateCastMemberOutput(anId.getValue());
    }
    public static CreateCastMemberOutput from(final CastMember aMember) {
        return from(aMember.getId());
    }
}
