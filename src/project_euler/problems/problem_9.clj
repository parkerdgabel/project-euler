(ns project-euler.problems.problem-9
  "Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

   a2 + b2 = c2
   For example, 32 + 42 = 9 + 16 = 25 = 52.

   There exists exactly one Pythagorean triplet for which a + b + c = 1000.
   Find the product abc."
  (:require [clojure.math.combinatorics :refer [partitions]]
            [clojure.math.numeric-tower :refer [expt]]
            [project-euler.utils.utils :refer [find-first]]))

(def ^:private triplets
  (partitions (take 1000 (cycle [1])) :min 3 :max 3))

(def ^:private sorted-triplets (->> triplets (map #(sort %))))
(def ^:private int-triplets (->> sorted-triplets (map #(map count %))))
(def ^:private strictly-ascending-triplets
  (->> int-triplets
       (filter #(apply < %))))

(defn- is-pythagorean-triplet
  [coll]
  (let [[a b c] (map #(expt % 2) coll)]
    (= (+ a b) c)))

(def solution (apply * (->> strictly-ascending-triplets (find-first is-pythagorean-triplet))))
