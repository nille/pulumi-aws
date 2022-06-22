# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'ApplicationAutoStartConfiguration',
    'ApplicationAutoStopConfiguration',
    'ApplicationInitialCapacity',
    'ApplicationInitialCapacityInitialCapacityConfig',
    'ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration',
    'ApplicationMaximumCapacity',
    'ApplicationNetworkConfiguration',
]

@pulumi.output_type
class ApplicationAutoStartConfiguration(dict):
    def __init__(__self__, *,
                 enabled: Optional[bool] = None):
        """
        :param bool enabled: Enables the application to automatically stop after a certain amount of time being idle. Defaults to `true`.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Enables the application to automatically stop after a certain amount of time being idle. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")


@pulumi.output_type
class ApplicationAutoStopConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "idleTimeoutMinutes":
            suggest = "idle_timeout_minutes"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ApplicationAutoStopConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ApplicationAutoStopConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ApplicationAutoStopConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 enabled: Optional[bool] = None,
                 idle_timeout_minutes: Optional[int] = None):
        """
        :param bool enabled: Enables the application to automatically stop after a certain amount of time being idle. Defaults to `true`.
        :param int idle_timeout_minutes: The amount of idle time in minutes after which your application will automatically stop. Defaults to `15` minutes.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if idle_timeout_minutes is not None:
            pulumi.set(__self__, "idle_timeout_minutes", idle_timeout_minutes)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Enables the application to automatically stop after a certain amount of time being idle. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="idleTimeoutMinutes")
    def idle_timeout_minutes(self) -> Optional[int]:
        """
        The amount of idle time in minutes after which your application will automatically stop. Defaults to `15` minutes.
        """
        return pulumi.get(self, "idle_timeout_minutes")


@pulumi.output_type
class ApplicationInitialCapacity(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "initialCapacityType":
            suggest = "initial_capacity_type"
        elif key == "initialCapacityConfig":
            suggest = "initial_capacity_config"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ApplicationInitialCapacity. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ApplicationInitialCapacity.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ApplicationInitialCapacity.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 initial_capacity_type: str,
                 initial_capacity_config: Optional['outputs.ApplicationInitialCapacityInitialCapacityConfig'] = None):
        """
        :param str initial_capacity_type: The worker type for an analytics framework. For Spark applications, the key can either be set to `Driver` or `Executor`. For Hive applications, it can be set to `HiveDriver` or `TezTask`.
        :param 'ApplicationInitialCapacityInitialCapacityConfigArgs' initial_capacity_config: The initial capacity configuration per worker.
        """
        pulumi.set(__self__, "initial_capacity_type", initial_capacity_type)
        if initial_capacity_config is not None:
            pulumi.set(__self__, "initial_capacity_config", initial_capacity_config)

    @property
    @pulumi.getter(name="initialCapacityType")
    def initial_capacity_type(self) -> str:
        """
        The worker type for an analytics framework. For Spark applications, the key can either be set to `Driver` or `Executor`. For Hive applications, it can be set to `HiveDriver` or `TezTask`.
        """
        return pulumi.get(self, "initial_capacity_type")

    @property
    @pulumi.getter(name="initialCapacityConfig")
    def initial_capacity_config(self) -> Optional['outputs.ApplicationInitialCapacityInitialCapacityConfig']:
        """
        The initial capacity configuration per worker.
        """
        return pulumi.get(self, "initial_capacity_config")


@pulumi.output_type
class ApplicationInitialCapacityInitialCapacityConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "workerCount":
            suggest = "worker_count"
        elif key == "workerConfiguration":
            suggest = "worker_configuration"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ApplicationInitialCapacityInitialCapacityConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ApplicationInitialCapacityInitialCapacityConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ApplicationInitialCapacityInitialCapacityConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 worker_count: int,
                 worker_configuration: Optional['outputs.ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration'] = None):
        """
        :param int worker_count: The number of workers in the initial capacity configuration.
        :param 'ApplicationInitialCapacityInitialCapacityConfigWorkerConfigurationArgs' worker_configuration: The resource configuration of the initial capacity configuration.
        """
        pulumi.set(__self__, "worker_count", worker_count)
        if worker_configuration is not None:
            pulumi.set(__self__, "worker_configuration", worker_configuration)

    @property
    @pulumi.getter(name="workerCount")
    def worker_count(self) -> int:
        """
        The number of workers in the initial capacity configuration.
        """
        return pulumi.get(self, "worker_count")

    @property
    @pulumi.getter(name="workerConfiguration")
    def worker_configuration(self) -> Optional['outputs.ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration']:
        """
        The resource configuration of the initial capacity configuration.
        """
        return pulumi.get(self, "worker_configuration")


