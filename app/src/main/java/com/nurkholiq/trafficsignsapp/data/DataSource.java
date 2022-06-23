package com.nurkholiq.trafficsignsapp.data;

import com.nurkholiq.trafficsignsapp.R;
import com.nurkholiq.trafficsignsapp.model.Traffic;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static List<Traffic> yellowListTraffic() {
        ArrayList<Traffic> arr = new ArrayList<>();
        arr.add(new Traffic(R.drawable.__3, "Tikungan ke kiri", "Menandakan di depan akan ada tikungan atau belokan ke kiri arah jarum jam 10.30"));
        arr.add(new Traffic(R.drawable.group_12, "Tikungan ke kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_13, "Tikungan tajam ke kiri", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.300."));
        arr.add(new Traffic(R.drawable.group_14, "Tikungan tajam ke kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_15, "Banyak tikungan atau tikungan pertama ke kiri", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_16, "Banyak tikungan atau tikungan pertama ke kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_19, "Tanjakan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_20, "Lampu pengatur lalulintas", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        return arr;
    }

    public static List<Traffic> redListTraffic() {
        ArrayList<Traffic> arr = new ArrayList<>();
        arr.add(new Traffic(R.drawable.group_2, "Wajib Ke Kiri", "Menandakan di depan akan ada tikungan atau belokan ke kiri arah jarum jam 10.30"));
        arr.add(new Traffic(R.drawable.group_3, "Wajib Ke Kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_4, "Tikungan tajam ke kiri", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.300."));
        arr.add(new Traffic(R.drawable.group_5, "Tikungan tajam ke kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_6, "Wajib Mengikuti Arah Kiri", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_7, "Wajib Mengikuti Arah Kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_8, "Wajib Mengikuti Laluintas", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_9, "Wajib Mengikuti Bundaran", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        return arr;
    }

    public static List<Traffic> blueListTraffic() {
        ArrayList<Traffic> arr = new ArrayList<>();
        arr.add(new Traffic(R.drawable.group_10, "Wajib Ke Kiri", "Menandakan di depan akan ada tikungan atau belokan ke kiri arah jarum jam 10.30"));
        arr.add(new Traffic(R.drawable.group_22, "Wajib Ke Kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_21, "Tikungan tajam ke kiri", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.300."));
        arr.add(new Traffic(R.drawable.group_23, "Tikungan tajam ke kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_26, "Wajib Mengikuti Arah Kiri", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_24, "Wajib Mengikuti Arah Kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_25, "Wajib Mengikuti Laluintas", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_1, "Wajib Mengikuti Bundaran", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        return arr;
    }

    public static List<Traffic> greenListTraffic() {
        ArrayList<Traffic> arr = new ArrayList<>();
        arr.add(new Traffic(R.drawable.group_10, "Wajib Ke Kiri", "Menandakan di depan akan ada tikungan atau belokan ke kiri arah jarum jam 10.30"));
        arr.add(new Traffic(R.drawable.group_22, "Wajib Ke Kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_21, "Tikungan tajam ke kiri", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.300."));
        arr.add(new Traffic(R.drawable.group_23, "Tikungan tajam ke kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_26, "Wajib Mengikuti Arah Kiri", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_24, "Wajib Mengikuti Arah Kanan", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_25, "Wajib Mengikuti Laluintas", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        arr.add(new Traffic(R.drawable.group_1, "Wajib Mengikuti Bundaran", "Menandakan di depan akan ada tikungan atau belokan ke kanan arah jarum jam 13.30."));
        return arr;
    }
}
