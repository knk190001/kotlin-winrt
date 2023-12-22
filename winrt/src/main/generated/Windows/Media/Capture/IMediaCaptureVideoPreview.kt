package Windows.Media.Capture

import Windows.Foundation.Collections.IPropertySet
import Windows.Foundation.IAsyncAction
import Windows.Media.IMediaExtension
import Windows.Media.MediaProperties.MediaEncodingProfile
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

@ABIMarker(IMediaCaptureVideoPreview.ABI::class)
@Signature("{27727073-549e-447f-a20a-4f03c479d8c0}")
@Guid("27727073549e447fa20a4f03c479d8c0")
@WinRTInterface("27727073549e447fa20a4f03c479d8c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureVideoPreview.ByReference::class)
public interface IMediaCaptureVideoPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartPreviewAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun StartPreviewToCustomSinkAsync(encodingProfile: MediaEncodingProfile?,
      customMediaSink: IMediaExtension?): IAsyncAction?

  @InterfaceMethod(2)
  public fun StartPreviewToCustomSinkAsync(
    encodingProfile: MediaEncodingProfile?,
    customSinkActivationId: String?,
    customSinkSettings: IPropertySet?
  ): IAsyncAction?

  @InterfaceMethod(3)
  public fun StopPreviewAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureVideoPreview> {
    public override fun getValue() = ABI.makeIMediaCaptureVideoPreview(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureVideoPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureVideoPreview {
    public val __1673389433_Ptr: Pointer?

    public val _1673389433_VtblPtr: Pointer?
      get() = __1673389433_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartPreviewAsync(): IAsyncAction? {
      val fnPtr = _1673389433_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1673389433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun StartPreviewToCustomSinkAsync(encodingProfile: MediaEncodingProfile?,
        customMediaSink: IMediaExtension?): IAsyncAction? {
      val fnPtr = _1673389433_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1673389433_Ptr, marshalToNative(encodingProfile),
          marshalToNative(customMediaSink), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun StartPreviewToCustomSinkAsync(
      encodingProfile: MediaEncodingProfile?,
      customSinkActivationId: String?,
      customSinkSettings: IPropertySet?
    ): IAsyncAction? {
      val fnPtr = _1673389433_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1673389433_Ptr, marshalToNative(encodingProfile),
          marshalToNative(customSinkActivationId), marshalToNative(customSinkSettings), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun StopPreviewAsync(): IAsyncAction? {
      val fnPtr = _1673389433_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1673389433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureVideoPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1673389433_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureVideoPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27727073549e447fa20a4f03c479d8c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureVideoPreview(ptr: Pointer?): WithDefault =
        IMediaCaptureVideoPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureVideoPreview {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureVideoPreview(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureVideoPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1673389433_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureVideoPreview):
        Array<IMediaCaptureVideoPreview?> = (elements as
        Array<IMediaCaptureVideoPreview?>).castToImpl<IMediaCaptureVideoPreview,IMediaCaptureVideoPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureVideoPreview?> =
        arrayOfNulls<IMediaCaptureVideoPreview_Impl>(size) as Array<IMediaCaptureVideoPreview?>
  }
}
