package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Media.Capture.Core.VariablePhotoSequenceCapture
import Windows.Media.MediaProperties.ImageEncodingProperties
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

@ABIMarker(IMediaCapture3.ABI::class)
@Signature("{d4136f30-1564-466e-bc0a-af94e02ab016}")
@Guid("d4136f301564466ebc0aaf94e02ab016")
@WinRTInterface("d4136f301564466ebc0aaf94e02ab016")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCapture3.ByReference::class)
public interface IMediaCapture3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun PrepareVariablePhotoSequenceCaptureAsync(type: ImageEncodingProperties?):
      IAsyncOperation<VariablePhotoSequenceCapture?>?

  @InterfaceMethod(1)
  public fun add_FocusChanged(handler: TypedEventHandler<MediaCapture?,
      MediaCaptureFocusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_FocusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_PhotoConfirmationCaptured(handler: TypedEventHandler<MediaCapture?,
      PhotoConfirmationCapturedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PhotoConfirmationCaptured(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaCapture3>
      {
    public override fun getValue() = ABI.makeIMediaCapture3(pointer.getPointer(0))

    public fun setValue(value: IMediaCapture3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCapture3 {
    public val __1535274201_Ptr: Pointer?

    public val _1535274201_VtblPtr: Pointer?
      get() = __1535274201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun PrepareVariablePhotoSequenceCaptureAsync(type: ImageEncodingProperties?):
        IAsyncOperation<VariablePhotoSequenceCapture?>? {
      val fnPtr = _1535274201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<VariablePhotoSequenceCapture?>>()
      val hr = fn.invokeHR(arrayOf(__1535274201_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<VariablePhotoSequenceCapture?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_FocusChanged(handler: TypedEventHandler<MediaCapture?,
        MediaCaptureFocusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1535274201_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1535274201_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_FocusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1535274201_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535274201_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_PhotoConfirmationCaptured(handler: TypedEventHandler<MediaCapture?,
        PhotoConfirmationCapturedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1535274201_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1535274201_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PhotoConfirmationCaptured(token: EventRegistrationToken?): Unit {
      val fnPtr = _1535274201_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535274201_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaCapture3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1535274201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCapture3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4136f301564466ebc0aaf94e02ab016")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCapture3(ptr: Pointer?): WithDefault = IMediaCapture3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCapture3 {
      val address = segment.toRawLongValue()
      return makeIMediaCapture3(Pointer(address))
    }

    public override fun toNative(obj: IMediaCapture3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1535274201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCapture3): Array<IMediaCapture3?> = (elements as
        Array<IMediaCapture3?>).castToImpl<IMediaCapture3,IMediaCapture3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCapture3?> =
        arrayOfNulls<IMediaCapture3_Impl>(size) as Array<IMediaCapture3?>
  }
}
