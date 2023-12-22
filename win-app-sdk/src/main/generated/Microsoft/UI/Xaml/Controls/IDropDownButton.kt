package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IDropDownButton.ABI::class)
@Signature("{c1e9fa91-4f95-5796-8a7b-3b7594a12c69}")
@Guid("c1e9fa914f9557968a7b3b7594a12c69")
@WinRTInterface("c1e9fa914f9557968a7b3b7594a12c69")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDropDownButton.ByReference::class)
public interface IDropDownButton : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDropDownButton> {
    public override fun getValue() = ABI.makeIDropDownButton(pointer.getPointer(0))

    public fun setValue(value: IDropDownButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDropDownButton {
    public val __1892403274_Ptr: Pointer?

    public val _1892403274_VtblPtr: Pointer?
      get() = __1892403274_Ptr?.getPointer(0)
  }

  public class IDropDownButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1892403274_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDropDownButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c1e9fa914f9557968a7b3b7594a12c69")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDropDownButton(ptr: Pointer?): WithDefault = IDropDownButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDropDownButton {
      val address = segment.toRawLongValue()
      return makeIDropDownButton(Pointer(address))
    }

    public override fun toNative(obj: IDropDownButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1892403274_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDropDownButton): Array<IDropDownButton?> = (elements as
        Array<IDropDownButton?>).castToImpl<IDropDownButton,IDropDownButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDropDownButton?> =
        arrayOfNulls<IDropDownButton_Impl>(size) as Array<IDropDownButton?>
  }
}
