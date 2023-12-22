package Windows.ApplicationModel.Appointments

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentParticipant.ABI::class)
@Signature("{615e2902-9718-467b-83fb-b293a19121de}")
@Guid("615e29029718467b83fbb293a19121de")
@WinRTInterface("615e29029718467b83fbb293a19121de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentParticipant.ByReference::class)
public interface IAppointmentParticipant : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun put_DisplayName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Address(): String?

  @InterfaceMethod(3)
  public fun put_Address(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentParticipant> {
    public override fun getValue() = ABI.makeIAppointmentParticipant(pointer.getPointer(0))

    public fun setValue(value: IAppointmentParticipant_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentParticipant {
    public val __880852351_Ptr: Pointer?

    public val _880852351_VtblPtr: Pointer?
      get() = __880852351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _880852351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__880852351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _880852351_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__880852351_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Address(): String? {
      val fnPtr = _880852351_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__880852351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Address(value: String?): Unit {
      val fnPtr = _880852351_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__880852351_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppointmentParticipant_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __880852351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentParticipant, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("615e29029718467b83fbb293a19121de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentParticipant(ptr: Pointer?): WithDefault =
        IAppointmentParticipant_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentParticipant {
      val address = segment.toRawLongValue()
      return makeIAppointmentParticipant(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentParticipant): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__880852351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentParticipant): Array<IAppointmentParticipant?>
        = (elements as
        Array<IAppointmentParticipant?>).castToImpl<IAppointmentParticipant,IAppointmentParticipant_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentParticipant?> =
        arrayOfNulls<IAppointmentParticipant_Impl>(size) as Array<IAppointmentParticipant?>
  }
}
