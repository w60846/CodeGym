package pl.codegym.task.task19.task1917;

/* 
Twój własny FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileConsoleWriter  {

    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        fileWriter = new FileWriter(fd);
    }

    public FileConsoleWriter(String fileName, Charset charset) throws IOException {
        fileWriter = new FileWriter(fileName, charset);
    }

    public FileConsoleWriter(String fileName, Charset charset, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, charset, append);
    }

    public FileConsoleWriter(File file, Charset charset) throws IOException {
        fileWriter = new FileWriter(file, charset);
    }

    public FileConsoleWriter(File file, Charset charset, boolean append) throws IOException {
        fileWriter = new FileWriter(file, charset, append);
    }


    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.println(c);
    }


    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
        System.out.println(new String(cbuf).substring(off, off + len));
    }


    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.println(str.substring(off, off + len));
    }


    public void close() throws IOException {
        fileWriter.close();
    }


    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.println(new String(cbuf));
    }


    public void write(String str) throws IOException {
        fileWriter.write(str);
    }

    public static void main(String[] args) {

    }

}
