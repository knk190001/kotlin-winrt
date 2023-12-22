package Windows.Security.Authentication.Identity.Provider

import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SecondaryAuthenticationFactorRegistration.ABI::class)
@Signature("rc(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorRegistration;{9f4cbbb4-8cba-48b0-840d-dbb22a54c678})")
@WinRTByReference(brClass = SecondaryAuthenticationFactorRegistration.ByReference::class)
public class SecondaryAuthenticationFactorRegistration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryAuthenticationFactorRegistration.WithDefault, IWinRTObject {
  private val __967098279_Interface: ISecondaryAuthenticationFactorRegistration.WithDefault by
      lazy {
    as_967098279()
  }


  public override val __967098279_Ptr: JNAPointer? by lazy {
    __967098279_Interface.__967098279_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__967098279_Interface)

  private fun as_967098279(): ISecondaryAuthenticationFactorRegistration.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryAuthenticationFactorRegistration.ABI.makeISecondaryAuthenticationFactorRegistration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryAuthenticationFactorRegistration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryAuthenticationFactorRegistration.ABI.makeISecondaryAuthenticationFactorRegistration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecondaryAuthenticationFactorRegistration> {
    public override fun getValue() =
        SecondaryAuthenticationFactorRegistration(pointer.getPointer(0))

    public fun setValue(value: SecondaryAuthenticationFactorRegistration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryAuthenticationFactorRegistration, MemoryAddress> {
    public val ISecondaryAuthenticationFactorRegistrationStatics_Instance:
        ISecondaryAuthenticationFactorRegistrationStatics by lazy {
      createISecondaryAuthenticationFactorRegistrationStatics()
    }


    public val ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Instance:
        ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics by lazy {
      createISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISecondaryAuthenticationFactorRegistrationStatics():
        ISecondaryAuthenticationFactorRegistrationStatics {
      val refiid = Guid.REFIID(ISecondaryAuthenticationFactorRegistrationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorRegistration".toHandle(),refiid,interfacePtr)
      val result =
          ISecondaryAuthenticationFactorRegistrationStatics.ABI.makeISecondaryAuthenticationFactorRegistrationStatics(interfacePtr.value)
      return result
    }

    public fun createISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics():
        ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics {
      val refiid =
          Guid.REFIID(ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorRegistration".toHandle(),refiid,interfacePtr)
      val result =
          ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics.ABI.makeISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        SecondaryAuthenticationFactorRegistration {
      val address = segment.toRawLongValue()
      return SecondaryAuthenticationFactorRegistration(Pointer(address))
    }

    public override fun toNative(obj: SecondaryAuthenticationFactorRegistration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestStartRegisteringDeviceAsync(
      deviceId: String,
      capabilities: SecondaryAuthenticationFactorDeviceCapabilities,
      deviceFriendlyName: String,
      deviceModelNumber: String,
      deviceKey: IBuffer,
      mutualAuthenticationKey: IBuffer
    ) =
        ABI.ISecondaryAuthenticationFactorRegistrationStatics_Instance.RequestStartRegisteringDeviceAsync(deviceId,
        capabilities, deviceFriendlyName, deviceModelNumber, deviceKey, mutualAuthenticationKey)

    public
        fun FindAllRegisteredDeviceInfoAsync(queryType: SecondaryAuthenticationFactorDeviceFindScope)
        =
        ABI.ISecondaryAuthenticationFactorRegistrationStatics_Instance.FindAllRegisteredDeviceInfoAsync(queryType)

    public fun UnregisterDeviceAsync(deviceId: String) =
        ABI.ISecondaryAuthenticationFactorRegistrationStatics_Instance.UnregisterDeviceAsync(deviceId)

    public fun UpdateDeviceConfigurationDataAsync(deviceId: String,
        deviceConfigurationData: IBuffer) =
        ABI.ISecondaryAuthenticationFactorRegistrationStatics_Instance.UpdateDeviceConfigurationDataAsync(deviceId,
        deviceConfigurationData)

    public fun RegisterDevicePresenceMonitoringAsync(
      deviceId: String,
      deviceInstancePath: String,
      monitoringMode: SecondaryAuthenticationFactorDevicePresenceMonitoringMode
    ) =
        ABI.ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Instance.RegisterDevicePresenceMonitoringAsync(deviceId,
        deviceInstancePath, monitoringMode)

    public fun RegisterDevicePresenceMonitoringAsync(
      deviceId: String,
      deviceInstancePath: String,
      monitoringMode: SecondaryAuthenticationFactorDevicePresenceMonitoringMode,
      deviceFriendlyName: String,
      deviceModelNumber: String,
      deviceConfigurationData: IBuffer
    ) =
        ABI.ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Instance.RegisterDevicePresenceMonitoringAsync(deviceId,
        deviceInstancePath, monitoringMode, deviceFriendlyName, deviceModelNumber,
        deviceConfigurationData)

    public fun UnregisterDevicePresenceMonitoringAsync(deviceId: String) =
        ABI.ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Instance.UnregisterDevicePresenceMonitoringAsync(deviceId)

    public fun IsDevicePresenceMonitoringSupported() =
        ABI.ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Instance.IsDevicePresenceMonitoringSupported()
  }
}
