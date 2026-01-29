
public class Graph<T extends Comparable> {

    private Vertex head;
/*➤ Nasıl çalışır:
Eğer head == null ise → eklenen ilk vertex olur.
Değilse → linked list’in sonuna kadar gider ve yeni vertex’i sona ekler. */
    public void addVertex(T id) {
        Vertex<T> newVertex = new Vertex(id);
        if (head == null) {
            head = newVertex;
        } else {
            Vertex<T> iterator = head;
            while (iterator.nextVertex != null) {
                iterator = iterator.nextVertex;
            }
            iterator.nextVertex = newVertex;
        }
    }
/*2) findVertex(T id)
➤ Amaç:
Verilen id’ye sahip Vertex’i bulmak.
➤ Nasıl çalışır:
Head’den başlar → linked list boyunca ilerler.
 */
    public Vertex<T> findVertex(T id) {
        Vertex<T> iterator = head;
        while (iterator != null) {
            if (iterator.id.compareTo(id) == 0) {
                return iterator;
            }
            iterator = iterator.nextVertex;
        }
        return null;
    }
/*Amaç:
startId → endId arasında yönlü bir kenar eklemek.
➤ Çalışma Mantığı:
startId vertexini bulur
endId vertexinin var olup olmadığını kontrol eder
Edge listesi boşsa ilk kenar olarak ekler
Boş değilse → edge listesinin sonuna ekler */
    public void addEdge(T startId, T endId) {
        Vertex<T> startVertex = findVertex(startId);
        if (startVertex != null && findVertex(endId) != null) {
            Edge<T> newEdge = new Edge(endId);
            if (startVertex.edgeLink == null) {
                startVertex.edgeLink = newEdge;
            } else {
                Edge iterator = startVertex.edgeLink;
                while (iterator.nextEdge != null) {
                    iterator = iterator.nextEdge;
                }
                iterator.nextEdge = newEdge;
            }
        } else {
            System.out.println("başlangıç veya bitiş düğümü yok");
        }
    }
    /*4) countVertex()
➤ Amaç:
Graf'taki toplam vertex sayısını bulmak.
➤ Nasıl:
Head'den başlayıp linked list’in sonuna kadar ilerler → counter++ → return counter. */
    public int countVertex(){
        int counter=0;
        Vertex iterator=head;
        while(iterator!=null){
            counter++;
            iterator=iterator.nextVertex;
        }
        return counter;
    }
    /*5) inDegree(T id)
➤ Amaç:
Bir vertex’e kaç tane kenarın geldiğini (in-degree) hesaplar.
➤ Nasıl:
Graf’taki her vertex’in edge listesine bakar.
Eğer bir edge şu vertex’e gidiyorsa → count++ */
    public int inDegree(T id){
        int counter=0;
        Vertex iterator=head;
        while(iterator!=null){
            Edge iteratorEdge=iterator.edgeLink;
            while(iteratorEdge!=null){
                if(iteratorEdge.vertexId.compareTo(id)==0)
                    counter++;
                iteratorEdge=iteratorEdge.nextEdge;
            }
            iterator=iterator.nextVertex;
        }
        return counter;
    }
    /*6) outDegree(T id)
➤ Amaç:
Bir vertex’ten kaç kenar çıktığını bulur.
➤ Nasıl:
O vertex'i bulur → edge listesinde kaç edge varsa sayar. */
    public int outDegree(T id){
        int counter=0;
        Vertex current=findVertex(id);
        if (current==null){
            System.out.println("Bu id'ye sahip bir vertex bulunamadı");
            return counter;
        }
        Edge iterator=current.edgeLink;
        while(iterator!=null){
            counter++;
            iterator=iterator.nextEdge;
        }
        return counter;
    }
    /*7) delete(T id)
➤ Amaç:
Graf’tan bir vertex’i silmek.
(Not: Kenarlardaki referansları silmez! Topological sort'ta işe yarayacak kadar hafif bir silme.) */
    private void delete(T id){
        if(findVertex(id)==null)
            return;
        if(head.id.compareTo(id)==0){
            head=head.nextVertex;
        }else{
            Vertex<T> iterator=head;
            while(iterator.nextVertex.id.compareTo(id)!=0){
                iterator=iterator.nextVertex;
            }
            iterator.nextVertex=iterator.nextVertex.nextVertex;
            
        }
    }
    /*8) findVertexWithZeroIndegree()
➤ Amaç:
Hiç kimsenin kendisine edge göndermediği vertex’i bulmak.
Topological sorting için gereklidir.
➤ Nasıl:
Her vertex için inDegree(id) hesaplar
0 ise → return id
Bulamazsa → null (graf döngülü olabilir) */
    public T findVertexWithZeroIndegree(){
        Vertex<T> iterator=head;
        while(iterator!=null){
            if(inDegree(iterator.id)==0)
                return iterator.id;
            iterator=iterator.nextVertex;
        }
        return null;
    }
    public void topologicalSorting(){
        int count=countVertex();
        for (int i = 0; i < count; i++) {
            T zeroId=findVertexWithZeroIndegree();
            if(zeroId==null){
                System.out.println("grafta cycle var. topological sorting yapılamaz");
                return;
            }
            delete(zeroId);
            System.out.print(zeroId+ "  ");
            
        }
        System.out.println("");
        
    }

    public void display() {
        Vertex<T> iterator = head;
        while (iterator != null) {
            System.out.print(iterator.id + "-->");
            Edge iteratorEdge = iterator.edgeLink;
            if (iteratorEdge != null) {

                while (iteratorEdge.nextEdge != null) {
                    System.out.print(iteratorEdge.vertexId + "-->");
                    iteratorEdge = iteratorEdge.nextEdge;
                }
                System.out.println(iterator.id);
            }else
                System.out.println("");
            iterator = iterator.nextVertex;
            }
        }
    }




public class Test {

    public static void main(String[] args) {
        Graph<Integer> graf=new Graph();
        graf.addVertex(1);
        graf.addVertex(2);
        graf.addVertex(3);
        graf.addVertex(4);
        graf.addVertex(5);
        
        graf.addEdge(1,2);
        graf.addEdge(1,3);
        graf.addEdge(2,3);
        graf.addEdge(2,4);
        graf.addEdge(3,5);
        graf.addEdge(4,5);
        graf.display();
        System.out.println(graf.outDegree(1));
        System.out.println(graf.inDegree(3));
        graf.topologicalSorting();
        
        
    }
}

 

public class Edge<T extends Comparable> {
    T vertexId;
    Edge nextEdge;
    public Edge(T id){
        vertexId=id;
    }
    public String toString(){
        return String.valueOf(vertexId);
    }
}
public class Vertex<T extends Comparable> {
    T id;
    Vertex nextVertex;
    Edge edgeLink;
    public Vertex(T id){
        this.id=id;
                
    }
    public String toString(){
        return String.valueOf(id);
    }
}/*Vertex Sınıfı
Her vertex’in:
id’si
nextVertex: bir sonraki vertex
edgeLink: edge listesi başlangıcı
Edge Sınıfı
Her kenarın:
vertexId: nereye gidiyor
nextEdge: aynı vertex’ten çıkan bir sonraki edge */