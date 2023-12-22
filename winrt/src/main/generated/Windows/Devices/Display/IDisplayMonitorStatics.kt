package Windows.Devices.Display

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

@ABIMarker(IDisplayMonitorStatics.ABI::class)
@Signature("{6eae698f-a228-4c05-821d-b695d667de8e}")
@Guid("6eae698fa2284c05821db695d667de8e")
@WinRTInterface("6eae698fa2284c05821db695d667de8e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayMonitorStatics.ByReference::class)
public interface IDisplayMonitorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<DisplayMonitor?>?

  @InterfaceMethod(2)
  public fun FromInterfaceIdAsync(deviceInterfaceId: String?): IAsyncOperation<DisplayMonitor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayMonitorStatics> {
    public override fun getValue() = ABI.makeIDisplayMonitorStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayMonitorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayMonitorStatics {
    public val __980487178_Ptr: Pointer?

    public val _980487178_VtblPtr: Pointer?
      get() = __980487178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _980487178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__980487178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<DisplayMonitor?>? {
      val fnPtr = _980487178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DisplayMonitor?>>()
      val hr = fn.invokeHR(arrayOf(__980487178_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DisplayMonitor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromInterfaceIdAsync(deviceInterfaceId: String?):
        IAsyncOperation<DisplayMonitor?>? {
      val fnPtr = _980487178_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DisplayMonitor?>>()
      val hr = fn.invokeHR(arrayOf(__980487178_Ptr, marshalToNative(deviceInterfaceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DisplayMonitor?>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayMonitorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __980487178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayMonitorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6eae698fa2284c05821db695d667de8e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayMonitorStatics(ptr: Pointer?): WithDefault =
        IDisplayMonitorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayMonitorStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayMonitorStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayMonitorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__980487178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayMonitorStatics): Array<IDisplayMonitorStatics?> =
        (elements as
        Array<IDisplayMonitorStatics?>).castToImpl<IDisplayMonitorStatics,IDisplayMonitorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayMonitorStatics?> =
        arrayOfNulls<IDisplayMonitorStatics_Impl>(size) as Array<IDisplayMonitorStatics?>
  }
}
