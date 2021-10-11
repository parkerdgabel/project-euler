(ns project-euler.problems.problem-3
  "The prime factors of 13195 are 5, 7, 13 and 29.

   What is the largest prime factor of the number 600851475143?"
  (:require [project-euler.utils.utils :refer [find-first]]
            [project-euler.utils.number-seqs :refer [primes]]))

(defn- largest-factor
  [num]
  (assert (pos? num))
  (if-not (< num 2)
    (let [candidates (take-while #(<= % num) primes)]
      (->> candidates (reverse) (find-first #(zero? (mod num %)))))
    1))

(def solution (largest-factor 600851475143))
;; Pollard's Rho algorithm