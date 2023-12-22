package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.UIElement
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

@ABIMarker(IInkToolbarCustomToolButton.ABI::class)
@Signature("{9f98acd7-c605-4105-be10-3943a7c0da3c}")
@Guid("9f98acd7c6054105be103943a7c0da3c")
@WinRTInterface("9f98acd7c6054105be103943a7c0da3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarCustomToolButton.ByReference::class)
public interface IInkToolbarCustomToolButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConfigurationContent(): UIElement?

  @InterfaceMethod(1)
  public fun put_ConfigurationContent(value: UIElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarCustomToolButton> {
    public override fun getValue() = ABI.makeIInkToolbarCustomToolButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarCustomToolButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarCustomToolButton {
    public val __1545068844_Ptr: Pointer?

    public val _1545068844_VtblPtr: Pointer?
      get() = __1545068844_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConfigurationContent(): UIElement? {
      val fnPtr = _1545068844_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1545068844_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ConfigurationContent(value: UIElement?): Unit {
      val fnPtr = _1545068844_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1545068844_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkToolbarCustomToolButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1545068844_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarCustomToolButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f98acd7c6054105be103943a7c0da3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarCustomToolButton(ptr: Pointer?): WithDefault =
        IInkToolbarCustomToolButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarCustomToolButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarCustomToolButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarCustomToolButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1545068844_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarCustomToolButton):
        Array<IInkToolbarCustomToolButton?> = (elements as
        Array<IInkToolbarCustomToolButton?>).castToImpl<IInkToolbarCustomToolButton,IInkToolbarCustomToolButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarCustomToolButton?> =
        arrayOfNulls<IInkToolbarCustomToolButton_Impl>(size) as Array<IInkToolbarCustomToolButton?>
  }
}
