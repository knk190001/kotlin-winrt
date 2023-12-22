package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandAccountWatcher.ABI::class)
@Signature("{6bf3335e-23b5-449f-928d-5e0d3e04471d}")
@Guid("6bf3335e23b5449f928d5e0d3e04471d")
@WinRTInterface("6bf3335e23b5449f928d5e0d3e04471d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAccountWatcher.ByReference::class)
public interface IMobileBroadbandAccountWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AccountAdded(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
      MobileBroadbandAccountEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AccountAdded(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_AccountUpdated(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
      MobileBroadbandAccountUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_AccountUpdated(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_AccountRemoved(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
      MobileBroadbandAccountEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_AccountRemoved(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_EnumerationCompleted(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_Stopped(handler: TypedEventHandler<MobileBroadbandAccountWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Stopped(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun get_Status(): MobileBroadbandAccountWatcherStatus?

  @InterfaceMethod(11)
  public fun Start(): Unit

  @InterfaceMethod(12)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAccountWatcher> {
    public override fun getValue() = ABI.makeIMobileBroadbandAccountWatcher(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAccountWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAccountWatcher {
    public val __618476533_Ptr: Pointer?

    public val _618476533_VtblPtr: Pointer?
      get() = __618476533_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_AccountAdded(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
        MobileBroadbandAccountEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _618476533_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AccountAdded(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _618476533_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_AccountUpdated(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
        MobileBroadbandAccountUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _618476533_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_AccountUpdated(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _618476533_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_AccountRemoved(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
        MobileBroadbandAccountEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _618476533_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_AccountRemoved(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _618476533_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_EnumerationCompleted(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _618476533_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_EnumerationCompleted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _618476533_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Stopped(handler: TypedEventHandler<MobileBroadbandAccountWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _618476533_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Stopped(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _618476533_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Status(): MobileBroadbandAccountWatcherStatus? {
      val fnPtr = _618476533_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandAccountWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandAccountWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun Start(): Unit {
      val fnPtr = _618476533_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Stop(): Unit {
      val fnPtr = _618476533_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618476533_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMobileBroadbandAccountWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __618476533_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAccountWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6bf3335e23b5449f928d5e0d3e04471d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAccountWatcher(ptr: Pointer?): WithDefault =
        IMobileBroadbandAccountWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandAccountWatcher {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAccountWatcher(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAccountWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__618476533_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAccountWatcher):
        Array<IMobileBroadbandAccountWatcher?> = (elements as
        Array<IMobileBroadbandAccountWatcher?>).castToImpl<IMobileBroadbandAccountWatcher,IMobileBroadbandAccountWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAccountWatcher?> =
        arrayOfNulls<IMobileBroadbandAccountWatcher_Impl>(size) as
        Array<IMobileBroadbandAccountWatcher?>
  }
}
