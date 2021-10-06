(ns project-euler.problems.problem-3
  "The prime factors of 13195 are 5, 7, 13 and 29.

   What is the largest prime factor of the number 600851475143?"
  (:require [clojure.math.numeric-tower :refer [gcd]]))

;; Trial Divion by wheel
(defn factor-2
  [num]
  (assert (pos? num))
  (let [divisions (take-while #(zero? (mod % 2)) (iterate #(/ % 2) num))]
    (if (empty? divisions)
      num
      (/ (last divisions) 2))))
;; Pollard's Rho algorithm