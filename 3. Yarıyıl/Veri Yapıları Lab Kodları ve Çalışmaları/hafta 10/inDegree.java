public int inDegree(T id) {
    int counter = 0;
    Vertex iterator = head;
    
    // Tüm düğümleri dolaş
    while (iterator != null) {
        Edge iteratorEdge = iterator.edgeLink;
        
        // Mevcut düğümden çıkan tüm kenarları (Edge'leri) dolaş
        while (iteratorEdge != null) {
            
            // Eğer kenarın hedef düğüm kimliği, aradığımız kimliğe eşitse
            if (iteratorEdge.vertexId.compareTo(id) == 0) {
                counter++; // Gelen derece sayacını artır
            }
            iteratorEdge = iteratorEdge.nextEdge;
        }
        iterator = iterator.nextVertex;
    }
    return counter;
}
/*Bu metot, verilen bir düğüm kimliğine (id) kaç tane gelen kenar (incoming edge) olduğunu bulur.

Ne Yapar? Bir düğüme kaç farklı düğümden ulaşıldığını sayar.

Nasıl Çalışır?

Grafın başından (head) başlayarak tüm düğümleri (Vertex iterator) tek tek dolaşır.

Her düğüm için, o düğümden çıkan tüm kenarları (Edge iteratorEdge) kontrol eder.

Bir kenarın hedefi, aradığımız id'ye eşitse (yani bu kenar, hedef düğüme doğru gidiyorsa), counter'ı artırır.

Grafın tamamını tarayarak gelen tüm kenarları sayar ve sonucu döndürür. */