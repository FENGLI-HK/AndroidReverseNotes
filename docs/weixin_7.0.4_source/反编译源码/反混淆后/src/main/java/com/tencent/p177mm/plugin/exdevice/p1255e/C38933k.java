package com.tencent.p177mm.plugin.exdevice.p1255e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.plugin.exdevice.e.k */
public final class C38933k extends C42986i {
    public C1332b jBi;
    public int jCt;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(19426);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.jBi == null) {
                c6092b = new C6092b("Not all required fields were included: Data");
                AppMethodBeat.m2505o(19426);
                throw c6092b;
            }
            if (this.lvj != null) {
                c6093a.mo13479iy(1, this.lvj.computeSize());
                this.lvj.writeFields(c6093a);
            }
            if (this.jBi != null) {
                c6093a.mo13473c(2, this.jBi);
            }
            c6093a.mo13480iz(3, this.jCt);
            AppMethodBeat.m2505o(19426);
            return 0;
        } else if (i == 1) {
            if (this.lvj != null) {
                ix = C6087a.m9557ix(1, this.lvj.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.jBi != null) {
                ix += C6091a.m9571b(2, this.jBi);
            }
            int bs = ix + C6091a.m9572bs(3, this.jCt);
            AppMethodBeat.m2505o(19426);
            return bs;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.jBi == null) {
                c6092b = new C6092b("Not all required fields were included: Data");
                AppMethodBeat.m2505o(19426);
                throw c6092b;
            }
            AppMethodBeat.m2505o(19426);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C38933k c38933k = (C38933k) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C38932d c38932d = new C38932d();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c38932d.populateBuilderWithField(c6086a3, c38932d, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c38933k.lvj = c38932d;
                    }
                    AppMethodBeat.m2505o(19426);
                    return 0;
                case 2:
                    c38933k.jBi = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(19426);
                    return 0;
                case 3:
                    c38933k.jCt = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(19426);
                    return 0;
                default:
                    AppMethodBeat.m2505o(19426);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(19426);
            return -1;
        }
    }
}
