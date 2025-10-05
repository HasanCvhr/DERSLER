print("hello World")
print('Hello\World')
print("""Merhaba
      Dünya
""")
print("Merhaba\t Dünya")
 #tab olarak algılar boşluk bırakır.
 mesaj="Merhaba dünya"
 #mesaj2="ben hasan"
print(mesaj+ ""+mesaj2)
#print (mesaj[1])   köşeli parantez bize istediğimiz karakteri geri döndürüyor.
 
#print(mesaj[0:3])0. ve 3. harfler arasını yazdırcak 0 dahil 3 değil.
#print(mesaj[::2]) baştan 
#başlayarak 2 şer 2şer harfleri yazdıracak.
print(mesaj.upper()) # bütün harfler büyük
print(mesaj.lower()) #bütün harfler küçük
print(mesaj.startswith("me")) #bir ifadenin hangi karakterle başladığını doğru/yanlış olarak gösterir.
print(mesaj.endswith("aj")) #bir ifadenin hangi parçayla bittiğini gösterir.
print(len(mesaj)) # mesajın kaç karakterli olduğunu söyler.
print("Merhaba* 10") #10 tane merhaba yazdırır.
isim="Ali"
yas="20"
print("{}, {} yaşindadir.format(isim,yas)")
print(f"{isim} {mesaj} dedi.")