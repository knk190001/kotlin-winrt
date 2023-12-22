package Windows.UI.Xaml.Controls.Primitives

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

@ABIMarker(IPivotHeaderItem.ABI::class)
@Signature("{594572c2-82aa-410b-9e55-fd8e2c98862d}")
@Guid("594572c282aa410b9e55fd8e2c98862d")
@WinRTInterface("594572c282aa410b9e55fd8e2c98862d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPivotHeaderItem.ByReference::class)
public interface IPivotHeaderItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPivotHeaderItem> {
    public override fun getValue() = ABI.makeIPivotHeaderItem(pointer.getPointer(0))

    public fun setValue(value: IPivotHeaderItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPivotHeaderItem {
    public val __1686756666_Ptr: Pointer?

    public val _1686756666_VtblPtr: Pointer?
      get() = __1686756666_Ptr?.getPointer(0)
  }

  public class IPivotHeaderItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1686756666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPivotHeaderItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("594572c282aa410b9e55fd8e2c98862d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPivotHeaderItem(ptr: Pointer?): WithDefault = IPivotHeaderItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPivotHeaderItem {
      val address = segment.toRawLongValue()
      return makeIPivotHeaderItem(Pointer(address))
    }

    public override fun toNative(obj: IPivotHeaderItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1686756666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPivotHeaderItem): Array<IPivotHeaderItem?> = (elements as
        Array<IPivotHeaderItem?>).castToImpl<IPivotHeaderItem,IPivotHeaderItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPivotHeaderItem?> =
        arrayOfNulls<IPivotHeaderItem_Impl>(size) as Array<IPivotHeaderItem?>
  }
}
