# 🐾 Migros Test Automation (EN)

[![Build with Maven](https://img.shields.io/badge/build-Maven-5C2D91?logo=apachemaven)](https://maven.apache.org/)
[![Test Framework](https://img.shields.io/badge/Cucumber-6.10.4-brightgreen?logo=cucumber)](https://cucumber.io/)
[![Selenium](https://img.shields.io/badge/Selenium-4.28.1-43B02A?logo=selenium)](https://www.selenium.dev/)
[![License: MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Kübra%20Daşdoğan-0077B5?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/kubradas/)

---

## 🔍 Project Summary

This is an automation testing project created to verify basic user flows on the [migros.com.tr](https://www.migros.com.tr/) website. 
It is implemented using Selenium WebDriver, JUnit, and Cucumber, and runs on both Chrome and Firefox browsers.

---

## 🥪 Test Scenario

1. Open Migros homepage.  
2. Select "Pet Shop" from the categories menu.  
3. Verify the Pet Shop page is loaded.  
4. Sort products by "Lowest price".  
5. Verify that sorting is applied correctly.

---

## 🚀 How to Run

1. Clone this project:

```bash
git clone https://github.com/kubradas/MigrosTestAutomation.git
cd MigrosTestAutomation
```

2. Select browser in `config.properties`: `browser=chrome` or `browser=firefox`

3. Run the tests via Maven:

```bash
mvn clean test
```

---

## 📋 Reporting

After test execution, the following reports are automatically generated under `target/cucumber-reports/`:

- `cucumber-report.html` – User-friendly, detailed test report in HTML format  
- `cucumber-report.json` – Provides raw data for advanced reporting tools (e.g., Masterthought)

---

## 👩‍💼 Developer

**Kübra Daşdoğan**  
Software QA Engineer  
[View LinkedIn Profile](https://www.linkedin.com/in/kubradas/)

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.



---

# 🐾 Migros Test Automation (Türkçe)

[![Build with Maven](https://img.shields.io/badge/build-Maven-5C2D91?logo=apachemaven)](https://maven.apache.org/)
[![Test Framework](https://img.shields.io/badge/Cucumber-6.10.4-brightgreen?logo=cucumber)](https://cucumber.io/)
[![Selenium](https://img.shields.io/badge/Selenium-4.28.1-43B02A?logo=selenium)](https://www.selenium.dev/)
[![License: MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Kübra%20Daşdoğan-0077B5?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/kubradas/)

---

## 🔍 Proje Özeti

Bu proje, [migros.com.tr](https://www.migros.com.tr/) sitesinde gerçekleştirilen temel kullanıcı akışlarını test etmek amacıyla hazırlanmış bir test otomasyon framework'üdür.
Selenium WebDriver, JUnit ve Cucumber kullanılarak hem Chrome hem Firefox tarayıcılarında çalışacak şekilde yapılandırılmıştır.

---

## 🥪 Test Senaryosu

1. Migros anasayfası açılır.  
2. Kategoriler menüsünden "Pet Shop" seçilir.  
3. Pet Shop sayfasının açıldığı doğrulanır.  
4. Ürünler "Düşük fiyattan yükseğe" göre sıralanır.  
5. Sıralamanın doğru yapıldığı doğrulanır.

---

## 🚀 Nasıl Çalıştırılır?  

1. Bu projeyi klonlayın:

```bash
git clone https://github.com/kubradas/MigrosTestAutomation.git
cd MigrosTestAutomation
```

2. Tarayıcıyı seçmek için `config.properties` dosyasında `browser=chrome` veya `browser=firefox` ayarını yapın.

3. Maven ile testleri çalıştırın:

```bash
mvn clean test
```

---

## 📋 Raporlama

Test çalıştırıldığında `target/cucumber-reports/` dizininde aşağıdaki raporlar oluşur:

- `cucumber-report.html` – Kullanıcı dostu, HTML formatında detaylı test raporu  
- `cucumber-report.json` – Gelişmiş raporlama sistemleri (Masterthought gibi) için veri sağlar

---

## 👩‍💼 Geliştirici

**Kübra Daşdoğan**  
Yazılım Test Mühendisi  
[LinkedIn Profilim](https://www.linkedin.com/in/kubradas/)

---

## 📄 Lisans  

Bu proje MIT lisansı ile lisanslanmıştır. Detaylar için [LICENSE](LICENSE) dosyasını inceleyin.

---

