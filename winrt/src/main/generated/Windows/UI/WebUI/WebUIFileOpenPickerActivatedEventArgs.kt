package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgsWithUser
import Windows.ApplicationModel.Activation.IFileOpenPickerActivatedEventArgs
import Windows.ApplicationModel.Activation.IFileOpenPickerActivatedEventArgs2
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

@ABIMarker(WebUIFileOpenPickerActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUIFileOpenPickerActivatedEventArgs;{72827082-5525-4bf2-bc09-1f5095d4964d})")
@WinRTByReference(brClass = WebUIFileOpenPickerActivatedEventArgs.ByReference::class)
public class WebUIFileOpenPickerActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileOpenPickerActivatedEventArgs.WithDefault,
    IActivatedEventArgs.WithDefault, IFileOpenPickerActivatedEventArgs2.WithDefault,
    IActivatedEventArgsDeferral.WithDefault, IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __898768899_Interface: IFileOpenPickerActivatedEventArgs.WithDefault by lazy {
    as_898768899()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __2092032143_Interface: IFileOpenPickerActivatedEventArgs2.WithDefault by lazy {
    as_2092032143()
  }


  private val __1254540095_Interface: IActivatedEventArgsDeferral.WithDefault by lazy {
    as_1254540095()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __898768899_Ptr: JNAPointer? by lazy {
    __898768899_Interface.__898768899_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __2092032143_Ptr: JNAPointer? by lazy {
    __2092032143_Interface.__2092032143_Ptr
  }


  public override val __1254540095_Ptr: JNAPointer? by lazy {
    __1254540095_Interface.__1254540095_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__898768899_Interface, __1721660047_Interface, __2092032143_Interface,
        __1254540095_Interface, __988512_Interface)

  private fun as_898768899(): IFileOpenPickerActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFileOpenPickerActivatedEventArgs.ABI.makeIFileOpenPickerActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileOpenPickerActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileOpenPickerActivatedEventArgs.ABI.makeIFileOpenPickerActivatedEventArgs(ref.value))
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

  private fun as_2092032143(): IFileOpenPickerActivatedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IFileOpenPickerActivatedEventArgs2.ABI.makeIFileOpenPickerActivatedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileOpenPickerActivatedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileOpenPickerActivatedEventArgs2.ABI.makeIFileOpenPickerActivatedEventArgs2(ref.value))
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
      IByReference<WebUIFileOpenPickerActivatedEventArgs> {
    public override fun getValue() = WebUIFileOpenPickerActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUIFileOpenPickerActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUIFileOpenPickerActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUIFileOpenPickerActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUIFileOpenPickerActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUIFileOpenPickerActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
