Feature: Migros Pet Shop Kategorisi Testi

  @MigrosTest
  Scenario: Kullanıcı Pet Shop kategorisinde düşük fiyat sıralaması yapar
    Given Kullanıcı Migros ana sayfasına gider
    When Kullanıcı Pet Shop kategorisini seçer
    Then Pet Shop sayfasının açıldığını doğrular
    When Kullanıcı ürünleri düşük fiyata göre sıralar
    Then Kullanıcı fiyatları çeker ve düşükten yükseğe sıralandığını doğrular
