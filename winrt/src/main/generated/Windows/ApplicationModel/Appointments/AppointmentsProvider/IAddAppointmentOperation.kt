package Windows.ApplicationModel.Appointments.AppointmentsProvider

import Windows.ApplicationModel.Appointments.Appointment
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

@ABIMarker(IAddAppointmentOperation.ABI::class)
@Signature("{ec4a9af3-620d-4c69-add7-9794e918081f}")
@Guid("ec4a9af3620d4c69add79794e918081f")
@WinRTInterface("ec4a9af3620d4c69add79794e918081f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAddAppointmentOperation.ByReference::class)
public interface IAddAppointmentOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppointmentInformation(): Appointment?

  @InterfaceMethod(1)
  public fun get_SourcePackageFamilyName(): String?

  @InterfaceMethod(2)
  public fun ReportCompleted(itemId: String?): Unit

  @InterfaceMethod(3)
  public fun ReportCanceled(): Unit

  @InterfaceMethod(4)
  public fun ReportError(value: String?): Unit

  @InterfaceMethod(5)
  public fun DismissUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAddAppointmentOperation> {
    public override fun getValue() = ABI.makeIAddAppointmentOperation(pointer.getPointer(0))

    public fun setValue(value: IAddAppointmentOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAddAppointmentOperation {
    public val __151431573_Ptr: Pointer?

    public val _151431573_VtblPtr: Pointer?
      get() = __151431573_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppointmentInformation(): Appointment? {
      val fnPtr = _151431573_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Appointment>()
      val hr = fn.invokeHR(arrayOf(__151431573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Appointment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SourcePackageFamilyName(): String? {
      val fnPtr = _151431573_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__151431573_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportCompleted(itemId: String?): Unit {
      val fnPtr = _151431573_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__151431573_Ptr, marshalToNative(itemId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun ReportCanceled(): Unit {
      val fnPtr = _151431573_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__151431573_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ReportError(value: String?): Unit {
      val fnPtr = _151431573_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__151431573_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun DismissUI(): Unit {
      val fnPtr = _151431573_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__151431573_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAddAppointmentOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __151431573_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAddAppointmentOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec4a9af3620d4c69add79794e918081f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAddAppointmentOperation(ptr: Pointer?): WithDefault =
        IAddAppointmentOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAddAppointmentOperation {
      val address = segment.toRawLongValue()
      return makeIAddAppointmentOperation(Pointer(address))
    }

    public override fun toNative(obj: IAddAppointmentOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__151431573_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAddAppointmentOperation):
        Array<IAddAppointmentOperation?> = (elements as
        Array<IAddAppointmentOperation?>).castToImpl<IAddAppointmentOperation,IAddAppointmentOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAddAppointmentOperation?> =
        arrayOfNulls<IAddAppointmentOperation_Impl>(size) as Array<IAddAppointmentOperation?>
  }
}
