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

@ABIMarker(IHyperlinkClickEventArgs.ABI::class)
@Signature("{c755916b-7bdc-4be7-b373-9240a503d870}")
@Guid("c755916b7bdc4be7b3739240a503d870")
@WinRTInterface("c755916b7bdc4be7b3739240a503d870")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkClickEventArgs.ByReference::class)
public interface IHyperlinkClickEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkClickEventArgs> {
    public override fun getValue() = ABI.makeIHyperlinkClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkClickEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkClickEventArgs {
    public val __2058664755_Ptr: Pointer?

    public val _2058664755_VtblPtr: Pointer?
      get() = __2058664755_Ptr?.getPointer(0)
  }

  public class IHyperlinkClickEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2058664755_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkClickEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c755916b7bdc4be7b3739240a503d870")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkClickEventArgs(ptr: Pointer?): WithDefault =
        IHyperlinkClickEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkClickEventArgs {
      val address = segment.toRawLongValue()
      return makeIHyperlinkClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2058664755_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkClickEventArgs):
        Array<IHyperlinkClickEventArgs?> = (elements as
        Array<IHyperlinkClickEventArgs?>).castToImpl<IHyperlinkClickEventArgs,IHyperlinkClickEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkClickEventArgs?> =
        arrayOfNulls<IHyperlinkClickEventArgs_Impl>(size) as Array<IHyperlinkClickEventArgs?>
  }
}
