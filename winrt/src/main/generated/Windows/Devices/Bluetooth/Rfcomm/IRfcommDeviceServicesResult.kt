package Windows.Devices.Bluetooth.Rfcomm

import Windows.Devices.Bluetooth.BluetoothError
import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRfcommDeviceServicesResult.ABI::class)
@Signature("{3b48388c-7ccf-488e-9625-d259a5732d55}")
@Guid("3b48388c7ccf488e9625d259a5732d55")
@WinRTInterface("3b48388c7ccf488e9625d259a5732d55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRfcommDeviceServicesResult.ByReference::class)
public interface IRfcommDeviceServicesResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): BluetoothError?

  @InterfaceMethod(1)
  public fun get_Services(): IVectorView<RfcommDeviceService?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRfcommDeviceServicesResult> {
    public override fun getValue() = ABI.makeIRfcommDeviceServicesResult(pointer.getPointer(0))

    public fun setValue(value: IRfcommDeviceServicesResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRfcommDeviceServicesResult {
    public val __154072606_Ptr: Pointer?

    public val _154072606_VtblPtr: Pointer?
      get() = __154072606_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): BluetoothError? {
      val fnPtr = _154072606_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothError>()
      val hr = fn.invokeHR(arrayOf(__154072606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothError>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Services(): IVectorView<RfcommDeviceService?>? {
      val fnPtr = _154072606_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<RfcommDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__154072606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<RfcommDeviceService?>>(result.getValue())
      return resultValue
    }
  }

  public class IRfcommDeviceServicesResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __154072606_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRfcommDeviceServicesResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b48388c7ccf488e9625d259a5732d55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRfcommDeviceServicesResult(ptr: Pointer?): WithDefault =
        IRfcommDeviceServicesResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRfcommDeviceServicesResult {
      val address = segment.toRawLongValue()
      return makeIRfcommDeviceServicesResult(Pointer(address))
    }

    public override fun toNative(obj: IRfcommDeviceServicesResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__154072606_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRfcommDeviceServicesResult):
        Array<IRfcommDeviceServicesResult?> = (elements as
        Array<IRfcommDeviceServicesResult?>).castToImpl<IRfcommDeviceServicesResult,IRfcommDeviceServicesResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRfcommDeviceServicesResult?> =
        arrayOfNulls<IRfcommDeviceServicesResult_Impl>(size) as Array<IRfcommDeviceServicesResult?>
  }
}
