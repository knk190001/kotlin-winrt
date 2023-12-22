package Windows.UI.Input

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

@ABIMarker(ISystemButtonEventController.ABI::class)
@Signature("{59b893a9-73bc-52b5-ba41-82511b2cb46c}")
@Guid("59b893a973bc52b5ba4182511b2cb46c")
@WinRTInterface("59b893a973bc52b5ba4182511b2cb46c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemButtonEventController.ByReference::class)
public interface ISystemButtonEventController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_SystemFunctionButtonPressed(handler: TypedEventHandler<SystemButtonEventController?,
      SystemFunctionButtonEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SystemFunctionButtonPressed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public
      fun add_SystemFunctionButtonReleased(handler: TypedEventHandler<SystemButtonEventController?,
      SystemFunctionButtonEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_SystemFunctionButtonReleased(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_SystemFunctionLockChanged(handler: TypedEventHandler<SystemButtonEventController?,
      SystemFunctionLockChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_SystemFunctionLockChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public
      fun add_SystemFunctionLockIndicatorChanged(handler: TypedEventHandler<SystemButtonEventController?,
      SystemFunctionLockIndicatorChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_SystemFunctionLockIndicatorChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemButtonEventController> {
    public override fun getValue() = ABI.makeISystemButtonEventController(pointer.getPointer(0))

    public fun setValue(value: ISystemButtonEventController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemButtonEventController {
    public val __1425341497_Ptr: Pointer?

    public val _1425341497_VtblPtr: Pointer?
      get() = __1425341497_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_SystemFunctionButtonPressed(handler: TypedEventHandler<SystemButtonEventController?,
        SystemFunctionButtonEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1425341497_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1425341497_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SystemFunctionButtonPressed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1425341497_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425341497_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_SystemFunctionButtonReleased(handler: TypedEventHandler<SystemButtonEventController?,
        SystemFunctionButtonEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1425341497_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1425341497_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_SystemFunctionButtonReleased(token: EventRegistrationToken?): Unit {
      val fnPtr = _1425341497_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425341497_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override
        fun add_SystemFunctionLockChanged(handler: TypedEventHandler<SystemButtonEventController?,
        SystemFunctionLockChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1425341497_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1425341497_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_SystemFunctionLockChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1425341497_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425341497_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_SystemFunctionLockIndicatorChanged(handler: TypedEventHandler<SystemButtonEventController?,
        SystemFunctionLockIndicatorChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1425341497_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1425341497_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_SystemFunctionLockIndicatorChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1425341497_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1425341497_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemButtonEventController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1425341497_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemButtonEventController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59b893a973bc52b5ba4182511b2cb46c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemButtonEventController(ptr: Pointer?): WithDefault =
        ISystemButtonEventController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemButtonEventController {
      val address = segment.toRawLongValue()
      return makeISystemButtonEventController(Pointer(address))
    }

    public override fun toNative(obj: ISystemButtonEventController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1425341497_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemButtonEventController):
        Array<ISystemButtonEventController?> = (elements as
        Array<ISystemButtonEventController?>).castToImpl<ISystemButtonEventController,ISystemButtonEventController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemButtonEventController?> =
        arrayOfNulls<ISystemButtonEventController_Impl>(size) as
        Array<ISystemButtonEventController?>
  }
}
