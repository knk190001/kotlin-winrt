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

@ABIMarker(IFlipViewItem.ABI::class)
@Signature("{56196565-ce2b-4bda-a36b-82a2b8b0d4c0}")
@Guid("56196565ce2b4bdaa36b82a2b8b0d4c0")
@WinRTInterface("56196565ce2b4bdaa36b82a2b8b0d4c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipViewItem.ByReference::class)
public interface IFlipViewItem : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlipViewItem>
      {
    public override fun getValue() = ABI.makeIFlipViewItem(pointer.getPointer(0))

    public fun setValue(value: IFlipViewItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipViewItem {
    public val __1919350527_Ptr: Pointer?

    public val _1919350527_VtblPtr: Pointer?
      get() = __1919350527_Ptr?.getPointer(0)
  }

  public class IFlipViewItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1919350527_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipViewItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56196565ce2b4bdaa36b82a2b8b0d4c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipViewItem(ptr: Pointer?): WithDefault = IFlipViewItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipViewItem {
      val address = segment.toRawLongValue()
      return makeIFlipViewItem(Pointer(address))
    }

    public override fun toNative(obj: IFlipViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1919350527_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipViewItem): Array<IFlipViewItem?> = (elements as
        Array<IFlipViewItem?>).castToImpl<IFlipViewItem,IFlipViewItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipViewItem?> =
        arrayOfNulls<IFlipViewItem_Impl>(size) as Array<IFlipViewItem?>
  }
}
