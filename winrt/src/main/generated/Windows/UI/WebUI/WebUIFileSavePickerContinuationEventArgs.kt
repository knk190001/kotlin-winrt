package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgsWithUser
import Windows.ApplicationModel.Activation.IContinuationActivatedEventArgs
import Windows.ApplicationModel.Activation.IFileSavePickerContinuationEventArgs
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

@ABIMarker(WebUIFileSavePickerContinuationEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIFileSavePickerContinuationEventArgs;{2c846fe1-3bad-4f33-8c8b-e46fae824b4b})")
@WinRTByReference(brClass = WebUIFileSavePickerContinuationEventArgs.ByReference::class)
public class WebUIFileSavePickerContinuationEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileSavePickerContinuationEventArgs.WithDefault,
    IContinuationActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IActivatedEventArgsDeferral.WithDefault, IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __1743476144_Interface: IFileSavePickerContinuationEventArgs.WithDefault by lazy {
    as_1743476144()
  }


  private val __1151516762_Interface: IContinuationActivatedEventArgs.WithDefault by lazy {
    as_1151516762()
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


  public override val __1743476144_Ptr: JNAPointer? by lazy {
    __1743476144_Interface.__1743476144_Ptr
  }


  public override val __1151516762_Ptr: JNAPointer? by lazy {
    __1151516762_Interface.__1151516762_Ptr
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
    get() = arrayOf(__1743476144_Interface, __1151516762_Interface, __1721660047_Interface,
        __1254540095_Interface, __988512_Interface)

  private fun as_1743476144(): IFileSavePickerContinuationEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFileSavePickerContinuationEventArgs.ABI.makeIFileSavePickerContinuationEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileSavePickerContinuationEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileSavePickerContinuationEventArgs.ABI.makeIFileSavePickerContinuationEventArgs(ref.value))
  }

  private fun as_1151516762(): IContinuationActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IContinuationActivatedEventArgs.ABI.makeIContinuationActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContinuationActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContinuationActivatedEventArgs.ABI.makeIContinuationActivatedEventArgs(ref.value))
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
      IByReference<WebUIFileSavePickerContinuationEventArgs> {
    public override fun getValue() = WebUIFileSavePickerContinuationEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUIFileSavePickerContinuationEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIFileSavePickerContinuationEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WebUIFileSavePickerContinuationEventArgs {
      val address = segment.toRawLongValue()
      return WebUIFileSavePickerContinuationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUIFileSavePickerContinuationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
