package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ca extends BaseFilter {
    public ca() {
        super(GLSLRender.bJB);
    }

    public final void ApplyGLSLFilter(boolean z, float f, float f2) {
        AppMethodBeat.i(86534);
        BaseFilter baseFilter = new BaseFilter(GLSLRender.bKD);
        baseFilter.addParam(new o("inputImageTexture2", "sh/quanminyingdi_curve.png", 33986));
        setNextFilter(baseFilter, null);
        BaseFilter baseFilter2 = new BaseFilter(GLSLRender.bLF);
        baseFilter2.addParam(new f("inputH", 1.0f));
        baseFilter2.addParam(new f("inputS", 0.9f));
        baseFilter2.addParam(new f("inputV", 1.0f));
        baseFilter.setNextFilter(baseFilter2, null);
        baseFilter = new BaseFilter(GLSLRender.bKG);
        float[] fArr = new float[]{0.0f, 0.0f, 0.0f};
        float[] fArr2 = new float[]{0.0f, 0.0f, 0.0f};
        baseFilter.addParam(new g("shadowsShift", new float[]{-0.019607844f, 0.039215688f, 0.023529412f}));
        baseFilter.addParam(new g("midtonesShift", fArr));
        baseFilter.addParam(new g("highlightsShift", fArr2));
        baseFilter.addParam(new i("preserveLuminosity", 1));
        baseFilter2.setNextFilter(baseFilter, null);
        super.ApplyGLSLFilter(z, f, f2);
        AppMethodBeat.o(86534);
    }
}
