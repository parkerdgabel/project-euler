(ns project-euler.utils.number-seqs)

(def primes
 (remove
  (fn [x]
    (some #(zero? (mod x %)) primes))
  (iterate inc 2)))

(def natural-numbers (iterate inc 1))