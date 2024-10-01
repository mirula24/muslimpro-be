package com.amirul.muslimpro.seeder;

import com.amirul.muslimpro.dto.request.CaptionRequest;
import com.amirul.muslimpro.service.CaptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CaptionSeeder implements CommandLineRunner {

    @Autowired
    private CaptionService captionService;

    private static final int MAX_LENGTH = 255;

    private String truncate(String input) {
        if (input == null) {
            return null;
        }
        return input.length() > MAX_LENGTH ? input.substring(0, MAX_LENGTH) : input;
    }

    @Override
    public void run(String... args) {
        List<CaptionRequest> captions = Arrays.asList(
                new CaptionRequest("user1@example.com", truncate("القدار"), truncate("Allah plan is better than your dreams"), truncate("اَيُّهَا الَّذِيْنَ اٰمَنُوا اجْتَنِبُوْا كَثِيْرًا مِّنَ الظَّنِّۖ اِنَّ بَعْضَ الظَّنِّ اِثْمٌ وَّلَا تَجَسَّسُوْا وَلَا يَغْتَبْ بَّعْضُكُمْ بَعْضًاۗ اَيُحِبُّ اَحَدُكُمْ اَنْ يَّأْكُلَ لَحْمَ اَخِيْهِ مَيْتًا فَكَرِهْتُمُوْهُۗ وَاتَّقُوا اللّٰهَ ۗاِنَّ اللّٰهَ تَوَّابٌ رَّحِيْمٌ"), truncate("Wahai orang-orang yang beriman! Jauhilah banyak dari prasangka, sesungguhnya sebagian prasangka itu dosa dan janganlah kamu mencari-cari kesalahan orang lain dan janganlah ada di antara kamu yang menggunjing sebagian yang lain. Apakah ada di antara kamu yang suka memakan daging saudaranya yang sudah mati? Tentu kamu merasa jijik. Dan bertakwalah kepada Allah, sesungguhnya Allah Maha Penerima tobat, Maha Penyayang.")),
                new CaptionRequest("user2@example.com", truncate(""), truncate("Dua hal yang harus kita ingat :"), truncate("Kebaikan orang lain terhadap kita dan Keburukan kita terhadap orang lain"), truncate("by : Ustadz Handy Bonny")),
                new CaptionRequest("user3@example.com", truncate(""), truncate("Dua hal yang harus kita Lupakan :"), truncate("Kebaikan kita terhadap Orang lain dan Keburukan Orang lain terhadap kita"), truncate("by : Ustadz Handy Bonny")),
                new CaptionRequest("user4@example.com", truncate("وَفِي السَّمَاءِ رِزْقُكُمْ وَمَا تُوعَدُونَ"), truncate("And in the heaven is your provision and whatever you are promised"), truncate("وَفِي السَّمَاءِ رِزْقُكُمْ وَمَا تُوعَدُونَ"), truncate("Dan di langit terdapat rezekimu dan apa yang dijanjikan kepadamu.")),
                new CaptionRequest("user5@example.com", truncate("اِنَّ اللّٰهَ مَعَ الصَّابِرِيْنَ"), truncate("Indeed, Allah is with the patient"), truncate("يَا أَيُّهَا الَّذِينَ آمَنُوا اسْتَعِينُوا بِالصَّبْرِ وَالصَّلَاةِ ۚ إِنَّ اللَّهَ مَعَ الصَّابِرِينَ"), truncate("Wahai orang-orang yang beriman! Mohonlah pertolongan (kepada Allah) dengan sabar dan salat. Sesungguhnya Allah beserta orang-orang yang sabar.")),
                new CaptionRequest("user6@example.com", truncate("وَمَا تَوْفِيقِي إِلَّا بِاللَّهِ"), truncate("My success is only by Allah"), truncate("وَمَا تَوْفِيقِي إِلَّا بِاللَّهِ ۚ عَلَيْهِ تَوَكَّلْتُ وَإِلَيْهِ أُنِيبُ"), truncate("Dan tidak ada taufik bagiku melainkan dengan (pertolongan) Allah. Hanya kepada-Nya aku bertawakkal dan hanya kepada-Nya aku kembali.")),
                new CaptionRequest("user7@example.com", truncate("وَاصْبِرْ وَمَا صَبْرُكَ إِلَّا بِاللَّهِ"), truncate("Be patient, and your patience is only through Allah"), truncate("وَاصْبِرْ وَمَا صَبْرُكَ إِلَّا بِاللَّهِ ۚ وَلَا تَحْزَنْ عَلَيْهِمْ وَلَا تَكُ فِي ضَيْقٍ مِمَّا يَمْكُرُونَ"), truncate("Bersabarlah, dan kesabaranmu itu hanya dengan pertolongan Allah, dan janganlah engkau bersedih hati terhadap (kekafiran) mereka dan jangan (pula) merasa sempit terhadap apa yang mereka tipu dayakan."))
        );

        for (CaptionRequest caption : captions) {
            try {
                captionService.createCaption(caption);
                System.out.println("Caption created successfully: " + caption.getBaris1());
            } catch (Exception e) {
                System.err.println("Error creating caption: " + e.getMessage());
            }
        }

        System.out.println("Caption seeding completed.");
    }
}