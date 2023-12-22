package Windows.Graphics.Imaging

import Windows.Foundation.IAsyncOperation
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapFrame.ABI::class)
@Signature("{72a49a1c-8081-438d-91bc-94ecfc8185c6}")
@Guid("72a49a1c8081438d91bc94ecfc8185c6")
@WinRTInterface("72a49a1c8081438d91bc94ecfc8185c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapFrame.ByReference::class)
public interface IBitmapFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetThumbnailAsync(): IAsyncOperation<ImageStream?>?

  @InterfaceMethod(1)
  public fun get_BitmapProperties(): BitmapPropertiesView?

  @InterfaceMethod(2)
  public fun get_BitmapPixelFormat(): BitmapPixelFormat?

  @InterfaceMethod(3)
  public fun get_BitmapAlphaMode(): BitmapAlphaMode?

  @InterfaceMethod(4)
  public fun get_DpiX(): Double

  @InterfaceMethod(5)
  public fun get_DpiY(): Double

  @InterfaceMethod(6)
  public fun get_PixelWidth(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_PixelHeight(): WinDef.UINT

  @InterfaceMethod(8)
  public fun get_OrientedPixelWidth(): WinDef.UINT

  @InterfaceMethod(9)
  public fun get_OrientedPixelHeight(): WinDef.UINT

  @InterfaceMethod(10)
  public fun GetPixelDataAsync(): IAsyncOperation<PixelDataProvider?>?

  @InterfaceMethod(11)
  public fun GetPixelDataAsync(
    pixelFormat: BitmapPixelFormat?,
    alphaMode: BitmapAlphaMode?,
    transform: BitmapTransform?,
    exifOrientationMode: ExifOrientationMode?,
    colorManagementMode: ColorManagementMode?
  ): IAsyncOperation<PixelDataProvider?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapFrame> {
    public override fun getValue() = ABI.makeIBitmapFrame(pointer.getPointer(0))

    public fun setValue(value: IBitmapFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapFrame {
    public val __405954709_Ptr: Pointer?

    public val _405954709_VtblPtr: Pointer?
      get() = __405954709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetThumbnailAsync(): IAsyncOperation<ImageStream?>? {
      val fnPtr = _405954709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ImageStream?>>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ImageStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BitmapProperties(): BitmapPropertiesView? {
      val fnPtr = _405954709_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPropertiesView>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPropertiesView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BitmapPixelFormat(): BitmapPixelFormat? {
      val fnPtr = _405954709_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BitmapAlphaMode(): BitmapAlphaMode? {
      val fnPtr = _405954709_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapAlphaMode>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapAlphaMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DpiX(): Double {
      val fnPtr = _405954709_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_DpiY(): Double {
      val fnPtr = _405954709_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_PixelWidth(): WinDef.UINT {
      val fnPtr = _405954709_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_PixelHeight(): WinDef.UINT {
      val fnPtr = _405954709_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_OrientedPixelWidth(): WinDef.UINT {
      val fnPtr = _405954709_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_OrientedPixelHeight(): WinDef.UINT {
      val fnPtr = _405954709_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun GetPixelDataAsync(): IAsyncOperation<PixelDataProvider?>? {
      val fnPtr = _405954709_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PixelDataProvider?>>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PixelDataProvider?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun GetPixelDataAsync(
      pixelFormat: BitmapPixelFormat?,
      alphaMode: BitmapAlphaMode?,
      transform: BitmapTransform?,
      exifOrientationMode: ExifOrientationMode?,
      colorManagementMode: ColorManagementMode?
    ): IAsyncOperation<PixelDataProvider?>? {
      val fnPtr = _405954709_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PixelDataProvider?>>()
      val hr = fn.invokeHR(arrayOf(__405954709_Ptr, marshalToNative(pixelFormat),
          marshalToNative(alphaMode), marshalToNative(transform),
          marshalToNative(exifOrientationMode), marshalToNative(colorManagementMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PixelDataProvider?>>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __405954709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("72a49a1c8081438d91bc94ecfc8185c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapFrame(ptr: Pointer?): WithDefault = IBitmapFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapFrame {
      val address = segment.toRawLongValue()
      return makeIBitmapFrame(Pointer(address))
    }

    public override fun toNative(obj: IBitmapFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__405954709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapFrame): Array<IBitmapFrame?> = (elements as
        Array<IBitmapFrame?>).castToImpl<IBitmapFrame,IBitmapFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapFrame?> =
        arrayOfNulls<IBitmapFrame_Impl>(size) as Array<IBitmapFrame?>
  }
}
