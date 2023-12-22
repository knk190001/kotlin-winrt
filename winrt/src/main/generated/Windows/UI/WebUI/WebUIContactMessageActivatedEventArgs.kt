package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IContactActivatedEventArgs
import Windows.ApplicationModel.Activation.IContactMessageActivatedEventArgs
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

@ABIMarker(WebUIContactMessageActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIContactMessageActivatedEventArgs;{de598db2-0e03-43b0-bf56-bcc40b3162df})")
@WinRTByReference(brClass = WebUIContactMessageActivatedEventArgs.ByReference::class)
public class WebUIContactMessageActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactMessageActivatedEventArgs.WithDefault,
    IContactActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IActivatedEventArgsDeferral.WithDefault, IWinRTObject {
  private val __2024007414_Interface: IContactMessageActivatedEventArgs.WithDefault by lazy {
    as_2024007414()
  }


  private val __90994973_Interface: IContactActivatedEventArgs.WithDefault by lazy {
    as_90994973()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __1254540095_Interface: IActivatedEventArgsDeferral.WithDefault by lazy {
    as_1254540095()
  }


  public override val __2024007414_Ptr: JNAPointer? by lazy {
    __2024007414_Interface.__2024007414_Ptr
  }


  public override val __90994973_Ptr: JNAPointer? by lazy {
    __90994973_Interface.__90994973_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __1254540095_Ptr: JNAPointer? by lazy {
    __1254540095_Interface.__1254540095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2024007414_Interface, __90994973_Interface, __1721660047_Interface,
        __1254540095_Interface)

  private fun as_2024007414(): IContactMessageActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactMessageActivatedEventArgs.ABI.makeIContactMessageActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactMessageActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactMessageActivatedEventArgs.ABI.makeIContactMessageActivatedEventArgs(ref.value))
  }

  private fun as_90994973(): IContactActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactActivatedEventArgs.ABI.makeIContactActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactActivatedEventArgs.ABI.makeIContactActivatedEventArgs(ref.value))
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
      IByReference<WebUIContactMessageActivatedEventArgs> {
    public override fun getValue() = WebUIContactMessageActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUIContactMessageActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIContactMessageActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUIContactMessageActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUIContactMessageActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUIContactMessageActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
