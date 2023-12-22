package Windows.UI.Core.Preview

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

@ABIMarker(ICoreAppWindowPreview.ABI::class)
@Signature("{a4f6e665-365e-5fde-87a5-9543c3a15aa8}")
@Guid("a4f6e665365e5fde87a59543c3a15aa8")
@WinRTInterface("a4f6e665365e5fde87a59543c3a15aa8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreAppWindowPreview.ByReference::class)
public interface ICoreAppWindowPreview : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreAppWindowPreview> {
    public override fun getValue() = ABI.makeICoreAppWindowPreview(pointer.getPointer(0))

    public fun setValue(value: ICoreAppWindowPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreAppWindowPreview {
    public val __6733385_Ptr: Pointer?

    public val _6733385_VtblPtr: Pointer?
      get() = __6733385_Ptr?.getPointer(0)
  }

  public class ICoreAppWindowPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __6733385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreAppWindowPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4f6e665365e5fde87a59543c3a15aa8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreAppWindowPreview(ptr: Pointer?): WithDefault =
        ICoreAppWindowPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreAppWindowPreview {
      val address = segment.toRawLongValue()
      return makeICoreAppWindowPreview(Pointer(address))
    }

    public override fun toNative(obj: ICoreAppWindowPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__6733385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreAppWindowPreview): Array<ICoreAppWindowPreview?> =
        (elements as
        Array<ICoreAppWindowPreview?>).castToImpl<ICoreAppWindowPreview,ICoreAppWindowPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreAppWindowPreview?> =
        arrayOfNulls<ICoreAppWindowPreview_Impl>(size) as Array<ICoreAppWindowPreview?>
  }
}
