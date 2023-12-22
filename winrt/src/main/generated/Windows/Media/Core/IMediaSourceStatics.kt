package Windows.Media.Core

import Windows.Foundation.Uri
import Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaSourceStatics.ABI::class)
@Signature("{f77d6fa4-4652-410e-b1d8-e9a5e245a45c}")
@Guid("f77d6fa44652410eb1d8e9a5e245a45c")
@WinRTInterface("f77d6fa44652410eb1d8e9a5e245a45c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSourceStatics.ByReference::class)
public interface IMediaSourceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromAdaptiveMediaSource(mediaSource: AdaptiveMediaSource?): MediaSource?

  @InterfaceMethod(1)
  public fun CreateFromMediaStreamSource(mediaSource: MediaStreamSource?): MediaSource?

  @InterfaceMethod(2)
  public fun CreateFromMseStreamSource(mediaSource: MseStreamSource?): MediaSource?

  @InterfaceMethod(3)
  public fun CreateFromIMediaSource(mediaSource: IMediaSource?): MediaSource?

  @InterfaceMethod(4)
  public fun CreateFromStorageFile(`file`: IStorageFile?): MediaSource?

  @InterfaceMethod(5)
  public fun CreateFromStream(stream: IRandomAccessStream?, contentType: String?): MediaSource?

  @InterfaceMethod(6)
  public fun CreateFromStreamReference(stream: IRandomAccessStreamReference?, contentType: String?):
      MediaSource?

  @InterfaceMethod(7)
  public fun CreateFromUri(uri: Uri?): MediaSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaSourceStatics> {
    public override fun getValue() = ABI.makeIMediaSourceStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaSourceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSourceStatics {
    public val __1804552507_Ptr: Pointer?

    public val _1804552507_VtblPtr: Pointer?
      get() = __1804552507_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromAdaptiveMediaSource(mediaSource: AdaptiveMediaSource?):
        MediaSource? {
      val fnPtr = _1804552507_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1804552507_Ptr, marshalToNative(mediaSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromMediaStreamSource(mediaSource: MediaStreamSource?): MediaSource? {
      val fnPtr = _1804552507_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1804552507_Ptr, marshalToNative(mediaSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromMseStreamSource(mediaSource: MseStreamSource?): MediaSource? {
      val fnPtr = _1804552507_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1804552507_Ptr, marshalToNative(mediaSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromIMediaSource(mediaSource: IMediaSource?): MediaSource? {
      val fnPtr = _1804552507_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1804552507_Ptr, marshalToNative(mediaSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateFromStorageFile(`file`: IStorageFile?): MediaSource? {
      val fnPtr = _1804552507_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1804552507_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateFromStream(stream: IRandomAccessStream?, contentType: String?):
        MediaSource? {
      val fnPtr = _1804552507_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1804552507_Ptr, marshalToNative(stream),
          marshalToNative(contentType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateFromStreamReference(stream: IRandomAccessStreamReference?,
        contentType: String?): MediaSource? {
      val fnPtr = _1804552507_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1804552507_Ptr, marshalToNative(stream),
          marshalToNative(contentType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateFromUri(uri: Uri?): MediaSource? {
      val fnPtr = _1804552507_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSource>()
      val hr = fn.invokeHR(arrayOf(__1804552507_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSource>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSourceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1804552507_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSourceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f77d6fa44652410eb1d8e9a5e245a45c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSourceStatics(ptr: Pointer?): WithDefault = IMediaSourceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSourceStatics {
      val address = segment.toRawLongValue()
      return makeIMediaSourceStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaSourceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1804552507_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSourceStatics): Array<IMediaSourceStatics?> =
        (elements as
        Array<IMediaSourceStatics?>).castToImpl<IMediaSourceStatics,IMediaSourceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSourceStatics?> =
        arrayOfNulls<IMediaSourceStatics_Impl>(size) as Array<IMediaSourceStatics?>
  }
}
