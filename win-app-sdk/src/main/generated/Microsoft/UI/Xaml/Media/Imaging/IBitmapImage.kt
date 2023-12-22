package Microsoft.UI.Xaml.Media.Imaging

import Microsoft.UI.Xaml.ExceptionRoutedEventHandler
import Microsoft.UI.Xaml.RoutedEventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Uri
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapImage.ABI::class)
@Signature("{5cc29916-a411-5bc2-a3c5-a00d99a59da8}")
@Guid("5cc29916a4115bc2a3c5a00d99a59da8")
@WinRTInterface("5cc29916a4115bc2a3c5a00d99a59da8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapImage.ByReference::class)
public interface IBitmapImage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CreateOptions(): BitmapCreateOptions?

  @InterfaceMethod(1)
  public fun put_CreateOptions(value: BitmapCreateOptions?): Unit

  @InterfaceMethod(2)
  public fun get_UriSource(): Uri?

  @InterfaceMethod(3)
  public fun put_UriSource(value: Uri?): Unit

  @InterfaceMethod(4)
  public fun get_DecodePixelWidth(): Int

  @InterfaceMethod(5)
  public fun put_DecodePixelWidth(value: Int): Unit

  @InterfaceMethod(6)
  public fun get_DecodePixelHeight(): Int

  @InterfaceMethod(7)
  public fun put_DecodePixelHeight(value: Int): Unit

  @InterfaceMethod(8)
  public fun get_DecodePixelType(): DecodePixelType?

  @InterfaceMethod(9)
  public fun put_DecodePixelType(value: DecodePixelType?): Unit

  @InterfaceMethod(10)
  public fun get_IsAnimatedBitmap(): Boolean

  @InterfaceMethod(11)
  public fun get_IsPlaying(): Boolean

  @InterfaceMethod(12)
  public fun get_AutoPlay(): Boolean

  @InterfaceMethod(13)
  public fun put_AutoPlay(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun add_DownloadProgress(handler: DownloadProgressEventHandler?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_DownloadProgress(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_ImageOpened(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_ImageOpened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_ImageFailed(handler: ExceptionRoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_ImageFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun Play(): Unit

  @InterfaceMethod(21)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapImage> {
    public override fun getValue() = ABI.makeIBitmapImage(pointer.getPointer(0))

    public fun setValue(value: IBitmapImage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapImage {
    public val __173410533_Ptr: Pointer?

    public val _173410533_VtblPtr: Pointer?
      get() = __173410533_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CreateOptions(): BitmapCreateOptions? {
      val fnPtr = _173410533_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapCreateOptions>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapCreateOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CreateOptions(value: BitmapCreateOptions?): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_UriSource(): Uri? {
      val fnPtr = _173410533_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_UriSource(value: Uri?): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_DecodePixelWidth(): Int {
      val fnPtr = _173410533_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_DecodePixelWidth(value: Int): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_DecodePixelHeight(): Int {
      val fnPtr = _173410533_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_DecodePixelHeight(value: Int): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DecodePixelType(): DecodePixelType? {
      val fnPtr = _173410533_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DecodePixelType>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DecodePixelType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_DecodePixelType(value: DecodePixelType?): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsAnimatedBitmap(): Boolean {
      val fnPtr = _173410533_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_IsPlaying(): Boolean {
      val fnPtr = _173410533_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_AutoPlay(): Boolean {
      val fnPtr = _173410533_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_AutoPlay(value: Boolean): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_DownloadProgress(handler: DownloadProgressEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _173410533_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_DownloadProgress(token: EventRegistrationToken?): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_ImageOpened(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _173410533_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_ImageOpened(token: EventRegistrationToken?): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_ImageFailed(handler: ExceptionRoutedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _173410533_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_ImageFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun Play(): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun Stop(): Unit {
      val fnPtr = _173410533_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__173410533_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBitmapImage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __173410533_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapImage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5cc29916a4115bc2a3c5a00d99a59da8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapImage(ptr: Pointer?): WithDefault = IBitmapImage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapImage {
      val address = segment.toRawLongValue()
      return makeIBitmapImage(Pointer(address))
    }

    public override fun toNative(obj: IBitmapImage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__173410533_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapImage): Array<IBitmapImage?> = (elements as
        Array<IBitmapImage?>).castToImpl<IBitmapImage,IBitmapImage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapImage?> =
        arrayOfNulls<IBitmapImage_Impl>(size) as Array<IBitmapImage?>
  }
}
