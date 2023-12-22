package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandModem.ABI::class)
@Signature("{d0356912-e9f9-4f67-a03d-43189a316bf1}")
@Guid("d0356912e9f94f67a03d43189a316bf1")
@WinRTInterface("d0356912e9f94f67a03d43189a316bf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandModem.ByReference::class)
public interface IMobileBroadbandModem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentAccount(): MobileBroadbandAccount?

  @InterfaceMethod(1)
  public fun get_DeviceInformation(): MobileBroadbandDeviceInformation?

  @InterfaceMethod(2)
  public fun get_MaxDeviceServiceCommandSizeInBytes(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_MaxDeviceServiceDataSizeInBytes(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_DeviceServices(): IVectorView<MobileBroadbandDeviceServiceInformation?>?

  @InterfaceMethod(5)
  public fun GetDeviceService(deviceServiceId: com.sun.jna.platform.win32.Guid.GUID?):
      MobileBroadbandDeviceService?

  @InterfaceMethod(6)
  public fun get_IsResetSupported(): Boolean

  @InterfaceMethod(7)
  public fun ResetAsync(): IAsyncAction?

  @InterfaceMethod(8)
  public fun GetCurrentConfigurationAsync(): IAsyncOperation<MobileBroadbandModemConfiguration?>?

  @InterfaceMethod(9)
  public fun get_CurrentNetwork(): MobileBroadbandNetwork?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandModem> {
    public override fun getValue() = ABI.makeIMobileBroadbandModem(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandModem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandModem {
    public val __240854638_Ptr: Pointer?

    public val _240854638_VtblPtr: Pointer?
      get() = __240854638_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentAccount(): MobileBroadbandAccount? {
      val fnPtr = _240854638_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandAccount>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandAccount>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceInformation(): MobileBroadbandDeviceInformation? {
      val fnPtr = _240854638_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandDeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandDeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaxDeviceServiceCommandSizeInBytes(): WinDef.UINT {
      val fnPtr = _240854638_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_MaxDeviceServiceDataSizeInBytes(): WinDef.UINT {
      val fnPtr = _240854638_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_DeviceServices():
        IVectorView<MobileBroadbandDeviceServiceInformation?>? {
      val fnPtr = _240854638_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandDeviceServiceInformation?>>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MobileBroadbandDeviceServiceInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetDeviceService(deviceServiceId: com.sun.jna.platform.win32.Guid.GUID?):
        MobileBroadbandDeviceService? {
      val fnPtr = _240854638_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandDeviceService>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr, marshalToNative(deviceServiceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandDeviceService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsResetSupported(): Boolean {
      val fnPtr = _240854638_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun ResetAsync(): IAsyncAction? {
      val fnPtr = _240854638_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetCurrentConfigurationAsync():
        IAsyncOperation<MobileBroadbandModemConfiguration?>? {
      val fnPtr = _240854638_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandModemConfiguration?>>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandModemConfiguration?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_CurrentNetwork(): MobileBroadbandNetwork? {
      val fnPtr = _240854638_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandNetwork>()
      val hr = fn.invokeHR(arrayOf(__240854638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandNetwork>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandModem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __240854638_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandModem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0356912e9f94f67a03d43189a316bf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandModem(ptr: Pointer?): WithDefault =
        IMobileBroadbandModem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandModem {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandModem(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandModem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__240854638_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandModem): Array<IMobileBroadbandModem?> =
        (elements as
        Array<IMobileBroadbandModem?>).castToImpl<IMobileBroadbandModem,IMobileBroadbandModem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandModem?> =
        arrayOfNulls<IMobileBroadbandModem_Impl>(size) as Array<IMobileBroadbandModem?>
  }
}
