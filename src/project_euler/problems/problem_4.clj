 (ns project-euler.problems.problem-4
  "A palindromic number reads the same both ways.
   The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

   Find the largest palindrome made from the product of two 3-digit numbers."
  (:require [clojure.string :as string]
            [project-euler.utils.utils :refer [find-first]]))

(def ^:private three-digits (range 100 1000))

(defn- create-palindrome
  [num]
  (let [strnum (str num)
        r (string/reverse strnum)]
    (Integer/parseInt (string/join [strnum r]))))

(def ^:private palindromes (->> three-digits (map create-palindrome)))

(defn- is-product-of-three-digits
  [num]
  (if-let [d (find-first #(zero? (mod num %)) (->> three-digits (reverse)))]
    (= 3 (count (str (/ num d))))
    false))

(def solution (find-first is-product-of-three-digits (->> palindromes (sort) (reverse))))
