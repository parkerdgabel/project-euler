(ns project-euler.problems.problem-2
  "Each new term in the Fibonacci sequence is generated by adding the previous two terms.
   By starting with 1 and 2, the first 10 terms will be:

   1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

   By considering the terms in the Fibonacci sequence whose values do not exceed four million,
   find the sum of the even-valued terms.")

(defn- fib-add [[a b]]
  [b (+ a b)])

(def ^:private fib-seq
  (map last (iterate fib-add [0 1])))

(def ^:private less-than-four-million (take-while #(< % (* 4 1000000)) fib-seq))

(def ^:private all-evens (filter even? less-than-four-million))

(def solution (reduce + all-evens))