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

@ABIMarker(IRemoteSystemWatcher.ABI::class)
@Signature("{5d600c7e-2c07-48c5-889c-455d2b099771}")
@Guid("5d600c7e2c0748c5889c455d2b099771")
@WinRTInterface("5d600c7e2c0748c5889c455d2b099771")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemWatcher.ByReference::class)
public interface IRemoteSystemWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Start(): Unit

  @InterfaceMethod(1)
  public fun Stop(): Unit

  @InterfaceMethod(2)
  public fun add_RemoteSystemAdded(handler: TypedEventHandler<RemoteSystemWatcher?,
      RemoteSystemAddedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RemoteSystemAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_RemoteSystemUpdated(handler: TypedEventHandler<RemoteSystemWatcher?,
      RemoteSystemUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_RemoteSystemUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_RemoteSystemRemoved(handler: TypedEventHandler<RemoteSystemWatcher?,
      RemoteSystemRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_RemoteSystemRemoved(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemWatcher> {
    public override fun getValue() = ABI.makeIRemoteSystemWatcher(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemWatcher {
    public val __1335123960_Ptr: Pointer?

    public val _1335123960_VtblPtr: Pointer?
      get() = __1335123960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Start(): Unit {
      val fnPtr = _1335123960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335123960_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Stop(): Unit {
      val fnPtr = _1335123960_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335123960_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_RemoteSystemAdded(handler: TypedEventHandler<RemoteSystemWatcher?,
        RemoteSystemAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1335123960_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1335123960_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RemoteSystemAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1335123960_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335123960_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_RemoteSystemUpdated(handler: TypedEventHandler<RemoteSystemWatcher?,
        RemoteSystemUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1335123960_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1335123960_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_RemoteSystemUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1335123960_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335123960_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_RemoteSystemRemoved(handler: TypedEventHandler<RemoteSystemWatcher?,
        RemoteSystemRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1335123960_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1335123960_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_RemoteSystemRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _1335123960_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1335123960_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoteSystemWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1335123960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d600c7e2c0748c5889c455d2b099771")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemWatcher(ptr: Pointer?): WithDefault = IRemoteSystemWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemWatcher {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemWatcher(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1335123960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemWatcher): Array<IRemoteSystemWatcher?> =
        (elements as
        Array<IRemoteSystemWatcher?>).castToImpl<IRemoteSystemWatcher,IRemoteSystemWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemWatcher?> =
        arrayOfNulls<IRemoteSystemWatcher_Impl>(size) as Array<IRemoteSystemWatcher?>
  }
}
