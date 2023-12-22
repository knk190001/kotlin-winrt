package Windows.Storage

import Windows.Foundation.IClosable
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

@ABIMarker(StorageStreamTransaction.ABI::class)
@Signature("rc(Windows.Storage.StorageStreamTransaction;{f67cf363-a53d-4d94-ae2c-67232d93acdd})")
@WinRTByReference(brClass = StorageStreamTransaction.ByReference::class)
public class StorageStreamTransaction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageStreamTransaction.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1005653916_Interface: IStorageStreamTransaction.WithDefault by lazy {
    as_1005653916()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1005653916_Ptr: JNAPointer? by lazy {
    __1005653916_Interface.__1005653916_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1005653916_Interface, __1260617006_Interface)

  private fun as_1005653916(): IStorageStreamTransaction.WithDefault {
    if(pointer == NULL) {
      return(IStorageStreamTransaction.ABI.makeIStorageStreamTransaction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageStreamTransaction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageStreamTransaction.ABI.makeIStorageStreamTransaction(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageStreamTransaction> {
    public override fun getValue() = StorageStreamTransaction(pointer.getPointer(0))

    public fun setValue(value: StorageStreamTransaction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageStreamTransaction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageStreamTransaction {
      val address = segment.toRawLongValue()
      return StorageStreamTransaction(Pointer(address))
    }

    public override fun toNative(obj: StorageStreamTransaction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
