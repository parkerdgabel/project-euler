(ns project-euler.problems.problem-5-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-5 :refer [solution]]))

(deftest problem-5-answer
  (testing "The correct answer returned for problem 5"
    (is (= 232792560 solution))))