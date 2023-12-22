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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppointmentStoreChange.ABI::class)
@Signature("{a5a6e035-0a33-3654-8463-b543e90c3b79}")
@Guid("a5a6e0350a3336548463b543e90c3b79")
@WinRTInterface("a5a6e0350a3336548463b543e90c3b79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppointmentStoreChange.ByReference::class)
public interface IAppointmentStoreChange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Appointment(): Appointment?

  @InterfaceMethod(1)
  public fun get_ChangeType(): AppointmentStoreChangeType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentStoreChange> {
    public override fun getValue() = ABI.makeIAppointmentStoreChange(pointer.getPointer(0))

    public fun setValue(value: IAppointmentStoreChange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentStoreChange {
    public val __2110380605_Ptr: Pointer?

    public val _2110380605_VtblPtr: Pointer?
      get() = __2110380605_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Appointment(): Appointment? {
      val fnPtr = _2110380605_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Appointment>()
      val hr = fn.invokeHR(arrayOf(__2110380605_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Appointment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChangeType(): AppointmentStoreChangeType? {
      val fnPtr = _2110380605_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppointmentStoreChangeType>()
      val hr = fn.invokeHR(arrayOf(__2110380605_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppointmentStoreChangeType>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentStoreChange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2110380605_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentStoreChange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5a6e0350a3336548463b543e90c3b79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentStoreChange(ptr: Pointer?): WithDefault =
        IAppointmentStoreChange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppointmentStoreChange {
      val address = segment.toRawLongValue()
      return makeIAppointmentStoreChange(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentStoreChange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2110380605_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentStoreChange): Array<IAppointmentStoreChange?>
        = (elements as
        Array<IAppointmentStoreChange?>).castToImpl<IAppointmentStoreChange,IAppointmentStoreChange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppointmentStoreChange?> =
        arrayOfNulls<IAppointmentStoreChange_Impl>(size) as Array<IAppointmentStoreChange?>
  }
}
