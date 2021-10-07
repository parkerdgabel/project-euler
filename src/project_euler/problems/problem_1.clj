(ns project-euler.problems.problem-1
  "Multiples of 3 or 5

   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
   The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000."
  (:require [clojure.core.logic]))

(def ^:private multiples-of-3-or-5 (for [x     (range 1000)
                               :when (or (== 0 (mod x 3)) (== 0 (mod x 5)))] x))

(def solution (reduce + multiples-of-3-or-5))

;; Logic solution