@pulumi.output_type
class ApplicationInitialCapacityInitialCapacityConfigWorkerConfiguration(dict):
    def __init__(__self__, *,
                 cpu: str,
                 memory: str,
                 disk: Optional[str] = None):
        """
        :param str cpu: The CPU requirements for every worker instance of the worker type.
        :param str memory: The memory requirements for every worker instance of the worker type.
        :param str disk: The disk requirements for every worker instance of the worker type.
        """
        pulumi.set(__self__, "cpu", cpu)
        pulumi.set(__self__, "memory", memory)
        if disk is not None:
            pulumi.set(__self__, "disk", disk)

    @property
    @pulumi.getter
    def cpu(self) -> str:
        """
        The CPU requirements for every worker instance of the worker type.
        """
        return pulumi.get(self, "cpu")

    @property
    @pulumi.getter
    def memory(self) -> str:
        """
        The memory requirements for every worker instance of the worker type.
        """
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter
    def disk(self) -> Optional[str]:
        """
        The disk requirements for every worker instance of the worker type.
        """
        return pulumi.get(self, "disk")


@pulumi.output_type
class ApplicationMaximumCapacity(dict):
    def __init__(__self__, *,
                 cpu: str,
                 memory: str,
                 disk: Optional[str] = None):
        """
        :param str cpu: The CPU requirements for every worker instance of the worker type.
        :param str memory: The memory requirements for every worker instance of the worker type.
        :param str disk: The disk requirements for every worker instance of the worker type.
        """
        pulumi.set(__self__, "cpu", cpu)
        pulumi.set(__self__, "memory", memory)
        if disk is not None:
            pulumi.set(__self__, "disk", disk)

    @property
    @pulumi.getter
    def cpu(self) -> str:
        """
        The CPU requirements for every worker instance of the worker type.
        """
        return pulumi.get(self, "cpu")

    @property
    @pulumi.getter
    def memory(self) -> str:
        """
        The memory requirements for every worker instance of the worker type.
        """
        return pulumi.get(self, "memory")

    @property
    @pulumi.getter
    def disk(self) -> Optional[str]:
        """
        The disk requirements for every worker instance of the worker type.
        """
        return pulumi.get(self, "disk")


@pulumi.output_type
class ApplicationNetworkConfiguration(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "securityGroupIds":
            suggest = "security_group_ids"
        elif key == "subnetIds":
            suggest = "subnet_ids"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in ApplicationNetworkConfiguration. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        ApplicationNetworkConfiguration.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        ApplicationNetworkConfiguration.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 security_group_ids: Optional[Sequence[str]] = None,
                 subnet_ids: Optional[Sequence[str]] = None):
        """
        :param Sequence[str] security_group_ids: The array of security group Ids for customer VPC connectivity.
        :param Sequence[str] subnet_ids: The array of subnet Ids for customer VPC connectivity.
        """
        if security_group_ids is not None:
            pulumi.set(__self__, "security_group_ids", security_group_ids)
        if subnet_ids is not None:
            pulumi.set(__self__, "subnet_ids", subnet_ids)

    @property
    @pulumi.getter(name="securityGroupIds")
    def security_group_ids(self) -> Optional[Sequence[str]]:
        """
        The array of security group Ids for customer VPC connectivity.
        """
        return pulumi.get(self, "security_group_ids")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Optional[Sequence[str]]:
        """
        The array of subnet Ids for customer VPC connectivity.
        """
        return pulumi.get(self, "subnet_ids")

