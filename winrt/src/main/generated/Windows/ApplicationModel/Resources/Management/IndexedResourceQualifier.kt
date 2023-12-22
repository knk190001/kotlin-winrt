package Windows.ApplicationModel.Resources.Management

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

@ABIMarker(IndexedResourceQualifier.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Management.IndexedResourceQualifier;{dae3bb9b-d304-497f-a168-a340042c8adb})")
@WinRTByReference(brClass = IndexedResourceQualifier.ByReference::class)
public class IndexedResourceQualifier(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIndexedResourceQualifier.WithDefault, IWinRTObject {
  private val __170794530_Interface: IIndexedResourceQualifier.WithDefault by lazy {
    as_170794530()
  }


  public override val __170794530_Ptr: JNAPointer? by lazy {
    __170794530_Interface.__170794530_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__170794530_Interface)

  private fun as_170794530(): IIndexedResourceQualifier.WithDefault {
    if(pointer == NULL) {
      return(IIndexedResourceQualifier.ABI.makeIIndexedResourceQualifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIndexedResourceQualifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIndexedResourceQualifier.ABI.makeIIndexedResourceQualifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IndexedResourceQualifier> {
    public override fun getValue() = IndexedResourceQualifier(pointer.getPointer(0))

    public fun setValue(value: IndexedResourceQualifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IndexedResourceQualifier, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IndexedResourceQualifier {
      val address = segment.toRawLongValue()
      return IndexedResourceQualifier(Pointer(address))
    }

    public override fun toNative(obj: IndexedResourceQualifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
