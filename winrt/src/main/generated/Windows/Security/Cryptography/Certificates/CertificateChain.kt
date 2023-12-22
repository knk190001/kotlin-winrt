package Windows.Security.Cryptography.Certificates

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

@ABIMarker(CertificateChain.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.CertificateChain;{20bf5385-3691-4501-a62c-fd97278b31ee})")
@WinRTByReference(brClass = CertificateChain.ByReference::class)
public class CertificateChain(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICertificateChain.WithDefault, IWinRTObject {
  private val __519924056_Interface: ICertificateChain.WithDefault by lazy {
    as_519924056()
  }


  public override val __519924056_Ptr: JNAPointer? by lazy {
    __519924056_Interface.__519924056_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__519924056_Interface)

  private fun as_519924056(): ICertificateChain.WithDefault {
    if(pointer == NULL) {
      return(ICertificateChain.ABI.makeICertificateChain(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateChain>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateChain.ABI.makeICertificateChain(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CertificateChain> {
    public override fun getValue() = CertificateChain(pointer.getPointer(0))

    public fun setValue(value: CertificateChain): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CertificateChain, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CertificateChain {
      val address = segment.toRawLongValue()
      return CertificateChain(Pointer(address))
    }

    public override fun toNative(obj: CertificateChain): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
