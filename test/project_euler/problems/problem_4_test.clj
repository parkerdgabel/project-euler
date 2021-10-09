(ns project-euler.problems.problem-4-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-4 :refer [solution]]))

(deftest problem-3-answer
  (testing "The correct answer returned for problem 4"
    (is (= 906609 solution))))