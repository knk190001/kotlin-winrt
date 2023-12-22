package Windows.Storage

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

@ABIMarker(StorageProvider.ABI::class)
@Signature("rc(Windows.Storage.StorageProvider;{e705eed4-d478-47d6-ba46-1a8ebe114a20})")
@WinRTByReference(brClass = StorageProvider.ByReference::class)
public class StorageProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageProvider.WithDefault, IStorageProvider2.WithDefault, IWinRTObject {
  private val __1413517357_Interface: IStorageProvider.WithDefault by lazy {
    as_1413517357()
  }


  private val __869365057_Interface: IStorageProvider2.WithDefault by lazy {
    as_869365057()
  }


  public override val __1413517357_Ptr: JNAPointer? by lazy {
    __1413517357_Interface.__1413517357_Ptr
  }


  public override val __869365057_Ptr: JNAPointer? by lazy {
    __869365057_Interface.__869365057_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1413517357_Interface, __869365057_Interface)

  private fun as_1413517357(): IStorageProvider.WithDefault {
    if(pointer == NULL) {
      return(IStorageProvider.ABI.makeIStorageProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProvider.ABI.makeIStorageProvider(ref.value))
  }

  private fun as_869365057(): IStorageProvider2.WithDefault {
    if(pointer == NULL) {
      return(IStorageProvider2.ABI.makeIStorageProvider2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageProvider2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageProvider2.ABI.makeIStorageProvider2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageProvider> {
    public override fun getValue() = StorageProvider(pointer.getPointer(0))

    public fun setValue(value: StorageProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageProvider, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageProvider {
      val address = segment.toRawLongValue()
      return StorageProvider(Pointer(address))
    }

    public override fun toNative(obj: StorageProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
