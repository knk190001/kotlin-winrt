package Windows.UI.Input.Spatial

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Perception.PerceptionTimestamp
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

@ABIMarker(ISpatialInteractionManager.ABI::class)
@Signature("{32a64ea8-a15a-3995-b8bd-80513cb5adef}")
@Guid("32a64ea8a15a3995b8bd80513cb5adef")
@WinRTInterface("32a64ea8a15a3995b8bd80513cb5adef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionManager.ByReference::class)
public interface ISpatialInteractionManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_SourceDetected(handler: TypedEventHandler<SpatialInteractionManager?,
      SpatialInteractionSourceEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SourceDetected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_SourceLost(handler: TypedEventHandler<SpatialInteractionManager?,
      SpatialInteractionSourceEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SourceLost(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_SourceUpdated(handler: TypedEventHandler<SpatialInteractionManager?,
      SpatialInteractionSourceEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SourceUpdated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_SourcePressed(handler: TypedEventHandler<SpatialInteractionManager?,
      SpatialInteractionSourceEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_SourcePressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_SourceReleased(handler: TypedEventHandler<SpatialInteractionManager?,
      SpatialInteractionSourceEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_SourceReleased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_InteractionDetected(handler: TypedEventHandler<SpatialInteractionManager?,
      SpatialInteractionDetectedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_InteractionDetected(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun GetDetectedSourcesAtTimestamp(timeStamp: PerceptionTimestamp?):
      IVectorView<SpatialInteractionSourceState?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionManager> {
    public override fun getValue() = ABI.makeISpatialInteractionManager(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionManager {
    public val __1005365959_Ptr: Pointer?

    public val _1005365959_VtblPtr: Pointer?
      get() = __1005365959_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_SourceDetected(handler: TypedEventHandler<SpatialInteractionManager?,
        SpatialInteractionSourceEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SourceDetected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_SourceLost(handler: TypedEventHandler<SpatialInteractionManager?,
        SpatialInteractionSourceEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SourceLost(token: EventRegistrationToken?): Unit {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_SourceUpdated(handler: TypedEventHandler<SpatialInteractionManager?,
        SpatialInteractionSourceEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SourceUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_SourcePressed(handler: TypedEventHandler<SpatialInteractionManager?,
        SpatialInteractionSourceEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_SourcePressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_SourceReleased(handler: TypedEventHandler<SpatialInteractionManager?,
        SpatialInteractionSourceEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_SourceReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override
        fun add_InteractionDetected(handler: TypedEventHandler<SpatialInteractionManager?,
        SpatialInteractionDetectedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_InteractionDetected(token: EventRegistrationToken?): Unit {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun GetDetectedSourcesAtTimestamp(timeStamp: PerceptionTimestamp?):
        IVectorView<SpatialInteractionSourceState?>? {
      val fnPtr = _1005365959_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SpatialInteractionSourceState?>>()
      val hr = fn.invokeHR(arrayOf(__1005365959_Ptr, marshalToNative(timeStamp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<SpatialInteractionSourceState?>>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1005365959_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("32a64ea8a15a3995b8bd80513cb5adef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionManager(ptr: Pointer?): WithDefault =
        ISpatialInteractionManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionManager {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionManager(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1005365959_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionManager):
        Array<ISpatialInteractionManager?> = (elements as
        Array<ISpatialInteractionManager?>).castToImpl<ISpatialInteractionManager,ISpatialInteractionManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionManager?> =
        arrayOfNulls<ISpatialInteractionManager_Impl>(size) as Array<ISpatialInteractionManager?>
  }
}
