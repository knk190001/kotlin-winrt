package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemSessionParticipantWatcher.ABI::class)
@Signature("{dcdd02cc-aa87-4d79-b6cc-4459b3e92075}")
@Guid("dcdd02ccaa874d79b6cc4459b3e92075")
@WinRTInterface("dcdd02ccaa874d79b6cc4459b3e92075")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionParticipantWatcher.ByReference::class)
public interface IRemoteSystemSessionParticipantWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Stop(): Unit

  @InterfaceMethod(2)
  public fun get_Status(): RemoteSystemSessionParticipantWatcherStatus?

  @InterfaceMethod(3)
  public fun add_Added(handler: TypedEventHandler<RemoteSystemSessionParticipantWatcher?,
      RemoteSystemSessionParticipantAddedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Removed(handler: TypedEventHandler<RemoteSystemSessionParticipantWatcher?,
      RemoteSystemSessionParticipantRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public
      fun add_EnumerationCompleted(handler: TypedEventHandler<RemoteSystemSessionParticipantWatcher?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionParticipantWatcher> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionParticipantWatcher(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionParticipantWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionParticipantWatcher {
    public val __1471945845_Ptr: Pointer?

    public val _1471945845_VtblPtr: Pointer?
      get() = __1471945845_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Stop(): Unit {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Status(): RemoteSystemSessionParticipantWatcherStatus? {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionParticipantWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<RemoteSystemSessionParticipantWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_Added(handler: TypedEventHandler<RemoteSystemSessionParticipantWatcher?,
        RemoteSystemSessionParticipantAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override
        fun add_Removed(handler: TypedEventHandler<RemoteSystemSessionParticipantWatcher?,
        RemoteSystemSessionParticipantRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override
        fun add_EnumerationCompleted(handler: TypedEventHandler<RemoteSystemSessionParticipantWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1471945845_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1471945845_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteSystemSessionParticipantWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1471945845_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionParticipantWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dcdd02ccaa874d79b6cc4459b3e92075")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionParticipantWatcher(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionParticipantWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionParticipantWatcher {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionParticipantWatcher(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionParticipantWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1471945845_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionParticipantWatcher):
        Array<IRemoteSystemSessionParticipantWatcher?> = (elements as
        Array<IRemoteSystemSessionParticipantWatcher?>).castToImpl<IRemoteSystemSessionParticipantWatcher,IRemoteSystemSessionParticipantWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionParticipantWatcher?> =
        arrayOfNulls<IRemoteSystemSessionParticipantWatcher_Impl>(size) as
        Array<IRemoteSystemSessionParticipantWatcher?>
  }
}
