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

@ABIMarker(IInkToolbarEraserButton.ABI::class)
@Signature("{4cbdb92e-5f5e-4b35-a41c-16ffb0283bc0}")
@Guid("4cbdb92e5f5e4b35a41c16ffb0283bc0")
@WinRTInterface("4cbdb92e5f5e4b35a41c16ffb0283bc0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarEraserButton.ByReference::class)
public interface IInkToolbarEraserButton : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarEraserButton> {
    public override fun getValue() = ABI.makeIInkToolbarEraserButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarEraserButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarEraserButton {
    public val __257934671_Ptr: Pointer?

    public val _257934671_VtblPtr: Pointer?
      get() = __257934671_Ptr?.getPointer(0)
  }

  public class IInkToolbarEraserButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __257934671_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarEraserButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4cbdb92e5f5e4b35a41c16ffb0283bc0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarEraserButton(ptr: Pointer?): WithDefault =
        IInkToolbarEraserButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarEraserButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarEraserButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarEraserButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__257934671_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarEraserButton): Array<IInkToolbarEraserButton?>
        = (elements as
        Array<IInkToolbarEraserButton?>).castToImpl<IInkToolbarEraserButton,IInkToolbarEraserButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarEraserButton?> =
        arrayOfNulls<IInkToolbarEraserButton_Impl>(size) as Array<IInkToolbarEraserButton?>
  }
}
