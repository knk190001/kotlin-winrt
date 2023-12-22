package Windows.Graphics.Imaging

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IBitmapDecoderStatics.ABI::class)
@Signature("{438ccb26-bcef-4e95-bad6-23a822e58d01}")
@Guid("438ccb26bcef4e95bad623a822e58d01")
@WinRTInterface("438ccb26bcef4e95bad623a822e58d01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapDecoderStatics.ByReference::class)
public interface IBitmapDecoderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BmpDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_JpegDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_PngDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_TiffDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun get_GifDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_JpegXRDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(6)
  public fun get_IcoDecoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(7)
  public fun GetDecoderInformationEnumerator(): IVectorView<BitmapCodecInformation?>?

  @InterfaceMethod(8)
  public fun CreateAsync(stream: IRandomAccessStream?): IAsyncOperation<BitmapDecoder?>?

  @InterfaceMethod(9)
  public fun CreateAsync(decoderId: com.sun.jna.platform.win32.Guid.GUID?,
      stream: IRandomAccessStream?): IAsyncOperation<BitmapDecoder?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapDecoderStatics> {
    public override fun getValue() = ABI.makeIBitmapDecoderStatics(pointer.getPointer(0))

    public fun setValue(value: IBitmapDecoderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapDecoderStatics {
    public val __786223943_Ptr: Pointer?

    public val _786223943_VtblPtr: Pointer?
      get() = __786223943_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BmpDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_JpegDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PngDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TiffDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_GifDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_JpegXRDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IcoDecoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetDecoderInformationEnumerator(): IVectorView<BitmapCodecInformation?>? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<BitmapCodecInformation?>>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<BitmapCodecInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateAsync(stream: IRandomAccessStream?):
        IAsyncOperation<BitmapDecoder?>? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BitmapDecoder?>>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BitmapDecoder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateAsync(decoderId: com.sun.jna.platform.win32.Guid.GUID?,
        stream: IRandomAccessStream?): IAsyncOperation<BitmapDecoder?>? {
      val fnPtr = _786223943_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BitmapDecoder?>>()
      val hr = fn.invokeHR(arrayOf(__786223943_Ptr, marshalToNative(decoderId),
          marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BitmapDecoder?>>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapDecoderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __786223943_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapDecoderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("438ccb26bcef4e95bad623a822e58d01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapDecoderStatics(ptr: Pointer?): WithDefault =
        IBitmapDecoderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapDecoderStatics {
      val address = segment.toRawLongValue()
      return makeIBitmapDecoderStatics(Pointer(address))
    }

    public override fun toNative(obj: IBitmapDecoderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__786223943_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapDecoderStatics): Array<IBitmapDecoderStatics?> =
        (elements as
        Array<IBitmapDecoderStatics?>).castToImpl<IBitmapDecoderStatics,IBitmapDecoderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapDecoderStatics?> =
        arrayOfNulls<IBitmapDecoderStatics_Impl>(size) as Array<IBitmapDecoderStatics?>
  }
}
