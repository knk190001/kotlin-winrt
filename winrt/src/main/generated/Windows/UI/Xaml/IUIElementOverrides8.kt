package Windows.UI.Xaml

import Windows.UI.Xaml.Input.KeyboardAcceleratorInvokedEventArgs
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

@ABIMarker(IUIElementOverrides8.ABI::class)
@Signature("{4a5a645c-548d-48cf-b998-7844d6e235a1}")
@Guid("4a5a645c548d48cfb9987844d6e235a1")
@WinRTInterface("4a5a645c548d48cfb9987844d6e235a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementOverrides8.ByReference::class)
public interface IUIElementOverrides8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnKeyboardAcceleratorInvoked(args: KeyboardAcceleratorInvokedEventArgs?): Unit

  @InterfaceMethod(1)
  public fun OnBringIntoViewRequested(e: BringIntoViewRequestedEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementOverrides8> {
    public override fun getValue() = ABI.makeIUIElementOverrides8(pointer.getPointer(0))

    public fun setValue(value: IUIElementOverrides8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementOverrides8 {
    public val __56859801_Ptr: Pointer?

    public val _56859801_VtblPtr: Pointer?
      get() = __56859801_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnKeyboardAcceleratorInvoked(args: KeyboardAcceleratorInvokedEventArgs?):
        Unit {
      val fnPtr = _56859801_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56859801_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnBringIntoViewRequested(e: BringIntoViewRequestedEventArgs?): Unit {
      val fnPtr = _56859801_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56859801_Ptr, marshalToNative(e),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElementOverrides8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __56859801_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementOverrides8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a5a645c548d48cfb9987844d6e235a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementOverrides8(ptr: Pointer?): WithDefault = IUIElementOverrides8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementOverrides8 {
      val address = segment.toRawLongValue()
      return makeIUIElementOverrides8(Pointer(address))
    }

    public override fun toNative(obj: IUIElementOverrides8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__56859801_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementOverrides8): Array<IUIElementOverrides8?> =
        (elements as
        Array<IUIElementOverrides8?>).castToImpl<IUIElementOverrides8,IUIElementOverrides8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementOverrides8?> =
        arrayOfNulls<IUIElementOverrides8_Impl>(size) as Array<IUIElementOverrides8?>
  }
}
