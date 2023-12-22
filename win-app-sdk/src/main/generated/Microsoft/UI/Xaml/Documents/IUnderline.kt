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

@ABIMarker(IUnderline.ABI::class)
@Signature("{68aaec6e-ea71-5ed2-b83e-91684b25efb9}")
@Guid("68aaec6eea715ed2b83e91684b25efb9")
@WinRTInterface("68aaec6eea715ed2b83e91684b25efb9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUnderline.ByReference::class)
public interface IUnderline : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUnderline> {
    public override fun getValue() = ABI.makeIUnderline(pointer.getPointer(0))

    public fun setValue(value: IUnderline_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUnderline {
    public val __772248975_Ptr: Pointer?

    public val _772248975_VtblPtr: Pointer?
      get() = __772248975_Ptr?.getPointer(0)
  }

  public class IUnderline_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __772248975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUnderline, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68aaec6eea715ed2b83e91684b25efb9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUnderline(ptr: Pointer?): WithDefault = IUnderline_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUnderline {
      val address = segment.toRawLongValue()
      return makeIUnderline(Pointer(address))
    }

    public override fun toNative(obj: IUnderline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__772248975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUnderline): Array<IUnderline?> = (elements as
        Array<IUnderline?>).castToImpl<IUnderline,IUnderline_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUnderline?> = arrayOfNulls<IUnderline_Impl>(size)
        as Array<IUnderline?>
  }
}
