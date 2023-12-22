package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IPrintTaskSettingsActivatedEventArgs
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

@ABIMarker(WebUIPrintTaskSettingsActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIPrintTaskSettingsActivatedEventArgs;{ee30a0c9-ce56-4865-ba8e-8954ac271107})")
@WinRTByReference(brClass = WebUIPrintTaskSettingsActivatedEventArgs.ByReference::class)
public class WebUIPrintTaskSettingsActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskSettingsActivatedEventArgs.WithDefault,
    IActivatedEventArgs.WithDefault, IActivatedEventArgsDeferral.WithDefault, IWinRTObject {
  private val __1889950994_Interface: IPrintTaskSettingsActivatedEventArgs.WithDefault by lazy {
    as_1889950994()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __1254540095_Interface: IActivatedEventArgsDeferral.WithDefault by lazy {
    as_1254540095()
  }


  public override val __1889950994_Ptr: JNAPointer? by lazy {
    __1889950994_Interface.__1889950994_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __1254540095_Ptr: JNAPointer? by lazy {
    __1254540095_Interface.__1254540095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1889950994_Interface, __1721660047_Interface, __1254540095_Interface)

  private fun as_1889950994(): IPrintTaskSettingsActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskSettingsActivatedEventArgs.ABI.makeIPrintTaskSettingsActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskSettingsActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskSettingsActivatedEventArgs.ABI.makeIPrintTaskSettingsActivatedEventArgs(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebUIPrintTaskSettingsActivatedEventArgs> {
    public override fun getValue() = WebUIPrintTaskSettingsActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUIPrintTaskSettingsActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIPrintTaskSettingsActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebUIPrintTaskSettingsActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUIPrintTaskSettingsActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUIPrintTaskSettingsActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
