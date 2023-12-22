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

@ABIMarker(IListViewHeaderItem.ABI::class)
@Signature("{e94366c8-64f5-5930-a325-b23aacdbce89}")
@Guid("e94366c864f55930a325b23aacdbce89")
@WinRTInterface("e94366c864f55930a325b23aacdbce89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewHeaderItem.ByReference::class)
public interface IListViewHeaderItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewHeaderItem> {
    public override fun getValue() = ABI.makeIListViewHeaderItem(pointer.getPointer(0))

    public fun setValue(value: IListViewHeaderItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewHeaderItem {
    public val __1296356854_Ptr: Pointer?

    public val _1296356854_VtblPtr: Pointer?
      get() = __1296356854_Ptr?.getPointer(0)
  }

  public class IListViewHeaderItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1296356854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewHeaderItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e94366c864f55930a325b23aacdbce89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewHeaderItem(ptr: Pointer?): WithDefault = IListViewHeaderItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewHeaderItem {
      val address = segment.toRawLongValue()
      return makeIListViewHeaderItem(Pointer(address))
    }

    public override fun toNative(obj: IListViewHeaderItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1296356854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewHeaderItem): Array<IListViewHeaderItem?> =
        (elements as
        Array<IListViewHeaderItem?>).castToImpl<IListViewHeaderItem,IListViewHeaderItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewHeaderItem?> =
        arrayOfNulls<IListViewHeaderItem_Impl>(size) as Array<IListViewHeaderItem?>
  }
}
