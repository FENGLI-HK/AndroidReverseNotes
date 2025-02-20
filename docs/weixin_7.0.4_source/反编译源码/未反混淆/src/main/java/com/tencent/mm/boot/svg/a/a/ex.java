package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ex extends c {
    private final int height = 96;
    private final int width = 96;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(k, looper);
                a.setColor(-1);
                g = c.a(g, 1.0f, 0.0f, -1592.0f, 0.0f, 1.0f, -216.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 1592.0f, 0.0f, 1.0f, 216.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path l = c.l(looper);
                l.moveTo(43.0f, 71.37524f);
                l.cubicTo(40.38898f, 70.74798f, 37.94752f, 69.685074f, 35.756817f, 68.267685f);
                l.lineTo(33.071095f, 70.953415f);
                l.cubicTo(32.744633f, 71.280716f, 32.349525f, 71.44395f, 31.887455f, 71.44395f);
                l.cubicTo(31.425385f, 71.44395f, 31.03028f, 71.280716f, 30.703815f, 70.953415f);
                l.lineTo(25.968422f, 66.21802f);
                l.cubicTo(25.64112f, 65.891556f, 25.47789f, 65.49645f, 25.47789f, 65.03438f);
                l.cubicTo(25.47789f, 64.5723f, 25.64112f, 64.1772f, 25.968422f, 63.85074f);
                l.lineTo(28.676521f, 61.14264f);
                l.cubicTo(27.294926f, 58.977337f, 26.258167f, 56.570663f, 25.643635f, 54.0f);
                l.lineTo(21.67647f, 54.0f);
                l.cubicTo(21.213764f, 54.0f, 20.818117f, 53.8375f, 20.491205f, 53.511665f);
                l.cubicTo(20.163456f, 53.18667f, 20.0f, 52.793335f, 20.0f, 52.333332f);
                l.lineTo(20.0f, 45.666668f);
                l.cubicTo(20.0f, 45.206665f, 20.163456f, 44.81333f, 20.491205f, 44.488335f);
                l.cubicTo(20.818117f, 44.1625f, 21.213764f, 44.0f, 21.67647f, 44.0f);
                l.lineTo(25.432756f, 44.0f);
                l.cubicTo(25.968296f, 41.245472f, 26.984692f, 38.662666f, 28.391035f, 36.342514f);
                l.lineTo(25.513884f, 33.465363f);
                l.cubicTo(25.186583f, 33.137226f, 25.022514f, 32.742958f, 25.022514f, 32.279213f);
                l.cubicTo(25.022514f, 31.816303f, 25.186583f, 31.421198f, 25.513884f, 31.093899f);
                l.lineTo(30.256813f, 26.35097f);
                l.cubicTo(30.584112f, 26.02367f, 30.979218f, 25.8596f, 31.442125f, 25.8596f);
                l.cubicTo(31.905033f, 25.8596f, 32.30014f, 26.02367f, 32.628277f, 26.35097f);
                l.lineTo(35.322765f, 29.045517f);
                l.cubicTo(37.62329f, 27.483685f, 40.215202f, 26.318954f, 43.0f, 25.649855f);
                l.lineTo(43.0f, 21.67647f);
                l.cubicTo(43.0f, 21.213764f, 43.1625f, 20.818117f, 43.488335f, 20.491205f);
                l.cubicTo(43.81333f, 20.164293f, 44.206665f, 20.0f, 44.666668f, 20.0f);
                l.lineTo(51.333332f, 20.0f);
                l.cubicTo(51.793335f, 20.0f, 52.18667f, 20.164293f, 52.511665f, 20.491205f);
                l.cubicTo(52.8375f, 20.818117f, 53.0f, 21.213764f, 53.0f, 21.67647f);
                l.lineTo(53.0f, 25.427748f);
                l.cubicTo(55.947445f, 25.99736f, 58.698654f, 27.117449f, 61.14241f, 28.676748f);
                l.lineTo(63.85074f, 25.968422f);
                l.cubicTo(64.1772f, 25.64112f, 64.5723f, 25.47789f, 65.03438f, 25.47789f);
                l.cubicTo(65.49645f, 25.47789f, 65.891556f, 25.64112f, 66.21802f, 25.968422f);
                l.lineTo(70.953415f, 30.703815f);
                l.cubicTo(71.280716f, 31.031116f, 71.44395f, 31.425385f, 71.44395f, 31.887455f);
                l.cubicTo(71.44395f, 32.350365f, 71.280716f, 32.744633f, 70.953415f, 33.071095f);
                l.lineTo(68.26744f, 35.757065f);
                l.cubicTo(69.86432f, 38.225166f, 71.011284f, 41.011517f, 71.59228f, 44.0f);
                l.lineTo(75.32353f, 44.0f);
                l.cubicTo(75.78623f, 44.0f, 76.181885f, 44.1625f, 76.5088f, 44.488335f);
                l.cubicTo(76.83655f, 44.81333f, 77.0f, 45.206665f, 77.0f, 45.666668f);
                l.lineTo(77.0f, 52.333332f);
                l.cubicTo(77.0f, 52.793335f, 76.83655f, 53.18667f, 76.5088f, 53.511665f);
                l.cubicTo(76.181885f, 53.8375f, 75.78623f, 54.0f, 75.32353f, 54.0f);
                l.lineTo(71.38141f, 54.0f);
                l.cubicTo(70.71336f, 56.79468f, 69.546326f, 59.395546f, 67.9797f, 61.70317f);
                l.lineTo(70.57086f, 64.294395f);
                l.cubicTo(70.89816f, 64.62086f, 71.06223f, 65.0168f, 71.06223f, 65.479706f);
                l.cubicTo(71.06223f, 65.94262f, 70.89816f, 66.338554f, 70.57086f, 66.66502f);
                l.lineTo(65.827934f, 71.40795f);
                l.cubicTo(65.50063f, 71.736084f, 65.10553f, 71.89932f, 64.642624f, 71.89932f);
                l.cubicTo(64.17971f, 71.89932f, 63.78461f, 71.736084f, 63.45647f, 71.40795f);
                l.lineTo(60.682983f, 68.63446f);
                l.cubicTo(58.355732f, 70.045006f, 55.764164f, 71.0632f, 53.0f, 71.59731f);
                l.lineTo(53.0f, 75.32353f);
                l.cubicTo(53.0f, 75.78707f, 52.8375f, 76.181885f, 52.511665f, 76.5088f);
                l.cubicTo(52.18667f, 76.83655f, 51.793335f, 77.0f, 51.333332f, 77.0f);
                l.lineTo(44.666668f, 77.0f);
                l.cubicTo(44.206665f, 77.0f, 43.81333f, 76.83655f, 43.488335f, 76.5088f);
                l.cubicTo(43.1625f, 76.181885f, 43.0f, 75.78707f, 43.0f, 75.32353f);
                l.lineTo(43.0f, 71.37524f);
                l.close();
                l.moveTo(48.41505f, 30.0f);
                l.cubicTo(58.58648f, 30.0f, 66.83177f, 38.244457f, 66.83177f, 48.415886f);
                l.cubicTo(66.83177f, 58.58648f, 58.58648f, 66.83177f, 48.41505f, 66.83177f);
                l.cubicTo(38.245296f, 66.83177f, 30.0f, 58.58648f, 30.0f, 48.415886f);
                l.cubicTo(30.0f, 38.244457f, 38.245296f, 30.0f, 48.41505f, 30.0f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
