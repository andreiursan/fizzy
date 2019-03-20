(ns fizzy.core-test
  (:require [clojure.test :refer :all]
            [fizzy.core :refer :all]))

(deftest fizz-buzz-test
  (testing "Tests fizz-buzz"
    (are [given expected] (= (apply fizz-buzz [given]) expected)
      1 1
      3 "fizz"
      5 "buzz"
      6 "fizz"
      11 11
      6  "fizz"
      15 "fizzbuzz")))