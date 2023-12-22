package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IDisplayManager.ABI::class)
@Signature("{4ed9245b-15ec-56e2-9072-7fe5084a31a7}")
@Guid("4ed9245b15ec56e290727fe5084a31a7")
@WinRTInterface("4ed9245b15ec56e290727fe5084a31a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayManager.ByReference::class)
public interface IDisplayManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentTargets(): IVectorView<DisplayTarget?>?

  @InterfaceMethod(1)
  public fun GetCurrentAdapters(): IVectorView<DisplayAdapter?>?

  @InterfaceMethod(2)
  public fun TryAcquireTarget(target: DisplayTarget?): DisplayManagerResult?

  @InterfaceMethod(3)
  public fun ReleaseTarget(target: DisplayTarget?): Unit

  @InterfaceMethod(4)
  public fun TryReadCurrentStateForAllTargets(): DisplayManagerResultWithState?

  @InterfaceMethod(5)
  public fun TryAcquireTargetsAndReadCurrentState(targets: IIterable<DisplayTarget?>?):
      DisplayManagerResultWithState?

  @InterfaceMethod(6)
  public fun TryAcquireTargetsAndCreateEmptyState(targets: IIterable<DisplayTarget?>?):
      DisplayManagerResultWithState?

  @InterfaceMethod(7)
  public fun TryAcquireTargetsAndCreateSubstate(existingState: DisplayState?,
      targets: IIterable<DisplayTarget?>?): DisplayManagerResultWithState?

  @InterfaceMethod(8)
  public fun CreateDisplayDevice(adapter: DisplayAdapter?): DisplayDevice?

  @InterfaceMethod(9)
  public fun add_Enabled(handler: TypedEventHandler<DisplayManager?,
      DisplayManagerEnabledEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_Enabled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_Disabled(handler: TypedEventHandler<DisplayManager?,
      DisplayManagerDisabledEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_Disabled(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun add_Changed(handler: TypedEventHandler<DisplayManager?,
      DisplayManagerChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(14)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(15)
  public fun add_PathsFailedOrInvalidated(handler: TypedEventHandler<DisplayManager?,
      DisplayManagerPathsFailedOrInvalidatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(16)
  public fun remove_PathsFailedOrInvalidated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(17)
  public fun Start(): Unit

  @InterfaceMethod(18)
  public fun Stop(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayManager> {
    public override fun getValue() = ABI.makeIDisplayManager(pointer.getPointer(0))

    public fun setValue(value: IDisplayManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayManager {
    public val __1682026637_Ptr: Pointer?

    public val _1682026637_VtblPtr: Pointer?
      get() = __1682026637_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentTargets(): IVectorView<DisplayTarget?>? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayTarget?>>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayTarget?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentAdapters(): IVectorView<DisplayAdapter?>? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayAdapter?>>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayAdapter?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryAcquireTarget(target: DisplayTarget?): DisplayManagerResult? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayManagerResult>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayManagerResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReleaseTarget(target: DisplayTarget?): Unit {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(target),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun TryReadCurrentStateForAllTargets(): DisplayManagerResultWithState? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayManagerResultWithState>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayManagerResultWithState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun TryAcquireTargetsAndReadCurrentState(targets: IIterable<DisplayTarget?>?):
        DisplayManagerResultWithState? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayManagerResultWithState>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(targets), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayManagerResultWithState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun TryAcquireTargetsAndCreateEmptyState(targets: IIterable<DisplayTarget?>?):
        DisplayManagerResultWithState? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayManagerResultWithState>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(targets), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayManagerResultWithState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun TryAcquireTargetsAndCreateSubstate(existingState: DisplayState?,
        targets: IIterable<DisplayTarget?>?): DisplayManagerResultWithState? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayManagerResultWithState>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(existingState),
          marshalToNative(targets), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayManagerResultWithState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateDisplayDevice(adapter: DisplayAdapter?): DisplayDevice? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayDevice>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(adapter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun add_Enabled(handler: TypedEventHandler<DisplayManager?,
        DisplayManagerEnabledEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_Enabled(token: EventRegistrationToken?): Unit {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_Disabled(handler: TypedEventHandler<DisplayManager?,
        DisplayManagerDisabledEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_Disabled(token: EventRegistrationToken?): Unit {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun add_Changed(handler: TypedEventHandler<DisplayManager?,
        DisplayManagerChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun add_PathsFailedOrInvalidated(handler: TypedEventHandler<DisplayManager?,
        DisplayManagerPathsFailedOrInvalidatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun remove_PathsFailedOrInvalidated(token: EventRegistrationToken?): Unit {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun Start(): Unit {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun Stop(): Unit {
      val fnPtr = _1682026637_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1682026637_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1682026637_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ed9245b15ec56e290727fe5084a31a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayManager(ptr: Pointer?): WithDefault = IDisplayManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayManager {
      val address = segment.toRawLongValue()
      return makeIDisplayManager(Pointer(address))
    }

    public override fun toNative(obj: IDisplayManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1682026637_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayManager): Array<IDisplayManager?> = (elements as
        Array<IDisplayManager?>).castToImpl<IDisplayManager,IDisplayManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayManager?> =
        arrayOfNulls<IDisplayManager_Impl>(size) as Array<IDisplayManager?>
  }
}
