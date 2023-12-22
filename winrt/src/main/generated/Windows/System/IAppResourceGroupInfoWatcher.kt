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

@ABIMarker(IAppResourceGroupInfoWatcher.ABI::class)
@Signature("{d9b0a0fd-6e5a-4c72-8b17-09fec4a212bd}")
@Guid("d9b0a0fd6e5a4c728b1709fec4a212bd")
@WinRTInterface("d9b0a0fd6e5a4c728b1709fec4a212bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppResourceGroupInfoWatcher.ByReference::class)
public interface IAppResourceGroupInfoWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Added(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
      AppResourceGroupInfoWatcherEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Removed(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
      AppResourceGroupInfoWatcherEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_Stopped(handler: TypedEventHandler<AppResourceGroupInfoWatcher?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_ExecutionStateChanged(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
      AppResourceGroupInfoWatcherExecutionStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_ExecutionStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun get_Status(): AppResourceGroupInfoWatcherStatus?

  @InterfaceMethod(11)
  public fun Start(): Unit

  @InterfaceMethod(12)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppResourceGroupInfoWatcher> {
    public override fun getValue() = ABI.makeIAppResourceGroupInfoWatcher(pointer.getPointer(0))

    public fun setValue(value: IAppResourceGroupInfoWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppResourceGroupInfoWatcher {
    public val __421882831_Ptr: Pointer?

    public val _421882831_VtblPtr: Pointer?
      get() = __421882831_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Added(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
        AppResourceGroupInfoWatcherEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _421882831_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _421882831_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Removed(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
        AppResourceGroupInfoWatcherEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _421882831_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _421882831_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_EnumerationCompleted(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _421882831_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _421882831_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Stopped(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _421882831_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _421882831_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override
        fun add_ExecutionStateChanged(handler: TypedEventHandler<AppResourceGroupInfoWatcher?,
        AppResourceGroupInfoWatcherExecutionStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _421882831_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_ExecutionStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _421882831_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Status(): AppResourceGroupInfoWatcherStatus? {
      val fnPtr = _421882831_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppResourceGroupInfoWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppResourceGroupInfoWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun Start(): Unit {
      val fnPtr = _421882831_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun Stop(): Unit {
      val fnPtr = _421882831_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__421882831_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppResourceGroupInfoWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __421882831_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppResourceGroupInfoWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9b0a0fd6e5a4c728b1709fec4a212bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppResourceGroupInfoWatcher(ptr: Pointer?): WithDefault =
        IAppResourceGroupInfoWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppResourceGroupInfoWatcher {
      val address = segment.toRawLongValue()
      return makeIAppResourceGroupInfoWatcher(Pointer(address))
    }

    public override fun toNative(obj: IAppResourceGroupInfoWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__421882831_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppResourceGroupInfoWatcher):
        Array<IAppResourceGroupInfoWatcher?> = (elements as
        Array<IAppResourceGroupInfoWatcher?>).castToImpl<IAppResourceGroupInfoWatcher,IAppResourceGroupInfoWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppResourceGroupInfoWatcher?> =
        arrayOfNulls<IAppResourceGroupInfoWatcher_Impl>(size) as
        Array<IAppResourceGroupInfoWatcher?>
  }
}
