package Windows.Networking.NetworkOperators

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

@ABIMarker(ProvisionFromXmlDocumentResults.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ProvisionFromXmlDocumentResults;{217700e0-8203-11df-adb9-f4ce462d9137})")
@WinRTByReference(brClass = ProvisionFromXmlDocumentResults.ByReference::class)
public class ProvisionFromXmlDocumentResults(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProvisionFromXmlDocumentResults.WithDefault, IWinRTObject {
  private val __396801878_Interface: IProvisionFromXmlDocumentResults.WithDefault by lazy {
    as_396801878()
  }


  public override val __396801878_Ptr: JNAPointer? by lazy {
    __396801878_Interface.__396801878_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__396801878_Interface)

  private fun as_396801878(): IProvisionFromXmlDocumentResults.WithDefault {
    if(pointer == NULL) {
      return(IProvisionFromXmlDocumentResults.ABI.makeIProvisionFromXmlDocumentResults(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProvisionFromXmlDocumentResults>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProvisionFromXmlDocumentResults.ABI.makeIProvisionFromXmlDocumentResults(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProvisionFromXmlDocumentResults> {
    public override fun getValue() = ProvisionFromXmlDocumentResults(pointer.getPointer(0))

    public fun setValue(value: ProvisionFromXmlDocumentResults): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProvisionFromXmlDocumentResults, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProvisionFromXmlDocumentResults {
      val address = segment.toRawLongValue()
      return ProvisionFromXmlDocumentResults(Pointer(address))
    }

    public override fun toNative(obj: ProvisionFromXmlDocumentResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
