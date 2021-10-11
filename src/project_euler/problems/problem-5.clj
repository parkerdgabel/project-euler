(ns project-euler.problems.problem-5
  "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

   What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?"
  (:require [clojure.math.numeric-tower :refer [lcm]]))

(def ^:private one-to-twenty (range 1 21))

(def solution (reduce lcm one-to-twenty))
