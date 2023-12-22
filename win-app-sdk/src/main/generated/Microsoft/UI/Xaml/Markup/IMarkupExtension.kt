package Microsoft.UI.Xaml.Markup

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

@ABIMarker(IMarkupExtension.ABI::class)
@Signature("{c355371e-091d-5136-af4a-baf5e00616bd}")
@Guid("c355371e091d5136af4abaf5e00616bd")
@WinRTInterface("c355371e091d5136af4abaf5e00616bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMarkupExtension.ByReference::class)
public interface IMarkupExtension : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMarkupExtension> {
    public override fun getValue() = ABI.makeIMarkupExtension(pointer.getPointer(0))

    public fun setValue(value: IMarkupExtension_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMarkupExtension {
    public val __1905419458_Ptr: Pointer?

    public val _1905419458_VtblPtr: Pointer?
      get() = __1905419458_Ptr?.getPointer(0)
  }

  public class IMarkupExtension_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1905419458_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMarkupExtension, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c355371e091d5136af4abaf5e00616bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMarkupExtension(ptr: Pointer?): WithDefault = IMarkupExtension_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMarkupExtension {
      val address = segment.toRawLongValue()
      return makeIMarkupExtension(Pointer(address))
    }

    public override fun toNative(obj: IMarkupExtension): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1905419458_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMarkupExtension): Array<IMarkupExtension?> = (elements as
        Array<IMarkupExtension?>).castToImpl<IMarkupExtension,IMarkupExtension_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMarkupExtension?> =
        arrayOfNulls<IMarkupExtension_Impl>(size) as Array<IMarkupExtension?>
  }
}
