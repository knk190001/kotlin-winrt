package Windows.Security.Authentication.Identity.Provider

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryAuthenticationFactorRegistrationStatics.ABI::class)
@Signature("{1adf0f65-e3b7-4155-997f-b756ef65beba}")
@Guid("1adf0f65e3b74155997fb756ef65beba")
@WinRTInterface("1adf0f65e3b74155997fb756ef65beba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryAuthenticationFactorRegistrationStatics.ByReference::class)
public interface ISecondaryAuthenticationFactorRegistrationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStartRegisteringDeviceAsync(
    deviceId: String?,
    capabilities: SecondaryAuthenticationFactorDeviceCapabilities?,
    deviceFriendlyName: String?,
    deviceModelNumber: String?,
    deviceKey: IBuffer?,
    mutualAuthenticationKey: IBuffer?
  ): IAsyncOperation<SecondaryAuthenticationFactorRegistrationResult?>?

  @InterfaceMethod(1)
  public
      fun FindAllRegisteredDeviceInfoAsync(queryType: SecondaryAuthenticationFactorDeviceFindScope?):
      IAsyncOperation<IVectorView<SecondaryAuthenticationFactorInfo?>?>?

  @InterfaceMethod(2)
  public fun UnregisterDeviceAsync(deviceId: String?): IAsyncAction?

  @InterfaceMethod(3)
  public fun UpdateDeviceConfigurationDataAsync(deviceId: String?,
      deviceConfigurationData: IBuffer?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryAuthenticationFactorRegistrationStatics> {
    public override fun getValue() =
        ABI.makeISecondaryAuthenticationFactorRegistrationStatics(pointer.getPointer(0))

    public fun setValue(value: ISecondaryAuthenticationFactorRegistrationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryAuthenticationFactorRegistrationStatics {
    public val __940969684_Ptr: Pointer?

    public val _940969684_VtblPtr: Pointer?
      get() = __940969684_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStartRegisteringDeviceAsync(
      deviceId: String?,
      capabilities: SecondaryAuthenticationFactorDeviceCapabilities?,
      deviceFriendlyName: String?,
      deviceModelNumber: String?,
      deviceKey: IBuffer?,
      mutualAuthenticationKey: IBuffer?
    ): IAsyncOperation<SecondaryAuthenticationFactorRegistrationResult?>? {
      val fnPtr = _940969684_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<SecondaryAuthenticationFactorRegistrationResult?>>()
      val hr = fn.invokeHR(arrayOf(__940969684_Ptr, marshalToNative(deviceId),
          marshalToNative(capabilities), marshalToNative(deviceFriendlyName),
          marshalToNative(deviceModelNumber), marshalToNative(deviceKey),
          marshalToNative(mutualAuthenticationKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SecondaryAuthenticationFactorRegistrationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun FindAllRegisteredDeviceInfoAsync(queryType: SecondaryAuthenticationFactorDeviceFindScope?):
        IAsyncOperation<IVectorView<SecondaryAuthenticationFactorInfo?>?>? {
      val fnPtr = _940969684_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<SecondaryAuthenticationFactorInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__940969684_Ptr, marshalToNative(queryType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<SecondaryAuthenticationFactorInfo?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun UnregisterDeviceAsync(deviceId: String?): IAsyncAction? {
      val fnPtr = _940969684_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__940969684_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UpdateDeviceConfigurationDataAsync(deviceId: String?,
        deviceConfigurationData: IBuffer?): IAsyncAction? {
      val fnPtr = _940969684_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__940969684_Ptr, marshalToNative(deviceId),
          marshalToNative(deviceConfigurationData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryAuthenticationFactorRegistrationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __940969684_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryAuthenticationFactorRegistrationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1adf0f65e3b74155997fb756ef65beba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryAuthenticationFactorRegistrationStatics(ptr: Pointer?): WithDefault =
        ISecondaryAuthenticationFactorRegistrationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISecondaryAuthenticationFactorRegistrationStatics {
      val address = segment.toRawLongValue()
      return makeISecondaryAuthenticationFactorRegistrationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryAuthenticationFactorRegistrationStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__940969684_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryAuthenticationFactorRegistrationStatics):
        Array<ISecondaryAuthenticationFactorRegistrationStatics?> = (elements as
        Array<ISecondaryAuthenticationFactorRegistrationStatics?>).castToImpl<ISecondaryAuthenticationFactorRegistrationStatics,ISecondaryAuthenticationFactorRegistrationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISecondaryAuthenticationFactorRegistrationStatics?> =
        arrayOfNulls<ISecondaryAuthenticationFactorRegistrationStatics_Impl>(size) as
        Array<ISecondaryAuthenticationFactorRegistrationStatics?>
  }
}
