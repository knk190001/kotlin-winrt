package Windows.Media.Capture.Frames

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

@ABIMarker(IMultiSourceMediaFrameArrivedEventArgs.ABI::class)
@Signature("{63115e01-cf51-48fd-aab0-6d693eb48127}")
@Guid("63115e01cf5148fdaab06d693eb48127")
@WinRTInterface("63115e01cf5148fdaab06d693eb48127")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMultiSourceMediaFrameArrivedEventArgs.ByReference::class)
public interface IMultiSourceMediaFrameArrivedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMultiSourceMediaFrameArrivedEventArgs> {
    public override fun getValue() =
        ABI.makeIMultiSourceMediaFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMultiSourceMediaFrameArrivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMultiSourceMediaFrameArrivedEventArgs {
    public val __633386529_Ptr: Pointer?

    public val _633386529_VtblPtr: Pointer?
      get() = __633386529_Ptr?.getPointer(0)
  }

  public class IMultiSourceMediaFrameArrivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __633386529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMultiSourceMediaFrameArrivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63115e01cf5148fdaab06d693eb48127")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMultiSourceMediaFrameArrivedEventArgs(ptr: Pointer?): WithDefault =
        IMultiSourceMediaFrameArrivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMultiSourceMediaFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMultiSourceMediaFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMultiSourceMediaFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__633386529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMultiSourceMediaFrameArrivedEventArgs):
        Array<IMultiSourceMediaFrameArrivedEventArgs?> = (elements as
        Array<IMultiSourceMediaFrameArrivedEventArgs?>).castToImpl<IMultiSourceMediaFrameArrivedEventArgs,IMultiSourceMediaFrameArrivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMultiSourceMediaFrameArrivedEventArgs?> =
        arrayOfNulls<IMultiSourceMediaFrameArrivedEventArgs_Impl>(size) as
        Array<IMultiSourceMediaFrameArrivedEventArgs?>
  }
}
