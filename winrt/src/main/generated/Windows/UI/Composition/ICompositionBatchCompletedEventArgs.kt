package Windows.UI.Composition

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

@ABIMarker(ICompositionBatchCompletedEventArgs.ABI::class)
@Signature("{0d00dad0-9464-450a-a562-2e2698b0a812}")
@Guid("0d00dad09464450aa5622e2698b0a812")
@WinRTInterface("0d00dad09464450aa5622e2698b0a812")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionBatchCompletedEventArgs.ByReference::class)
public interface ICompositionBatchCompletedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionBatchCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeICompositionBatchCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICompositionBatchCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionBatchCompletedEventArgs {
    public val __1556353910_Ptr: Pointer?

    public val _1556353910_VtblPtr: Pointer?
      get() = __1556353910_Ptr?.getPointer(0)
  }

  public class ICompositionBatchCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1556353910_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionBatchCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0d00dad09464450aa5622e2698b0a812")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionBatchCompletedEventArgs(ptr: Pointer?): WithDefault =
        ICompositionBatchCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionBatchCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeICompositionBatchCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICompositionBatchCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1556353910_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionBatchCompletedEventArgs):
        Array<ICompositionBatchCompletedEventArgs?> = (elements as
        Array<ICompositionBatchCompletedEventArgs?>).castToImpl<ICompositionBatchCompletedEventArgs,ICompositionBatchCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionBatchCompletedEventArgs?> =
        arrayOfNulls<ICompositionBatchCompletedEventArgs_Impl>(size) as
        Array<ICompositionBatchCompletedEventArgs?>
  }
}
