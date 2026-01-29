public void display() {
    Vertex<T> iterator = head;
    
    // Tüm düğümleri dolaş
    while (iterator != null) {
        
        // Düğümün kimliğini yazdır
        System.out.print(iterator.id + " --> ");
        
        Edge iteratorEdge = iterator.edgeLink;
        
        // Eğer düğümün kenarı varsa (yani komşusu varsa)
        if (iteratorEdge != null) {
            
            // Tüm kenarları dolaş
            while (iteratorEdge != null) {
                
                // Kenarın hedef düğüm kimliğini yazdır
                System.out.print(iteratorEdge.vertexId + " --> ");
                iteratorEdge = iteratorEdge.nextEdge;
            }
            System.out.println(""); // Kenarlar bittikten sonra alt satıra geç
        } else {
            // Eğer hiç kenar yoksa (izole düğüm)
            System.out.println("");
        }
        iterator = iterator.nextVertex;
    }
}
/*Bu metot, verilen bir düğümden kaç tane kenar çıktığını (outgoing edge) bulur.

Ne Yapar? Bir düğümden komşu düğümlere giden kenar sayısını sayar.

Nasıl Çalışır?

Önce findVertex(id) metodu ile hedef düğümü bulur. Eğer düğüm yoksa hata verir.

Bulunan hedef düğüme geçer.

Bu düğümün kenar listesinin (current.edgeLink) başından başlayarak çıkan tüm kenarları tek tek dolaşır.

Dolaştığı her kenar için counter'ı artırır ve bu düğümün giden kenar sayısını (out-degree) döndürür. */