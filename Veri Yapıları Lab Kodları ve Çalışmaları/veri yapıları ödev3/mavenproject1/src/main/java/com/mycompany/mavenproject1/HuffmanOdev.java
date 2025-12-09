/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author hasanmac
 */
import java.io.*;
import java.util.*;


public class HuffmanOdev {
    static class HuffmanNode implements Comparable<HuffmanNode> {
        int frequency;      // Karakterin sıklığı
        char character;     // Karakter
        HuffmanNode left;   // Sol dal
        HuffmanNode right;  // Sağ dal

        // Yaprak düğüm kurucusu (karakter ve frekans)
        public HuffmanNode(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
            this.left = null;
            this.right = null;
        }

        // İç düğüm kurucusu (sadece frekans toplamı)
        public HuffmanNode(int frequency, HuffmanNode left, HuffmanNode right) {
            this.character = '-'; // İç düğümlerde karakterin önemi yok
            this.frequency = frequency;
            this.left = left;
            this.right = right;
        }

        // Comparable: Küçükten büyüğe sıralama (Generic yapı için gerekli)
        @Override
        public int compareTo(HuffmanNode other) {
            return this.frequency - other.frequency;
        }
        
        @Override
        public String toString() {
            return "['" + character + "': " + frequency + "]";
        }
    }
    // --- İÇ SINIF BİTİŞİ ---


    // Karakter kodlarını tutacak global harita
    static Map<Character, String> huffmanCodes = new HashMap<>();

    public static void main(String[] args) {
        try {
            // 1. letter.txt dosyasından frekansları bul
            Map<Character, Integer> frequencyMap = getFrequencies("letter.txt");
            System.out.println("Frekanslar bulundu: " + frequencyMap);

            // 2. Sıralı Bağlı Liste (Generic Metot Kullanımı ile)
            LinkedList<HuffmanNode> nodeList = new LinkedList<>();
            
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                // Generic 'addSorted' metodunu kullanıyoruz
                addSorted(nodeList, new HuffmanNode(entry.getKey(), entry.getValue()));
            }
            
            System.out.println("Sıralı Liste: " + nodeList);

            // 3. Huffman ağacını oluştur
            HuffmanNode root = buildHuffmanTree(nodeList);

            // 4. Kodları bul
            generateCodes(root, "");
            
            System.out.println("\n--- HUFFMAN KODLARI ---");
            for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
                System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
            }

            // 5. Metni kodla (Encode) -> encoded.txt
            String sourceText = readFile("source.txt");
            String encodedText = encodeText(sourceText);
            writeFile("encoded.txt", encodedText);
            System.out.println("\nKodlandı ve encoded.txt'ye yazıldı: " + encodedText);

            // 6. Metni çöz (Decode) -> decoded.txt
            String readEncoded = readFile("encoded.txt");
            String decodedText = decodeText(readEncoded, root);
            writeFile("decoded.txt", decodedText);
            System.out.println("Çözüldü ve decoded.txt'ye yazıldı: " + decodedText);

        } catch (IOException e) {
            System.err.println("Dosya hatası: " + e.getMessage());
        }
    }

    // --- YARDIMCI METOTLAR ---

    /**
     * GENERIC SIRALI EKLEME METODU (<T extends Comparable<T>>)
     * Listenin sıralı yapısını bozmadan eleman ekler.
     */
    public static <T extends Comparable<T>> void addSorted(LinkedList<T> list, T item) {
        if (list.isEmpty()) {
            list.add(item);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (item.compareTo(list.get(i)) < 0) {
                list.add(i, item);
                return;
            }
        }
        list.addLast(item);
    }

    // Frekans okuma
    private static Map<Character, Integer> getFrequencies(String filename) throws IOException {
        Map<Character, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int c;
            while ((c = br.read()) != -1) {
                char character = (char) c;
                if (character == '\r' || character == '\n') continue;
                map.put(character, map.getOrDefault(character, 0) + 1);
            }
        }
        return map;
    }

    // Ağaç oluşturma
    private static HuffmanNode buildHuffmanTree(LinkedList<HuffmanNode> list) {
        while (list.size() > 1) {
            HuffmanNode left = list.pollFirst();
            HuffmanNode right = list.pollFirst();
            HuffmanNode parent = new HuffmanNode(left.frequency + right.frequency, left, right);
            addSorted(list, parent);
        }
        return list.get(0);
    }

    // Kod üretme (Recursive)
    private static void generateCodes(HuffmanNode node, String code) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.character, code);
            return;
        }
        generateCodes(node.left, code + "0");
        generateCodes(node.right, code + "1");
    }

    // Encode
    private static String encodeText(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == '\r' || c == '\n') continue;
            String code = huffmanCodes.get(c);
            if (code != null) sb.append(code);
        }
        return sb.toString();
    }

    // Decode
    private static String decodeText(String encoded, HuffmanNode root) {
        StringBuilder sb = new StringBuilder();
        HuffmanNode current = root;
        for (char bit : encoded.toCharArray()) {
            if (bit == '0') current = current.left;
            else current = current.right;

            if (current.left == null && current.right == null) {
                sb.append(current.character);
                current = root;
            }
        }
        return sb.toString();
    }

    // Dosya Okuma
    private static String readFile(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }

    // Dosya Yazma
    private static void writeFile(String filename, String content) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(content);
        }
    }
}
