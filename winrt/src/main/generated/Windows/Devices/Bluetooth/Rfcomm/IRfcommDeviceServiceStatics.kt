package Windows.Devices.Bluetooth.Rfcomm

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

@ABIMarker(IRfcommDeviceServiceStatics.ABI::class)
@Signature("{a4a149ef-626d-41ac-b253-87ac5c27e28a}")
@Guid("a4a149ef626d41acb25387ac5c27e28a")
@WinRTInterface("a4a149ef626d41acb25387ac5c27e28a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommDeviceServiceStatics.ByReference::class)
public interface IRfcommDeviceServiceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<RfcommDeviceService?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(serviceId: RfcommServiceId?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommDeviceServiceStatics> {
    public override fun getValue() = ABI.makeIRfcommDeviceServiceStatics(pointer.getPointer(0))

    public fun setValue(value: IRfcommDeviceServiceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommDeviceServiceStatics {
    public val __1506526381_Ptr: Pointer?

    public val _1506526381_VtblPtr: Pointer?
      get() = __1506526381_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<RfcommDeviceService?>? {
      val fnPtr = _1506526381_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RfcommDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__1506526381_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<RfcommDeviceService?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(serviceId: RfcommServiceId?): String? {
      val fnPtr = _1506526381_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1506526381_Ptr, marshalToNative(serviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRfcommDeviceServiceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1506526381_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommDeviceServiceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4a149ef626d41acb25387ac5c27e28a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommDeviceServiceStatics(ptr: Pointer?): WithDefault =
        IRfcommDeviceServiceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommDeviceServiceStatics {
      val address = segment.toRawLongValue()
      return makeIRfcommDeviceServiceStatics(Pointer(address))
    }

    public override fun toNative(obj: IRfcommDeviceServiceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1506526381_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommDeviceServiceStatics):
        Array<IRfcommDeviceServiceStatics?> = (elements as
        Array<IRfcommDeviceServiceStatics?>).castToImpl<IRfcommDeviceServiceStatics,IRfcommDeviceServiceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommDeviceServiceStatics?> =
        arrayOfNulls<IRfcommDeviceServiceStatics_Impl>(size) as Array<IRfcommDeviceServiceStatics?>
  }
}
