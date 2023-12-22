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

@ABIMarker(IInline.ABI::class)
@Signature("{813d427a-8980-5a79-a8fa-f27919cfb24f}")
@Guid("813d427a89805a79a8faf27919cfb24f")
@WinRTInterface("813d427a89805a79a8faf27919cfb24f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInline.ByReference::class)
public interface IInline : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInline> {
    public override fun getValue() = ABI.makeIInline(pointer.getPointer(0))

    public fun setValue(value: IInline_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInline {
    public val __1828782774_Ptr: Pointer?

    public val _1828782774_VtblPtr: Pointer?
      get() = __1828782774_Ptr?.getPointer(0)
  }

  public class IInline_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1828782774_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInline, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("813d427a89805a79a8faf27919cfb24f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInline(ptr: Pointer?): WithDefault = IInline_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInline {
      val address = segment.toRawLongValue()
      return makeIInline(Pointer(address))
    }

    public override fun toNative(obj: IInline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1828782774_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInline): Array<IInline?> = (elements as
        Array<IInline?>).castToImpl<IInline,IInline_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInline?> = arrayOfNulls<IInline_Impl>(size) as
        Array<IInline?>
  }
}
