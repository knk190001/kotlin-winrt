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

@ABIMarker(IFlipView.ABI::class)
@Signature("{a1582f68-3d7d-4d3b-b71d-488eed1e3493}")
@Guid("a1582f683d7d4d3bb71d488eed1e3493")
@WinRTInterface("a1582f683d7d4d3bb71d488eed1e3493")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlipView.ByReference::class)
public interface IFlipView : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlipView> {
    public override fun getValue() = ABI.makeIFlipView(pointer.getPointer(0))

    public fun setValue(value: IFlipView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlipView {
    public val __1362571470_Ptr: Pointer?

    public val _1362571470_VtblPtr: Pointer?
      get() = __1362571470_Ptr?.getPointer(0)
  }

  public class IFlipView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1362571470_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlipView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1582f683d7d4d3bb71d488eed1e3493")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlipView(ptr: Pointer?): WithDefault = IFlipView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlipView {
      val address = segment.toRawLongValue()
      return makeIFlipView(Pointer(address))
    }

    public override fun toNative(obj: IFlipView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1362571470_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlipView): Array<IFlipView?> = (elements as
        Array<IFlipView?>).castToImpl<IFlipView,IFlipView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlipView?> = arrayOfNulls<IFlipView_Impl>(size)
        as Array<IFlipView?>
  }
}
