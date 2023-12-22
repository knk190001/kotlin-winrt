package Windows.Media.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IAdvancedPhotoCapture.ABI::class)
@Signature("{83ffaafa-6667-44dc-973c-a6bce596aa0f}")
@Guid("83ffaafa666744dc973ca6bce596aa0f")
@WinRTInterface("83ffaafa666744dc973ca6bce596aa0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedPhotoCapture.ByReference::class)
public interface IAdvancedPhotoCapture : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CaptureAsync(): IAsyncOperation<AdvancedCapturedPhoto?>?

  @InterfaceMethod(1)
  public fun CaptureAsync(context: IUnknown?): IAsyncOperation<AdvancedCapturedPhoto?>?

  @InterfaceMethod(2)
  public fun add_OptionalReferencePhotoCaptured(handler: TypedEventHandler<AdvancedPhotoCapture?,
      OptionalReferencePhotoCapturedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_OptionalReferencePhotoCaptured(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_AllPhotosCaptured(handler: TypedEventHandler<AdvancedPhotoCapture?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_AllPhotosCaptured(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun FinishAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedPhotoCapture> {
    public override fun getValue() = ABI.makeIAdvancedPhotoCapture(pointer.getPointer(0))

    public fun setValue(value: IAdvancedPhotoCapture_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedPhotoCapture {
    public val __748501554_Ptr: Pointer?

    public val _748501554_VtblPtr: Pointer?
      get() = __748501554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CaptureAsync(): IAsyncOperation<AdvancedCapturedPhoto?>? {
      val fnPtr = _748501554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AdvancedCapturedPhoto?>>()
      val hr = fn.invokeHR(arrayOf(__748501554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AdvancedCapturedPhoto?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CaptureAsync(context: IUnknown?): IAsyncOperation<AdvancedCapturedPhoto?>? {
      val fnPtr = _748501554_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AdvancedCapturedPhoto?>>()
      val hr = fn.invokeHR(arrayOf(__748501554_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AdvancedCapturedPhoto?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override
        fun add_OptionalReferencePhotoCaptured(handler: TypedEventHandler<AdvancedPhotoCapture?,
        OptionalReferencePhotoCapturedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _748501554_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__748501554_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_OptionalReferencePhotoCaptured(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _748501554_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__748501554_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_AllPhotosCaptured(handler: TypedEventHandler<AdvancedPhotoCapture?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _748501554_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__748501554_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_AllPhotosCaptured(token: EventRegistrationToken?): Unit {
      val fnPtr = _748501554_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__748501554_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun FinishAsync(): IAsyncAction? {
      val fnPtr = _748501554_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__748501554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedPhotoCapture_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __748501554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedPhotoCapture, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83ffaafa666744dc973ca6bce596aa0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedPhotoCapture(ptr: Pointer?): WithDefault =
        IAdvancedPhotoCapture_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedPhotoCapture {
      val address = segment.toRawLongValue()
      return makeIAdvancedPhotoCapture(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedPhotoCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__748501554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedPhotoCapture): Array<IAdvancedPhotoCapture?> =
        (elements as
        Array<IAdvancedPhotoCapture?>).castToImpl<IAdvancedPhotoCapture,IAdvancedPhotoCapture_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedPhotoCapture?> =
        arrayOfNulls<IAdvancedPhotoCapture_Impl>(size) as Array<IAdvancedPhotoCapture?>
  }
}
