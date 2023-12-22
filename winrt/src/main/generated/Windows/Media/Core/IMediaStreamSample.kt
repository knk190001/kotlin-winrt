package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Storage.Streams.Buffer
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaStreamSample.ABI::class)
@Signature("{5c8db627-4b80-4361-9837-6cb7481ad9d6}")
@Guid("5c8db6274b80436198376cb7481ad9d6")
@WinRTInterface("5c8db6274b80436198376cb7481ad9d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSample.ByReference::class)
public interface IMediaStreamSample : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Processed(handler: TypedEventHandler<MediaStreamSample?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Processed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_Buffer(): Buffer?

  @InterfaceMethod(3)
  public fun get_Timestamp(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_ExtendedProperties(): MediaStreamSamplePropertySet?

  @InterfaceMethod(5)
  public fun get_Protection(): MediaStreamSampleProtectionProperties?

  @InterfaceMethod(6)
  public fun put_DecodeTimestamp(value: TimeSpan?): Unit

  @InterfaceMethod(7)
  public fun get_DecodeTimestamp(): TimeSpan?

  @InterfaceMethod(8)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(9)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(10)
  public fun put_KeyFrame(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun get_KeyFrame(): Boolean

  @InterfaceMethod(12)
  public fun put_Discontinuous(value: Boolean): Unit

  @InterfaceMethod(13)
  public fun get_Discontinuous(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSample> {
    public override fun getValue() = ABI.makeIMediaStreamSample(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSample_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSample {
    public val __2131438873_Ptr: Pointer?

    public val _2131438873_VtblPtr: Pointer?
      get() = __2131438873_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Processed(handler: TypedEventHandler<MediaStreamSample?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Processed(token: EventRegistrationToken?): Unit {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Buffer(): Buffer? {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Buffer>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Buffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Timestamp(): TimeSpan? {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ExtendedProperties(): MediaStreamSamplePropertySet? {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSamplePropertySet>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSamplePropertySet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Protection(): MediaStreamSampleProtectionProperties? {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSampleProtectionProperties>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSampleProtectionProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_DecodeTimestamp(value: TimeSpan?): Unit {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_DecodeTimestamp(): TimeSpan? {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_KeyFrame(value: Boolean): Unit {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_KeyFrame(): Boolean {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_Discontinuous(value: Boolean): Unit {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_Discontinuous(): Boolean {
      val fnPtr = _2131438873_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2131438873_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaStreamSample_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2131438873_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSample, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c8db6274b80436198376cb7481ad9d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSample(ptr: Pointer?): WithDefault = IMediaStreamSample_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSample {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSample(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSample): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2131438873_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSample): Array<IMediaStreamSample?> =
        (elements as
        Array<IMediaStreamSample?>).castToImpl<IMediaStreamSample,IMediaStreamSample_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSample?> =
        arrayOfNulls<IMediaStreamSample_Impl>(size) as Array<IMediaStreamSample?>
  }
}
