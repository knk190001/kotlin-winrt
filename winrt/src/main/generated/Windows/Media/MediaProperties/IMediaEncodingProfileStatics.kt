package Windows.Media.MediaProperties

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageFile
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

@ABIMarker(IMediaEncodingProfileStatics.ABI::class)
@Signature("{197f352c-2ede-4a45-a896-817a4854f8fe}")
@Guid("197f352c2ede4a45a896817a4854f8fe")
@WinRTInterface("197f352c2ede4a45a896817a4854f8fe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEncodingProfileStatics.ByReference::class)
public interface IMediaEncodingProfileStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateM4a(quality: AudioEncodingQuality?): MediaEncodingProfile?

  @InterfaceMethod(1)
  public fun CreateMp3(quality: AudioEncodingQuality?): MediaEncodingProfile?

  @InterfaceMethod(2)
  public fun CreateWma(quality: AudioEncodingQuality?): MediaEncodingProfile?

  @InterfaceMethod(3)
  public fun CreateMp4(quality: VideoEncodingQuality?): MediaEncodingProfile?

  @InterfaceMethod(4)
  public fun CreateWmv(quality: VideoEncodingQuality?): MediaEncodingProfile?

  @InterfaceMethod(5)
  public fun CreateFromFileAsync(`file`: IStorageFile?): IAsyncOperation<MediaEncodingProfile?>?

  @InterfaceMethod(6)
  public fun CreateFromStreamAsync(stream: IRandomAccessStream?):
      IAsyncOperation<MediaEncodingProfile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEncodingProfileStatics> {
    public override fun getValue() = ABI.makeIMediaEncodingProfileStatics(pointer.getPointer(0))

    public fun setValue(value: IMediaEncodingProfileStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEncodingProfileStatics {
    public val __1906241876_Ptr: Pointer?

    public val _1906241876_VtblPtr: Pointer?
      get() = __1906241876_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateM4a(quality: AudioEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1906241876_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1906241876_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateMp3(quality: AudioEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1906241876_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1906241876_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWma(quality: AudioEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1906241876_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1906241876_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateMp4(quality: VideoEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1906241876_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1906241876_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateWmv(quality: VideoEncodingQuality?): MediaEncodingProfile? {
      val fnPtr = _1906241876_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaEncodingProfile>()
      val hr = fn.invokeHR(arrayOf(__1906241876_Ptr, marshalToNative(quality), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaEncodingProfile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateFromFileAsync(`file`: IStorageFile?):
        IAsyncOperation<MediaEncodingProfile?>? {
      val fnPtr = _1906241876_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaEncodingProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1906241876_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaEncodingProfile?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateFromStreamAsync(stream: IRandomAccessStream?):
        IAsyncOperation<MediaEncodingProfile?>? {
      val fnPtr = _1906241876_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaEncodingProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1906241876_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MediaEncodingProfile?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaEncodingProfileStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1906241876_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEncodingProfileStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("197f352c2ede4a45a896817a4854f8fe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEncodingProfileStatics(ptr: Pointer?): WithDefault =
        IMediaEncodingProfileStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEncodingProfileStatics {
      val address = segment.toRawLongValue()
      return makeIMediaEncodingProfileStatics(Pointer(address))
    }

    public override fun toNative(obj: IMediaEncodingProfileStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1906241876_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEncodingProfileStatics):
        Array<IMediaEncodingProfileStatics?> = (elements as
        Array<IMediaEncodingProfileStatics?>).castToImpl<IMediaEncodingProfileStatics,IMediaEncodingProfileStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEncodingProfileStatics?> =
        arrayOfNulls<IMediaEncodingProfileStatics_Impl>(size) as
        Array<IMediaEncodingProfileStatics?>
  }
}
