package com.fpinscala.chapter03

/**
 * Created by aragipindi on 12/16/14.
 */
object DataStructures {

	def tail[A](xs:List[A]):List[A] = {
		xs match {
			case a :: b => b
			case Nil => Nil
		}
	}

	def setHead[A](xs:List[A],a:A): List[A] = {
		xs match {
			case x :: y => a :: y
			case Nil => a :: Nil
		}
	}

	@annotation.tailrec
	def drop[A](xs:List[A],n:Int):List[A]={
		xs match {
			case Nil => Nil
			case _ if n <= 0 => xs
			case x :: y => drop(y,n-1)
		}
	}

}
