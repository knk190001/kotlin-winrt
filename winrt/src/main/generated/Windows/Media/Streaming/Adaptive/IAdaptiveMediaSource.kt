package Windows.Media.Streaming.Adaptive

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.Core.IMediaSource
import Windows.Media.Core.IMediaSource.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IAdaptiveMediaSource.ABI::class)
@Signature("{4c7332ef-d39f-4396-b4d9-043957a7c964}")
@Guid("4c7332efd39f4396b4d9043957a7c964")
@WinRTInterface("4c7332efd39f4396b4d9043957a7c964")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSource.ByReference::class)
public interface IAdaptiveMediaSource : NativeMapped, IWinRTInterface, IMediaSource {
  @InterfaceMethod(0)
  public fun get_IsLive(): Boolean

  @InterfaceMethod(1)
  public fun get_DesiredLiveOffset(): TimeSpan?

  @InterfaceMethod(2)
  public fun put_DesiredLiveOffset(value: TimeSpan?): Unit

  @InterfaceMethod(3)
  public fun get_InitialBitrate(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_InitialBitrate(value: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun get_CurrentDownloadBitrate(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_CurrentPlaybackBitrate(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_AvailableBitrates(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(8)
  public fun get_DesiredMinBitrate(): IReference<WinDef.UINT>?

  @InterfaceMethod(9)
  public fun put_DesiredMinBitrate(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(10)
  public fun get_DesiredMaxBitrate(): IReference<WinDef.UINT>?

  @InterfaceMethod(11)
  public fun put_DesiredMaxBitrate(value: IReference<WinDef.UINT>?): Unit

  @InterfaceMethod(12)
  public fun get_AudioOnlyPlayback(): Boolean

  @InterfaceMethod(13)
  public fun get_InboundBitsPerSecond(): WinDef.ULONG

  @InterfaceMethod(14)
  public fun get_InboundBitsPerSecondWindow(): TimeSpan?

  @InterfaceMethod(15)
  public fun put_InboundBitsPerSecondWindow(value: TimeSpan?): Unit

  @InterfaceMethod(16)
  public fun add_DownloadBitrateChanged(handler: TypedEventHandler<AdaptiveMediaSource?,
      AdaptiveMediaSourceDownloadBitrateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_DownloadBitrateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_PlaybackBitrateChanged(handler: TypedEventHandler<AdaptiveMediaSource?,
      AdaptiveMediaSourcePlaybackBitrateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_PlaybackBitrateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_DownloadRequested(handler: TypedEventHandler<AdaptiveMediaSource?,
      AdaptiveMediaSourceDownloadRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_DownloadRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_DownloadCompleted(handler: TypedEventHandler<AdaptiveMediaSource?,
      AdaptiveMediaSourceDownloadCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_DownloadCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun add_DownloadFailed(handler: TypedEventHandler<AdaptiveMediaSource?,
      AdaptiveMediaSourceDownloadFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(25)
  public fun remove_DownloadFailed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSource> {
    public override fun getValue() = ABI.makeIAdaptiveMediaSource(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSource, IMediaSource.WithDefault {
    public val __754966167_Ptr: Pointer?

    public val _754966167_VtblPtr: Pointer?
      get() = __754966167_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsLive(): Boolean {
      val fnPtr = _754966167_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DesiredLiveOffset(): TimeSpan? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DesiredLiveOffset(value: TimeSpan?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_InitialBitrate(): WinDef.UINT {
      val fnPtr = _754966167_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_InitialBitrate(value: WinDef.UINT): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CurrentDownloadBitrate(): WinDef.UINT {
      val fnPtr = _754966167_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_CurrentPlaybackBitrate(): WinDef.UINT {
      val fnPtr = _754966167_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_AvailableBitrates(): IVectorView<WinDef.UINT>? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_DesiredMinBitrate(): IReference<WinDef.UINT>? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_DesiredMinBitrate(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DesiredMaxBitrate(): IReference<WinDef.UINT>? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DesiredMaxBitrate(value: IReference<WinDef.UINT>?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_AudioOnlyPlayback(): Boolean {
      val fnPtr = _754966167_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_InboundBitsPerSecond(): WinDef.ULONG {
      val fnPtr = _754966167_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_InboundBitsPerSecondWindow(): TimeSpan? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_InboundBitsPerSecondWindow(value: TimeSpan?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_DownloadBitrateChanged(handler: TypedEventHandler<AdaptiveMediaSource?,
        AdaptiveMediaSourceDownloadBitrateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_DownloadBitrateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_PlaybackBitrateChanged(handler: TypedEventHandler<AdaptiveMediaSource?,
        AdaptiveMediaSourcePlaybackBitrateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_PlaybackBitrateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_DownloadRequested(handler: TypedEventHandler<AdaptiveMediaSource?,
        AdaptiveMediaSourceDownloadRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_DownloadRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_DownloadCompleted(handler: TypedEventHandler<AdaptiveMediaSource?,
        AdaptiveMediaSourceDownloadCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_DownloadCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun add_DownloadFailed(handler: TypedEventHandler<AdaptiveMediaSource?,
        AdaptiveMediaSourceDownloadFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _754966167_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun remove_DownloadFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _754966167_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__754966167_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdaptiveMediaSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaSource {
    public override val __1076644650_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_754966167_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __754966167_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c7332efd39f4396b4d9043957a7c964")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSource(ptr: Pointer?): WithDefault = IAdaptiveMediaSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSource {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSource(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__754966167_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSource): Array<IAdaptiveMediaSource?> =
        (elements as
        Array<IAdaptiveMediaSource?>).castToImpl<IAdaptiveMediaSource,IAdaptiveMediaSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSource?> =
        arrayOfNulls<IAdaptiveMediaSource_Impl>(size) as Array<IAdaptiveMediaSource?>
  }
}
