package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import e.a.a.c.a;
import java.util.LinkedList;

public final class aoj extends btd {
    public int kCl = 0;
    public String kCm = "ok";
    public String nWx;
    public LinkedList<atb> wsA = new LinkedList();
    public String wsB;
    public int wsC;
    public LinkedList<String> wsD = new LinkedList();
    public int wsE;

    public aoj() {
        AppMethodBeat.i(56837);
        AppMethodBeat.o(56837);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(56838);
        b bVar;
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56838);
                throw bVar;
            }
            if (this.BaseResponse != null) {
                aVar.iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.iz(2, this.kCl);
            if (this.kCm != null) {
                aVar.e(3, this.kCm);
            }
            aVar.e(4, 8, this.wsA);
            if (this.wsB != null) {
                aVar.e(5, this.wsB);
            }
            aVar.iz(6, this.wsC);
            if (this.nWx != null) {
                aVar.e(7, this.nWx);
            }
            aVar.e(8, 1, this.wsD);
            aVar.iz(9, this.wsE);
            AppMethodBeat.o(56838);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += e.a.a.b.b.a.bs(2, this.kCl);
            if (this.kCm != null) {
                ix += e.a.a.b.b.a.f(3, this.kCm);
            }
            ix += e.a.a.a.c(4, 8, this.wsA);
            if (this.wsB != null) {
                ix += e.a.a.b.b.a.f(5, this.wsB);
            }
            ix += e.a.a.b.b.a.bs(6, this.wsC);
            if (this.nWx != null) {
                ix += e.a.a.b.b.a.f(7, this.nWx);
            }
            int c = (ix + e.a.a.a.c(8, 1, this.wsD)) + e.a.a.b.b.a.bs(9, this.wsE);
            AppMethodBeat.o(56838);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wsA.clear();
            this.wsD.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            if (this.BaseResponse == null) {
                bVar = new b("Not all required fields were included: BaseResponse");
                AppMethodBeat.o(56838);
                throw bVar;
            }
            AppMethodBeat.o(56838);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            aoj aoj = (aoj) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(aVar4, baseResponse, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aoj.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.o(56838);
                    return 0;
                case 2:
                    aoj.kCl = aVar3.BTU.vd();
                    AppMethodBeat.o(56838);
                    return 0;
                case 3:
                    aoj.kCm = aVar3.BTU.readString();
                    AppMethodBeat.o(56838);
                    return 0;
                case 4:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        atb atb = new atb();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = atb.populateBuilderWithField(aVar4, atb, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        aoj.wsA.add(atb);
                    }
                    AppMethodBeat.o(56838);
                    return 0;
                case 5:
                    aoj.wsB = aVar3.BTU.readString();
                    AppMethodBeat.o(56838);
                    return 0;
                case 6:
                    aoj.wsC = aVar3.BTU.vd();
                    AppMethodBeat.o(56838);
                    return 0;
                case 7:
                    aoj.nWx = aVar3.BTU.readString();
                    AppMethodBeat.o(56838);
                    return 0;
                case 8:
                    aoj.wsD.add(aVar3.BTU.readString());
                    AppMethodBeat.o(56838);
                    return 0;
                case 9:
                    aoj.wsE = aVar3.BTU.vd();
                    AppMethodBeat.o(56838);
                    return 0;
                default:
                    AppMethodBeat.o(56838);
                    return -1;
            }
        } else {
            AppMethodBeat.o(56838);
            return -1;
        }
    }
}
