(ns project-euler.problems.problem-9-test
  (:require [clojure.test :refer :all]
            [project-euler.problems.problem-9 :refer [solution]]))

(deftest problem-8-answer
  (testing "The correct answer returned for problem 6"
    (is (= 31875000 solution))))