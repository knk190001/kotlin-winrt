package Windows.Media.Core

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

@ABIMarker(IMediaStreamSourceSampleRequestedEventArgs.ABI::class)
@Signature("{10f9bb9e-71c5-492f-847f-0da1f35e81f8}")
@Guid("10f9bb9e71c5492f847f0da1f35e81f8")
@WinRTInterface("10f9bb9e71c5492f847f0da1f35e81f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSourceSampleRequestedEventArgs.ByReference::class)
public interface IMediaStreamSourceSampleRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): MediaStreamSourceSampleRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSourceSampleRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIMediaStreamSourceSampleRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSourceSampleRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSourceSampleRequestedEventArgs {
    public val __1521451075_Ptr: Pointer?

    public val _1521451075_VtblPtr: Pointer?
      get() = __1521451075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): MediaStreamSourceSampleRequest? {
      val fnPtr = _1521451075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSourceSampleRequest>()
      val hr = fn.invokeHR(arrayOf(__1521451075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSourceSampleRequest>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSourceSampleRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1521451075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSourceSampleRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10f9bb9e71c5492f847f0da1f35e81f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSourceSampleRequestedEventArgs(ptr: Pointer?): WithDefault =
        IMediaStreamSourceSampleRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMediaStreamSourceSampleRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSourceSampleRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSourceSampleRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1521451075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSourceSampleRequestedEventArgs):
        Array<IMediaStreamSourceSampleRequestedEventArgs?> = (elements as
        Array<IMediaStreamSourceSampleRequestedEventArgs?>).castToImpl<IMediaStreamSourceSampleRequestedEventArgs,IMediaStreamSourceSampleRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSourceSampleRequestedEventArgs?> =
        arrayOfNulls<IMediaStreamSourceSampleRequestedEventArgs_Impl>(size) as
        Array<IMediaStreamSourceSampleRequestedEventArgs?>
  }
}
