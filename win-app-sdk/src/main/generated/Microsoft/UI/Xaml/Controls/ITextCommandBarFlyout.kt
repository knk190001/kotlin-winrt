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

@ABIMarker(ITextCommandBarFlyout.ABI::class)
@Signature("{6d0f38a5-0eb3-5d73-8195-d2d89b76b0f7}")
@Guid("6d0f38a50eb35d738195d2d89b76b0f7")
@WinRTInterface("6d0f38a50eb35d738195d2d89b76b0f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextCommandBarFlyout.ByReference::class)
public interface ITextCommandBarFlyout : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextCommandBarFlyout> {
    public override fun getValue() = ABI.makeITextCommandBarFlyout(pointer.getPointer(0))

    public fun setValue(value: ITextCommandBarFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextCommandBarFlyout {
    public val __1813426295_Ptr: Pointer?

    public val _1813426295_VtblPtr: Pointer?
      get() = __1813426295_Ptr?.getPointer(0)
  }

  public class ITextCommandBarFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1813426295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextCommandBarFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d0f38a50eb35d738195d2d89b76b0f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextCommandBarFlyout(ptr: Pointer?): WithDefault =
        ITextCommandBarFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextCommandBarFlyout {
      val address = segment.toRawLongValue()
      return makeITextCommandBarFlyout(Pointer(address))
    }

    public override fun toNative(obj: ITextCommandBarFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1813426295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextCommandBarFlyout): Array<ITextCommandBarFlyout?> =
        (elements as
        Array<ITextCommandBarFlyout?>).castToImpl<ITextCommandBarFlyout,ITextCommandBarFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextCommandBarFlyout?> =
        arrayOfNulls<ITextCommandBarFlyout_Impl>(size) as Array<ITextCommandBarFlyout?>
  }
}
