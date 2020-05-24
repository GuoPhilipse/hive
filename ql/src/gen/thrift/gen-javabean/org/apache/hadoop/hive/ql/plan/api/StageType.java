/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.ql.plan.api;


public enum StageType implements org.apache.thrift.TEnum {
  CONDITIONAL(0),
  COPY(1),
  DDL(2),
  MAPRED(3),
  EXPLAIN(4),
  FETCH(5),
  FUNC(6),
  MAPREDLOCAL(7),
  MOVE(8),
  STATS(9),
  DEPENDENCY_COLLECTION(10),
  COLUMNSTATS(11),
  REPL_DUMP(12),
  REPL_BOOTSTRAP_LOAD(13),
  REPL_STATE_LOG(14),
  REPL_TXN(15),
  REPL_INCREMENTAL_LOAD(16),
  SCHEDULED_QUERY_MAINT(17),
  ACK(18),
  RANGER_DUMP(19),
  RANGER_LOAD(20);

  private final int value;

  StageType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static StageType findByValue(int value) { 
    switch (value) {
      case 0:
        return CONDITIONAL;
      case 1:
        return COPY;
      case 2:
        return DDL;
      case 3:
        return MAPRED;
      case 4:
        return EXPLAIN;
      case 5:
        return FETCH;
      case 6:
        return FUNC;
      case 7:
        return MAPREDLOCAL;
      case 8:
        return MOVE;
      case 9:
        return STATS;
      case 10:
        return DEPENDENCY_COLLECTION;
      case 11:
        return COLUMNSTATS;
      case 12:
        return REPL_DUMP;
      case 13:
        return REPL_BOOTSTRAP_LOAD;
      case 14:
        return REPL_STATE_LOG;
      case 15:
        return REPL_TXN;
      case 16:
        return REPL_INCREMENTAL_LOAD;
      case 17:
        return SCHEDULED_QUERY_MAINT;
      case 18:
        return ACK;
      case 19:
        return RANGER_DUMP;
      case 20:
        return RANGER_LOAD;
      default:
        return null;
    }
  }
}
