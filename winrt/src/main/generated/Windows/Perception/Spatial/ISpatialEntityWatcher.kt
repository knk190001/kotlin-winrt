package Windows.Perception.Spatial

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

@ABIMarker(ISpatialEntityWatcher.ABI::class)
@Signature("{b3b85fa0-6d5e-4bbc-805d-5fe5b9ba1959}")
@Guid("b3b85fa06d5e4bbc805d5fe5b9ba1959")
@WinRTInterface("b3b85fa06d5e4bbc805d5fe5b9ba1959")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialEntityWatcher.ByReference::class)
public interface ISpatialEntityWatcher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): SpatialEntityWatcherStatus?

  @InterfaceMethod(1)
  public fun add_Added(handler: TypedEventHandler<SpatialEntityWatcher?,
      SpatialEntityAddedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_Added(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_Updated(handler: TypedEventHandler<SpatialEntityWatcher?,
      SpatialEntityUpdatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_Updated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Removed(handler: TypedEventHandler<SpatialEntityWatcher?,
      SpatialEntityRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Removed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_EnumerationCompleted(handler: TypedEventHandler<SpatialEntityWatcher?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(9)
  public fun Start(): Unit

  @InterfaceMethod(10)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialEntityWatcher> {
    public override fun getValue() = ABI.makeISpatialEntityWatcher(pointer.getPointer(0))

    public fun setValue(value: ISpatialEntityWatcher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialEntityWatcher {
    public val __584896200_Ptr: Pointer?

    public val _584896200_VtblPtr: Pointer?
      get() = __584896200_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): SpatialEntityWatcherStatus? {
      val fnPtr = _584896200_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialEntityWatcherStatus>()
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialEntityWatcherStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_Added(handler: TypedEventHandler<SpatialEntityWatcher?,
        SpatialEntityAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _584896200_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_Added(token: EventRegistrationToken?): Unit {
      val fnPtr = _584896200_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_Updated(handler: TypedEventHandler<SpatialEntityWatcher?,
        SpatialEntityUpdatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _584896200_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_Updated(token: EventRegistrationToken?): Unit {
      val fnPtr = _584896200_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Removed(handler: TypedEventHandler<SpatialEntityWatcher?,
        SpatialEntityRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _584896200_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Removed(token: EventRegistrationToken?): Unit {
      val fnPtr = _584896200_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_EnumerationCompleted(handler: TypedEventHandler<SpatialEntityWatcher?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _584896200_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_EnumerationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _584896200_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Start(): Unit {
      val fnPtr = _584896200_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Stop(): Unit {
      val fnPtr = _584896200_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__584896200_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpatialEntityWatcher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __584896200_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialEntityWatcher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3b85fa06d5e4bbc805d5fe5b9ba1959")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialEntityWatcher(ptr: Pointer?): WithDefault =
        ISpatialEntityWatcher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialEntityWatcher {
      val address = segment.toRawLongValue()
      return makeISpatialEntityWatcher(Pointer(address))
    }

    public override fun toNative(obj: ISpatialEntityWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__584896200_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialEntityWatcher): Array<ISpatialEntityWatcher?> =
        (elements as
        Array<ISpatialEntityWatcher?>).castToImpl<ISpatialEntityWatcher,ISpatialEntityWatcher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialEntityWatcher?> =
        arrayOfNulls<ISpatialEntityWatcher_Impl>(size) as Array<ISpatialEntityWatcher?>
  }
}
