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

@ABIMarker(IListViewBaseHeaderItem.ABI::class)
@Signature("{6d0ded27-0d19-4091-8917-ce7c85c1e630}")
@Guid("6d0ded270d1940918917ce7c85c1e630")
@WinRTInterface("6d0ded270d1940918917ce7c85c1e630")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseHeaderItem.ByReference::class)
public interface IListViewBaseHeaderItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseHeaderItem> {
    public override fun getValue() = ABI.makeIListViewBaseHeaderItem(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseHeaderItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseHeaderItem {
    public val __699599024_Ptr: Pointer?

    public val _699599024_VtblPtr: Pointer?
      get() = __699599024_Ptr?.getPointer(0)
  }

  public class IListViewBaseHeaderItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __699599024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseHeaderItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d0ded270d1940918917ce7c85c1e630")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseHeaderItem(ptr: Pointer?): WithDefault =
        IListViewBaseHeaderItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseHeaderItem {
      val address = segment.toRawLongValue()
      return makeIListViewBaseHeaderItem(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseHeaderItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__699599024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseHeaderItem): Array<IListViewBaseHeaderItem?>
        = (elements as
        Array<IListViewBaseHeaderItem?>).castToImpl<IListViewBaseHeaderItem,IListViewBaseHeaderItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseHeaderItem?> =
        arrayOfNulls<IListViewBaseHeaderItem_Impl>(size) as Array<IListViewBaseHeaderItem?>
  }
}
