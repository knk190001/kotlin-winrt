package Windows.Graphics.Imaging

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.IAsyncAction
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
import kotlin.Boolean
import kotlin.Byte
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapEncoder.ABI::class)
@Signature("{2bc468e3-e1f8-4b54-95e8-32919551ce62}")
@Guid("2bc468e3e1f84b5495e832919551ce62")
@WinRTInterface("2bc468e3e1f84b5495e832919551ce62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapEncoder.ByReference::class)
public interface IBitmapEncoder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EncoderInformation(): BitmapCodecInformation?

  @InterfaceMethod(1)
  public fun get_BitmapProperties(): BitmapProperties?

  @InterfaceMethod(2)
  public fun get_BitmapContainerProperties(): BitmapProperties?

  @InterfaceMethod(3)
  public fun get_IsThumbnailGenerated(): Boolean

  @InterfaceMethod(4)
  public fun put_IsThumbnailGenerated(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_GeneratedThumbnailWidth(): WinDef.UINT

  @InterfaceMethod(6)
  public fun put_GeneratedThumbnailWidth(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun get_GeneratedThumbnailHeight(): WinDef.UINT

  @InterfaceMethod(8)
  public fun put_GeneratedThumbnailHeight(value: WinDef.UINT): Unit

  @InterfaceMethod(9)
  public fun get_BitmapTransform(): BitmapTransform?

  @InterfaceMethod(10)
  public fun SetPixelData(
    pixelFormat: BitmapPixelFormat?,
    alphaMode: BitmapAlphaMode?,
    width: WinDef.UINT,
    height: WinDef.UINT,
    dpiX: Double,
    dpiY: Double,
    pixels: Array<Byte>
  ): Unit

  @InterfaceMethod(11)
  public fun GoToNextFrameAsync(): IAsyncAction?

  @InterfaceMethod(12)
  public fun GoToNextFrameAsync(encodingOptions: IIterable<IKeyValuePair<String?,
      BitmapTypedValue?>?>?): IAsyncAction?

  @InterfaceMethod(13)
  public fun FlushAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapEncoder>
      {
    public override fun getValue() = ABI.makeIBitmapEncoder(pointer.getPointer(0))

    public fun setValue(value: IBitmapEncoder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapEncoder {
    public val __1719659964_Ptr: Pointer?

    public val _1719659964_VtblPtr: Pointer?
      get() = __1719659964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EncoderInformation(): BitmapCodecInformation? {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapCodecInformation>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapCodecInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BitmapProperties(): BitmapProperties? {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapProperties>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BitmapContainerProperties(): BitmapProperties? {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapProperties>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsThumbnailGenerated(): Boolean {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsThumbnailGenerated(value: Boolean): Unit {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_GeneratedThumbnailWidth(): WinDef.UINT {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_GeneratedThumbnailWidth(value: WinDef.UINT): Unit {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_GeneratedThumbnailHeight(): WinDef.UINT {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_GeneratedThumbnailHeight(value: WinDef.UINT): Unit {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_BitmapTransform(): BitmapTransform? {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapTransform>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapTransform>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun SetPixelData(
      pixelFormat: BitmapPixelFormat?,
      alphaMode: BitmapAlphaMode?,
      width: WinDef.UINT,
      height: WinDef.UINT,
      dpiX: Double,
      dpiY: Double,
      pixels: Array<Byte>
    ): Unit {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr, marshalToNative(pixelFormat),
          marshalToNative(alphaMode), width, height, dpiX, dpiY,
          pixels.size,marshalToNative(pixels),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun GoToNextFrameAsync(): IAsyncAction? {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GoToNextFrameAsync(encodingOptions: IIterable<IKeyValuePair<String?,
        BitmapTypedValue?>?>?): IAsyncAction? {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr, marshalToNative(encodingOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun FlushAsync(): IAsyncAction? {
      val fnPtr = _1719659964_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1719659964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapEncoder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1719659964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapEncoder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bc468e3e1f84b5495e832919551ce62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapEncoder(ptr: Pointer?): WithDefault = IBitmapEncoder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapEncoder {
      val address = segment.toRawLongValue()
      return makeIBitmapEncoder(Pointer(address))
    }

    public override fun toNative(obj: IBitmapEncoder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1719659964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapEncoder): Array<IBitmapEncoder?> = (elements as
        Array<IBitmapEncoder?>).castToImpl<IBitmapEncoder,IBitmapEncoder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapEncoder?> =
        arrayOfNulls<IBitmapEncoder_Impl>(size) as Array<IBitmapEncoder?>
  }
}
