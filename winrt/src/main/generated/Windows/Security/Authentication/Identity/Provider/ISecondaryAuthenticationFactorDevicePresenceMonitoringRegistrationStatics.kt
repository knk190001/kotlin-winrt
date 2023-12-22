package Windows.Security.Authentication.Identity.Provider

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics.ABI::class)
@Signature("{90499a19-7ef2-4523-951c-a417a24acf93}")
@Guid("90499a197ef24523951ca417a24acf93")
@WinRTInterface("90499a197ef24523951ca417a24acf93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics.ByReference::class)
public interface ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics :
    NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RegisterDevicePresenceMonitoringAsync(
    deviceId: String?,
    deviceInstancePath: String?,
    monitoringMode: SecondaryAuthenticationFactorDevicePresenceMonitoringMode?
  ): IAsyncOperation<SecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatus?>?

  @InterfaceMethod(1)
  public fun RegisterDevicePresenceMonitoringAsync(
    deviceId: String?,
    deviceInstancePath: String?,
    monitoringMode: SecondaryAuthenticationFactorDevicePresenceMonitoringMode?,
    deviceFriendlyName: String?,
    deviceModelNumber: String?,
    deviceConfigurationData: IBuffer?
  ): IAsyncOperation<SecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatus?>?

  @InterfaceMethod(2)
  public fun UnregisterDevicePresenceMonitoringAsync(deviceId: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun IsDevicePresenceMonitoringSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics(pointer.getPointer(0))

    public
        fun setValue(value: ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault :
      ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics {
    public val __312006701_Ptr: Pointer?

    public val _312006701_VtblPtr: Pointer?
      get() = __312006701_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterDevicePresenceMonitoringAsync(
      deviceId: String?,
      deviceInstancePath: String?,
      monitoringMode: SecondaryAuthenticationFactorDevicePresenceMonitoringMode?
    ): IAsyncOperation<SecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatus?>? {
      val fnPtr = _312006701_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__312006701_Ptr, marshalToNative(deviceId),
          marshalToNative(deviceInstancePath), marshalToNative(monitoringMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RegisterDevicePresenceMonitoringAsync(
      deviceId: String?,
      deviceInstancePath: String?,
      monitoringMode: SecondaryAuthenticationFactorDevicePresenceMonitoringMode?,
      deviceFriendlyName: String?,
      deviceModelNumber: String?,
      deviceConfigurationData: IBuffer?
    ): IAsyncOperation<SecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatus?>? {
      val fnPtr = _312006701_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatus?>>()
      val hr = fn.invokeHR(arrayOf(__312006701_Ptr, marshalToNative(deviceId),
          marshalToNative(deviceInstancePath), marshalToNative(monitoringMode),
          marshalToNative(deviceFriendlyName), marshalToNative(deviceModelNumber),
          marshalToNative(deviceConfigurationData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UnregisterDevicePresenceMonitoringAsync(deviceId: String?): IAsyncAction? {
      val fnPtr = _312006701_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__312006701_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun IsDevicePresenceMonitoringSupported(): Boolean {
      val fnPtr = _312006701_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__312006701_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __312006701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI :
      IABI<ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90499a197ef24523951ca417a24acf93")

    public override val layout: ValueLayout = ADDRESS

    public
        fun makeISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics(ptr: Pointer?):
        WithDefault =
        ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics(Pointer(address))
    }

    public override
        fun toNative(obj: ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__312006701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics):
        Array<ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics?> =
        (elements as
        Array<ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics?>).castToImpl<ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics,ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics?> =
        arrayOfNulls<ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics_Impl>(size)
        as Array<ISecondaryAuthenticationFactorDevicePresenceMonitoringRegistrationStatics?>
  }
}
