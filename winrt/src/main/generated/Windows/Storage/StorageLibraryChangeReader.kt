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

@ABIMarker(StorageLibraryChangeReader.ABI::class)
@Signature("rc(Windows.Storage.StorageLibraryChangeReader;{f205bc83-fca2-41f9-8954-ee2e991eb96f})")
@WinRTByReference(brClass = StorageLibraryChangeReader.ByReference::class)
public class StorageLibraryChangeReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageLibraryChangeReader.WithDefault,
    IStorageLibraryChangeReader2.WithDefault, IWinRTObject {
  private val __946864588_Interface: IStorageLibraryChangeReader.WithDefault by lazy {
    as_946864588()
  }


  private val __711968794_Interface: IStorageLibraryChangeReader2.WithDefault by lazy {
    as_711968794()
  }


  public override val __946864588_Ptr: JNAPointer? by lazy {
    __946864588_Interface.__946864588_Ptr
  }


  public override val __711968794_Ptr: JNAPointer? by lazy {
    __711968794_Interface.__711968794_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__946864588_Interface, __711968794_Interface)

  private fun as_946864588(): IStorageLibraryChangeReader.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryChangeReader.ABI.makeIStorageLibraryChangeReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryChangeReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeReader.ABI.makeIStorageLibraryChangeReader(ref.value))
  }

  private fun as_711968794(): IStorageLibraryChangeReader2.WithDefault {
    if(pointer == NULL) {
      return(IStorageLibraryChangeReader2.ABI.makeIStorageLibraryChangeReader2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageLibraryChangeReader2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageLibraryChangeReader2.ABI.makeIStorageLibraryChangeReader2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageLibraryChangeReader> {
    public override fun getValue() = StorageLibraryChangeReader(pointer.getPointer(0))

    public fun setValue(value: StorageLibraryChangeReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageLibraryChangeReader, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageLibraryChangeReader {
      val address = segment.toRawLongValue()
      return StorageLibraryChangeReader(Pointer(address))
    }

    public override fun toNative(obj: StorageLibraryChangeReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
