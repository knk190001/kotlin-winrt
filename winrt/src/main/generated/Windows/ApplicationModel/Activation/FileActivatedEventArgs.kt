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

@ABIMarker(FileActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.FileActivatedEventArgs;{bb2afc33-93b1-42ed-8b26-236dd9c78496})")
@WinRTByReference(brClass = FileActivatedEventArgs.ByReference::class)
public class FileActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IFileActivatedEventArgsWithNeighboringFiles.WithDefault,
    IFileActivatedEventArgsWithCallerPackageFamilyName.WithDefault,
    IApplicationViewActivatedEventArgs.WithDefault, IViewSwitcherProvider.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __136556715_Interface: IFileActivatedEventArgs.WithDefault by lazy {
    as_136556715()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __93781288_Interface: IFileActivatedEventArgsWithNeighboringFiles.WithDefault by
      lazy {
    as_93781288()
  }


  private val __650955431_Interface: IFileActivatedEventArgsWithCallerPackageFamilyName.WithDefault
      by lazy {
    as_650955431()
  }


  private val __1142708526_Interface: IApplicationViewActivatedEventArgs.WithDefault by lazy {
    as_1142708526()
  }


  private val __1905429824_Interface: IViewSwitcherProvider.WithDefault by lazy {
    as_1905429824()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __136556715_Ptr: JNAPointer? by lazy {
    __136556715_Interface.__136556715_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __93781288_Ptr: JNAPointer? by lazy {
    __93781288_Interface.__93781288_Ptr
  }


  public override val __650955431_Ptr: JNAPointer? by lazy {
    __650955431_Interface.__650955431_Ptr
  }


  public override val __1142708526_Ptr: JNAPointer? by lazy {
    __1142708526_Interface.__1142708526_Ptr
  }


  public override val __1905429824_Ptr: JNAPointer? by lazy {
    __1905429824_Interface.__1905429824_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__136556715_Interface, __1721660047_Interface, __93781288_Interface,
        __650955431_Interface, __1142708526_Interface, __1905429824_Interface, __988512_Interface)

  private fun as_136556715(): IFileActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFileActivatedEventArgs.ABI.makeIFileActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileActivatedEventArgs.ABI.makeIFileActivatedEventArgs(ref.value))
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

  private fun as_93781288(): IFileActivatedEventArgsWithNeighboringFiles.WithDefault {
    if(pointer == NULL) {
      return(IFileActivatedEventArgsWithNeighboringFiles.ABI.makeIFileActivatedEventArgsWithNeighboringFiles(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileActivatedEventArgsWithNeighboringFiles>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileActivatedEventArgsWithNeighboringFiles.ABI.makeIFileActivatedEventArgsWithNeighboringFiles(ref.value))
  }

  private fun as_650955431(): IFileActivatedEventArgsWithCallerPackageFamilyName.WithDefault {
    if(pointer == NULL) {
      return(IFileActivatedEventArgsWithCallerPackageFamilyName.ABI.makeIFileActivatedEventArgsWithCallerPackageFamilyName(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileActivatedEventArgsWithCallerPackageFamilyName>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileActivatedEventArgsWithCallerPackageFamilyName.ABI.makeIFileActivatedEventArgsWithCallerPackageFamilyName(ref.value))
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
      IByReference<FileActivatedEventArgs> {
    public override fun getValue() = FileActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: FileActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FileActivatedEventArgs {
      val address = segment.toRawLongValue()
      return FileActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FileActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
