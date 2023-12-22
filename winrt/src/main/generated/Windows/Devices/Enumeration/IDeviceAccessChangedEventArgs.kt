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

@ABIMarker(IDeviceAccessChangedEventArgs.ABI::class)
@Signature("{deda0bcc-4f9d-4f58-9dba-a9bc800408d5}")
@Guid("deda0bcc4f9d4f589dbaa9bc800408d5")
@WinRTInterface("deda0bcc4f9d4f589dbaa9bc800408d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceAccessChangedEventArgs.ByReference::class)
public interface IDeviceAccessChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): DeviceAccessStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceAccessChangedEventArgs> {
    public override fun getValue() = ABI.makeIDeviceAccessChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDeviceAccessChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceAccessChangedEventArgs {
    public val __322955291_Ptr: Pointer?

    public val _322955291_VtblPtr: Pointer?
      get() = __322955291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): DeviceAccessStatus? {
      val fnPtr = _322955291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessStatus>()
      val hr = fn.invokeHR(arrayOf(__322955291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessStatus>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceAccessChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __322955291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceAccessChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("deda0bcc4f9d4f589dbaa9bc800408d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceAccessChangedEventArgs(ptr: Pointer?): WithDefault =
        IDeviceAccessChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceAccessChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDeviceAccessChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDeviceAccessChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__322955291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceAccessChangedEventArgs):
        Array<IDeviceAccessChangedEventArgs?> = (elements as
        Array<IDeviceAccessChangedEventArgs?>).castToImpl<IDeviceAccessChangedEventArgs,IDeviceAccessChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceAccessChangedEventArgs?> =
        arrayOfNulls<IDeviceAccessChangedEventArgs_Impl>(size) as
        Array<IDeviceAccessChangedEventArgs?>
  }
}
