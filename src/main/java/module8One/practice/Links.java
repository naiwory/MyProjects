package module8One.practice;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Links {

    private static Runnable buildTask ( String loadFrom , String saveTo ) {

        return ( ) -> {

            try {
                long lStartTime = System.nanoTime();

                URL website = new URL ( loadFrom );
                ReadableByteChannel rbc = Channels.newChannel ( website.openStream ( ) );
                FileOutputStream fos = new FileOutputStream ( saveTo );
                fos.getChannel ( ).transferFrom ( rbc , 0 , Long.MAX_VALUE );

                long lEndTime = System.nanoTime();
                long output = lEndTime - lStartTime;
                System.out.println ( "Файл " + loadFrom + " загружен [" + output / 1000000 + "]" );

            } catch ( Exception e ) {

                e.printStackTrace ( );

                System.out.println ( "Загрузка завершилась с ошибкой " + saveTo );

            }

        };

    }



    public static void main ( String[] args ) throws Exception {

        Scanner scanner = new Scanner ( new FileReader ( "files/practice8One/links.txt" ) );

        String result = "";

        for ( int i = 0 ; i < 9 ; i++ ) {

            result += scanner.nextLine ( ) + "\n";

        }

        scanner.close ( );

        String[] links = result.split ( "\n" );

        for ( String s : links )
            System.out.println ( s );

        ExecutorService pool = Executors.newFixedThreadPool ( 2 );
        pool.submit ( buildTask ( links[ 0 ] , "files/cache/crowd-cheering.mp3" ) );
        pool.submit ( buildTask ( links[ 1 ] , "files/cache/lotus_flowers-wide.jpg" ) );
        pool.submit(buildTask(links[2], "files/cache/wave.mp3"));
        pool.submit(buildTask(links[3], "files/cache/trolltunga.jpg"));
        pool.submit(buildTask(links[4], "files/cache/big_buck_bunny_480p_2mb.flv"));
        pool.submit(buildTask(links[5], "files/cache/shutterstock-316382687.jpg"));
        pool.submit(buildTask(links[6], "files/cache/big_buck_bunny_720p_1mb.flv"));
        pool.submit(buildTask(links[7], "files/cache/big_buck_bunny_720p_5mb.flv"));
        pool.submit(buildTask(links[8], "files/cache/big_buck_bunny_720p_2mb.flv"));

        pool.shutdown ();

    }
}
