package Windows.Media

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaControl.ABI::class)
@Signature("{98f1fbe1-7a8d-42cb-b6fe-8fe698264f13}")
@Guid("98f1fbe17a8d42cbb6fe8fe698264f13")
@WinRTInterface("98f1fbe17a8d42cbb6fe8fe698264f13")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaControl.ByReference::class)
public interface IMediaControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SoundLevelChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SoundLevelChanged(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_PlayPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_PlayPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_PausePressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_PausePressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_StopPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_StopPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_PlayPauseTogglePressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PlayPauseTogglePressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_RecordPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_RecordPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_NextTrackPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_NextTrackPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_PreviousTrackPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_PreviousTrackPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_FastForwardPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_FastForwardPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_RewindPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_RewindPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun add_ChannelUpPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(21)
  public fun remove_ChannelUpPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(22)
  public fun add_ChannelDownPressed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(23)
  public fun remove_ChannelDownPressed(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(24)
  public fun get_SoundLevel(): SoundLevel?

  @InterfaceMethod(25)
  public fun put_TrackName(value: String?): Unit

  @InterfaceMethod(26)
  public fun get_TrackName(): String?

  @InterfaceMethod(27)
  public fun put_ArtistName(value: String?): Unit

  @InterfaceMethod(28)
  public fun get_ArtistName(): String?

  @InterfaceMethod(29)
  public fun put_IsPlaying(value: Boolean): Unit

  @InterfaceMethod(30)
  public fun get_IsPlaying(): Boolean

  @InterfaceMethod(31)
  public fun put_AlbumArt(value: Uri?): Unit

  @InterfaceMethod(32)
  public fun get_AlbumArt(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaControl>
      {
    public override fun getValue() = ABI.makeIMediaControl(pointer.getPointer(0))

    public fun setValue(value: IMediaControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaControl {
    public val __353308649_Ptr: Pointer?

    public val _353308649_VtblPtr: Pointer?
      get() = __353308649_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SoundLevelChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SoundLevelChanged(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_PlayPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_PlayPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_PausePressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_PausePressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_StopPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_StopPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_PlayPauseTogglePressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PlayPauseTogglePressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_RecordPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_RecordPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_NextTrackPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_NextTrackPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_PreviousTrackPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_PreviousTrackPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_FastForwardPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_FastForwardPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_RewindPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_RewindPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun add_ChannelUpPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun remove_ChannelUpPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun add_ChannelDownPressed(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun remove_ChannelDownPressed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_SoundLevel(): SoundLevel? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoundLevel>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoundLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun put_TrackName(value: String?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_TrackName(): String? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun put_ArtistName(value: String?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_ArtistName(): String? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun put_IsPlaying(value: Boolean): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_IsPlaying(): Boolean {
      val fnPtr = _353308649_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_AlbumArt(value: Uri?): Unit {
      val fnPtr = _353308649_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_AlbumArt(): Uri? {
      val fnPtr = _353308649_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__353308649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IMediaControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __353308649_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("98f1fbe17a8d42cbb6fe8fe698264f13")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaControl(ptr: Pointer?): WithDefault = IMediaControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaControl {
      val address = segment.toRawLongValue()
      return makeIMediaControl(Pointer(address))
    }

    public override fun toNative(obj: IMediaControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__353308649_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaControl): Array<IMediaControl?> = (elements as
        Array<IMediaControl?>).castToImpl<IMediaControl,IMediaControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaControl?> =
        arrayOfNulls<IMediaControl_Impl>(size) as Array<IMediaControl?>
  }
}
