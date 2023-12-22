package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgsWithUser
import Windows.ApplicationModel.Activation.IApplicationViewActivatedEventArgs
import Windows.ApplicationModel.Activation.IDialReceiverActivatedEventArgs
import Windows.ApplicationModel.Activation.ILaunchActivatedEventArgs
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

@ABIMarker(WebUIDialReceiverActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIDialReceiverActivatedEventArgs;{fb777ed7-85ee-456e-a44d-85d730e70aed})")
@WinRTByReference(brClass = WebUIDialReceiverActivatedEventArgs.ByReference::class)
public class WebUIDialReceiverActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDialReceiverActivatedEventArgs.WithDefault,
    ILaunchActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IApplicationViewActivatedEventArgs.WithDefault, IActivatedEventArgsDeferral.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __1708290286_Interface: IDialReceiverActivatedEventArgs.WithDefault by lazy {
    as_1708290286()
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


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __1708290286_Ptr: JNAPointer? by lazy {
    __1708290286_Interface.__1708290286_Ptr
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


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1708290286_Interface, __183308062_Interface, __1721660047_Interface,
        __1142708526_Interface, __1254540095_Interface, __988512_Interface)

  private fun as_1708290286(): IDialReceiverActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDialReceiverActivatedEventArgs.ABI.makeIDialReceiverActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDialReceiverActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDialReceiverActivatedEventArgs.ABI.makeIDialReceiverActivatedEventArgs(ref.value))
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
      IByReference<WebUIDialReceiverActivatedEventArgs> {
    public override fun getValue() = WebUIDialReceiverActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUIDialReceiverActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIDialReceiverActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUIDialReceiverActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUIDialReceiverActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUIDialReceiverActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
