// Lab Kodları
public int outDegree(T id) {
    int counter = 0;
    
    // Kimliğe sahip düğümü bul
    Vertex current = findVertex(id);
    
    // Eğer düğüm bulunamazsa
    if (current == null) {
        System.out.println("Bu id'ye sahip bir vertex bulunamadı");
        return counter; // 0 döner
    }
    
    Edge iterator = current.edgeLink;
    
    // Düğümden çıkan tüm kenarları (Edge'leri) dolaş
    while (iterator != null) {
        counter++; // Giden derece sayacını artır
        iterator = iterator.nextEdge;
    }
    return counter;
}

// ----------------------------------------------------

public int countVertex() {
    int counter = 0;
    Vertex iterator = head;
    
    // Tüm düğümleri dolaş
    while (iterator != null) {
        counter++;
        iterator = iterator.nextVertex;
    }
    return counter;
}
/*Bu metot, grafın yapısını komşuluk listesi formatında görüntüler.

Ne Yapar? Hangi düğümün hangi düğümlere bağlı olduğunu gösterir.

Nasıl Çalışır?

Grafın başından (head) başlayarak tüm ana düğümleri dolaşır.

Her ana düğüm için:

Düğümün kimliğini yazdırır (örneğin, A -->).

O düğümden çıkan tüm kenarları (komşularını) listeler (örneğin, B --> C -->).

Böylece çıktı, "Düğüm ve onun komşuları" şeklinde bir liste oluşturur. */