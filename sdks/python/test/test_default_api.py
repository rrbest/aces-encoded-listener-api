# coding: utf-8

"""
    Aces Encoded Listener API

    API Specification for Encoded Listeners that read data on a blockchain and forward transaction events to registered subscribers. 

    OpenAPI spec version: 0.1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.apis.default_api import DefaultApi


class TestDefaultApi(unittest.TestCase):
    """ DefaultApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.default_api.DefaultApi()

    def tearDown(self):
        pass

    def test_status_get(self):
        """
        Test case for status_get

        Get Health of node.
        """
        pass

    def test_subscriptions_id_events_get(self):
        """
        Test case for subscriptions_id_events_get

        List Subscription Events
        """
        pass

    def test_subscriptions_id_get(self):
        """
        Test case for subscriptions_id_get

        Gets Subscription
        """
        pass

    def test_subscriptions_id_unsubscribes_post(self):
        """
        Test case for subscriptions_id_unsubscribes_post

        Create an Unsubscription.
        """
        pass

    def test_subscriptions_post(self):
        """
        Test case for subscriptions_post

        Registers a subscriber node to receive blockchain events.
        """
        pass


if __name__ == '__main__':
    unittest.main()
