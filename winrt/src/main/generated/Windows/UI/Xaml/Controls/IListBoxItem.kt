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

@ABIMarker(IListBoxItem.ABI::class)
@Signature("{43c13323-6edf-4e4b-b6b2-3a93eec41d95}")
@Guid("43c133236edf4e4bb6b23a93eec41d95")
@WinRTInterface("43c133236edf4e4bb6b23a93eec41d95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListBoxItem.ByReference::class)
public interface IListBoxItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListBoxItem> {
    public override fun getValue() = ABI.makeIListBoxItem(pointer.getPointer(0))

    public fun setValue(value: IListBoxItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListBoxItem {
    public val __427975524_Ptr: Pointer?

    public val _427975524_VtblPtr: Pointer?
      get() = __427975524_Ptr?.getPointer(0)
  }

  public class IListBoxItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __427975524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListBoxItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43c133236edf4e4bb6b23a93eec41d95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListBoxItem(ptr: Pointer?): WithDefault = IListBoxItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListBoxItem {
      val address = segment.toRawLongValue()
      return makeIListBoxItem(Pointer(address))
    }

    public override fun toNative(obj: IListBoxItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__427975524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListBoxItem): Array<IListBoxItem?> = (elements as
        Array<IListBoxItem?>).castToImpl<IListBoxItem,IListBoxItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListBoxItem?> =
        arrayOfNulls<IListBoxItem_Impl>(size) as Array<IListBoxItem?>
  }
}
