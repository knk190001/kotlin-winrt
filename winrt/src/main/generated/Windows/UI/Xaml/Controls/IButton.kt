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

@ABIMarker(IButton.ABI::class)
@Signature("{280335ae-5570-46c7-8e0b-602be71229a2}")
@Guid("280335ae557046c78e0b602be71229a2")
@WinRTInterface("280335ae557046c78e0b602be71229a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButton.ByReference::class)
public interface IButton : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IButton> {
    public override fun getValue() = ABI.makeIButton(pointer.getPointer(0))

    public fun setValue(value: IButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButton {
    public val __257556046_Ptr: Pointer?

    public val _257556046_VtblPtr: Pointer?
      get() = __257556046_Ptr?.getPointer(0)
  }

  public class IButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __257556046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("280335ae557046c78e0b602be71229a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButton(ptr: Pointer?): WithDefault = IButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButton {
      val address = segment.toRawLongValue()
      return makeIButton(Pointer(address))
    }

    public override fun toNative(obj: IButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__257556046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButton): Array<IButton?> = (elements as
        Array<IButton?>).castToImpl<IButton,IButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButton?> = arrayOfNulls<IButton_Impl>(size) as
        Array<IButton?>
  }
}
