package com.example.sandi_uas;

import android.content.Context;

import com.program.tugaslist_sandi.model.Air;
import com.program.tugaslist_sandi.model.Darat;
import com.program.tugaslist_sandi.model.Hewan;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Darat> initDataDarat(Context ctx) {
        List<Darat> darats = new ArrayList<>();
        darats.add(new Darat(ctx.getString(R.string.beruang), "Nepal, Pakistan, and India Timur",
                ctx.getString(R.string.des_beruang), R.drawable.darat_beruang));
        darats.add(new Darat(ctx.getString(R.string.citah), "Afrika",
                ctx.getString(R.string.des_citah), R.drawable.darat_citah));
        darats.add(new Darat(ctx.getString(R.string.harimau), "Asia Tenggara, Asia Selatan",
                ctx.getString(R.string.des_harimau), R.drawable.darat_harimau));
        darats.add(new Darat(ctx.getString(R.string.macankumbang), "Indonesia",
                ctx.getString(R.string.des_macankumbang), R.drawable.darat_macanh));
        darats.add(new Darat(ctx.getString(R.string.singa), "Afrika, Eropa, Timur Tengah",
                ctx.getString(R.string.des_singa), R.drawable.darat_singa));
    return darats;

    }

    private static List<Air> initDataAir(Context ctx) {
        List<Air> Airs = new ArrayList<>();
        Airs.add(new Air(ctx.getString(R.string.buaya),"Asia dan Eropa",
                ctx.getString(R.string.des_buaya), R.drawable.air_buaya));
        Airs.add(new Air(ctx.getString(R.string.hiu), "Samudara Asia dan Eropa",
                ctx.getString(R.string.des_hiu), R.drawable.air_hiu));
        Airs.add(new Air(ctx.getString(R.string.pari), "Samudra Asia dan Eropa",
                ctx.getString(R.string.des_pari), R.drawable.air_pari));
        Airs.add(new Air(ctx.getString(R.string.paus), "Samudra Asia dan Eropa",
                ctx.getString(R.string.des_paus), R.drawable.air_paus));
        Airs.add(new Air(ctx.getString(R.string.ubur), "Samudra Asia dan Eropa",
                ctx.getString(R.string.des_ubur), R.drawable.air_ubur));

        return Airs;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataDarat(ctx));
        hewans.addAll(initDataAir(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
