(ns project-euler.problems.problem-6-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-6 :refer [solution]]))

(deftest problem-6-answer
  (testing "The correct answer returned for problem 6"
    (is (= 25164150 solution))))