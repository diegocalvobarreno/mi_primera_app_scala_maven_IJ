package com.fer.cam

import org.apache.spark.{SparkConf, SparkContext}

object DiegoWebObject {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("DiegoWeb").setMaster("local[2]").set("spark.executor.memory","1g");
    val sc = new SparkContext(conf)


    val rdd1 = sc.parallelize(List(1, 2, 3, 4, 5, 6, 7, 8, 9))

    val rdd2 = rdd1.map(_ * 2)
      rdd2.collect().foreach(println)
  }
}
