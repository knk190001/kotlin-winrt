package Windows.UI.WebUI

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IApplicationViewActivatedEventArgs
import Windows.ApplicationModel.Activation.ISearchActivatedEventArgs
import Windows.ApplicationModel.Activation.ISearchActivatedEventArgsWithLinguisticDetails
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

@ABIMarker(WebUISearchActivatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.WebUI.WebUISearchActivatedEventArgs;{8cb36951-58c8-43e3-94bc-41d33f8b630e})")
@WinRTByReference(brClass = WebUISearchActivatedEventArgs.ByReference::class)
public class WebUISearchActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    ISearchActivatedEventArgsWithLinguisticDetails.WithDefault,
    IApplicationViewActivatedEventArgs.WithDefault, IActivatedEventArgsDeferral.WithDefault,
    IWinRTObject {
  private val __1311408233_Interface: ISearchActivatedEventArgs.WithDefault by lazy {
    as_1311408233()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __1454051392_Interface: ISearchActivatedEventArgsWithLinguisticDetails.WithDefault by
      lazy {
    as_1454051392()
  }


  private val __1142708526_Interface: IApplicationViewActivatedEventArgs.WithDefault by lazy {
    as_1142708526()
  }


  private val __1254540095_Interface: IActivatedEventArgsDeferral.WithDefault by lazy {
    as_1254540095()
  }


  public override val __1311408233_Ptr: JNAPointer? by lazy {
    __1311408233_Interface.__1311408233_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __1454051392_Ptr: JNAPointer? by lazy {
    __1454051392_Interface.__1454051392_Ptr
  }


  public override val __1142708526_Ptr: JNAPointer? by lazy {
    __1142708526_Interface.__1142708526_Ptr
  }


  public override val __1254540095_Ptr: JNAPointer? by lazy {
    __1254540095_Interface.__1254540095_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1311408233_Interface, __1721660047_Interface, __1454051392_Interface,
        __1142708526_Interface, __1254540095_Interface)

  private fun as_1311408233(): ISearchActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISearchActivatedEventArgs.ABI.makeISearchActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchActivatedEventArgs.ABI.makeISearchActivatedEventArgs(ref.value))
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

  private fun as_1454051392(): ISearchActivatedEventArgsWithLinguisticDetails.WithDefault {
    if(pointer == NULL) {
      return(ISearchActivatedEventArgsWithLinguisticDetails.ABI.makeISearchActivatedEventArgsWithLinguisticDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchActivatedEventArgsWithLinguisticDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchActivatedEventArgsWithLinguisticDetails.ABI.makeISearchActivatedEventArgsWithLinguisticDetails(ref.value))
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
      IByReference<WebUISearchActivatedEventArgs> {
    public override fun getValue() = WebUISearchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebUISearchActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebUISearchActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebUISearchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return WebUISearchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebUISearchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
