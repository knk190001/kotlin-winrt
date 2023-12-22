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

@ABIMarker(ITextChangedEventArgs.ABI::class)
@Signature("{4dd04f7d-7a11-4b2e-9933-577df39252b6}")
@Guid("4dd04f7d7a114b2e9933577df39252b6")
@WinRTInterface("4dd04f7d7a114b2e9933577df39252b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextChangedEventArgs.ByReference::class)
public interface ITextChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextChangedEventArgs> {
    public override fun getValue() = ABI.makeITextChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextChangedEventArgs {
    public val __1118775212_Ptr: Pointer?

    public val _1118775212_VtblPtr: Pointer?
      get() = __1118775212_Ptr?.getPointer(0)
  }

  public class ITextChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1118775212_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4dd04f7d7a114b2e9933577df39252b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextChangedEventArgs(ptr: Pointer?): WithDefault =
        ITextChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITextChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1118775212_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextChangedEventArgs): Array<ITextChangedEventArgs?> =
        (elements as
        Array<ITextChangedEventArgs?>).castToImpl<ITextChangedEventArgs,ITextChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextChangedEventArgs?> =
        arrayOfNulls<ITextChangedEventArgs_Impl>(size) as Array<ITextChangedEventArgs?>
  }
}
