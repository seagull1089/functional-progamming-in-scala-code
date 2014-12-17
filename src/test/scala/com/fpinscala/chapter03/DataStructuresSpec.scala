package com.fpinscala.chapter03


import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * Created by aragipindi on 12/16/14.
 */
class DataStructuresSpec extends FlatSpec with ShouldMatchers {

	"Drop" should "remove the given number of head elements from the list " in {
		val lst = List(1,2,3,4,5,6)
		DataStructures.drop(lst,4).size should be (2)
		DataStructures.drop(lst,6).size should be (0)
		DataStructures.drop(lst,10).size should be (0)
		DataStructures.drop(lst,0).size should be (lst.size)

		val lst2 = List()
		DataStructures.drop(lst2,4).size should be (lst2.size)
	}

}
