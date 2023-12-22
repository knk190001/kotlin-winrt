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

@ABIMarker(IInkToolbarPencilButton.ABI::class)
@Signature("{5b112832-1984-4148-9f25-382b35db087f}")
@Guid("5b112832198441489f25382b35db087f")
@WinRTInterface("5b112832198441489f25382b35db087f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarPencilButton.ByReference::class)
public interface IInkToolbarPencilButton : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarPencilButton> {
    public override fun getValue() = ABI.makeIInkToolbarPencilButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarPencilButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarPencilButton {
    public val __1509419792_Ptr: Pointer?

    public val _1509419792_VtblPtr: Pointer?
      get() = __1509419792_Ptr?.getPointer(0)
  }

  public class IInkToolbarPencilButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1509419792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarPencilButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b112832198441489f25382b35db087f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarPencilButton(ptr: Pointer?): WithDefault =
        IInkToolbarPencilButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarPencilButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarPencilButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarPencilButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1509419792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarPencilButton): Array<IInkToolbarPencilButton?>
        = (elements as
        Array<IInkToolbarPencilButton?>).castToImpl<IInkToolbarPencilButton,IInkToolbarPencilButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarPencilButton?> =
        arrayOfNulls<IInkToolbarPencilButton_Impl>(size) as Array<IInkToolbarPencilButton?>
  }
}
