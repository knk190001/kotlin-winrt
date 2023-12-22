package Windows.Media.Core

import Windows.Foundation.TimeSpan
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

@ABIMarker(IMediaStreamSourceSampleRenderedEventArgs.ABI::class)
@Signature("{9d697b05-d4f2-4c7a-9dfe-8d6cd0b3ee84}")
@Guid("9d697b05d4f24c7a9dfe8d6cd0b3ee84")
@WinRTInterface("9d697b05d4f24c7a9dfe8d6cd0b3ee84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceSampleRenderedEventArgs.ByReference::class)
public interface IMediaStreamSourceSampleRenderedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SampleLag(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceSampleRenderedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceSampleRenderedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceSampleRenderedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceSampleRenderedEventArgs {
    public val __573626898_Ptr: Pointer?

    public val _573626898_VtblPtr: Pointer?
      get() = __573626898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SampleLag(): TimeSpan? {
      val fnPtr = _573626898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__573626898_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSourceSampleRenderedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __573626898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceSampleRenderedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d697b05d4f24c7a9dfe8d6cd0b3ee84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceSampleRenderedEventArgs(ptr: Pointer?): WithDefault =
        IMediaStreamSourceSampleRenderedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaStreamSourceSampleRenderedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceSampleRenderedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceSampleRenderedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__573626898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceSampleRenderedEventArgs):
        Array<IMediaStreamSourceSampleRenderedEventArgs?> = (elements as
        Array<IMediaStreamSourceSampleRenderedEventArgs?>).castToImpl<IMediaStreamSourceSampleRenderedEventArgs,IMediaStreamSourceSampleRenderedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceSampleRenderedEventArgs?> =
        arrayOfNulls<IMediaStreamSourceSampleRenderedEventArgs_Impl>(size) as
        Array<IMediaStreamSourceSampleRenderedEventArgs?>
  }
}
