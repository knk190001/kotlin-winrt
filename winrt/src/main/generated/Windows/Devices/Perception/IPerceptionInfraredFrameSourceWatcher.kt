package Windows.Devices.Perception

import Windows.Devices.Enumeration.DeviceWatcherStatus
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

@ABIMarker(IPerceptionInfraredFrameSourceWatcher.ABI::class)
@Signature("{383cff99-d70c-444d-a8b0-720c2e66fe3b}")
@Guid("383cff99d70c444da8b0720c2e66fe3b")
@WinRTInterface("383cff99d70c444da8b0720c2e66fe3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionInfraredFrameSourceWatcher.ByReference::class)
public interface IPerceptionInfraredFrameSourceWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SourceAdded(handler: TypedEventHandler<PerceptionInfraredFrameSourceWatcher?,
      PerceptionInfraredFrameSourceAddedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SourceAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_SourceRemoved(handler: TypedEventHandler<PerceptionInfraredFrameSourceWatcher?,
      PerceptionInfraredFrameSourceRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SourceRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Stopped(handler: TypedEventHandler<PerceptionInfraredFrameSourceWatcher?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public
      fun add_EnumerationCompleted(handler: TypedEventHandler<PerceptionInfraredFrameSourceWatcher?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun get_Status(): DeviceWatcherStatus?

  @InterfaceMethod(9)
  public fun Start(): Unit

  @InterfaceMethod(10)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionInfraredFrameSourceWatcher> {
    public override fun getValue() =
        ABI.makeIPerceptionInfraredFrameSourceWatcher(pointer.getPointer(0))

    public fun setValue(value: IPerceptionInfraredFrameSourceWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionInfraredFrameSourceWatcher {
    public val __1815272350_Ptr: Pointer?

    public val _1815272350_VtblPtr: Pointer?
      get() = __1815272350_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_SourceAdded(handler: TypedEventHandler<PerceptionInfraredFrameSourceWatcher?,
        PerceptionInfraredFrameSourceAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SourceAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_SourceRemoved(handler: TypedEventHandler<PerceptionInfraredFrameSourceWatcher?,
        PerceptionInfraredFrameSourceRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SourceRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_Stopped(handler: TypedEventHandler<PerceptionInfraredFrameSourceWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_EnumerationCompleted(handler: TypedEventHandler<PerceptionInfraredFrameSourceWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Status(): DeviceWatcherStatus? {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun Start(): Unit {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Stop(): Unit {
      val fnPtr = _1815272350_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1815272350_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPerceptionInfraredFrameSourceWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1815272350_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionInfraredFrameSourceWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("383cff99d70c444da8b0720c2e66fe3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionInfraredFrameSourceWatcher(ptr: Pointer?): WithDefault =
        IPerceptionInfraredFrameSourceWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionInfraredFrameSourceWatcher {
      val address = segment.toRawLongValue()
      return makeIPerceptionInfraredFrameSourceWatcher(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionInfraredFrameSourceWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1815272350_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionInfraredFrameSourceWatcher):
        Array<IPerceptionInfraredFrameSourceWatcher?> = (elements as
        Array<IPerceptionInfraredFrameSourceWatcher?>).castToImpl<IPerceptionInfraredFrameSourceWatcher,IPerceptionInfraredFrameSourceWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionInfraredFrameSourceWatcher?> =
        arrayOfNulls<IPerceptionInfraredFrameSourceWatcher_Impl>(size) as
        Array<IPerceptionInfraredFrameSourceWatcher?>
  }
}
