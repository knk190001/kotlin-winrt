package Windows.Services.Store

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

@ABIMarker(StoreLicense.ABI::class)
@Signature("rc(Windows.Services.Store.StoreLicense;{26dc9579-4c4f-4f30-bc89-649f60e36055})")
@WinRTByReference(brClass = StoreLicense.ByReference::class)
public class StoreLicense(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStoreLicense.WithDefault, IWinRTObject {
  private val __780351923_Interface: IStoreLicense.WithDefault by lazy {
    as_780351923()
  }


  public override val __780351923_Ptr: JNAPointer? by lazy {
    __780351923_Interface.__780351923_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__780351923_Interface)

  private fun as_780351923(): IStoreLicense.WithDefault {
    if(pointer == NULL) {
      return(IStoreLicense.ABI.makeIStoreLicense(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStoreLicense>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStoreLicense.ABI.makeIStoreLicense(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StoreLicense> {
    public override fun getValue() = StoreLicense(pointer.getPointer(0))

    public fun setValue(value: StoreLicense): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StoreLicense, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StoreLicense {
      val address = segment.toRawLongValue()
      return StoreLicense(Pointer(address))
    }

    public override fun toNative(obj: StoreLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
