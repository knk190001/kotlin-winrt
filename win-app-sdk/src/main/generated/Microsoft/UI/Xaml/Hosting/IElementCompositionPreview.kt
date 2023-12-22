package Microsoft.UI.Xaml.Hosting

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

@ABIMarker(IElementCompositionPreview.ABI::class)
@Signature("{c8ad1ef4-a93f-5a25-85bd-7c498d9856d3}")
@Guid("c8ad1ef4a93f5a2585bd7c498d9856d3")
@WinRTInterface("c8ad1ef4a93f5a2585bd7c498d9856d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElementCompositionPreview.ByReference::class)
public interface IElementCompositionPreview : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElementCompositionPreview> {
    public override fun getValue() = ABI.makeIElementCompositionPreview(pointer.getPointer(0))

    public fun setValue(value: IElementCompositionPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElementCompositionPreview {
    public val __715771745_Ptr: Pointer?

    public val _715771745_VtblPtr: Pointer?
      get() = __715771745_Ptr?.getPointer(0)
  }

  public class IElementCompositionPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __715771745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementCompositionPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8ad1ef4a93f5a2585bd7c498d9856d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementCompositionPreview(ptr: Pointer?): WithDefault =
        IElementCompositionPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementCompositionPreview {
      val address = segment.toRawLongValue()
      return makeIElementCompositionPreview(Pointer(address))
    }

    public override fun toNative(obj: IElementCompositionPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__715771745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementCompositionPreview):
        Array<IElementCompositionPreview?> = (elements as
        Array<IElementCompositionPreview?>).castToImpl<IElementCompositionPreview,IElementCompositionPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementCompositionPreview?> =
        arrayOfNulls<IElementCompositionPreview_Impl>(size) as Array<IElementCompositionPreview?>
  }
}
