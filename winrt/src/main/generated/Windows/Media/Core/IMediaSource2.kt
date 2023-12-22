package Windows.Media.Core

import Windows.Foundation.Collections.IObservableVector
import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.Playback.IMediaPlaybackSource
import Windows.Media.Playback.IMediaPlaybackSource.ABI.IID
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

@ABIMarker(IMediaSource2.ABI::class)
@Signature("{2eb61048-655f-4c37-b813-b4e45dfa0abe}")
@Guid("2eb61048655f4c37b813b4e45dfa0abe")
@WinRTInterface("2eb61048655f4c37b813b4e45dfa0abe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSource2.ByReference::class)
public interface IMediaSource2 : NativeMapped, IWinRTInterface, IMediaPlaybackSource, IClosable {
  @InterfaceMethod(0)
  public fun add_OpenOperationCompleted(handler: TypedEventHandler<MediaSource?,
      MediaSourceOpenOperationCompletedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_OpenOperationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_CustomProperties(): ValueSet?

  @InterfaceMethod(3)
  public fun get_Duration(): IReference<TimeSpan?>?

  @InterfaceMethod(4)
  public fun get_IsOpen(): Boolean

  @InterfaceMethod(5)
  public fun get_ExternalTimedTextSources(): IObservableVector<TimedTextSource?>?

  @InterfaceMethod(6)
  public fun get_ExternalTimedMetadataTracks(): IObservableVector<TimedMetadataTrack?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaSource2>
      {
    public override fun getValue() = ABI.makeIMediaSource2(pointer.getPointer(0))

    public fun setValue(value: IMediaSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSource2, IMediaPlaybackSource.WithDefault,
      IClosable.WithDefault {
    public val __983754168_Ptr: Pointer?

    public val _983754168_VtblPtr: Pointer?
      get() = __983754168_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_OpenOperationCompleted(handler: TypedEventHandler<MediaSource?,
        MediaSourceOpenOperationCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _983754168_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__983754168_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_OpenOperationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _983754168_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__983754168_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CustomProperties(): ValueSet? {
      val fnPtr = _983754168_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__983754168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Duration(): IReference<TimeSpan?>? {
      val fnPtr = _983754168_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__983754168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsOpen(): Boolean {
      val fnPtr = _983754168_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__983754168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_ExternalTimedTextSources(): IObservableVector<TimedTextSource?>? {
      val fnPtr = _983754168_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<TimedTextSource?>>()
      val hr = fn.invokeHR(arrayOf(__983754168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<TimedTextSource?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ExternalTimedMetadataTracks(): IObservableVector<TimedMetadataTrack?>? {
      val fnPtr = _983754168_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<TimedMetadataTrack?>>()
      val hr = fn.invokeHR(arrayOf(__983754168_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<TimedMetadataTrack?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaPlaybackSource, IClosable
      {
    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754168_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754168_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __983754168_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2eb61048655f4c37b813b4e45dfa0abe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSource2(ptr: Pointer?): WithDefault = IMediaSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSource2 {
      val address = segment.toRawLongValue()
      return makeIMediaSource2(Pointer(address))
    }

    public override fun toNative(obj: IMediaSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__983754168_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSource2): Array<IMediaSource2?> = (elements as
        Array<IMediaSource2?>).castToImpl<IMediaSource2,IMediaSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSource2?> =
        arrayOfNulls<IMediaSource2_Impl>(size) as Array<IMediaSource2?>
  }
}
