package com.tencent.p177mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.aif;
import com.tencent.p177mm.protocal.protobuf.aig;
import com.tencent.p177mm.protocal.protobuf.bnd;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.card.model.ae */
public final class C38741ae extends C1207m implements C1918k {
    private final C7472b ehh;
    private C1202f ehi;
    public bnd kem;

    public C38741ae(LinkedList<String> linkedList, int i) {
        AppMethodBeat.m2504i(87907);
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new aif();
        c1196a.fsK = new aig();
        c1196a.uri = "/cgi-bin/micromsg-bin/getdynamiccardcode";
        this.ehh = c1196a.acD();
        aif aif = (aif) this.ehh.fsG.fsP;
        aif.wor = linkedList;
        aif.scene = i;
        AppMethodBeat.m2505o(87907);
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(87908);
        C4990ab.m7417i("MicroMsg.NetSceneGetDynamicCardCode", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            this.kem = ((aig) this.ehh.fsH.fsP).wos;
        }
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(87908);
    }

    public final int getType() {
        return 1382;
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(87909);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(87909);
        return a;
    }
}
