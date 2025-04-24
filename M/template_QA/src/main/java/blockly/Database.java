package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Database {

public static final int TIMEOUT = 300;

/**
 *
 * @author Leandro Leonardo Assarice
 * @since 24/04/2025, 09:47:33
 *
 */
public static void PopulateProducts() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.beginTransaction(Var.valueOf("app"));
    cronapi.database.Operations.executeNativeQueryUpdate(Var.valueOf("app.entity.Product"),Var.valueOf("INSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (1, \'Notebook Lenovo\', 3500.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (2, \'Mouse Logitech\', 120.50);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (3, \'Teclado Mecânico\', 299.99);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (4, \'Monitor LG 24\"\', 899.90);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (5, \'Headset Gamer\', 499.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (6, \'Webcam HD Logitech\', 229.90);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (7, \'Impressora HP DeskJet\', 649.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (8, \'HD Externo 1TB\', 379.99);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (9, \'SSD Kingston 480GB\', 299.90);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (10, \'Placa de Vídeo GTX 1660\', 1699.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (11, \'Cadeira Gamer ThunderX3\', 1399.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (12, \'Microfone Condensador BM800\', 249.90);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (13, \'Notebook Dell Inspiron\', 4299.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (14, \'Fonte Corsair 650W\', 549.90);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (15, \'Gabinete Gamer RGB\', 389.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (16, \'Hub USB 3.0 4 portas\', 89.90);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (17, \'Leitor Cartão SD/TF\', 49.90);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (18, \'Tablet Samsung Galaxy Tab A7\', 1299.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (19, \'Smartphone Motorola G73\', 1899.00);\nINSERT INTO PRODUCT (ID, NOME, PRECO) VALUES (20, \'Roteador TP-Link Archer C6\', 249.00);"));
    cronapi.database.Operations.commitTransaction(Var.valueOf("app"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Leandro Leonardo Assarice
 * @since 24/04/2025, 09:47:33
 *
 */
public static void TruncateProducts() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.beginTransaction(Var.valueOf("app"));
    cronapi.database.Operations.executeNativeQueryUpdate(Var.valueOf("app.entity.Product"),Var.valueOf("TRUNCATE TABLE PRODUCT"));
    cronapi.database.Operations.commitTransaction(Var.valueOf("app"));
   return Var.VAR_NULL;
   }
 }.call();
}

}

