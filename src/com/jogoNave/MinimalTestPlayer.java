package com.jogoNave;
import com.sun.jna.NativeLibrary;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JOptionPane;

import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
import uk.co.caprica.vlcj.runtime.windows.WindowsRuntimeUtil;

public class MinimalTestPlayer {

    public MinimalTestPlayer() {
        registerLibrary();
    }

    /**
     *  Executa arquivo de audio/video
     */
    public void play(final String filename) {
        final Canvas videoSurface = new Canvas();
        final Frame frame = buildFrame(videoSurface);
        final List<String> vlcArgs = new ArrayList<String>();

       // configureParameters(vlcArgs); >>> TESTEI SEM ESTA PARTE E FUNCIONOU

        final EmbeddedMediaPlayer mediaPlayer =
        createPlayer(vlcArgs, videoSurface);
        mediaPlayer.playMedia(filename);
    }

    /**
     *  Importante: Informa onde está a libvlc,
     que contem as funções nativas de manipulacao do player
     *
     *  Windows: libvlc.dll
     *  Linux: libvlc.so
     */
    private void registerLibrary() {
        NativeLibrary.addSearchPath("libvlc", "C:\\Arquivos de programas\\VideoLAN\\VLC\\");

        // Windows 64 bits:
        // NativeLibrary.addSearchPath("libvlc", "c:\\Program Files (x86)\\VideoLAN\\VLC\\");
    }

    /**
     * Cria frame onde será exibido o filme
     */
    private Frame buildFrame(final Canvas videoSurface) {
        final Frame f = new Frame("LavosierPlayer");
        f.setSize(800, 600);
        f.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLocationRelativeTo(null);
        f.setLayout(new BorderLayout());
        f.add(videoSurface, BorderLayout.CENTER);
        f.setVisible(false);
        return f;
    }

    /**
     * Configura parametros do VLC
     */
   /* private void configureParameters(final
    List<String> vlcArgs) {
        vlcArgs.add("--no-plugins-cache");
        vlcArgs.add("--no-video-title-show");
        vlcArgs.add("--no-snapshot-preview");

        // Importante, se esse parametro nao for configurado no Windows, a aplicacao nao funcionara
        /*EU LAVOSIER --->> COMENTEI DESTE PONTO PARA VÊ SE FUNCIONAVA SEM... E DEU CERTO.. ANTES AVISAVA QUE NÃO
         * EXISTIA MAIS ESTA OPÇÃO, DEPOIS DE COMENTADA PAROU*/
        
      /*  if (RuntimeUtil.isWindows()) {
            vlcArgs.add("--plugin-path="+ WindowsRuntimeUtil.getVlcInstallDir() + "\\plugins");
        }*/
    //}

    /**
     * Constroi o player
     */
    private EmbeddedMediaPlayer createPlayer(final List<String> vlcArgs, final Canvas videoSurface) {
        final MediaPlayerFactory factory =
        new MediaPlayerFactory(vlcArgs.toArray(new String[vlcArgs.size()]));
        EmbeddedMediaPlayer mediaPlayer = factory.newEmbeddedMediaPlayer();
        //mediaPlayer.setVideoSurface(videoSurface); ESTAVA DANDO ERRO
        
        //System.out.println (mediaPlayer.getClass().getName());
        return mediaPlayer;
    }

    public static void main(String[] args) throws InterruptedException {
        MinimalTestPlayer player = new MinimalTestPlayer();
        // Pode ser MP4, AVI, MOV, MKV, WMA, MPG, MP3, WAV, etc.
        //player.play("C:\\videos\\qualquer_video.mp4");
        player.play("D:\\Idiomas\\TocarSom.mp3");

        // Aguarda janela do player ser fechada
        Thread.currentThread().join();
    }
}
