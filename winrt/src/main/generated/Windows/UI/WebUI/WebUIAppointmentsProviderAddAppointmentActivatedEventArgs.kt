package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgsWithUser
import Windows.ApplicationModel.Activation.IAppointmentsProviderActivatedEventArgs
import Windows.ApplicationModel.Activation.IAppointmentsProviderAddAppointmentActivatedEventArgs
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(WebUIAppointmentsProviderAddAppointmentActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIAppointmentsProviderAddAppointmentActivatedEventArgs;{a2861367-cee5-4e4d-9ed7-41c34ec18b02})")
@WinRTByReference(brClass =
    WebUIAppointmentsProviderAddAppointmentActivatedEventArgs.ByReference::class)
public class WebUIAppointmentsProviderAddAppointmentActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentsProviderAddAppointmentActivatedEventArgs.WithDefault,
    IAppointmentsProviderActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IActivatedEventArgsDeferral.WithDefault, IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __2119283730_Interface:
      IAppointmentsProviderAddAppointmentActivatedEventArgs.WithDefault by lazy {
    as_2119283730()
  }


  private val __1135855692_Interface: IAppointmentsProviderActivatedEventArgs.WithDefault by lazy {
    as_1135855692()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __1254540095_Interface: IActivatedEventArgsDeferral.WithDefault by lazy {
    as_1254540095()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __2119283730_Ptr: JNAPointer? by lazy {
    __2119283730_Interface.__2119283730_Ptr
  }


  public override val __1135855692_Ptr: JNAPointer? by lazy {
    __1135855692_Interface.__1135855692_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __1254540095_Ptr: JNAPointer? by lazy {
    __1254540095_Interface.__1254540095_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2119283730_Interface, __1135855692_Interface, __1721660047_Interface,
        __1254540095_Interface, __988512_Interface)

  private fun as_2119283730(): IAppointmentsProviderAddAppointmentActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentsProviderAddAppointmentActivatedEventArgs.ABI.makeIAppointmentsProviderAddAppointmentActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentsProviderAddAppointmentActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentsProviderAddAppointmentActivatedEventArgs.ABI.makeIAppointmentsProviderAddAppointmentActivatedEventArgs(ref.value))
  }

  private fun as_1135855692(): IAppointmentsProviderActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentsProviderActivatedEventArgs.ABI.makeIAppointmentsProviderActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentsProviderActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentsProviderActivatedEventArgs.ABI.makeIAppointmentsProviderActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  private fun as_1254540095(): IActivatedEventArgsDeferral.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgsDeferral.ABI.makeIActivatedEventArgsDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgsDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgsDeferral.ABI.makeIActivatedEventArgsDeferral(ref.value))
  }

  private fun as_988512(): IActivatedEventArgsWithUser.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgsWithUser.ABI.makeIActivatedEventArgsWithUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgsWithUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgsWithUser.ABI.makeIActivatedEventArgsWithUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUIAppointmentsProviderAddAppointmentActivatedEventArgs> {
    public override fun getValue() =
        WebUIAppointmentsProviderAddAppointmentActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUIAppointmentsProviderAddAppointmentActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIAppointmentsProviderAddAppointmentActivatedEventArgs, MemoryAddress>
      {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebUIAppointmentsProviderAddAppointmentActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUIAppointmentsProviderAddAppointmentActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUIAppointmentsProviderAddAppointmentActivatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
