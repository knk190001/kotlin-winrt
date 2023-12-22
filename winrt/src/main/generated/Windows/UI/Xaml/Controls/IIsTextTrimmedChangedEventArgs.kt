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

@ABIMarker(IIsTextTrimmedChangedEventArgs.ABI::class)
@Signature("{16f597cd-ebff-4fb4-8714-26147418b945}")
@Guid("16f597cdebff4fb4871426147418b945")
@WinRTInterface("16f597cdebff4fb4871426147418b945")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIsTextTrimmedChangedEventArgs.ByReference::class)
public interface IIsTextTrimmedChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIsTextTrimmedChangedEventArgs> {
    public override fun getValue() = ABI.makeIIsTextTrimmedChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IIsTextTrimmedChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIsTextTrimmedChangedEventArgs {
    public val __1670536518_Ptr: Pointer?

    public val _1670536518_VtblPtr: Pointer?
      get() = __1670536518_Ptr?.getPointer(0)
  }

  public class IIsTextTrimmedChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1670536518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIsTextTrimmedChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16f597cdebff4fb4871426147418b945")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIsTextTrimmedChangedEventArgs(ptr: Pointer?): WithDefault =
        IIsTextTrimmedChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIsTextTrimmedChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIIsTextTrimmedChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IIsTextTrimmedChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1670536518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIsTextTrimmedChangedEventArgs):
        Array<IIsTextTrimmedChangedEventArgs?> = (elements as
        Array<IIsTextTrimmedChangedEventArgs?>).castToImpl<IIsTextTrimmedChangedEventArgs,IIsTextTrimmedChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIsTextTrimmedChangedEventArgs?> =
        arrayOfNulls<IIsTextTrimmedChangedEventArgs_Impl>(size) as
        Array<IIsTextTrimmedChangedEventArgs?>
  }
}
