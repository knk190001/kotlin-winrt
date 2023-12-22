package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IPickerFlyoutBase.ABI::class)
@Signature("{8c2cc030-14fe-5fca-8ce3-e11a918632cc}")
@Guid("8c2cc03014fe5fca8ce3e11a918632cc")
@WinRTInterface("8c2cc03014fe5fca8ce3e11a918632cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerFlyoutBase.ByReference::class)
public interface IPickerFlyoutBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerFlyoutBase> {
    public override fun getValue() = ABI.makeIPickerFlyoutBase(pointer.getPointer(0))

    public fun setValue(value: IPickerFlyoutBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerFlyoutBase {
    public val __599168789_Ptr: Pointer?

    public val _599168789_VtblPtr: Pointer?
      get() = __599168789_Ptr?.getPointer(0)
  }

  public class IPickerFlyoutBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __599168789_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerFlyoutBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c2cc03014fe5fca8ce3e11a918632cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerFlyoutBase(ptr: Pointer?): WithDefault = IPickerFlyoutBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerFlyoutBase {
      val address = segment.toRawLongValue()
      return makeIPickerFlyoutBase(Pointer(address))
    }

    public override fun toNative(obj: IPickerFlyoutBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__599168789_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerFlyoutBase): Array<IPickerFlyoutBase?> = (elements
        as Array<IPickerFlyoutBase?>).castToImpl<IPickerFlyoutBase,IPickerFlyoutBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerFlyoutBase?> =
        arrayOfNulls<IPickerFlyoutBase_Impl>(size) as Array<IPickerFlyoutBase?>
  }
}
