(ns project-euler.problems.problem-3-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-3 :refer :all]))

(deftest problem-3-answer
  (testing "The correct answer returned for problem 3"
    (is (= 6857 solution))))