package Windows.Devices.Pwm

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

@ABIMarker(IPwmControllerStatics3.ABI::class)
@Signature("{b2581871-0229-4344-ae3f-9b7cd0e66b94}")
@Guid("b258187102294344ae3f9b7cd0e66b94")
@WinRTInterface("b258187102294344ae3f9b7cd0e66b94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPwmControllerStatics3.ByReference::class)
public interface IPwmControllerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(friendlyName: String?): String?

  @InterfaceMethod(2)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<PwmController?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPwmControllerStatics3> {
    public override fun getValue() = ABI.makeIPwmControllerStatics3(pointer.getPointer(0))

    public fun setValue(value: IPwmControllerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPwmControllerStatics3 {
    public val __929153489_Ptr: Pointer?

    public val _929153489_VtblPtr: Pointer?
      get() = __929153489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _929153489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__929153489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(friendlyName: String?): String? {
      val fnPtr = _929153489_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__929153489_Ptr, marshalToNative(friendlyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<PwmController?>? {
      val fnPtr = _929153489_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PwmController?>>()
      val hr = fn.invokeHR(arrayOf(__929153489_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PwmController?>>(result.getValue())
      return resultValue
    }
  }

  public class IPwmControllerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __929153489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPwmControllerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b258187102294344ae3f9b7cd0e66b94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPwmControllerStatics3(ptr: Pointer?): WithDefault =
        IPwmControllerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPwmControllerStatics3 {
      val address = segment.toRawLongValue()
      return makeIPwmControllerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IPwmControllerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__929153489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPwmControllerStatics3): Array<IPwmControllerStatics3?> =
        (elements as
        Array<IPwmControllerStatics3?>).castToImpl<IPwmControllerStatics3,IPwmControllerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPwmControllerStatics3?> =
        arrayOfNulls<IPwmControllerStatics3_Impl>(size) as Array<IPwmControllerStatics3?>
  }
}
