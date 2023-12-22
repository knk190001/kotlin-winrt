package Windows.ApplicationModel.Activation

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

@ABIMarker(AppointmentsProviderShowTimeFrameActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.AppointmentsProviderShowTimeFrameActivatedEventArgs;{9baeaba6-0e0b-49aa-babc-12b1dc774986})")
@WinRTByReference(brClass = AppointmentsProviderShowTimeFrameActivatedEventArgs.ByReference::class)
public class AppointmentsProviderShowTimeFrameActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppointmentsProviderShowTimeFrameActivatedEventArgs.WithDefault,
    IAppointmentsProviderActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __632685541_Interface:
      IAppointmentsProviderShowTimeFrameActivatedEventArgs.WithDefault by lazy {
    as_632685541()
  }


  private val __1135855692_Interface: IAppointmentsProviderActivatedEventArgs.WithDefault by lazy {
    as_1135855692()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __632685541_Ptr: JNAPointer? by lazy {
    __632685541_Interface.__632685541_Ptr
  }


  public override val __1135855692_Ptr: JNAPointer? by lazy {
    __1135855692_Interface.__1135855692_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__632685541_Interface, __1135855692_Interface, __1721660047_Interface,
        __988512_Interface)

  private fun as_632685541(): IAppointmentsProviderShowTimeFrameActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppointmentsProviderShowTimeFrameActivatedEventArgs.ABI.makeIAppointmentsProviderShowTimeFrameActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppointmentsProviderShowTimeFrameActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppointmentsProviderShowTimeFrameActivatedEventArgs.ABI.makeIAppointmentsProviderShowTimeFrameActivatedEventArgs(ref.value))
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
      IByReference<AppointmentsProviderShowTimeFrameActivatedEventArgs> {
    public override fun getValue() =
        AppointmentsProviderShowTimeFrameActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppointmentsProviderShowTimeFrameActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppointmentsProviderShowTimeFrameActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppointmentsProviderShowTimeFrameActivatedEventArgs {
      val address = segment.toRawLongValue()
      return AppointmentsProviderShowTimeFrameActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppointmentsProviderShowTimeFrameActivatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
