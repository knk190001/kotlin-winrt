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

@ABIMarker(IListView.ABI::class)
@Signature("{f6ce8c6d-fe96-41ad-a64a-c2b81c4af7f8}")
@Guid("f6ce8c6dfe9641ada64ac2b81c4af7f8")
@WinRTInterface("f6ce8c6dfe9641ada64ac2b81c4af7f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListView.ByReference::class)
public interface IListView : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IListView> {
    public override fun getValue() = ABI.makeIListView(pointer.getPointer(0))

    public fun setValue(value: IListView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListView {
    public val __856973439_Ptr: Pointer?

    public val _856973439_VtblPtr: Pointer?
      get() = __856973439_Ptr?.getPointer(0)
  }

  public class IListView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __856973439_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6ce8c6dfe9641ada64ac2b81c4af7f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListView(ptr: Pointer?): WithDefault = IListView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListView {
      val address = segment.toRawLongValue()
      return makeIListView(Pointer(address))
    }

    public override fun toNative(obj: IListView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__856973439_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListView): Array<IListView?> = (elements as
        Array<IListView?>).castToImpl<IListView,IListView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListView?> = arrayOfNulls<IListView_Impl>(size)
        as Array<IListView?>
  }
}
