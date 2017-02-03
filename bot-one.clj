(defn- turn-directions [:right :left :about-face])

(fn [state time-left]
  (let [command-options [{:command {:action :move
                                    :metadata {}}}
                         {:command {:action :turn
                                    :metadata (rand-nth turn-directions)}}
                         {:command {:action :shoot
                                    :metadata {}}}]]
    (rand-nth command-options)))
