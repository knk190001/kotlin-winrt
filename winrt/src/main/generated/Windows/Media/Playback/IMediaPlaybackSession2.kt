package Windows.Media.Playback

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Media.MediaTimeRange
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaPlaybackSession2.ABI::class)
@Signature("{f8ba7c79-1fc8-4097-ad70-c0fa18cc0050}")
@Guid("f8ba7c791fc84097ad70c0fa18cc0050")
@WinRTInterface("f8ba7c791fc84097ad70c0fa18cc0050")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackSession2.ByReference::class)
public interface IMediaPlaybackSession2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_BufferedRangesChanged(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_BufferedRangesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PlayedRangesChanged(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PlayedRangesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_SeekableRangesChanged(value: TypedEventHandler<MediaPlaybackSession?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SeekableRangesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_SupportedPlaybackRatesChanged(value: TypedEventHandler<MediaPlaybackSession?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_SupportedPlaybackRatesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun get_SphericalVideoProjection(): MediaPlaybackSphericalVideoProjection?

  @InterfaceMethod(9)
  public fun get_IsMirroring(): Boolean

  @InterfaceMethod(10)
  public fun put_IsMirroring(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun GetBufferedRanges(): IVectorView<MediaTimeRange?>?

  @InterfaceMethod(12)
  public fun GetPlayedRanges(): IVectorView<MediaTimeRange?>?

  @InterfaceMethod(13)
  public fun GetSeekableRanges(): IVectorView<MediaTimeRange?>?

  @InterfaceMethod(14)
  public fun IsSupportedPlaybackRateRange(rate1: Double, rate2: Double): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackSession2> {
    public override fun getValue() = ABI.makeIMediaPlaybackSession2(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackSession2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackSession2 {
    public val __1704647394_Ptr: Pointer?

    public val _1704647394_VtblPtr: Pointer?
      get() = __1704647394_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_BufferedRangesChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_BufferedRangesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PlayedRangesChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PlayedRangesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_SeekableRangesChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SeekableRangesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_SupportedPlaybackRatesChanged(value: TypedEventHandler<MediaPlaybackSession?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_SupportedPlaybackRatesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_SphericalVideoProjection(): MediaPlaybackSphericalVideoProjection? {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackSphericalVideoProjection>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackSphericalVideoProjection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_IsMirroring(): Boolean {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsMirroring(value: Boolean): Unit {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun GetBufferedRanges(): IVectorView<MediaTimeRange?>? {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaTimeRange?>>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaTimeRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetPlayedRanges(): IVectorView<MediaTimeRange?>? {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaTimeRange?>>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaTimeRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun GetSeekableRanges(): IVectorView<MediaTimeRange?>? {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MediaTimeRange?>>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MediaTimeRange?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun IsSupportedPlaybackRateRange(rate1: Double, rate2: Double): Boolean {
      val fnPtr = _1704647394_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1704647394_Ptr, rate1, rate2, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaPlaybackSession2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1704647394_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackSession2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8ba7c791fc84097ad70c0fa18cc0050")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackSession2(ptr: Pointer?): WithDefault =
        IMediaPlaybackSession2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackSession2 {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackSession2(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackSession2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1704647394_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackSession2): Array<IMediaPlaybackSession2?> =
        (elements as
        Array<IMediaPlaybackSession2?>).castToImpl<IMediaPlaybackSession2,IMediaPlaybackSession2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackSession2?> =
        arrayOfNulls<IMediaPlaybackSession2_Impl>(size) as Array<IMediaPlaybackSession2?>
  }
}
