package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgsWithUser
import Windows.ApplicationModel.Activation.IApplicationViewActivatedEventArgs
import Windows.ApplicationModel.Activation.IDeviceActivatedEventArgs
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

@ABIMarker(WebUIDeviceActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIDeviceActivatedEventArgs;{cd50b9a9-ce10-44d2-8234-c355a073ef33})")
@WinRTByReference(brClass = WebUIDeviceActivatedEventArgs.ByReference::class)
public class WebUIDeviceActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IApplicationViewActivatedEventArgs.WithDefault, IActivatedEventArgsDeferral.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __475441349_Interface: IDeviceActivatedEventArgs.WithDefault by lazy {
    as_475441349()
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


  public override val __475441349_Ptr: JNAPointer? by lazy {
    __475441349_Interface.__475441349_Ptr
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
    get() = arrayOf(__475441349_Interface, __1721660047_Interface, __1142708526_Interface,
        __1254540095_Interface, __988512_Interface)

  private fun as_475441349(): IDeviceActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDeviceActivatedEventArgs.ABI.makeIDeviceActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceActivatedEventArgs.ABI.makeIDeviceActivatedEventArgs(ref.value))
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
      IByReference<WebUIDeviceActivatedEventArgs> {
    public override fun getValue() = WebUIDeviceActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUIDeviceActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIDeviceActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUIDeviceActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUIDeviceActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUIDeviceActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
