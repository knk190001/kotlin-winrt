package Windows.Networking.BackgroundTransfer

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

@ABIMarker(DownloadOperation.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.DownloadOperation;{bd87ebb0-5714-4e09-ba68-bef73903b0d7})")
@WinRTByReference(brClass = DownloadOperation.ByReference::class)
public class DownloadOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDownloadOperation.WithDefault, IBackgroundTransferOperation.WithDefault,
    IBackgroundTransferOperationPriority.WithDefault, IDownloadOperation2.WithDefault,
    IDownloadOperation3.WithDefault, IDownloadOperation4.WithDefault,
    IDownloadOperation5.WithDefault, IWinRTObject {
  private val __1669502110_Interface: IDownloadOperation.WithDefault by lazy {
    as_1669502110()
  }


  private val __1632478797_Interface: IBackgroundTransferOperation.WithDefault by lazy {
    as_1632478797()
  }


  private val __2067785489_Interface: IBackgroundTransferOperationPriority.WithDefault by lazy {
    as_2067785489()
  }


  private val __214957908_Interface: IDownloadOperation2.WithDefault by lazy {
    as_214957908()
  }


  private val __214957909_Interface: IDownloadOperation3.WithDefault by lazy {
    as_214957909()
  }


  private val __214957910_Interface: IDownloadOperation4.WithDefault by lazy {
    as_214957910()
  }


  private val __214957911_Interface: IDownloadOperation5.WithDefault by lazy {
    as_214957911()
  }


  public override val __1669502110_Ptr: JNAPointer? by lazy {
    __1669502110_Interface.__1669502110_Ptr
  }


  public override val __1632478797_Ptr: JNAPointer? by lazy {
    __1632478797_Interface.__1632478797_Ptr
  }


  public override val __2067785489_Ptr: JNAPointer? by lazy {
    __2067785489_Interface.__2067785489_Ptr
  }


  public override val __214957908_Ptr: JNAPointer? by lazy {
    __214957908_Interface.__214957908_Ptr
  }


  public override val __214957909_Ptr: JNAPointer? by lazy {
    __214957909_Interface.__214957909_Ptr
  }


  public override val __214957910_Ptr: JNAPointer? by lazy {
    __214957910_Interface.__214957910_Ptr
  }


  public override val __214957911_Ptr: JNAPointer? by lazy {
    __214957911_Interface.__214957911_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1669502110_Interface, __1632478797_Interface, __2067785489_Interface,
        __214957908_Interface, __214957909_Interface, __214957910_Interface, __214957911_Interface)

  private fun as_1669502110(): IDownloadOperation.WithDefault {
    if(pointer == NULL) {
      return(IDownloadOperation.ABI.makeIDownloadOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDownloadOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDownloadOperation.ABI.makeIDownloadOperation(ref.value))
  }

  private fun as_1632478797(): IBackgroundTransferOperation.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTransferOperation.ABI.makeIBackgroundTransferOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTransferOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTransferOperation.ABI.makeIBackgroundTransferOperation(ref.value))
  }

  private fun as_2067785489(): IBackgroundTransferOperationPriority.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTransferOperationPriority.ABI.makeIBackgroundTransferOperationPriority(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTransferOperationPriority>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTransferOperationPriority.ABI.makeIBackgroundTransferOperationPriority(ref.value))
  }

  private fun as_214957908(): IDownloadOperation2.WithDefault {
    if(pointer == NULL) {
      return(IDownloadOperation2.ABI.makeIDownloadOperation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDownloadOperation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDownloadOperation2.ABI.makeIDownloadOperation2(ref.value))
  }

  private fun as_214957909(): IDownloadOperation3.WithDefault {
    if(pointer == NULL) {
      return(IDownloadOperation3.ABI.makeIDownloadOperation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDownloadOperation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDownloadOperation3.ABI.makeIDownloadOperation3(ref.value))
  }

  private fun as_214957910(): IDownloadOperation4.WithDefault {
    if(pointer == NULL) {
      return(IDownloadOperation4.ABI.makeIDownloadOperation4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDownloadOperation4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDownloadOperation4.ABI.makeIDownloadOperation4(ref.value))
  }

  private fun as_214957911(): IDownloadOperation5.WithDefault {
    if(pointer == NULL) {
      return(IDownloadOperation5.ABI.makeIDownloadOperation5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDownloadOperation5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDownloadOperation5.ABI.makeIDownloadOperation5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DownloadOperation> {
    public override fun getValue() = DownloadOperation(pointer.getPointer(0))

    public fun setValue(value: DownloadOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DownloadOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DownloadOperation {
      val address = segment.toRawLongValue()
      return DownloadOperation(Pointer(address))
    }

    public override fun toNative(obj: DownloadOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
