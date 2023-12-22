package Microsoft.UI.Input

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInputPointerSource2.ABI::class)
@Signature("{58757e6e-da80-5ad2-a088-b90e8e407379}")
@Guid("58757e6eda805ad2a088b90e8e407379")
@WinRTInterface("58757e6eda805ad2a088b90e8e407379")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPointerSource2.ByReference::class)
public interface IInputPointerSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TrySetDeviceKinds(DeviceKinds: InputPointerSourceDeviceKinds?): Boolean

  @InterfaceMethod(1)
  public fun get_ActivationBehavior(): InputPointerActivationBehavior?

  @InterfaceMethod(2)
  public fun put_ActivationBehavior(value: InputPointerActivationBehavior?): Unit

  @InterfaceMethod(3)
  public fun add_DirectManipulationHitTest(handler: TypedEventHandler<InputPointerSource?,
      PointerEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_DirectManipulationHitTest(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_TouchHitTesting(handler: TypedEventHandler<InputPointerSource?,
      TouchHitTestingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_TouchHitTesting(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputPointerSource2> {
    public override fun getValue() = ABI.makeIInputPointerSource2(pointer.getPointer(0))

    public fun setValue(value: IInputPointerSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPointerSource2 {
    public val __1091861195_Ptr: Pointer?

    public val _1091861195_VtblPtr: Pointer?
      get() = __1091861195_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TrySetDeviceKinds(DeviceKinds: InputPointerSourceDeviceKinds?): Boolean {
      val fnPtr = _1091861195_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1091861195_Ptr, marshalToNative(DeviceKinds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ActivationBehavior(): InputPointerActivationBehavior? {
      val fnPtr = _1091861195_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InputPointerActivationBehavior>()
      val hr = fn.invokeHR(arrayOf(__1091861195_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InputPointerActivationBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_ActivationBehavior(value: InputPointerActivationBehavior?): Unit {
      val fnPtr = _1091861195_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091861195_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun add_DirectManipulationHitTest(handler: TypedEventHandler<InputPointerSource?,
        PointerEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1091861195_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1091861195_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_DirectManipulationHitTest(token: EventRegistrationToken?): Unit {
      val fnPtr = _1091861195_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091861195_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_TouchHitTesting(handler: TypedEventHandler<InputPointerSource?,
        TouchHitTestingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1091861195_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1091861195_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_TouchHitTesting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1091861195_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1091861195_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputPointerSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1091861195_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPointerSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("58757e6eda805ad2a088b90e8e407379")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPointerSource2(ptr: Pointer?): WithDefault = IInputPointerSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPointerSource2 {
      val address = segment.toRawLongValue()
      return makeIInputPointerSource2(Pointer(address))
    }

    public override fun toNative(obj: IInputPointerSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1091861195_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPointerSource2): Array<IInputPointerSource2?> =
        (elements as
        Array<IInputPointerSource2?>).castToImpl<IInputPointerSource2,IInputPointerSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPointerSource2?> =
        arrayOfNulls<IInputPointerSource2_Impl>(size) as Array<IInputPointerSource2?>
  }
}
