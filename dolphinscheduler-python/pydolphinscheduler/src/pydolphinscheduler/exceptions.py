# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.

"""Exceptions for pydolphinscheduler."""


class PyDSBaseException(Exception):
    """Base exception for pydolphinscheduler."""

    pass


class PyDSParamException(PyDSBaseException):
    """Exception for pydolphinscheduler parameter verify error."""

    pass


class PyDSTaskNoFoundException(PyDSBaseException):
    """Exception for pydolphinscheduler workflow task no found error."""

    pass


class PyDSJavaGatewayException(PyDSBaseException):
    """Exception for pydolphinscheduler Java gateway error."""

    pass


class PyDSProcessDefinitionNotAssignException(PyDSBaseException):
    """Exception for pydolphinscheduler process definition not assign error."""


class PyDSConfException(PyDSBaseException):
    """Exception for pydolphinscheduler configuration error."""

    pass
