package Windows.Devices.Sensors

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

@ABIMarker(IProximitySensorReadingChangedEventArgs.ABI::class)
@Signature("{cfc2f366-c3e8-40fd-8cc3-67e289004938}")
@Guid("cfc2f366c3e840fd8cc367e289004938")
@WinRTInterface("cfc2f366c3e840fd8cc367e289004938")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProximitySensorReadingChangedEventArgs.ByReference::class)
public interface IProximitySensorReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): ProximitySensorReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProximitySensorReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIProximitySensorReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IProximitySensorReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProximitySensorReadingChangedEventArgs {
    public val __1284025214_Ptr: Pointer?

    public val _1284025214_VtblPtr: Pointer?
      get() = __1284025214_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): ProximitySensorReading? {
      val fnPtr = _1284025214_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProximitySensorReading>()
      val hr = fn.invokeHR(arrayOf(__1284025214_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProximitySensorReading>(result.getValue())
      return resultValue
    }
  }

  public class IProximitySensorReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1284025214_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProximitySensorReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cfc2f366c3e840fd8cc367e289004938")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProximitySensorReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IProximitySensorReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IProximitySensorReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIProximitySensorReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IProximitySensorReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1284025214_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProximitySensorReadingChangedEventArgs):
        Array<IProximitySensorReadingChangedEventArgs?> = (elements as
        Array<IProximitySensorReadingChangedEventArgs?>).castToImpl<IProximitySensorReadingChangedEventArgs,IProximitySensorReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProximitySensorReadingChangedEventArgs?> =
        arrayOfNulls<IProximitySensorReadingChangedEventArgs_Impl>(size) as
        Array<IProximitySensorReadingChangedEventArgs?>
  }
}
