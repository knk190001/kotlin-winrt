package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardEmulator2.ABI::class)
@Signature("{fe3fc0b8-8529-411a-807b-48edc2a0ab44}")
@Guid("fe3fc0b88529411a807b48edc2a0ab44")
@WinRTInterface("fe3fc0b88529411a807b48edc2a0ab44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardEmulator2.ByReference::class)
public interface ISmartCardEmulator2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_ApduReceived(value: TypedEventHandler<SmartCardEmulator?,
      SmartCardEmulatorApduReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ApduReceived(value: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_ConnectionDeactivated(value: TypedEventHandler<SmartCardEmulator?,
      SmartCardEmulatorConnectionDeactivatedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_ConnectionDeactivated(value: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun Start(): Unit

  @InterfaceMethod(5)
  public fun IsHostCardEmulationSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulator2> {
    public override fun getValue() = ABI.makeISmartCardEmulator2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulator2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulator2 {
    public val __1441064649_Ptr: Pointer?

    public val _1441064649_VtblPtr: Pointer?
      get() = __1441064649_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ApduReceived(value: TypedEventHandler<SmartCardEmulator?,
        SmartCardEmulatorApduReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1441064649_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1441064649_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ApduReceived(value: EventRegistrationToken?): Unit {
      val fnPtr = _1441064649_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1441064649_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_ConnectionDeactivated(value: TypedEventHandler<SmartCardEmulator?,
        SmartCardEmulatorConnectionDeactivatedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1441064649_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1441064649_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_ConnectionDeactivated(value: EventRegistrationToken?): Unit {
      val fnPtr = _1441064649_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1441064649_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Start(): Unit {
      val fnPtr = _1441064649_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1441064649_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun IsHostCardEmulationSupported(): Boolean {
      val fnPtr = _1441064649_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1441064649_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmartCardEmulator2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1441064649_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulator2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe3fc0b88529411a807b48edc2a0ab44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulator2(ptr: Pointer?): WithDefault = ISmartCardEmulator2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardEmulator2 {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulator2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulator2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1441064649_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulator2): Array<ISmartCardEmulator2?> =
        (elements as
        Array<ISmartCardEmulator2?>).castToImpl<ISmartCardEmulator2,ISmartCardEmulator2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardEmulator2?> =
        arrayOfNulls<ISmartCardEmulator2_Impl>(size) as Array<ISmartCardEmulator2?>
  }
}
