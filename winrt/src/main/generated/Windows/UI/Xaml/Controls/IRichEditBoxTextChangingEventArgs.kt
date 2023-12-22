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

@ABIMarker(IRichEditBoxTextChangingEventArgs.ABI::class)
@Signature("{54065018-2813-4922-9f8e-b6bbafd995d8}")
@Guid("54065018281349229f8eb6bbafd995d8")
@WinRTInterface("54065018281349229f8eb6bbafd995d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBoxTextChangingEventArgs.ByReference::class)
public interface IRichEditBoxTextChangingEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditBoxTextChangingEventArgs> {
    public override fun getValue() =
        ABI.makeIRichEditBoxTextChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRichEditBoxTextChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBoxTextChangingEventArgs {
    public val __1666204980_Ptr: Pointer?

    public val _1666204980_VtblPtr: Pointer?
      get() = __1666204980_Ptr?.getPointer(0)
  }

  public class IRichEditBoxTextChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1666204980_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBoxTextChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54065018281349229f8eb6bbafd995d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBoxTextChangingEventArgs(ptr: Pointer?): WithDefault =
        IRichEditBoxTextChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBoxTextChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeIRichEditBoxTextChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBoxTextChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1666204980_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBoxTextChangingEventArgs):
        Array<IRichEditBoxTextChangingEventArgs?> = (elements as
        Array<IRichEditBoxTextChangingEventArgs?>).castToImpl<IRichEditBoxTextChangingEventArgs,IRichEditBoxTextChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBoxTextChangingEventArgs?> =
        arrayOfNulls<IRichEditBoxTextChangingEventArgs_Impl>(size) as
        Array<IRichEditBoxTextChangingEventArgs?>
  }
}
