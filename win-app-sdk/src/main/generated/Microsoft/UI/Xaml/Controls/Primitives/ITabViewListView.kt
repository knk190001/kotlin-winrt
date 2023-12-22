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

@ABIMarker(ITabViewListView.ABI::class)
@Signature("{ec48efb5-2cb3-562b-921c-e554923ce1d5}")
@Guid("ec48efb52cb3562b921ce554923ce1d5")
@WinRTInterface("ec48efb52cb3562b921ce554923ce1d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITabViewListView.ByReference::class)
public interface ITabViewListView : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITabViewListView> {
    public override fun getValue() = ABI.makeITabViewListView(pointer.getPointer(0))

    public fun setValue(value: ITabViewListView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITabViewListView {
    public val __2110679532_Ptr: Pointer?

    public val _2110679532_VtblPtr: Pointer?
      get() = __2110679532_Ptr?.getPointer(0)
  }

  public class ITabViewListView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2110679532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITabViewListView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec48efb52cb3562b921ce554923ce1d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITabViewListView(ptr: Pointer?): WithDefault = ITabViewListView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITabViewListView {
      val address = segment.toRawLongValue()
      return makeITabViewListView(Pointer(address))
    }

    public override fun toNative(obj: ITabViewListView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2110679532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITabViewListView): Array<ITabViewListView?> = (elements as
        Array<ITabViewListView?>).castToImpl<ITabViewListView,ITabViewListView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITabViewListView?> =
        arrayOfNulls<ITabViewListView_Impl>(size) as Array<ITabViewListView?>
  }
}
