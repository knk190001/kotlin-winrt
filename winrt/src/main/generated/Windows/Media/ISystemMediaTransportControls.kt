package Windows.Media

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemMediaTransportControls.ABI::class)
@Signature("{99fa3ff4-1742-42a6-902e-087d41f965ec}")
@Guid("99fa3ff4174242a6902e087d41f965ec")
@WinRTInterface("99fa3ff4174242a6902e087d41f965ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMediaTransportControls.ByReference::class)
public interface ISystemMediaTransportControls : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlaybackStatus(): MediaPlaybackStatus?

  @InterfaceMethod(1)
  public fun put_PlaybackStatus(value: MediaPlaybackStatus?): Unit

  @InterfaceMethod(2)
  public fun get_DisplayUpdater(): SystemMediaTransportControlsDisplayUpdater?

  @InterfaceMethod(3)
  public fun get_SoundLevel(): SoundLevel?

  @InterfaceMethod(4)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_IsEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsPlayEnabled(): Boolean

  @InterfaceMethod(7)
  public fun put_IsPlayEnabled(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsStopEnabled(): Boolean

  @InterfaceMethod(9)
  public fun put_IsStopEnabled(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsPauseEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsPauseEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsRecordEnabled(): Boolean

  @InterfaceMethod(13)
  public fun put_IsRecordEnabled(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_IsFastForwardEnabled(): Boolean

  @InterfaceMethod(15)
  public fun put_IsFastForwardEnabled(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsRewindEnabled(): Boolean

  @InterfaceMethod(17)
  public fun put_IsRewindEnabled(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_IsPreviousEnabled(): Boolean

  @InterfaceMethod(19)
  public fun put_IsPreviousEnabled(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_IsNextEnabled(): Boolean

  @InterfaceMethod(21)
  public fun put_IsNextEnabled(value: Boolean): Unit

  @InterfaceMethod(22)
  public fun get_IsChannelUpEnabled(): Boolean

  @InterfaceMethod(23)
  public fun put_IsChannelUpEnabled(value: Boolean): Unit

  @InterfaceMethod(24)
  public fun get_IsChannelDownEnabled(): Boolean

  @InterfaceMethod(25)
  public fun put_IsChannelDownEnabled(value: Boolean): Unit

  @InterfaceMethod(26)
  public fun add_ButtonPressed(handler: TypedEventHandler<SystemMediaTransportControls?,
      SystemMediaTransportControlsButtonPressedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(27)
  public fun remove_ButtonPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(28)
  public fun add_PropertyChanged(handler: TypedEventHandler<SystemMediaTransportControls?,
      SystemMediaTransportControlsPropertyChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(29)
  public fun remove_PropertyChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMediaTransportControls> {
    public override fun getValue() = ABI.makeISystemMediaTransportControls(pointer.getPointer(0))

    public fun setValue(value: ISystemMediaTransportControls_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMediaTransportControls {
    public val __1633449574_Ptr: Pointer?

    public val _1633449574_VtblPtr: Pointer?
      get() = __1633449574_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlaybackStatus(): MediaPlaybackStatus? {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackStatus>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PlaybackStatus(value: MediaPlaybackStatus?): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DisplayUpdater(): SystemMediaTransportControlsDisplayUpdater? {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemMediaTransportControlsDisplayUpdater>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SystemMediaTransportControlsDisplayUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SoundLevel(): SoundLevel? {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoundLevel>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoundLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsPlayEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsPlayEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsStopEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsStopEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsPauseEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsPauseEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsRecordEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsRecordEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsFastForwardEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsFastForwardEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsRewindEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsRewindEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_IsPreviousEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_IsPreviousEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_IsNextEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_IsNextEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_IsChannelUpEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_IsChannelUpEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_IsChannelDownEnabled(): Boolean {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_IsChannelDownEnabled(value: Boolean): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun add_ButtonPressed(handler: TypedEventHandler<SystemMediaTransportControls?,
        SystemMediaTransportControlsButtonPressedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun remove_ButtonPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override
        fun add_PropertyChanged(handler: TypedEventHandler<SystemMediaTransportControls?,
        SystemMediaTransportControlsPropertyChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(29)
    public override fun remove_PropertyChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1633449574_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1633449574_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemMediaTransportControls_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1633449574_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMediaTransportControls, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99fa3ff4174242a6902e087d41f965ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMediaTransportControls(ptr: Pointer?): WithDefault =
        ISystemMediaTransportControls_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemMediaTransportControls {
      val address = segment.toRawLongValue()
      return makeISystemMediaTransportControls(Pointer(address))
    }

    public override fun toNative(obj: ISystemMediaTransportControls): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1633449574_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMediaTransportControls):
        Array<ISystemMediaTransportControls?> = (elements as
        Array<ISystemMediaTransportControls?>).castToImpl<ISystemMediaTransportControls,ISystemMediaTransportControls_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemMediaTransportControls?> =
        arrayOfNulls<ISystemMediaTransportControls_Impl>(size) as
        Array<ISystemMediaTransportControls?>
  }
}
