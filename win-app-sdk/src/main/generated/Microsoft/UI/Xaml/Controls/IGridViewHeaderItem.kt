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

@ABIMarker(IGridViewHeaderItem.ABI::class)
@Signature("{2c90c3e0-3245-55d6-9d98-0fd9540e920f}")
@Guid("2c90c3e0324555d69d980fd9540e920f")
@WinRTInterface("2c90c3e0324555d69d980fd9540e920f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridViewHeaderItem.ByReference::class)
public interface IGridViewHeaderItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridViewHeaderItem> {
    public override fun getValue() = ABI.makeIGridViewHeaderItem(pointer.getPointer(0))

    public fun setValue(value: IGridViewHeaderItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridViewHeaderItem {
    public val __1148272306_Ptr: Pointer?

    public val _1148272306_VtblPtr: Pointer?
      get() = __1148272306_Ptr?.getPointer(0)
  }

  public class IGridViewHeaderItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1148272306_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridViewHeaderItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2c90c3e0324555d69d980fd9540e920f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridViewHeaderItem(ptr: Pointer?): WithDefault = IGridViewHeaderItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridViewHeaderItem {
      val address = segment.toRawLongValue()
      return makeIGridViewHeaderItem(Pointer(address))
    }

    public override fun toNative(obj: IGridViewHeaderItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1148272306_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridViewHeaderItem): Array<IGridViewHeaderItem?> =
        (elements as
        Array<IGridViewHeaderItem?>).castToImpl<IGridViewHeaderItem,IGridViewHeaderItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridViewHeaderItem?> =
        arrayOfNulls<IGridViewHeaderItem_Impl>(size) as Array<IGridViewHeaderItem?>
  }
}
