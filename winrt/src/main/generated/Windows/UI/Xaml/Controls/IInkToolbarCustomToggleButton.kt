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

@ABIMarker(IInkToolbarCustomToggleButton.ABI::class)
@Signature("{550c4d84-4f54-4fbe-b12b-e0a50aab0d05}")
@Guid("550c4d844f544fbeb12be0a50aab0d05")
@WinRTInterface("550c4d844f544fbeb12be0a50aab0d05")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarCustomToggleButton.ByReference::class)
public interface IInkToolbarCustomToggleButton : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarCustomToggleButton> {
    public override fun getValue() = ABI.makeIInkToolbarCustomToggleButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarCustomToggleButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarCustomToggleButton {
    public val __1790022296_Ptr: Pointer?

    public val _1790022296_VtblPtr: Pointer?
      get() = __1790022296_Ptr?.getPointer(0)
  }

  public class IInkToolbarCustomToggleButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1790022296_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarCustomToggleButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("550c4d844f544fbeb12be0a50aab0d05")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarCustomToggleButton(ptr: Pointer?): WithDefault =
        IInkToolbarCustomToggleButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarCustomToggleButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarCustomToggleButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarCustomToggleButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1790022296_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarCustomToggleButton):
        Array<IInkToolbarCustomToggleButton?> = (elements as
        Array<IInkToolbarCustomToggleButton?>).castToImpl<IInkToolbarCustomToggleButton,IInkToolbarCustomToggleButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarCustomToggleButton?> =
        arrayOfNulls<IInkToolbarCustomToggleButton_Impl>(size) as
        Array<IInkToolbarCustomToggleButton?>
  }
}
