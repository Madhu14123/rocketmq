/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.broker;

import java.io.File;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrokerPathConfigHelperTest {

    @Test
    public void testGetPath() {
        String lmqConsumerOffsetPath = BrokerPathConfigHelper.getLmqConsumerOffsetPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/lmqConsumerOffset.json".replace("/", File.separator), lmqConsumerOffsetPath);

        String consumerOffsetPath = BrokerPathConfigHelper.getConsumerOffsetPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/consumerOffset.json".replace("/", File.separator), consumerOffsetPath);

        String topicConfigPath = BrokerPathConfigHelper.getTopicConfigPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/topics.json".replace("/", File.separator), topicConfigPath);

        String subscriptionGroupPath = BrokerPathConfigHelper.getSubscriptionGroupPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/subscriptionGroup.json".replace("/", File.separator), subscriptionGroupPath);

        String topicQueueMappingPath = BrokerPathConfigHelper.getTopicQueueMappingPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/topicQueueMapping.json".replace("/", File.separator), topicQueueMappingPath);

        String consumerOrderInfoPath = BrokerPathConfigHelper.getConsumerOrderInfoPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/consumerOrderInfo.json".replace("/", File.separator), consumerOrderInfoPath);

        String timercheckPath = BrokerPathConfigHelper.getTimerCheckPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/timercheck".replace("/", File.separator), timercheckPath);

        String timermetricsPath = BrokerPathConfigHelper.getTimerMetricsPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/timermetrics".replace("/", File.separator), timermetricsPath);

        String transactionMetricsPath = BrokerPathConfigHelper.getTransactionMetricsPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/transactionMetrics".replace("/", File.separator), transactionMetricsPath);

        String consumerFilterPath = BrokerPathConfigHelper.getConsumerFilterPath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/consumerFilter.json".replace("/", File.separator), consumerFilterPath);

        String messageRequestModePath = BrokerPathConfigHelper.getMessageRequestModePath("/home/admin/store".replace("/", File.separator));
        assertEquals("/home/admin/store/config/messageRequestMode.json".replace("/", File.separator), messageRequestModePath);
    }
}
