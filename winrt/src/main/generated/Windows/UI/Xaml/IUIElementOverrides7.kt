package Windows.UI.Xaml

import Windows.Foundation.Collections.IIterable
import Windows.UI.Xaml.Input.ProcessKeyboardAcceleratorEventArgs
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

@ABIMarker(IUIElementOverrides7.ABI::class)
@Signature("{b97f7f68-c29b-4c99-a1c3-952619d6e720}")
@Guid("b97f7f68c29b4c99a1c3952619d6e720")
@WinRTInterface("b97f7f68c29b4c99a1c3952619d6e720")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementOverrides7.ByReference::class)
public interface IUIElementOverrides7 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetChildrenInTabFocusOrder(): IIterable<DependencyObject?>?

  @InterfaceMethod(1)
  public fun OnProcessKeyboardAccelerators(args: ProcessKeyboardAcceleratorEventArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementOverrides7> {
    public override fun getValue() = ABI.makeIUIElementOverrides7(pointer.getPointer(0))

    public fun setValue(value: IUIElementOverrides7_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementOverrides7 {
    public val __56859802_Ptr: Pointer?

    public val _56859802_VtblPtr: Pointer?
      get() = __56859802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetChildrenInTabFocusOrder(): IIterable<DependencyObject?>? {
      val fnPtr = _56859802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<DependencyObject?>>()
      val hr = fn.invokeHR(arrayOf(__56859802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<DependencyObject?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun OnProcessKeyboardAccelerators(args: ProcessKeyboardAcceleratorEventArgs?):
        Unit {
      val fnPtr = _56859802_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56859802_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUIElementOverrides7_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __56859802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementOverrides7, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b97f7f68c29b4c99a1c3952619d6e720")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementOverrides7(ptr: Pointer?): WithDefault = IUIElementOverrides7_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementOverrides7 {
      val address = segment.toRawLongValue()
      return makeIUIElementOverrides7(Pointer(address))
    }

    public override fun toNative(obj: IUIElementOverrides7): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__56859802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementOverrides7): Array<IUIElementOverrides7?> =
        (elements as
        Array<IUIElementOverrides7?>).castToImpl<IUIElementOverrides7,IUIElementOverrides7_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementOverrides7?> =
        arrayOfNulls<IUIElementOverrides7_Impl>(size) as Array<IUIElementOverrides7?>
  }
}
