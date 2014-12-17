package com.fpinscala.chapter02

/**
 * Created by aragipindi on 12/16/14.
 */
object Recursion {
	/* from the book example */
	def factorial(n:Int):Int = {
		@annotation.tailrec
		def go(n:Int,acc:Int):Int={
			if(n <=0) acc
			else go(n-1,acc*n)
		}
		go(n,1)
	}


	/* get the nth fibonacci using tail recursion
	*  the first 2 fibonacci numbers are 0,1
	* */

	def nthFib(n:Int):Int = {
		@annotation.tailrec
		def go(index:Int,tn_1:Int, tn_2:Int):Int={
			if(n==index) tn_1 + tn_2
			else go(index+1,tn_1 + tn_2,tn_1)
		}
		n match {
			case 0 => 1
			case 1 => 1
			case _ => go(2,1,0)
		}
	}


	/* Excerice 3
	* check if the given array is sorted according to the
	* comparator given.
	* */
	def isSorted[A](as: Array[A], gt: (A,A) => Boolean): Boolean ={
		def compare(index:Int,acc:Boolean):Boolean={
			if(!acc) false
			else if (index >= as.length -1) true
			else  compare(index+1, gt(as(index),as(index+1)))
		}
		compare(0,true)
	}

	def curry[A,B,C](f:(A,B)=>C): A=>(B=>C) ={
		// given a:A, return this partial evaluated function.
		a:A => f(a,_:B)
	}

	def unCurry[A,B,C](f:A=>B=>C):(A,B)=>C ={
		// given a,b return this method
		(a:A,b:B)=> f(a)(b)
	}

	def compose[A,B,C](f:A=>B,g:B=>C):A=>C = {
		a:A => g(f(a))
	}

}
