(ns project-euler.problems.problem-2-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-2 :refer :all]))

(deftest problem-2-answer
  (testing "Ensure the proper solution to problem 2"
    (is (= solution 4613732))))