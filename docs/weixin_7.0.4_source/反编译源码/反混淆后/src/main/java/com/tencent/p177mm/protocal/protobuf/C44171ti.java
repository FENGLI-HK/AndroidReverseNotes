package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.ti */
public final class C44171ti extends C1331a {
    public String nQB;
    public long timestamp;
    public String vGv;
    public String way;
    public C30226te waz;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(124309);
        int o;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            c6093a.mo13472ai(1, this.timestamp);
            if (this.way != null) {
                c6093a.mo13475e(2, this.way);
            }
            if (this.vGv != null) {
                c6093a.mo13475e(3, this.vGv);
            }
            if (this.nQB != null) {
                c6093a.mo13475e(4, this.nQB);
            }
            if (this.waz != null) {
                c6093a.mo13479iy(5, this.waz.computeSize());
                this.waz.writeFields(c6093a);
            }
            AppMethodBeat.m2505o(124309);
            return 0;
        } else if (i == 1) {
            o = C6091a.m9578o(1, this.timestamp) + 0;
            if (this.way != null) {
                o += C6091a.m9575f(2, this.way);
            }
            if (this.vGv != null) {
                o += C6091a.m9575f(3, this.vGv);
            }
            if (this.nQB != null) {
                o += C6091a.m9575f(4, this.nQB);
            }
            if (this.waz != null) {
                o += C6087a.m9557ix(5, this.waz.computeSize());
            }
            AppMethodBeat.m2505o(124309);
            return o;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (o = C1331a.getNextFieldNumber(c6086a); o > 0; o = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, o)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(124309);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C44171ti c44171ti = (C44171ti) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    c44171ti.timestamp = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(124309);
                    return 0;
                case 2:
                    c44171ti.way = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(124309);
                    return 0;
                case 3:
                    c44171ti.vGv = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(124309);
                    return 0;
                case 4:
                    c44171ti.nQB = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(124309);
                    return 0;
                case 5:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C30226te c30226te = new C30226te();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c30226te.populateBuilderWithField(c6086a3, c30226te, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c44171ti.waz = c30226te;
                    }
                    AppMethodBeat.m2505o(124309);
                    return 0;
                default:
                    AppMethodBeat.m2505o(124309);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(124309);
            return -1;
        }
    }
}
