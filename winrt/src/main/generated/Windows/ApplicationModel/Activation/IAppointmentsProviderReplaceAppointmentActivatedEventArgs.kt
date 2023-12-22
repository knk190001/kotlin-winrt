package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IAppointmentsProviderActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation
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

@ABIMarker(IAppointmentsProviderReplaceAppointmentActivatedEventArgs.ABI::class)
@Signature("{1551b7d4-a981-4067-8a62-0524e4ade121}")
@Guid("1551b7d4a98140678a620524e4ade121")
@WinRTInterface("1551b7d4a98140678a620524e4ade121")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IAppointmentsProviderReplaceAppointmentActivatedEventArgs.ByReference::class)
public interface IAppointmentsProviderReplaceAppointmentActivatedEventArgs : NativeMapped,
    IWinRTInterface, IAppointmentsProviderActivatedEventArgs, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_ReplaceAppointmentOperation(): ReplaceAppointmentOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppointmentsProviderReplaceAppointmentActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppointmentsProviderReplaceAppointmentActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppointmentsProviderReplaceAppointmentActivatedEventArgs_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppointmentsProviderReplaceAppointmentActivatedEventArgs,
      IAppointmentsProviderActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault {
    public val __2088112095_Ptr: Pointer?

    public val _2088112095_VtblPtr: Pointer?
      get() = __2088112095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReplaceAppointmentOperation(): ReplaceAppointmentOperation? {
      val fnPtr = _2088112095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ReplaceAppointmentOperation>()
      val hr = fn.invokeHR(arrayOf(__2088112095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ReplaceAppointmentOperation>(result.getValue())
      return resultValue
    }
  }

  public class IAppointmentsProviderReplaceAppointmentActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IAppointmentsProviderActivatedEventArgs, IActivatedEventArgs {
    public override val __1135855692_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2088112095_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgs.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_2088112095_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2088112095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppointmentsProviderReplaceAppointmentActivatedEventArgs, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1551b7d4a98140678a620524e4ade121")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppointmentsProviderReplaceAppointmentActivatedEventArgs(ptr: Pointer?):
        WithDefault = IAppointmentsProviderReplaceAppointmentActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppointmentsProviderReplaceAppointmentActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppointmentsProviderReplaceAppointmentActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppointmentsProviderReplaceAppointmentActivatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__2088112095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IAppointmentsProviderReplaceAppointmentActivatedEventArgs):
        Array<IAppointmentsProviderReplaceAppointmentActivatedEventArgs?> = (elements as
        Array<IAppointmentsProviderReplaceAppointmentActivatedEventArgs?>).castToImpl<IAppointmentsProviderReplaceAppointmentActivatedEventArgs,IAppointmentsProviderReplaceAppointmentActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAppointmentsProviderReplaceAppointmentActivatedEventArgs?> =
        arrayOfNulls<IAppointmentsProviderReplaceAppointmentActivatedEventArgs_Impl>(size) as
        Array<IAppointmentsProviderReplaceAppointmentActivatedEventArgs?>
  }
}
