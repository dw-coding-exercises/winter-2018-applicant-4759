(ns my-exercise.form_submit
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [my-exercise.core :refer :all]))

(deftest search_page_loads
  (is (= 200 (:status (app (mock/request :get "/search"))))))
