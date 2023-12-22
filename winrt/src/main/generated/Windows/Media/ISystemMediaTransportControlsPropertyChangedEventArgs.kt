package Windows.Media

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

@ABIMarker(ISystemMediaTransportControlsPropertyChangedEventArgs.ABI::class)
@Signature("{d0ca0936-339b-4cb3-8eeb-737607f56e08}")
@Guid("d0ca0936339b4cb38eeb737607f56e08")
@WinRTInterface("d0ca0936339b4cb38eeb737607f56e08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    ISystemMediaTransportControlsPropertyChangedEventArgs.ByReference::class)
public interface ISystemMediaTransportControlsPropertyChangedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Property(): SystemMediaTransportControlsProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMediaTransportControlsPropertyChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISystemMediaTransportControlsPropertyChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISystemMediaTransportControlsPropertyChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMediaTransportControlsPropertyChangedEventArgs {
    public val __684866034_Ptr: Pointer?

    public val _684866034_VtblPtr: Pointer?
      get() = __684866034_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Property(): SystemMediaTransportControlsProperty? {
      val fnPtr = _684866034_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMediaTransportControlsProperty>()
      val hr = fn.invokeHR(arrayOf(__684866034_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemMediaTransportControlsProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISystemMediaTransportControlsPropertyChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __684866034_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMediaTransportControlsPropertyChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0ca0936339b4cb38eeb737607f56e08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMediaTransportControlsPropertyChangedEventArgs(ptr: Pointer?): WithDefault
        = ISystemMediaTransportControlsPropertyChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISystemMediaTransportControlsPropertyChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISystemMediaTransportControlsPropertyChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISystemMediaTransportControlsPropertyChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__684866034_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMediaTransportControlsPropertyChangedEventArgs):
        Array<ISystemMediaTransportControlsPropertyChangedEventArgs?> = (elements as
        Array<ISystemMediaTransportControlsPropertyChangedEventArgs?>).castToImpl<ISystemMediaTransportControlsPropertyChangedEventArgs,ISystemMediaTransportControlsPropertyChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISystemMediaTransportControlsPropertyChangedEventArgs?> =
        arrayOfNulls<ISystemMediaTransportControlsPropertyChangedEventArgs_Impl>(size) as
        Array<ISystemMediaTransportControlsPropertyChangedEventArgs?>
  }
}
