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

@ABIMarker(FileOpenPickerContinuationEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.FileOpenPickerContinuationEventArgs;{f0fa3f3a-d4e8-4ad3-9c34-2308f32fcec9})")
@WinRTByReference(brClass = FileOpenPickerContinuationEventArgs.ByReference::class)
public class FileOpenPickerContinuationEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileOpenPickerContinuationEventArgs.WithDefault,
    IContinuationActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __680437565_Interface: IFileOpenPickerContinuationEventArgs.WithDefault by lazy {
    as_680437565()
  }


  private val __1151516762_Interface: IContinuationActivatedEventArgs.WithDefault by lazy {
    as_1151516762()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __680437565_Ptr: JNAPointer? by lazy {
    __680437565_Interface.__680437565_Ptr
  }


  public override val __1151516762_Ptr: JNAPointer? by lazy {
    __1151516762_Interface.__1151516762_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__680437565_Interface, __1151516762_Interface, __1721660047_Interface,
        __988512_Interface)

  private fun as_680437565(): IFileOpenPickerContinuationEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFileOpenPickerContinuationEventArgs.ABI.makeIFileOpenPickerContinuationEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileOpenPickerContinuationEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileOpenPickerContinuationEventArgs.ABI.makeIFileOpenPickerContinuationEventArgs(ref.value))
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
      IByReference<FileOpenPickerContinuationEventArgs> {
    public override fun getValue() = FileOpenPickerContinuationEventArgs(pointer.getPointer(0))

    public fun setValue(value: FileOpenPickerContinuationEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileOpenPickerContinuationEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FileOpenPickerContinuationEventArgs {
      val address = segment.toRawLongValue()
      return FileOpenPickerContinuationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FileOpenPickerContinuationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
