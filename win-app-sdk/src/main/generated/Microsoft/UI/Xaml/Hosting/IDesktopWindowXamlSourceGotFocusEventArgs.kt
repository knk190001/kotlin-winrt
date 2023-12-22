package Microsoft.UI.Xaml.Hosting

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

@ABIMarker(IDesktopWindowXamlSourceGotFocusEventArgs.ABI::class)
@Signature("{cc63d863-2071-5f6b-aef9-c0ba35f3b8df}")
@Guid("cc63d86320715f6baef9c0ba35f3b8df")
@WinRTInterface("cc63d86320715f6baef9c0ba35f3b8df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopWindowXamlSourceGotFocusEventArgs.ByReference::class)
public interface IDesktopWindowXamlSourceGotFocusEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): XamlSourceFocusNavigationRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopWindowXamlSourceGotFocusEventArgs> {
    public override fun getValue() =
        ABI.makeIDesktopWindowXamlSourceGotFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDesktopWindowXamlSourceGotFocusEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopWindowXamlSourceGotFocusEventArgs {
    public val __1748507351_Ptr: Pointer?

    public val _1748507351_VtblPtr: Pointer?
      get() = __1748507351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): XamlSourceFocusNavigationRequest? {
      val fnPtr = _1748507351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__1748507351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationRequest>(result.getValue())
      return resultValue
    }
  }

  public class IDesktopWindowXamlSourceGotFocusEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1748507351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopWindowXamlSourceGotFocusEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc63d86320715f6baef9c0ba35f3b8df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopWindowXamlSourceGotFocusEventArgs(ptr: Pointer?): WithDefault =
        IDesktopWindowXamlSourceGotFocusEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDesktopWindowXamlSourceGotFocusEventArgs {
      val address = segment.toRawLongValue()
      return makeIDesktopWindowXamlSourceGotFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDesktopWindowXamlSourceGotFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1748507351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopWindowXamlSourceGotFocusEventArgs):
        Array<IDesktopWindowXamlSourceGotFocusEventArgs?> = (elements as
        Array<IDesktopWindowXamlSourceGotFocusEventArgs?>).castToImpl<IDesktopWindowXamlSourceGotFocusEventArgs,IDesktopWindowXamlSourceGotFocusEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopWindowXamlSourceGotFocusEventArgs?> =
        arrayOfNulls<IDesktopWindowXamlSourceGotFocusEventArgs_Impl>(size) as
        Array<IDesktopWindowXamlSourceGotFocusEventArgs?>
  }
}
