package Windows.UI.Xaml.Hosting

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

@ABIMarker(IDesktopWindowXamlSourceTakeFocusRequestedEventArgs.ABI::class)
@Signature("{fe61e4b9-a7af-52b3-bdb9-c3305c0b8df2}")
@Guid("fe61e4b9a7af52b3bdb9c3305c0b8df2")
@WinRTInterface("fe61e4b9a7af52b3bdb9c3305c0b8df2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopWindowXamlSourceTakeFocusRequestedEventArgs.ByReference::class)
public interface IDesktopWindowXamlSourceTakeFocusRequestedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Request(): XamlSourceFocusNavigationRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIDesktopWindowXamlSourceTakeFocusRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDesktopWindowXamlSourceTakeFocusRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopWindowXamlSourceTakeFocusRequestedEventArgs {
    public val __1021217553_Ptr: Pointer?

    public val _1021217553_VtblPtr: Pointer?
      get() = __1021217553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): XamlSourceFocusNavigationRequest? {
      val fnPtr = _1021217553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__1021217553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationRequest>(result.getValue())
      return resultValue
    }
  }

  public class IDesktopWindowXamlSourceTakeFocusRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021217553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe61e4b9a7af52b3bdb9c3305c0b8df2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopWindowXamlSourceTakeFocusRequestedEventArgs(ptr: Pointer?): WithDefault =
        IDesktopWindowXamlSourceTakeFocusRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDesktopWindowXamlSourceTakeFocusRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDesktopWindowXamlSourceTakeFocusRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDesktopWindowXamlSourceTakeFocusRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1021217553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopWindowXamlSourceTakeFocusRequestedEventArgs):
        Array<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs?> = (elements as
        Array<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs?>).castToImpl<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs,IDesktopWindowXamlSourceTakeFocusRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs?> =
        arrayOfNulls<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs_Impl>(size) as
        Array<IDesktopWindowXamlSourceTakeFocusRequestedEventArgs?>
  }
}
