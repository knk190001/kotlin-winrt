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

@ABIMarker(IMediaFrameArrivedEventArgs.ABI::class)
@Signature("{0b430add-a490-4435-ada1-9affd55239f7}")
@Guid("0b430adda4904435ada19affd55239f7")
@WinRTInterface("0b430adda4904435ada19affd55239f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameArrivedEventArgs.ByReference::class)
public interface IMediaFrameArrivedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameArrivedEventArgs> {
    public override fun getValue() = ABI.makeIMediaFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameArrivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameArrivedEventArgs {
    public val __323511975_Ptr: Pointer?

    public val _323511975_VtblPtr: Pointer?
      get() = __323511975_Ptr?.getPointer(0)
  }

  public class IMediaFrameArrivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __323511975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameArrivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b430adda4904435ada19affd55239f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameArrivedEventArgs(ptr: Pointer?): WithDefault =
        IMediaFrameArrivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__323511975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameArrivedEventArgs):
        Array<IMediaFrameArrivedEventArgs?> = (elements as
        Array<IMediaFrameArrivedEventArgs?>).castToImpl<IMediaFrameArrivedEventArgs,IMediaFrameArrivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameArrivedEventArgs?> =
        arrayOfNulls<IMediaFrameArrivedEventArgs_Impl>(size) as Array<IMediaFrameArrivedEventArgs?>
  }
}
