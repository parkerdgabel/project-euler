(ns project-euler.problems.problem-6
  "The sum of the squares of the first ten natural numbers is 385,

   The square of the sum of the first ten natural numbers is 3025,

   Hence the difference between the sum of the squares of the
   first ten natural numbers and the square of the sum is 2640.

   Find the difference between the sum of the squares of the first
   one hundred natural numbers and the square of the sum."
  (:require [project-euler.utils.number-seqs :refer [natural-numbers]]
            [clojure.math.numeric-tower :refer [expt]]))

(def ^:private one-hundred (take 100 natural-numbers))

(defn- sum-of [coll] (reduce + coll))
(def ^:private squares (->> one-hundred (map #(expt % 2))))
(def ^:private sum-of-first-100 (sum-of one-hundred))
(def ^:private sum-of-squares (sum-of squares))
(def solution (- (expt sum-of-first-100 2) sum-of-squares))
