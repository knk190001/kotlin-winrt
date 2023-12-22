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

@ABIMarker(IInkToolbarBallpointPenButton.ABI::class)
@Signature("{158329f8-1e99-3acc-910f-9da2d872ae12}")
@Guid("158329f81e993acc910f9da2d872ae12")
@WinRTInterface("158329f81e993acc910f9da2d872ae12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarBallpointPenButton.ByReference::class)
public interface IInkToolbarBallpointPenButton : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarBallpointPenButton> {
    public override fun getValue() = ABI.makeIInkToolbarBallpointPenButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarBallpointPenButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarBallpointPenButton {
    public val __1874142571_Ptr: Pointer?

    public val _1874142571_VtblPtr: Pointer?
      get() = __1874142571_Ptr?.getPointer(0)
  }

  public class IInkToolbarBallpointPenButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1874142571_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarBallpointPenButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("158329f81e993acc910f9da2d872ae12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarBallpointPenButton(ptr: Pointer?): WithDefault =
        IInkToolbarBallpointPenButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarBallpointPenButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarBallpointPenButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarBallpointPenButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1874142571_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarBallpointPenButton):
        Array<IInkToolbarBallpointPenButton?> = (elements as
        Array<IInkToolbarBallpointPenButton?>).castToImpl<IInkToolbarBallpointPenButton,IInkToolbarBallpointPenButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarBallpointPenButton?> =
        arrayOfNulls<IInkToolbarBallpointPenButton_Impl>(size) as
        Array<IInkToolbarBallpointPenButton?>
  }
}
