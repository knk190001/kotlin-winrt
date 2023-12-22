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

@ABIMarker(ISystemMediaTransportControlsButtonPressedEventArgs.ABI::class)
@Signature("{b7f47116-a56f-4dc8-9e11-92031f4a87c2}")
@Guid("b7f47116a56f4dc89e1192031f4a87c2")
@WinRTInterface("b7f47116a56f4dc89e1192031f4a87c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMediaTransportControlsButtonPressedEventArgs.ByReference::class)
public interface ISystemMediaTransportControlsButtonPressedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Button(): SystemMediaTransportControlsButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMediaTransportControlsButtonPressedEventArgs> {
    public override fun getValue() =
        ABI.makeISystemMediaTransportControlsButtonPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISystemMediaTransportControlsButtonPressedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMediaTransportControlsButtonPressedEventArgs {
    public val __906969633_Ptr: Pointer?

    public val _906969633_VtblPtr: Pointer?
      get() = __906969633_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Button(): SystemMediaTransportControlsButton? {
      val fnPtr = _906969633_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMediaTransportControlsButton>()
      val hr = fn.invokeHR(arrayOf(__906969633_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemMediaTransportControlsButton>(result.getValue())
      return resultValue
    }
  }

  public class ISystemMediaTransportControlsButtonPressedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __906969633_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMediaTransportControlsButtonPressedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7f47116a56f4dc89e1192031f4a87c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMediaTransportControlsButtonPressedEventArgs(ptr: Pointer?): WithDefault =
        ISystemMediaTransportControlsButtonPressedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISystemMediaTransportControlsButtonPressedEventArgs {
      val address = segment.toRawLongValue()
      return makeISystemMediaTransportControlsButtonPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISystemMediaTransportControlsButtonPressedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__906969633_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMediaTransportControlsButtonPressedEventArgs):
        Array<ISystemMediaTransportControlsButtonPressedEventArgs?> = (elements as
        Array<ISystemMediaTransportControlsButtonPressedEventArgs?>).castToImpl<ISystemMediaTransportControlsButtonPressedEventArgs,ISystemMediaTransportControlsButtonPressedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISystemMediaTransportControlsButtonPressedEventArgs?> =
        arrayOfNulls<ISystemMediaTransportControlsButtonPressedEventArgs_Impl>(size) as
        Array<ISystemMediaTransportControlsButtonPressedEventArgs?>
  }
}
