package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IContactActivatedEventArgs
import Windows.ApplicationModel.Activation.IContactCallActivatedEventArgs
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

@ABIMarker(WebUIContactCallActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIContactCallActivatedEventArgs;{c2df14c7-30eb-41c6-b3bc-5b1694f9dab3})")
@WinRTByReference(brClass = WebUIContactCallActivatedEventArgs.ByReference::class)
public class WebUIContactCallActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContactCallActivatedEventArgs.WithDefault,
    IContactActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IActivatedEventArgsDeferral.WithDefault, IWinRTObject {
  private val __1818259301_Interface: IContactCallActivatedEventArgs.WithDefault by lazy {
    as_1818259301()
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


  public override val __1818259301_Ptr: JNAPointer? by lazy {
    __1818259301_Interface.__1818259301_Ptr
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
    get() = arrayOf(__1818259301_Interface, __90994973_Interface, __1721660047_Interface,
        __1254540095_Interface)

  private fun as_1818259301(): IContactCallActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContactCallActivatedEventArgs.ABI.makeIContactCallActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContactCallActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContactCallActivatedEventArgs.ABI.makeIContactCallActivatedEventArgs(ref.value))
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
      IByReference<WebUIContactCallActivatedEventArgs> {
    public override fun getValue() = WebUIContactCallActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUIContactCallActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIContactCallActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUIContactCallActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUIContactCallActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUIContactCallActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
