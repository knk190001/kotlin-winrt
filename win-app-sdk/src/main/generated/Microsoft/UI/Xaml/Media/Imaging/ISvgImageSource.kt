package Microsoft.UI.Xaml.Media.Imaging

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Foundation.Uri
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISvgImageSource.ABI::class)
@Signature("{d5b61d3c-b68d-53a2-b07b-ba6adfdd5887}")
@Guid("d5b61d3cb68d53a2b07bba6adfdd5887")
@WinRTInterface("d5b61d3cb68d53a2b07bba6adfdd5887")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISvgImageSource.ByReference::class)
public interface ISvgImageSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UriSource(): Uri?

  @InterfaceMethod(1)
  public fun put_UriSource(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_RasterizePixelWidth(): Double

  @InterfaceMethod(3)
  public fun put_RasterizePixelWidth(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_RasterizePixelHeight(): Double

  @InterfaceMethod(5)
  public fun put_RasterizePixelHeight(value: Double): Unit

  @InterfaceMethod(6)
  public fun add_Opened(handler: TypedEventHandler<SvgImageSource?,
      SvgImageSourceOpenedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_OpenFailed(handler: TypedEventHandler<SvgImageSource?,
      SvgImageSourceFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_OpenFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun SetSourceAsync(streamSource: IRandomAccessStream?):
      IAsyncOperation<SvgImageSourceLoadStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISvgImageSource> {
    public override fun getValue() = ABI.makeISvgImageSource(pointer.getPointer(0))

    public fun setValue(value: ISvgImageSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISvgImageSource {
    public val __883009991_Ptr: Pointer?

    public val _883009991_VtblPtr: Pointer?
      get() = __883009991_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UriSource(): Uri? {
      val fnPtr = _883009991_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_UriSource(value: Uri?): Unit {
      val fnPtr = _883009991_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RasterizePixelWidth(): Double {
      val fnPtr = _883009991_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_RasterizePixelWidth(value: Double): Unit {
      val fnPtr = _883009991_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RasterizePixelHeight(): Double {
      val fnPtr = _883009991_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RasterizePixelHeight(value: Double): Unit {
      val fnPtr = _883009991_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Opened(handler: TypedEventHandler<SvgImageSource?,
        SvgImageSourceOpenedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _883009991_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _883009991_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_OpenFailed(handler: TypedEventHandler<SvgImageSource?,
        SvgImageSourceFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _883009991_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_OpenFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _883009991_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetSourceAsync(streamSource: IRandomAccessStream?):
        IAsyncOperation<SvgImageSourceLoadStatus?>? {
      val fnPtr = _883009991_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SvgImageSourceLoadStatus?>>()
      val hr = fn.invokeHR(arrayOf(__883009991_Ptr, marshalToNative(streamSource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SvgImageSourceLoadStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class ISvgImageSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __883009991_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISvgImageSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5b61d3cb68d53a2b07bba6adfdd5887")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISvgImageSource(ptr: Pointer?): WithDefault = ISvgImageSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISvgImageSource {
      val address = segment.toRawLongValue()
      return makeISvgImageSource(Pointer(address))
    }

    public override fun toNative(obj: ISvgImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__883009991_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISvgImageSource): Array<ISvgImageSource?> = (elements as
        Array<ISvgImageSource?>).castToImpl<ISvgImageSource,ISvgImageSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISvgImageSource?> =
        arrayOfNulls<ISvgImageSource_Impl>(size) as Array<ISvgImageSource?>
  }
}
