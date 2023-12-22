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

@ABIMarker(UploadOperation.ABI::class)
@Signature("rc(Windows.Networking.BackgroundTransfer.UploadOperation;{3e5624e0-7389-434c-8b35-427fd36bbdae})")
@WinRTByReference(brClass = UploadOperation.ByReference::class)
public class UploadOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUploadOperation.WithDefault, IBackgroundTransferOperation.WithDefault,
    IBackgroundTransferOperationPriority.WithDefault, IUploadOperation2.WithDefault,
    IUploadOperation3.WithDefault, IUploadOperation4.WithDefault, IWinRTObject {
  private val __2095158021_Interface: IUploadOperation.WithDefault by lazy {
    as_2095158021()
  }


  private val __1632478797_Interface: IBackgroundTransferOperation.WithDefault by lazy {
    as_1632478797()
  }


  private val __2067785489_Interface: IBackgroundTransferOperationPriority.WithDefault by lazy {
    as_2067785489()
  }


  private val __525389261_Interface: IUploadOperation2.WithDefault by lazy {
    as_525389261()
  }


  private val __525389262_Interface: IUploadOperation3.WithDefault by lazy {
    as_525389262()
  }


  private val __525389263_Interface: IUploadOperation4.WithDefault by lazy {
    as_525389263()
  }


  public override val __2095158021_Ptr: JNAPointer? by lazy {
    __2095158021_Interface.__2095158021_Ptr
  }


  public override val __1632478797_Ptr: JNAPointer? by lazy {
    __1632478797_Interface.__1632478797_Ptr
  }


  public override val __2067785489_Ptr: JNAPointer? by lazy {
    __2067785489_Interface.__2067785489_Ptr
  }


  public override val __525389261_Ptr: JNAPointer? by lazy {
    __525389261_Interface.__525389261_Ptr
  }


  public override val __525389262_Ptr: JNAPointer? by lazy {
    __525389262_Interface.__525389262_Ptr
  }


  public override val __525389263_Ptr: JNAPointer? by lazy {
    __525389263_Interface.__525389263_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2095158021_Interface, __1632478797_Interface, __2067785489_Interface,
        __525389261_Interface, __525389262_Interface, __525389263_Interface)

  private fun as_2095158021(): IUploadOperation.WithDefault {
    if(pointer == NULL) {
      return(IUploadOperation.ABI.makeIUploadOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUploadOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUploadOperation.ABI.makeIUploadOperation(ref.value))
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

  private fun as_525389261(): IUploadOperation2.WithDefault {
    if(pointer == NULL) {
      return(IUploadOperation2.ABI.makeIUploadOperation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUploadOperation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUploadOperation2.ABI.makeIUploadOperation2(ref.value))
  }

  private fun as_525389262(): IUploadOperation3.WithDefault {
    if(pointer == NULL) {
      return(IUploadOperation3.ABI.makeIUploadOperation3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUploadOperation3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUploadOperation3.ABI.makeIUploadOperation3(ref.value))
  }

  private fun as_525389263(): IUploadOperation4.WithDefault {
    if(pointer == NULL) {
      return(IUploadOperation4.ABI.makeIUploadOperation4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUploadOperation4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUploadOperation4.ABI.makeIUploadOperation4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UploadOperation> {
    public override fun getValue() = UploadOperation(pointer.getPointer(0))

    public fun setValue(value: UploadOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UploadOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UploadOperation {
      val address = segment.toRawLongValue()
      return UploadOperation(Pointer(address))
    }

    public override fun toNative(obj: UploadOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
