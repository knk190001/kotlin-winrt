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

@ABIMarker(CertificateStore.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.CertificateStore;{b0bff720-344e-4331-af14-a7f7a7ebc93a})")
@WinRTByReference(brClass = CertificateStore.ByReference::class)
public class CertificateStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICertificateStore.WithDefault, ICertificateStore2.WithDefault, IWinRTObject {
  private val __535071608_Interface: ICertificateStore.WithDefault by lazy {
    as_535071608()
  }


  private val __592649286_Interface: ICertificateStore2.WithDefault by lazy {
    as_592649286()
  }


  public override val __535071608_Ptr: JNAPointer? by lazy {
    __535071608_Interface.__535071608_Ptr
  }


  public override val __592649286_Ptr: JNAPointer? by lazy {
    __592649286_Interface.__592649286_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__535071608_Interface, __592649286_Interface)

  private fun as_535071608(): ICertificateStore.WithDefault {
    if(pointer == NULL) {
      return(ICertificateStore.ABI.makeICertificateStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateStore.ABI.makeICertificateStore(ref.value))
  }

  private fun as_592649286(): ICertificateStore2.WithDefault {
    if(pointer == NULL) {
      return(ICertificateStore2.ABI.makeICertificateStore2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateStore2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateStore2.ABI.makeICertificateStore2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CertificateStore> {
    public override fun getValue() = CertificateStore(pointer.getPointer(0))

    public fun setValue(value: CertificateStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CertificateStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CertificateStore {
      val address = segment.toRawLongValue()
      return CertificateStore(Pointer(address))
    }

    public override fun toNative(obj: CertificateStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
