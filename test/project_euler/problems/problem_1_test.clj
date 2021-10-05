(ns project-euler.problems.problem-1-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-1 :refer :all]))

(deftest problem-1-answer
  (testing "Ensures the proper solution for problem 1"
    (is (= (project-euler.problems.problem-1/problem-1) 233168))))
