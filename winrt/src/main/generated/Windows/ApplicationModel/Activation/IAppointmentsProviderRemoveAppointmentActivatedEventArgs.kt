package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IAppointmentsProviderActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation
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

@ABIMarker(IAppointmentsProviderRemoveAppointmentActivatedEventArgs.ABI::class)
@Signature("{751f3ab8-0b8e-451c-9f15-966e699bac25}")
@Guid("751f3ab80b8e451c9f15966e699bac25")
@WinRTInterface("751f3ab80b8e451c9f15966e699bac25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IAppointmentsProviderRemoveAppointmentActivatedEventArgs.ByReference::class)
public interface IAppointmentsProviderRemoveAppointmentActivatedEventArgs : NativeMapped,
    IWinRTInterface, IAppointmentsProviderActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_RemoveAppointmentOperation(): RemoveAppointmentOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentsProviderRemoveAppointmentActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentsProviderRemoveAppointmentActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentsProviderRemoveAppointmentActivatedEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentsProviderRemoveAppointmentActivatedEventArgs,
      IAppointmentsProviderActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __384975501_Ptr: Pointer?

    public val _384975501_VtblPtr: Pointer?
      get() = __384975501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoveAppointmentOperation(): RemoveAppointmentOperation? {
      val fnPtr = _384975501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoveAppointmentOperation>()
      val hr = fn.invokeHR(arrayOf(__384975501_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoveAppointmentOperation>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentsProviderRemoveAppointmentActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAppointmentsProviderActivatedEventArgs, IActivatedEventArgs {
    public override val __1135855692_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_384975501_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_384975501_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __384975501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentsProviderRemoveAppointmentActivatedEventArgs, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("751f3ab80b8e451c9f15966e699bac25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentsProviderRemoveAppointmentActivatedEventArgs(ptr: Pointer?):
        WithDefault = IAppointmentsProviderRemoveAppointmentActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentsProviderRemoveAppointmentActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentsProviderRemoveAppointmentActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentsProviderRemoveAppointmentActivatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__384975501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppointmentsProviderRemoveAppointmentActivatedEventArgs):
        Array<IAppointmentsProviderRemoveAppointmentActivatedEventArgs?> = (elements as
        Array<IAppointmentsProviderRemoveAppointmentActivatedEventArgs?>).castToImpl<IAppointmentsProviderRemoveAppointmentActivatedEventArgs,IAppointmentsProviderRemoveAppointmentActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentsProviderRemoveAppointmentActivatedEventArgs?> =
        arrayOfNulls<IAppointmentsProviderRemoveAppointmentActivatedEventArgs_Impl>(size) as
        Array<IAppointmentsProviderRemoveAppointmentActivatedEventArgs?>
  }
}
