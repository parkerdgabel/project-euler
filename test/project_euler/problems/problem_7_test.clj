(ns project-euler.problems.problem-7-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-7 :refer [solution]]))

(deftest problem-6-answer
  (testing "The correct answer returned for problem 6"
    (is (= 104743 solution))))