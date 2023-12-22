package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkToolbarHighlighterButton.ABI::class)
@Signature("{0b3cc15b-7abf-487e-acc1-5b5048fee6d2}")
@Guid("0b3cc15b7abf487eacc15b5048fee6d2")
@WinRTInterface("0b3cc15b7abf487eacc15b5048fee6d2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarHighlighterButton.ByReference::class)
public interface IInkToolbarHighlighterButton : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarHighlighterButton> {
    public override fun getValue() = ABI.makeIInkToolbarHighlighterButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarHighlighterButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarHighlighterButton {
    public val __1907906850_Ptr: Pointer?

    public val _1907906850_VtblPtr: Pointer?
      get() = __1907906850_Ptr?.getPointer(0)
  }

  public class IInkToolbarHighlighterButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1907906850_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarHighlighterButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b3cc15b7abf487eacc15b5048fee6d2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarHighlighterButton(ptr: Pointer?): WithDefault =
        IInkToolbarHighlighterButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarHighlighterButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarHighlighterButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarHighlighterButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1907906850_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarHighlighterButton):
        Array<IInkToolbarHighlighterButton?> = (elements as
        Array<IInkToolbarHighlighterButton?>).castToImpl<IInkToolbarHighlighterButton,IInkToolbarHighlighterButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarHighlighterButton?> =
        arrayOfNulls<IInkToolbarHighlighterButton_Impl>(size) as
        Array<IInkToolbarHighlighterButton?>
  }
}
