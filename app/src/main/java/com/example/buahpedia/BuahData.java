package com.example.buahpedia;

import java.util.ArrayList;

public class BuahData {

    public static String[][] data = new String[][]{
            {
                    "Apel",
                    "Malus Domestica",
                    "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan, namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya",
                    "https://3.bp.blogspot.com/-OvJgGYpVmWw/UliUHQb5rdI/AAAAAAAABQU/4cif0RY99x0/s1600/HUANIU_APPLE01.jpg",
                    "Memelihara kesehatan usus, Baik untuk jantung, Menurunkan risiko diabetes, Mencegah kanker, Menjaga kesehatan otak,Menurunkan berat badan, Mengatasi bau mulut",
                    "https://www.alodokter.com/jarang-bertemu-dokter-berkat-manfaat-apel"
            },
            {
                    "Blueberry",
                    "Cyanococcus",
                    "Blueberry adalah tanaman berbunga dalam genus Vaccinium, bagian Cyanococcus. Spesies ini tumbuh di Amerika Utara. Berupa semak yang ukurannya mulai 10 cm hingga 4 m, spesies terkecil dikenal sebagai bluberry semak rendah, dan spesies terbesar adalah blueberry semak tinggi.",
                    "https://upload.wikimedia.org/wikipedia/id/thumb/8/88/PattsBlueberries.jpg/250px-PattsBlueberries.jpg",
                    "Meningkatkan daya tahan tubuh, Stimulasi otak, Baik untuk kulit kering, Membantu menajamkan penglihatan, dll.",
                    "https://lifestyle.kompas.com/read/2013/09/03/2236014/Melirik.11.Manfaat.dari.Buah.Blueberry"
            },
            {
                    "Ceri Manis",
                    "Prunus Avium",
                    "Ceri manis adalah sejenis tumbuhan pohon ceri yang tergabung dalam keluarga Rosaceae. Pohon ini berasal dari wilayah Eropa, Anatolia, Arab Maghrib, dan Asia Barat.",
                    "https://img2.pngdownload.id/20180626/jjx/kisspng-sour-cherry-sweetness-food-sweet-cherry-orchard-5b3301528a43f3.0022795115300693305664.jpg",
                    "Membantu tidur lebih cepat,Sumber nutrisi baik, Meredakan nyeri sendi, Meringankan nyeri otot usai olahraga, Menurunkan tekanan darah.",
                    "https://hellosehat.com/hidup-sehat/nutrisi/beragam-manfaat-buah-ceri/"
            },
            {
                    "Delima",
                    "Punica Granatum",
                    "Delima adalah tanaman buah-buahan yang dapat tumbuh hingga 5–8m. Tanaman ini diperkirakan berasal dari Iran, namun telah lama dikembangbiakkan di daerah Mediterania. Bangsa Moor memberi nama salah satu kota kuno di Spanyol, Granada berdasarkan nama buah ini.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Pomegranate_fruit.jpg/220px-Pomegranate_fruit.jpg",
                    "Mencegah penyakit jantung, Mencegah kanker, Mengurangi kolesterol jahat, Mengurangi risiko penyakit radang sendi",
                    "https://www.alodokter.com/4-manfaat-buah-delima-yang-perlu-kamu-tahu"
            },
            {
                    "Elderberry",
                    "Sambucus",
                    "Elderberry adalah sebuah genus tumbuhan berbunga dalam keluarga Adoxaceae. Genus tersebut awalnya ditempatkan dalam keluarga honeysuckle, Caprifoliaceae, tetapi diklasifikasikan ulang karena evidensi genetik.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Sambucus-berries.jpg/220px-Sambucus-berries.jpg",
                    "Mengurangi gelaja pilek dan flu, Menjaga kesehatan jantung, Membantu melancarkan sistem pencernaan, Meningkatkan kesehatan tulang, Meningkatkan kesehatan kulit dan rambut.",
                    "https://www.idntimes.com/health/fitness/dita-3/5-khasiat-buah-elderberry-bagi-kesehatan-si-mungil-kaya-manfaat-c1c2"
            },
    };

    public static ArrayList<Buah> getListData(){
        Buah buah = null;
        ArrayList<Buah> list = new ArrayList<>();
        for (int i = 0; i<data.length; i++){
            buah = new Buah();
            buah.setNama(data[i][0]);
            buah.setLatin(data[i][1]);
            buah.setDeskripsi(data[i][2]);
            buah.setGambar(data[i][3]);
            buah.setManfaat(data[i][4]);
            buah.setSumber(data[i][5]);

            list.add(buah);
        }

        return list;
    }

}
