package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.Core.IMediaSource.ABI.IID
import Windows.Media.Protection.MediaProtectionManager
import Windows.Storage.FileProperties.MusicProperties
import Windows.Storage.FileProperties.VideoProperties
import Windows.Storage.Streams.IRandomAccessStreamReference
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaStreamSource.ABI::class)
@Signature("{3712d543-45eb-4138-aa62-c01e26f3843f}")
@Guid("3712d54345eb4138aa62c01e26f3843f")
@WinRTInterface("3712d54345eb4138aa62c01e26f3843f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSource.ByReference::class)
public interface IMediaStreamSource : NativeMapped, IWinRTInterface, IMediaSource {
  @InterfaceMethod(0)
  public fun add_Closed(handler: TypedEventHandler<MediaStreamSource?,
      MediaStreamSourceClosedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Starting(handler: TypedEventHandler<MediaStreamSource?,
      MediaStreamSourceStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Starting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Paused(handler: TypedEventHandler<MediaStreamSource?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Paused(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_SampleRequested(handler: TypedEventHandler<MediaStreamSource?,
      MediaStreamSourceSampleRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_SampleRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_SwitchStreamsRequested(handler: TypedEventHandler<MediaStreamSource?,
      MediaStreamSourceSwitchStreamsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_SwitchStreamsRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun NotifyError(errorStatus: MediaStreamSourceErrorStatus?): Unit

  @InterfaceMethod(11)
  public fun AddStreamDescriptor(descriptor: IMediaStreamDescriptor?): Unit

  @InterfaceMethod(12)
  public fun put_MediaProtectionManager(value: MediaProtectionManager?): Unit

  @InterfaceMethod(13)
  public fun get_MediaProtectionManager(): MediaProtectionManager?

  @InterfaceMethod(14)
  public fun put_Duration(value: TimeSpan?): Unit

  @InterfaceMethod(15)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(16)
  public fun put_CanSeek(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun get_CanSeek(): Boolean

  @InterfaceMethod(18)
  public fun put_BufferTime(value: TimeSpan?): Unit

  @InterfaceMethod(19)
  public fun get_BufferTime(): TimeSpan?

  @InterfaceMethod(20)
  public fun SetBufferedRange(startOffset: TimeSpan?, endOffset: TimeSpan?): Unit

  @InterfaceMethod(21)
  public fun get_MusicProperties(): MusicProperties?

  @InterfaceMethod(22)
  public fun get_VideoProperties(): VideoProperties?

  @InterfaceMethod(23)
  public fun put_Thumbnail(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(24)
  public fun get_Thumbnail(): IRandomAccessStreamReference?

  @InterfaceMethod(25)
  public fun AddProtectionKey(
    streamDescriptor: IMediaStreamDescriptor?,
    keyIdentifier: Array<Byte>,
    licenseData: Array<Byte>
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSource> {
    public override fun getValue() = ABI.makeIMediaStreamSource(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSource, IMediaSource.WithDefault {
    public val __2144608138_Ptr: Pointer?

    public val _2144608138_VtblPtr: Pointer?
      get() = __2144608138_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Closed(handler: TypedEventHandler<MediaStreamSource?,
        MediaStreamSourceClosedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Starting(handler: TypedEventHandler<MediaStreamSource?,
        MediaStreamSourceStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Starting(token: EventRegistrationToken?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Paused(handler: TypedEventHandler<MediaStreamSource?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Paused(token: EventRegistrationToken?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_SampleRequested(handler: TypedEventHandler<MediaStreamSource?,
        MediaStreamSourceSampleRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_SampleRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_SwitchStreamsRequested(handler: TypedEventHandler<MediaStreamSource?,
        MediaStreamSourceSwitchStreamsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_SwitchStreamsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun NotifyError(errorStatus: MediaStreamSourceErrorStatus?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(errorStatus),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun AddStreamDescriptor(descriptor: IMediaStreamDescriptor?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(descriptor),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun put_MediaProtectionManager(value: MediaProtectionManager?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_MediaProtectionManager(): MediaProtectionManager? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaProtectionManager>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaProtectionManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_Duration(value: TimeSpan?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_CanSeek(value: Boolean): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_CanSeek(): Boolean {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_BufferTime(value: TimeSpan?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_BufferTime(): TimeSpan? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun SetBufferedRange(startOffset: TimeSpan?, endOffset: TimeSpan?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(startOffset),
          marshalToNative(endOffset),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun get_MusicProperties(): MusicProperties? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MusicProperties>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MusicProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun get_VideoProperties(): VideoProperties? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoProperties>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun put_Thumbnail(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_Thumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun AddProtectionKey(
      streamDescriptor: IMediaStreamDescriptor?,
      keyIdentifier: Array<Byte>,
      licenseData: Array<Byte>
    ): Unit {
      val fnPtr = _2144608138_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2144608138_Ptr, marshalToNative(streamDescriptor),
          keyIdentifier.size,marshalToNative(keyIdentifier),
          licenseData.size,marshalToNative(licenseData),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaStreamSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaSource {
    public override val __1076644650_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2144608138_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2144608138_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3712d54345eb4138aa62c01e26f3843f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSource(ptr: Pointer?): WithDefault = IMediaStreamSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSource {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSource(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2144608138_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSource): Array<IMediaStreamSource?> =
        (elements as
        Array<IMediaStreamSource?>).castToImpl<IMediaStreamSource,IMediaStreamSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSource?> =
        arrayOfNulls<IMediaStreamSource_Impl>(size) as Array<IMediaStreamSource?>
  }
}
