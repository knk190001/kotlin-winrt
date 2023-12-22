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

@ABIMarker(IHandwritingViewTextSubmittedEventArgs.ABI::class)
@Signature("{55ac0f47-f5e4-55da-b8a3-d418b7564291}")
@Guid("55ac0f47f5e455dab8a3d418b7564291")
@WinRTInterface("55ac0f47f5e455dab8a3d418b7564291")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandwritingViewTextSubmittedEventArgs.ByReference::class)
public interface IHandwritingViewTextSubmittedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandwritingViewTextSubmittedEventArgs> {
    public override fun getValue() =
        ABI.makeIHandwritingViewTextSubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHandwritingViewTextSubmittedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandwritingViewTextSubmittedEventArgs {
    public val __453697089_Ptr: Pointer?

    public val _453697089_VtblPtr: Pointer?
      get() = __453697089_Ptr?.getPointer(0)
  }

  public class IHandwritingViewTextSubmittedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __453697089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandwritingViewTextSubmittedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55ac0f47f5e455dab8a3d418b7564291")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandwritingViewTextSubmittedEventArgs(ptr: Pointer?): WithDefault =
        IHandwritingViewTextSubmittedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandwritingViewTextSubmittedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHandwritingViewTextSubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHandwritingViewTextSubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__453697089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandwritingViewTextSubmittedEventArgs):
        Array<IHandwritingViewTextSubmittedEventArgs?> = (elements as
        Array<IHandwritingViewTextSubmittedEventArgs?>).castToImpl<IHandwritingViewTextSubmittedEventArgs,IHandwritingViewTextSubmittedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandwritingViewTextSubmittedEventArgs?> =
        arrayOfNulls<IHandwritingViewTextSubmittedEventArgs_Impl>(size) as
        Array<IHandwritingViewTextSubmittedEventArgs?>
  }
}
