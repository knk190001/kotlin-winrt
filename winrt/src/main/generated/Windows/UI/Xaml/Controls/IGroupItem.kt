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

@ABIMarker(IGroupItem.ABI::class)
@Signature("{4ae8d5d1-7228-4a16-a61f-88c0e8f45c76}")
@Guid("4ae8d5d172284a16a61f88c0e8f45c76")
@WinRTInterface("4ae8d5d172284a16a61f88c0e8f45c76")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGroupItem.ByReference::class)
public interface IGroupItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGroupItem> {
    public override fun getValue() = ABI.makeIGroupItem(pointer.getPointer(0))

    public fun setValue(value: IGroupItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGroupItem {
    public val __545788310_Ptr: Pointer?

    public val _545788310_VtblPtr: Pointer?
      get() = __545788310_Ptr?.getPointer(0)
  }

  public class IGroupItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545788310_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGroupItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ae8d5d172284a16a61f88c0e8f45c76")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGroupItem(ptr: Pointer?): WithDefault = IGroupItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGroupItem {
      val address = segment.toRawLongValue()
      return makeIGroupItem(Pointer(address))
    }

    public override fun toNative(obj: IGroupItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545788310_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGroupItem): Array<IGroupItem?> = (elements as
        Array<IGroupItem?>).castToImpl<IGroupItem,IGroupItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGroupItem?> = arrayOfNulls<IGroupItem_Impl>(size)
        as Array<IGroupItem?>
  }
}
