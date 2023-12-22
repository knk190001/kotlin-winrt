package Windows.UI.Xaml.Hosting

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
@Signature("{b6f1a676-cfe6-46ac-acf6-c4687bb65e60}")
@Guid("b6f1a676cfe646acacf6c4687bb65e60")
@WinRTInterface("b6f1a676cfe646acacf6c4687bb65e60")
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
    public val __474763252_Ptr: Pointer?

    public val _474763252_VtblPtr: Pointer?
      get() = __474763252_Ptr?.getPointer(0)
  }

  public class IElementCompositionPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __474763252_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElementCompositionPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6f1a676cfe646acacf6c4687bb65e60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElementCompositionPreview(ptr: Pointer?): WithDefault =
        IElementCompositionPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElementCompositionPreview {
      val address = segment.toRawLongValue()
      return makeIElementCompositionPreview(Pointer(address))
    }

    public override fun toNative(obj: IElementCompositionPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__474763252_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElementCompositionPreview):
        Array<IElementCompositionPreview?> = (elements as
        Array<IElementCompositionPreview?>).castToImpl<IElementCompositionPreview,IElementCompositionPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElementCompositionPreview?> =
        arrayOfNulls<IElementCompositionPreview_Impl>(size) as Array<IElementCompositionPreview?>
  }
}
