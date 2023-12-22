package Windows.Media.Playback

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaBreakSkippedEventArgs.ABI::class)
@Signature("{6ee94c05-2f54-4a3e-a3ab-24c3b270b4a3}")
@Guid("6ee94c052f544a3ea3ab24c3b270b4a3")
@WinRTInterface("6ee94c052f544a3ea3ab24c3b270b4a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaBreakSkippedEventArgs.ByReference::class)
public interface IMediaBreakSkippedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MediaBreak(): MediaBreak?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaBreakSkippedEventArgs> {
    public override fun getValue() = ABI.makeIMediaBreakSkippedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaBreakSkippedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaBreakSkippedEventArgs {
    public val __290235387_Ptr: Pointer?

    public val _290235387_VtblPtr: Pointer?
      get() = __290235387_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MediaBreak(): MediaBreak? {
      val fnPtr = _290235387_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaBreak>()
      val hr = fn.invokeHR(arrayOf(__290235387_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaBreak>(result.getValue())
      return resultValue
    }
  }

  public class IMediaBreakSkippedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __290235387_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaBreakSkippedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ee94c052f544a3ea3ab24c3b270b4a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaBreakSkippedEventArgs(ptr: Pointer?): WithDefault =
        IMediaBreakSkippedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaBreakSkippedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaBreakSkippedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaBreakSkippedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__290235387_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaBreakSkippedEventArgs):
        Array<IMediaBreakSkippedEventArgs?> = (elements as
        Array<IMediaBreakSkippedEventArgs?>).castToImpl<IMediaBreakSkippedEventArgs,IMediaBreakSkippedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaBreakSkippedEventArgs?> =
        arrayOfNulls<IMediaBreakSkippedEventArgs_Impl>(size) as Array<IMediaBreakSkippedEventArgs?>
  }
}
