package Windows.Phone.System.Power

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IPowerManagerStatics.ABI::class)
@Signature("{25de8fd0-1c5b-11e1-bddb-0800200c9a66}")
@Guid("25de8fd01c5b11e1bddb0800200c9a66")
@WinRTInterface("25de8fd01c5b11e1bddb0800200c9a66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPowerManagerStatics.ByReference::class)
public interface IPowerManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PowerSavingMode(): PowerSavingMode?

  @InterfaceMethod(1)
  public fun add_PowerSavingModeChanged(changeHandler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_PowerSavingModeChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPowerManagerStatics> {
    public override fun getValue() = ABI.makeIPowerManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPowerManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPowerManagerStatics {
    public val __237326139_Ptr: Pointer?

    public val _237326139_VtblPtr: Pointer?
      get() = __237326139_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PowerSavingMode(): PowerSavingMode? {
      val fnPtr = _237326139_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PowerSavingMode>()
      val hr = fn.invokeHR(arrayOf(__237326139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PowerSavingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_PowerSavingModeChanged(changeHandler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _237326139_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__237326139_Ptr, marshalToNative(changeHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_PowerSavingModeChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _237326139_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__237326139_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPowerManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __237326139_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPowerManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("25de8fd01c5b11e1bddb0800200c9a66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPowerManagerStatics(ptr: Pointer?): WithDefault = IPowerManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPowerManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPowerManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPowerManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__237326139_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPowerManagerStatics): Array<IPowerManagerStatics?> =
        (elements as
        Array<IPowerManagerStatics?>).castToImpl<IPowerManagerStatics,IPowerManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPowerManagerStatics?> =
        arrayOfNulls<IPowerManagerStatics_Impl>(size) as Array<IPowerManagerStatics?>
  }
}
