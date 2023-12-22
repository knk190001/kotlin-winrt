package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IAppointmentsProviderActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IAppointmentsProviderAddAppointmentActivatedEventArgs.ABI::class)
@Signature("{a2861367-cee5-4e4d-9ed7-41c34ec18b02}")
@Guid("a2861367cee54e4d9ed741c34ec18b02")
@WinRTInterface("a2861367cee54e4d9ed741c34ec18b02")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IAppointmentsProviderAddAppointmentActivatedEventArgs.ByReference::class)
public interface IAppointmentsProviderAddAppointmentActivatedEventArgs : NativeMapped,
    IWinRTInterface, IAppointmentsProviderActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_AddAppointmentOperation(): AddAppointmentOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentsProviderAddAppointmentActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentsProviderAddAppointmentActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentsProviderAddAppointmentActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentsProviderAddAppointmentActivatedEventArgs,
      IAppointmentsProviderActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __2119283730_Ptr: Pointer?

    public val _2119283730_VtblPtr: Pointer?
      get() = __2119283730_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AddAppointmentOperation(): AddAppointmentOperation? {
      val fnPtr = _2119283730_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AddAppointmentOperation>()
      val hr = fn.invokeHR(arrayOf(__2119283730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AddAppointmentOperation>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentsProviderAddAppointmentActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAppointmentsProviderActivatedEventArgs, IActivatedEventArgs {
    public override val __1135855692_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2119283730_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2119283730_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2119283730_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentsProviderAddAppointmentActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2861367cee54e4d9ed741c34ec18b02")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentsProviderAddAppointmentActivatedEventArgs(ptr: Pointer?): WithDefault
        = IAppointmentsProviderAddAppointmentActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentsProviderAddAppointmentActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentsProviderAddAppointmentActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentsProviderAddAppointmentActivatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2119283730_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentsProviderAddAppointmentActivatedEventArgs):
        Array<IAppointmentsProviderAddAppointmentActivatedEventArgs?> = (elements as
        Array<IAppointmentsProviderAddAppointmentActivatedEventArgs?>).castToImpl<IAppointmentsProviderAddAppointmentActivatedEventArgs,IAppointmentsProviderAddAppointmentActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentsProviderAddAppointmentActivatedEventArgs?> =
        arrayOfNulls<IAppointmentsProviderAddAppointmentActivatedEventArgs_Impl>(size) as
        Array<IAppointmentsProviderAddAppointmentActivatedEventArgs?>
  }
}
