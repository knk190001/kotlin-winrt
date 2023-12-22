package Windows.UI.Xaml.Documents

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

@ABIMarker(ITextHighlighterBase.ABI::class)
@Signature("{d957601a-5f0d-4cdf-9758-97e0eb95c8fa}")
@Guid("d957601a5f0d4cdf975897e0eb95c8fa")
@WinRTInterface("d957601a5f0d4cdf975897e0eb95c8fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextHighlighterBase.ByReference::class)
public interface ITextHighlighterBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextHighlighterBase> {
    public override fun getValue() = ABI.makeITextHighlighterBase(pointer.getPointer(0))

    public fun setValue(value: ITextHighlighterBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextHighlighterBase {
    public val __753990333_Ptr: Pointer?

    public val _753990333_VtblPtr: Pointer?
      get() = __753990333_Ptr?.getPointer(0)
  }

  public class ITextHighlighterBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __753990333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextHighlighterBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d957601a5f0d4cdf975897e0eb95c8fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextHighlighterBase(ptr: Pointer?): WithDefault = ITextHighlighterBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextHighlighterBase {
      val address = segment.toRawLongValue()
      return makeITextHighlighterBase(Pointer(address))
    }

    public override fun toNative(obj: ITextHighlighterBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__753990333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextHighlighterBase): Array<ITextHighlighterBase?> =
        (elements as
        Array<ITextHighlighterBase?>).castToImpl<ITextHighlighterBase,ITextHighlighterBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextHighlighterBase?> =
        arrayOfNulls<ITextHighlighterBase_Impl>(size) as Array<ITextHighlighterBase?>
  }
}
