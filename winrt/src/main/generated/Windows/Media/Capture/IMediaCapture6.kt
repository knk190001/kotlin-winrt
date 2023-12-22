package Windows.Media.Capture

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Media.Capture.Frames.MediaFrameSource
import Windows.Media.Capture.Frames.MultiSourceMediaFrameReader
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

@ABIMarker(IMediaCapture6.ABI::class)
@Signature("{228948bd-4b20-4bb1-9fd6-a583212a1012}")
@Guid("228948bd4b204bb19fd6a583212a1012")
@WinRTInterface("228948bd4b204bb19fd6a583212a1012")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCapture6.ByReference::class)
public interface IMediaCapture6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_CaptureDeviceExclusiveControlStatusChanged(handler: TypedEventHandler<MediaCapture?,
      MediaCaptureDeviceExclusiveControlStatusChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_CaptureDeviceExclusiveControlStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun CreateMultiSourceFrameReaderAsync(inputSources: IIterable<MediaFrameSource?>?):
      IAsyncOperation<MultiSourceMediaFrameReader?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaCapture6>
      {
    public override fun getValue() = ABI.makeIMediaCapture6(pointer.getPointer(0))

    public fun setValue(value: IMediaCapture6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCapture6 {
    public val __1535274204_Ptr: Pointer?

    public val _1535274204_VtblPtr: Pointer?
      get() = __1535274204_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_CaptureDeviceExclusiveControlStatusChanged(handler: TypedEventHandler<MediaCapture?,
        MediaCaptureDeviceExclusiveControlStatusChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1535274204_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1535274204_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun remove_CaptureDeviceExclusiveControlStatusChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1535274204_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1535274204_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun CreateMultiSourceFrameReaderAsync(inputSources: IIterable<MediaFrameSource?>?):
        IAsyncOperation<MultiSourceMediaFrameReader?>? {
      val fnPtr = _1535274204_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MultiSourceMediaFrameReader?>>()
      val hr = fn.invokeHR(arrayOf(__1535274204_Ptr, marshalToNative(inputSources), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MultiSourceMediaFrameReader?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCapture6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1535274204_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCapture6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("228948bd4b204bb19fd6a583212a1012")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCapture6(ptr: Pointer?): WithDefault = IMediaCapture6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCapture6 {
      val address = segment.toRawLongValue()
      return makeIMediaCapture6(Pointer(address))
    }

    public override fun toNative(obj: IMediaCapture6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1535274204_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCapture6): Array<IMediaCapture6?> = (elements as
        Array<IMediaCapture6?>).castToImpl<IMediaCapture6,IMediaCapture6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCapture6?> =
        arrayOfNulls<IMediaCapture6_Impl>(size) as Array<IMediaCapture6?>
  }
}
