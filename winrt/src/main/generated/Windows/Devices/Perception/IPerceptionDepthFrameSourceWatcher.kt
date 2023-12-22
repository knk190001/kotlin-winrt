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

@ABIMarker(IPerceptionDepthFrameSourceWatcher.ABI::class)
@Signature("{780e96d1-8d02-4d2b-ada4-5ba624a0eb10}")
@Guid("780e96d18d024d2bada45ba624a0eb10")
@WinRTInterface("780e96d18d024d2bada45ba624a0eb10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionDepthFrameSourceWatcher.ByReference::class)
public interface IPerceptionDepthFrameSourceWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SourceAdded(handler: TypedEventHandler<PerceptionDepthFrameSourceWatcher?,
      PerceptionDepthFrameSourceAddedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SourceAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_SourceRemoved(handler: TypedEventHandler<PerceptionDepthFrameSourceWatcher?,
      PerceptionDepthFrameSourceRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SourceRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Stopped(handler: TypedEventHandler<PerceptionDepthFrameSourceWatcher?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Stopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<PerceptionDepthFrameSourceWatcher?,
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
      IByReference<IPerceptionDepthFrameSourceWatcher> {
    public override fun getValue() =
        ABI.makeIPerceptionDepthFrameSourceWatcher(pointer.getPointer(0))

    public fun setValue(value: IPerceptionDepthFrameSourceWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionDepthFrameSourceWatcher {
    public val __1156471062_Ptr: Pointer?

    public val _1156471062_VtblPtr: Pointer?
      get() = __1156471062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_SourceAdded(handler: TypedEventHandler<PerceptionDepthFrameSourceWatcher?,
        PerceptionDepthFrameSourceAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SourceAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_SourceRemoved(handler: TypedEventHandler<PerceptionDepthFrameSourceWatcher?,
        PerceptionDepthFrameSourceRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SourceRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Stopped(handler: TypedEventHandler<PerceptionDepthFrameSourceWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Stopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_EnumerationCompleted(handler: TypedEventHandler<PerceptionDepthFrameSourceWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Status(): DeviceWatcherStatus? {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun Start(): Unit {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Stop(): Unit {
      val fnPtr = _1156471062_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1156471062_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPerceptionDepthFrameSourceWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1156471062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionDepthFrameSourceWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("780e96d18d024d2bada45ba624a0eb10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionDepthFrameSourceWatcher(ptr: Pointer?): WithDefault =
        IPerceptionDepthFrameSourceWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionDepthFrameSourceWatcher {
      val address = segment.toRawLongValue()
      return makeIPerceptionDepthFrameSourceWatcher(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionDepthFrameSourceWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1156471062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionDepthFrameSourceWatcher):
        Array<IPerceptionDepthFrameSourceWatcher?> = (elements as
        Array<IPerceptionDepthFrameSourceWatcher?>).castToImpl<IPerceptionDepthFrameSourceWatcher,IPerceptionDepthFrameSourceWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionDepthFrameSourceWatcher?> =
        arrayOfNulls<IPerceptionDepthFrameSourceWatcher_Impl>(size) as
        Array<IPerceptionDepthFrameSourceWatcher?>
  }
}
