package Windows.ApplicationModel.Appointments.AppointmentsProvider

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IRemoveAppointmentOperation.ABI::class)
@Signature("{08b66aba-fe33-46cd-a50c-a8ffb3260537}")
@Guid("08b66abafe3346cda50ca8ffb3260537")
@WinRTInterface("08b66abafe3346cda50ca8ffb3260537")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoveAppointmentOperation.ByReference::class)
public interface IRemoveAppointmentOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppointmentId(): String?

  @InterfaceMethod(1)
  public fun get_InstanceStartDate(): IReference<DateTime?>?

  @InterfaceMethod(2)
  public fun get_SourcePackageFamilyName(): String?

  @InterfaceMethod(3)
  public fun ReportCompleted(): Unit

  @InterfaceMethod(4)
  public fun ReportCanceled(): Unit

  @InterfaceMethod(5)
  public fun ReportError(value: String?): Unit

  @InterfaceMethod(6)
  public fun DismissUI(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoveAppointmentOperation> {
    public override fun getValue() = ABI.makeIRemoveAppointmentOperation(pointer.getPointer(0))

    public fun setValue(value: IRemoveAppointmentOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoveAppointmentOperation {
    public val __1012522784_Ptr: Pointer?

    public val _1012522784_VtblPtr: Pointer?
      get() = __1012522784_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppointmentId(): String? {
      val fnPtr = _1012522784_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1012522784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_InstanceStartDate(): IReference<DateTime?>? {
      val fnPtr = _1012522784_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DateTime?>>()
      val hr = fn.invokeHR(arrayOf(__1012522784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DateTime?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SourcePackageFamilyName(): String? {
      val fnPtr = _1012522784_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1012522784_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ReportCompleted(): Unit {
      val fnPtr = _1012522784_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012522784_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ReportCanceled(): Unit {
      val fnPtr = _1012522784_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012522784_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ReportError(value: String?): Unit {
      val fnPtr = _1012522784_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012522784_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun DismissUI(): Unit {
      val fnPtr = _1012522784_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1012522784_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRemoveAppointmentOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1012522784_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoveAppointmentOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08b66abafe3346cda50ca8ffb3260537")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoveAppointmentOperation(ptr: Pointer?): WithDefault =
        IRemoveAppointmentOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoveAppointmentOperation {
      val address = segment.toRawLongValue()
      return makeIRemoveAppointmentOperation(Pointer(address))
    }

    public override fun toNative(obj: IRemoveAppointmentOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1012522784_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoveAppointmentOperation):
        Array<IRemoveAppointmentOperation?> = (elements as
        Array<IRemoveAppointmentOperation?>).castToImpl<IRemoveAppointmentOperation,IRemoveAppointmentOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoveAppointmentOperation?> =
        arrayOfNulls<IRemoveAppointmentOperation_Impl>(size) as Array<IRemoveAppointmentOperation?>
  }
}
