package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IApplicationViewActivatedEventArgs
import Windows.ApplicationModel.Activation.ILaunchActivatedEventArgs
import Windows.ApplicationModel.Activation.ILockScreenCallActivatedEventArgs
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

@ABIMarker(WebUILockScreenCallActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUILockScreenCallActivatedEventArgs;{06f37fbe-b5f2-448b-b13e-e328ac1c516a})")
@WinRTByReference(brClass = WebUILockScreenCallActivatedEventArgs.ByReference::class)
public class WebUILockScreenCallActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILockScreenCallActivatedEventArgs.WithDefault,
    ILaunchActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IApplicationViewActivatedEventArgs.WithDefault, IActivatedEventArgsDeferral.WithDefault,
    IWinRTObject {
  private val __1984481316_Interface: ILockScreenCallActivatedEventArgs.WithDefault by lazy {
    as_1984481316()
  }


  private val __183308062_Interface: ILaunchActivatedEventArgs.WithDefault by lazy {
    as_183308062()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __1142708526_Interface: IApplicationViewActivatedEventArgs.WithDefault by lazy {
    as_1142708526()
  }


  private val __1254540095_Interface: IActivatedEventArgsDeferral.WithDefault by lazy {
    as_1254540095()
  }


  public override val __1984481316_Ptr: JNAPointer? by lazy {
    __1984481316_Interface.__1984481316_Ptr
  }


  public override val __183308062_Ptr: JNAPointer? by lazy {
    __183308062_Interface.__183308062_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __1142708526_Ptr: JNAPointer? by lazy {
    __1142708526_Interface.__1142708526_Ptr
  }


  public override val __1254540095_Ptr: JNAPointer? by lazy {
    __1254540095_Interface.__1254540095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1984481316_Interface, __183308062_Interface, __1721660047_Interface,
        __1142708526_Interface, __1254540095_Interface)

  private fun as_1984481316(): ILockScreenCallActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILockScreenCallActivatedEventArgs.ABI.makeILockScreenCallActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILockScreenCallActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILockScreenCallActivatedEventArgs.ABI.makeILockScreenCallActivatedEventArgs(ref.value))
  }

  private fun as_183308062(): ILaunchActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILaunchActivatedEventArgs.ABI.makeILaunchActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILaunchActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILaunchActivatedEventArgs.ABI.makeILaunchActivatedEventArgs(ref.value))
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

  private fun as_1142708526(): IApplicationViewActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewActivatedEventArgs.ABI.makeIApplicationViewActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewActivatedEventArgs.ABI.makeIApplicationViewActivatedEventArgs(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUILockScreenCallActivatedEventArgs> {
    public override fun getValue() = WebUILockScreenCallActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUILockScreenCallActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUILockScreenCallActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUILockScreenCallActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUILockScreenCallActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUILockScreenCallActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
