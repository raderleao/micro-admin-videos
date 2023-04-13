package com.raderleao.admin.catalogo.application.castmember.retrieve.get;

import com.raderleao.admin.catalogo.application.UseCase;

public sealed abstract class GetCastMemberByIdUseCase
    extends UseCase<String, CastMemberOutput>
    permits DefaultGetCastMemberByIdUseCase {
}
