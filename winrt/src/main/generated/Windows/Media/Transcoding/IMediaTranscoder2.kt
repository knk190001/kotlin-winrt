package Windows.Media.Transcoding

import Windows.Foundation.IAsyncOperation
import Windows.Media.Core.IMediaSource
import Windows.Media.MediaProperties.MediaEncodingProfile
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IMediaTranscoder2.ABI::class)
@Signature("{40531d74-35e0-4f04-8574-ca8bc4e5a082}")
@Guid("40531d7435e04f048574ca8bc4e5a082")
@WinRTInterface("40531d7435e04f048574ca8bc4e5a082")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTranscoder2.ByReference::class)
public interface IMediaTranscoder2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PrepareMediaStreamSourceTranscodeAsync(
    source: IMediaSource?,
    destination: IRandomAccessStream?,
    profile: MediaEncodingProfile?
  ): IAsyncOperation<PrepareTranscodeResult?>?

  @InterfaceMethod(1)
  public fun put_VideoProcessingAlgorithm(value: MediaVideoProcessingAlgorithm?): Unit

  @InterfaceMethod(2)
  public fun get_VideoProcessingAlgorithm(): MediaVideoProcessingAlgorithm?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTranscoder2> {
    public override fun getValue() = ABI.makeIMediaTranscoder2(pointer.getPointer(0))

    public fun setValue(value: IMediaTranscoder2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTranscoder2 {
    public val __2124397789_Ptr: Pointer?

    public val _2124397789_VtblPtr: Pointer?
      get() = __2124397789_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PrepareMediaStreamSourceTranscodeAsync(
      source: IMediaSource?,
      destination: IRandomAccessStream?,
      profile: MediaEncodingProfile?
    ): IAsyncOperation<PrepareTranscodeResult?>? {
      val fnPtr = _2124397789_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PrepareTranscodeResult?>>()
      val hr = fn.invokeHR(arrayOf(__2124397789_Ptr, marshalToNative(source),
          marshalToNative(destination), marshalToNative(profile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PrepareTranscodeResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_VideoProcessingAlgorithm(value: MediaVideoProcessingAlgorithm?): Unit {
      val fnPtr = _2124397789_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2124397789_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_VideoProcessingAlgorithm(): MediaVideoProcessingAlgorithm? {
      val fnPtr = _2124397789_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaVideoProcessingAlgorithm>()
      val hr = fn.invokeHR(arrayOf(__2124397789_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaVideoProcessingAlgorithm>(result.getValue())
      return resultValue
    }
  }

  public class IMediaTranscoder2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2124397789_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTranscoder2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40531d7435e04f048574ca8bc4e5a082")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTranscoder2(ptr: Pointer?): WithDefault = IMediaTranscoder2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTranscoder2 {
      val address = segment.toRawLongValue()
      return makeIMediaTranscoder2(Pointer(address))
    }

    public override fun toNative(obj: IMediaTranscoder2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2124397789_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTranscoder2): Array<IMediaTranscoder2?> = (elements
        as Array<IMediaTranscoder2?>).castToImpl<IMediaTranscoder2,IMediaTranscoder2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTranscoder2?> =
        arrayOfNulls<IMediaTranscoder2_Impl>(size) as Array<IMediaTranscoder2?>
  }
}
