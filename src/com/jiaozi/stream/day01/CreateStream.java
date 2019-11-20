package com.jiaozi.stream.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @Description: 创建stream的方法
 * @Author: xiam
 * @Create: 2019-11-20
 **/
public class CreateStream {

    public static void main(String[] args) {
//        createStreamByCollection().forEach(System.out::println);
//        createStreamByStreamOf().forEach(System.out::println);
//        createStreamByArrays().forEach(System.out::println);
//        Stream<String> stringStream = createStreamByFiles();
//        System.out.println(stringStream);
//        stringStream.forEach(System.out::println);
//        createStreamByIterator().forEach(System.out::println);
//        createStreamByGenerate().forEach(System.out::println);
        createStreanByGenerateObj().forEach(System.out::println);
    }



    private static Stream<String> createStreamByCollection(){
        List<String>  charList = Arrays.asList("I","AM","YOUR","FATHER");
        return charList.stream();
    }

    private static Stream<String> createStreamByStreamOf(){
        return Stream.of("I","AM","YOUR","FATHER");
    }

    private static Stream<String> createStreamByArrays(){
        String[] str = {"I","AM","YOUR","FATHER"};
        return Arrays.stream(str);
    }

    private static Stream<String> createStreamByFiles(){
        Path path = Paths.get("E:\\javaStudy\\java8\\src\\com\\jiaozi\\stream\\day01\\Dish.java");
        try (Stream<String> lines= Files.lines(path)){
             lines.forEach(System.out::println);
             return lines;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Stream<Integer> createStreamByIterator(){
        return Stream.iterate(0,i->i+2).limit(100);
    }

    private static Stream<Double> createStreamByGenerate(){
        return Stream.generate(Math::random).limit(10);
    }

    private static Stream<Obj> createStreanByGenerateObj(){
        return Stream.generate(new ObjSupply()).limit(10);
    }

    static class ObjSupply implements Supplier<Obj>{
        private int index;

        private Random random = new Random(System.currentTimeMillis());

        @Override
        public Obj get() {
            index = random.nextInt(100);
            return new Obj(index,"xiam"+index);
        }
    }

    static class  Obj{
        private int index;

        private String name;

        public Obj(int index, String name) {
            this.index = index;
            this.name = name;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Obj{" +
                    "index=" + index +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
