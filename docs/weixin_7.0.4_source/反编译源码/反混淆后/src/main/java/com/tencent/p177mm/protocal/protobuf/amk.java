package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.amk */
public final class amk extends C1331a {
    public int DesignerUin;
    public SKBuiltinBuffer_t ReqBuf;
    public int Scene;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(62569);
        C6092b c6092b;
        int bs;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.ReqBuf == null) {
                c6092b = new C6092b("Not all required fields were included: ReqBuf");
                AppMethodBeat.m2505o(62569);
                throw c6092b;
            }
            c6093a.mo13480iz(1, this.DesignerUin);
            if (this.ReqBuf != null) {
                c6093a.mo13479iy(2, this.ReqBuf.computeSize());
                this.ReqBuf.writeFields(c6093a);
            }
            c6093a.mo13480iz(3, this.Scene);
            AppMethodBeat.m2505o(62569);
            return 0;
        } else if (i == 1) {
            bs = C6091a.m9572bs(1, this.DesignerUin) + 0;
            if (this.ReqBuf != null) {
                bs += C6087a.m9557ix(2, this.ReqBuf.computeSize());
            }
            bs += C6091a.m9572bs(3, this.Scene);
            AppMethodBeat.m2505o(62569);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (bs = C1331a.getNextFieldNumber(c6086a); bs > 0; bs = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, bs)) {
                    c6086a.ems();
                }
            }
            if (this.ReqBuf == null) {
                c6092b = new C6092b("Not all required fields were included: ReqBuf");
                AppMethodBeat.m2505o(62569);
                throw c6092b;
            }
            AppMethodBeat.m2505o(62569);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            amk amk = (amk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    amk.DesignerUin = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(62569);
                    return 0;
                case 2:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        amk.ReqBuf = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(62569);
                    return 0;
                case 3:
                    amk.Scene = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(62569);
                    return 0;
                default:
                    AppMethodBeat.m2505o(62569);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(62569);
            return -1;
        }
    }
}
