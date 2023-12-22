package Windows.System

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserWatcher.ABI::class)
@Signature("{155eb23b-242a-45e0-a2e9-3171fc6a7fbb}")
@Guid("155eb23b242a45e0a2e93171fc6a7fbb")
@WinRTInterface("155eb23b242a45e0a2e93171fc6a7fbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserWatcher.ByReference::class)
public interface IUserWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): UserWatcherStatus?

  @InterfaceMethod(1)
  public fun Start(): Unit

  @InterfaceMethod(2)
  public fun Stop(): Unit

  @InterfaceMethod(3)
  public fun add_Added(handler: TypedEventHandler<UserWatcher?, UserChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Removed(handler: TypedEventHandler<UserWatcher?, UserChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_Updated(handler: TypedEventHandler<UserWatcher?, UserChangedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun add_AuthenticationStatusChanged(handler: TypedEventHandler<UserWatcher?,
      UserChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_AuthenticationStatusChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_AuthenticationStatusChanging(handler: TypedEventHandler<UserWatcher?,
      UserAuthenticationStatusChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_AuthenticationStatusChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<UserWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_Stopped(handler: TypedEventHandler<UserWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserWatcher> {
    public override fun getValue() = ABI.makeIUserWatcher(pointer.getPointer(0))

    public fun setValue(value: IUserWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserWatcher {
    public val __1507792734_Ptr: Pointer?

    public val _1507792734_VtblPtr: Pointer?
      get() = __1507792734_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): UserWatcherStatus? {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Start(): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Stop(): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Added(handler: TypedEventHandler<UserWatcher?, UserChangedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Removed(handler: TypedEventHandler<UserWatcher?,
        UserChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_Updated(handler: TypedEventHandler<UserWatcher?,
        UserChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_AuthenticationStatusChanged(handler: TypedEventHandler<UserWatcher?,
        UserChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_AuthenticationStatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_AuthenticationStatusChanging(handler: TypedEventHandler<UserWatcher?,
        UserAuthenticationStatusChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_AuthenticationStatusChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_EnumerationCompleted(handler: TypedEventHandler<UserWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_Stopped(handler: TypedEventHandler<UserWatcher?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1507792734_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1507792734_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1507792734_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("155eb23b242a45e0a2e93171fc6a7fbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserWatcher(ptr: Pointer?): WithDefault = IUserWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserWatcher {
      val address = segment.toRawLongValue()
      return makeIUserWatcher(Pointer(address))
    }

    public override fun toNative(obj: IUserWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1507792734_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserWatcher): Array<IUserWatcher?> = (elements as
        Array<IUserWatcher?>).castToImpl<IUserWatcher,IUserWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserWatcher?> =
        arrayOfNulls<IUserWatcher_Impl>(size) as Array<IUserWatcher?>
  }
}
