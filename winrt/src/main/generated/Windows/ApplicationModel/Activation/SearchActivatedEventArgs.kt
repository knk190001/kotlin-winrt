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

@ABIMarker(SearchActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.SearchActivatedEventArgs;{8cb36951-58c8-43e3-94bc-41d33f8b630e})")
@WinRTByReference(brClass = SearchActivatedEventArgs.ByReference::class)
public class SearchActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IApplicationViewActivatedEventArgs.WithDefault,
    ISearchActivatedEventArgsWithLinguisticDetails.WithDefault, IViewSwitcherProvider.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __1311408233_Interface: ISearchActivatedEventArgs.WithDefault by lazy {
    as_1311408233()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __1142708526_Interface: IApplicationViewActivatedEventArgs.WithDefault by lazy {
    as_1142708526()
  }


  private val __1454051392_Interface: ISearchActivatedEventArgsWithLinguisticDetails.WithDefault by
      lazy {
    as_1454051392()
  }


  private val __1905429824_Interface: IViewSwitcherProvider.WithDefault by lazy {
    as_1905429824()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __1311408233_Ptr: JNAPointer? by lazy {
    __1311408233_Interface.__1311408233_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __1142708526_Ptr: JNAPointer? by lazy {
    __1142708526_Interface.__1142708526_Ptr
  }


  public override val __1454051392_Ptr: JNAPointer? by lazy {
    __1454051392_Interface.__1454051392_Ptr
  }


  public override val __1905429824_Ptr: JNAPointer? by lazy {
    __1905429824_Interface.__1905429824_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1311408233_Interface, __1721660047_Interface, __1142708526_Interface,
        __1454051392_Interface, __1905429824_Interface, __988512_Interface)

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

  private fun as_1142708526(): IApplicationViewActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewActivatedEventArgs.ABI.makeIApplicationViewActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewActivatedEventArgs.ABI.makeIApplicationViewActivatedEventArgs(ref.value))
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

  private fun as_1905429824(): IViewSwitcherProvider.WithDefault {
    if(pointer == NULL) {
      return(IViewSwitcherProvider.ABI.makeIViewSwitcherProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IViewSwitcherProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IViewSwitcherProvider.ABI.makeIViewSwitcherProvider(ref.value))
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
      IByReference<SearchActivatedEventArgs> {
    public override fun getValue() = SearchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SearchActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SearchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return SearchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SearchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
