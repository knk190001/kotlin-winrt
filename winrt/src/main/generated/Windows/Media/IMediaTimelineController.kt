package Windows.Media

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaTimelineController.ABI::class)
@Signature("{8ed361f3-0b78-4360-bf71-0c841999ea1b}")
@Guid("8ed361f30b784360bf710c841999ea1b")
@WinRTInterface("8ed361f30b784360bf710c841999ea1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTimelineController.ByReference::class)
public interface IMediaTimelineController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Resume(): Unit

  @InterfaceMethod(2)
  public fun Pause(): Unit

  @InterfaceMethod(3)
  public fun get_Position(): TimeSpan?

  @InterfaceMethod(4)
  public fun put_Position(value: TimeSpan?): Unit

  @InterfaceMethod(5)
  public fun get_ClockRate(): Double

  @InterfaceMethod(6)
  public fun put_ClockRate(value: Double): Unit

  @InterfaceMethod(7)
  public fun get_State(): MediaTimelineControllerState?

  @InterfaceMethod(8)
  public
      fun add_PositionChanged(positionChangedEventHandler: TypedEventHandler<MediaTimelineController?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_PositionChanged(eventCookie: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_StateChanged(stateChangedEventHandler: TypedEventHandler<MediaTimelineController?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_StateChanged(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTimelineController> {
    public override fun getValue() = ABI.makeIMediaTimelineController(pointer.getPointer(0))

    public fun setValue(value: IMediaTimelineController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTimelineController {
    public val __1902247089_Ptr: Pointer?

    public val _1902247089_VtblPtr: Pointer?
      get() = __1902247089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Resume(): Unit {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Pause(): Unit {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Position(): TimeSpan? {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Position(value: TimeSpan?): Unit {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ClockRate(): Double {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_ClockRate(value: Double): Unit {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_State(): MediaTimelineControllerState? {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaTimelineControllerState>()
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaTimelineControllerState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override
        fun add_PositionChanged(positionChangedEventHandler: TypedEventHandler<MediaTimelineController?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, marshalToNative(positionChangedEventHandler),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_PositionChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun add_StateChanged(stateChangedEventHandler: TypedEventHandler<MediaTimelineController?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, marshalToNative(stateChangedEventHandler),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_StateChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1902247089_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1902247089_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaTimelineController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1902247089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTimelineController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ed361f30b784360bf710c841999ea1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTimelineController(ptr: Pointer?): WithDefault =
        IMediaTimelineController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTimelineController {
      val address = segment.toRawLongValue()
      return makeIMediaTimelineController(Pointer(address))
    }

    public override fun toNative(obj: IMediaTimelineController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1902247089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTimelineController):
        Array<IMediaTimelineController?> = (elements as
        Array<IMediaTimelineController?>).castToImpl<IMediaTimelineController,IMediaTimelineController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTimelineController?> =
        arrayOfNulls<IMediaTimelineController_Impl>(size) as Array<IMediaTimelineController?>
  }
}
