package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceSelectedEventArgs.ABI::class)
@Signature("{269edade-1d2f-4940-8402-4156b81d3c77}")
@Guid("269edade1d2f494084024156b81d3c77")
@WinRTInterface("269edade1d2f494084024156b81d3c77")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceSelectedEventArgs.ByReference::class)
public interface IDeviceSelectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedDevice(): DeviceInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceSelectedEventArgs> {
    public override fun getValue() = ABI.makeIDeviceSelectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDeviceSelectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceSelectedEventArgs {
    public val __1248890216_Ptr: Pointer?

    public val _1248890216_VtblPtr: Pointer?
      get() = __1248890216_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedDevice(): DeviceInformation? {
      val fnPtr = _1248890216_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1248890216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceSelectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1248890216_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceSelectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("269edade1d2f494084024156b81d3c77")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceSelectedEventArgs(ptr: Pointer?): WithDefault =
        IDeviceSelectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceSelectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDeviceSelectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDeviceSelectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1248890216_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceSelectedEventArgs):
        Array<IDeviceSelectedEventArgs?> = (elements as
        Array<IDeviceSelectedEventArgs?>).castToImpl<IDeviceSelectedEventArgs,IDeviceSelectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceSelectedEventArgs?> =
        arrayOfNulls<IDeviceSelectedEventArgs_Impl>(size) as Array<IDeviceSelectedEventArgs?>
  }
}
