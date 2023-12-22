package Windows.Graphics.Imaging

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBitmapEncoderStatics.ABI::class)
@Signature("{a74356a7-a4e4-4eb9-8e40-564de7e1ccb2}")
@Guid("a74356a7a4e44eb98e40564de7e1ccb2")
@WinRTInterface("a74356a7a4e44eb98e40564de7e1ccb2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapEncoderStatics.ByReference::class)
public interface IBitmapEncoderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BmpEncoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_JpegEncoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_PngEncoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_TiffEncoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun get_GifEncoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_JpegXREncoderId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(6)
  public fun GetEncoderInformationEnumerator(): IVectorView<BitmapCodecInformation?>?

  @InterfaceMethod(7)
  public fun CreateAsync(encoderId: com.sun.jna.platform.win32.Guid.GUID?,
      stream: IRandomAccessStream?): IAsyncOperation<BitmapEncoder?>?

  @InterfaceMethod(8)
  public fun CreateAsync(
    encoderId: com.sun.jna.platform.win32.Guid.GUID?,
    stream: IRandomAccessStream?,
    encodingOptions: IIterable<IKeyValuePair<String?, BitmapTypedValue?>?>?
  ): IAsyncOperation<BitmapEncoder?>?

  @InterfaceMethod(9)
  public fun CreateForTranscodingAsync(stream: IRandomAccessStream?, bitmapDecoder: BitmapDecoder?):
      IAsyncOperation<BitmapEncoder?>?

  @InterfaceMethod(10)
  public fun CreateForInPlacePropertyEncodingAsync(bitmapDecoder: BitmapDecoder?):
      IAsyncOperation<BitmapEncoder?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBitmapEncoderStatics> {
    public override fun getValue() = ABI.makeIBitmapEncoderStatics(pointer.getPointer(0))

    public fun setValue(value: IBitmapEncoderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapEncoderStatics {
    public val __362557665_Ptr: Pointer?

    public val _362557665_VtblPtr: Pointer?
      get() = __362557665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BmpEncoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_JpegEncoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PngEncoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_TiffEncoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_GifEncoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_JpegXREncoderId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetEncoderInformationEnumerator(): IVectorView<BitmapCodecInformation?>? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<BitmapCodecInformation?>>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<BitmapCodecInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateAsync(encoderId: com.sun.jna.platform.win32.Guid.GUID?,
        stream: IRandomAccessStream?): IAsyncOperation<BitmapEncoder?>? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BitmapEncoder?>>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr, marshalToNative(encoderId),
          marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BitmapEncoder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateAsync(
      encoderId: com.sun.jna.platform.win32.Guid.GUID?,
      stream: IRandomAccessStream?,
      encodingOptions: IIterable<IKeyValuePair<String?, BitmapTypedValue?>?>?
    ): IAsyncOperation<BitmapEncoder?>? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BitmapEncoder?>>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr, marshalToNative(encoderId),
          marshalToNative(stream), marshalToNative(encodingOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BitmapEncoder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateForTranscodingAsync(stream: IRandomAccessStream?,
        bitmapDecoder: BitmapDecoder?): IAsyncOperation<BitmapEncoder?>? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BitmapEncoder?>>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr, marshalToNative(stream),
          marshalToNative(bitmapDecoder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BitmapEncoder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateForInPlacePropertyEncodingAsync(bitmapDecoder: BitmapDecoder?):
        IAsyncOperation<BitmapEncoder?>? {
      val fnPtr = _362557665_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BitmapEncoder?>>()
      val hr = fn.invokeHR(arrayOf(__362557665_Ptr, marshalToNative(bitmapDecoder), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BitmapEncoder?>>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapEncoderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __362557665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapEncoderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a74356a7a4e44eb98e40564de7e1ccb2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapEncoderStatics(ptr: Pointer?): WithDefault =
        IBitmapEncoderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapEncoderStatics {
      val address = segment.toRawLongValue()
      return makeIBitmapEncoderStatics(Pointer(address))
    }

    public override fun toNative(obj: IBitmapEncoderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__362557665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapEncoderStatics): Array<IBitmapEncoderStatics?> =
        (elements as
        Array<IBitmapEncoderStatics?>).castToImpl<IBitmapEncoderStatics,IBitmapEncoderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapEncoderStatics?> =
        arrayOfNulls<IBitmapEncoderStatics_Impl>(size) as Array<IBitmapEncoderStatics?>
  }
}
