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
 * @since 25/04/2025, 12:39:10
 *
 */
public static void PopulatePet() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.beginTransaction(Var.valueOf("app"));
    cronapi.database.Operations.executeNativeQueryUpdate(Var.valueOf("app.entity.Pet"),Var.valueOf("INSERT INTO PET (ID, nome, idade, raca) VALUES \n(1, \'Rex\', 3, \'Corgi\'),\n(2, \'Bella\', 5, \'Poodle\'),\n(3, \'Thor\', 2, \'Bulldog\'),\n(4, \'Luna\', 4, \'Golden Retriever\'),\n(5, \'Max\', 1, \'Beagle\'),\n(6, \'Nina\', 6, \'Shihtzu\'),\n(7, \'Bob\', 7, \'Pastor Alemão\'),\n(8, \'Mia\', 3, \'Pug\'),\n(9, \'Toby\', 2, \'Boxer\'),\n(10, \'Mel\', 5, \'Dálmata\');"));
    cronapi.database.Operations.commitTransaction(Var.valueOf("app"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Leandro Leonardo Assarice
 * @since 25/04/2025, 12:39:10
 *
 */
public static void TruncatePet() throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.beginTransaction(Var.valueOf("app"));
    cronapi.database.Operations.executeNativeQueryUpdate(Var.valueOf("app.entity.Pet"),Var.valueOf("TRUNCATE TABLE PET"));
    cronapi.database.Operations.commitTransaction(Var.valueOf("app"));
   return Var.VAR_NULL;
   }
 }.call();
}

}

