package Windows.Media.Core

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TimeSpan
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMediaStreamSampleStatics.ABI::class)
@Signature("{dfdf218f-a6cf-4579-be41-73dd941ad972}")
@Guid("dfdf218fa6cf4579be4173dd941ad972")
@WinRTInterface("dfdf218fa6cf4579be4173dd941ad972")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSampleStatics.ByReference::class)
public interface IMediaStreamSampleStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromBuffer(buffer: IBuffer?, timestamp: TimeSpan?): MediaStreamSample?

  @InterfaceMethod(1)
  public fun CreateFromStreamAsync(
    stream: IInputStream?,
    count: WinDef.UINT,
    timestamp: TimeSpan?
  ): IAsyncOperation<MediaStreamSample?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSampleStatics> {
    public override fun getValue() = ABI.makeIMediaStreamSampleStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSampleStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSampleStatics {
    public val __983182444_Ptr: Pointer?

    public val _983182444_VtblPtr: Pointer?
      get() = __983182444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromBuffer(buffer: IBuffer?, timestamp: TimeSpan?):
        MediaStreamSample? {
      val fnPtr = _983182444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSample>()
      val hr = fn.invokeHR(arrayOf(__983182444_Ptr, marshalToNative(buffer),
          marshalToNative(timestamp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSample>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromStreamAsync(
      stream: IInputStream?,
      count: WinDef.UINT,
      timestamp: TimeSpan?
    ): IAsyncOperation<MediaStreamSample?>? {
      val fnPtr = _983182444_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaStreamSample?>>()
      val hr = fn.invokeHR(arrayOf(__983182444_Ptr, marshalToNative(stream), count,
          marshalToNative(timestamp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaStreamSample?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSampleStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __983182444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSampleStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dfdf218fa6cf4579be4173dd941ad972")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSampleStatics(ptr: Pointer?): WithDefault =
        IMediaStreamSampleStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSampleStatics {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSampleStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSampleStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__983182444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSampleStatics):
        Array<IMediaStreamSampleStatics?> = (elements as
        Array<IMediaStreamSampleStatics?>).castToImpl<IMediaStreamSampleStatics,IMediaStreamSampleStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSampleStatics?> =
        arrayOfNulls<IMediaStreamSampleStatics_Impl>(size) as Array<IMediaStreamSampleStatics?>
  }
}
