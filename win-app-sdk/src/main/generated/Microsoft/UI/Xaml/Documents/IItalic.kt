package Microsoft.UI.Xaml.Documents

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

@ABIMarker(IItalic.ABI::class)
@Signature("{ca3cbebd-7a8d-5d7a-8fdf-538e8a680f6c}")
@Guid("ca3cbebd7a8d5d7a8fdf538e8a680f6c")
@WinRTInterface("ca3cbebd7a8d5d7a8fdf538e8a680f6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItalic.ByReference::class)
public interface IItalic : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IItalic> {
    public override fun getValue() = ABI.makeIItalic(pointer.getPointer(0))

    public fun setValue(value: IItalic_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItalic {
    public val __1833998925_Ptr: Pointer?

    public val _1833998925_VtblPtr: Pointer?
      get() = __1833998925_Ptr?.getPointer(0)
  }

  public class IItalic_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1833998925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItalic, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca3cbebd7a8d5d7a8fdf538e8a680f6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItalic(ptr: Pointer?): WithDefault = IItalic_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItalic {
      val address = segment.toRawLongValue()
      return makeIItalic(Pointer(address))
    }

    public override fun toNative(obj: IItalic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1833998925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItalic): Array<IItalic?> = (elements as
        Array<IItalic?>).castToImpl<IItalic,IItalic_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItalic?> = arrayOfNulls<IItalic_Impl>(size) as
        Array<IItalic?>
  }
}
