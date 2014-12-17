package com.fpinscala.chapter02

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
 * Created by aragipindi on 12/16/14.
 */
class RecursionSpec  extends FlatSpec with ShouldMatchers {
	"fibonacci nth elements" should "match" in {
			Recursion.nthFib(2) should be (1)
			Recursion.nthFib(3) should be (2)
			Recursion.nthFib(4) should be (3)
			Recursion.nthFib(5) should be (5)
			Recursion.nthFib(6) should be (8)
	}


	"sorted array" should "return true" in {
		def cmp(a:Int,b:Int)={
			a > b
		}
		val arr1 = Array(5,4,3,2,1)
		Recursion.isSorted(arr1, cmp) should be (true)

		val arr2 = Array(5)
		Recursion.isSorted(arr2, cmp) should be (true)

		val arr3 = Array[Int]()
		Recursion.isSorted(arr3, cmp) should be (true)

		val arr4 = Array(6,4,5,3,2,1)
		Recursion.isSorted(arr4, cmp) should be (false)

		val rev = arr1.reverse
		Recursion.isSorted(rev, cmp) should be (false)
	}
}
