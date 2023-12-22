package Windows.Media

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaTimelineController2.ABI::class)
@Signature("{ef74ea38-9e72-4df9-8355-6e90c81bbadd}")
@Guid("ef74ea389e724df983556e90c81bbadd")
@WinRTInterface("ef74ea389e724df983556e90c81bbadd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaTimelineController2.ByReference::class)
public interface IMediaTimelineController2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Duration(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun put_Duration(value: IReference<TimeSpan?>?): Unit

  @InterfaceMethod(2)
  public fun get_IsLoopingEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_IsLoopingEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun add_Failed(eventHandler: TypedEventHandler<MediaTimelineController?,
      MediaTimelineControllerFailedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Failed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_Ended(eventHandler: TypedEventHandler<MediaTimelineController?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Ended(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaTimelineController2> {
    public override fun getValue() = ABI.makeIMediaTimelineController2(pointer.getPointer(0))

    public fun setValue(value: IMediaTimelineController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaTimelineController2 {
    public val __1159882335_Ptr: Pointer?

    public val _1159882335_VtblPtr: Pointer?
      get() = __1159882335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Duration(): IReference<TimeSpan?>? {
      val fnPtr = _1159882335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1159882335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Duration(value: IReference<TimeSpan?>?): Unit {
      val fnPtr = _1159882335_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1159882335_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsLoopingEnabled(): Boolean {
      val fnPtr = _1159882335_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1159882335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsLoopingEnabled(value: Boolean): Unit {
      val fnPtr = _1159882335_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1159882335_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Failed(eventHandler: TypedEventHandler<MediaTimelineController?,
        MediaTimelineControllerFailedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1159882335_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1159882335_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Failed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1159882335_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1159882335_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Ended(eventHandler: TypedEventHandler<MediaTimelineController?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1159882335_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1159882335_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Ended(token: EventRegistrationToken?): Unit {
      val fnPtr = _1159882335_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1159882335_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaTimelineController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1159882335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaTimelineController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef74ea389e724df983556e90c81bbadd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaTimelineController2(ptr: Pointer?): WithDefault =
        IMediaTimelineController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaTimelineController2 {
      val address = segment.toRawLongValue()
      return makeIMediaTimelineController2(Pointer(address))
    }

    public override fun toNative(obj: IMediaTimelineController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1159882335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaTimelineController2):
        Array<IMediaTimelineController2?> = (elements as
        Array<IMediaTimelineController2?>).castToImpl<IMediaTimelineController2,IMediaTimelineController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaTimelineController2?> =
        arrayOfNulls<IMediaTimelineController2_Impl>(size) as Array<IMediaTimelineController2?>
  }
}
