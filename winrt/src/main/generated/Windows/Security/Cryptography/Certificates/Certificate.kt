package Windows.Security.Cryptography.Certificates

import Windows.Security.Cryptography.Certificates.ICertificateFactory.ABI.IID
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(Certificate.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.Certificate;{333f740c-04d8-43b3-b278-8c5fcc9be5a0})")
@WinRTByReference(brClass = Certificate.ByReference::class)
public class Certificate(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICertificate.WithDefault, ICertificate2.WithDefault,
    ICertificate3.WithDefault, IWinRTObject {
  private val __800299287_Interface: ICertificate.WithDefault by lazy {
    as_800299287()
  }


  private val __960525929_Interface: ICertificate2.WithDefault by lazy {
    as_960525929()
  }


  private val __960525930_Interface: ICertificate3.WithDefault by lazy {
    as_960525930()
  }


  public override val __800299287_Ptr: JNAPointer? by lazy {
    __800299287_Interface.__800299287_Ptr
  }


  public override val __960525929_Ptr: JNAPointer? by lazy {
    __960525929_Interface.__960525929_Ptr
  }


  public override val __960525930_Ptr: JNAPointer? by lazy {
    __960525930_Interface.__960525930_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__800299287_Interface, __960525929_Interface, __960525930_Interface)

  public constructor(certBlob: IBuffer) : this(ABI.activate(certBlob))

  private fun as_800299287(): ICertificate.WithDefault {
    if(pointer == NULL) {
      return(ICertificate.ABI.makeICertificate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificate.ABI.makeICertificate(ref.value))
  }

  private fun as_960525929(): ICertificate2.WithDefault {
    if(pointer == NULL) {
      return(ICertificate2.ABI.makeICertificate2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificate2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificate2.ABI.makeICertificate2(ref.value))
  }

  private fun as_960525930(): ICertificate3.WithDefault {
    if(pointer == NULL) {
      return(ICertificate3.ABI.makeICertificate3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificate3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificate3.ABI.makeICertificate3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Certificate> {
    public override fun getValue() = Certificate(pointer.getPointer(0))

    public fun setValue(value: Certificate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Certificate, MemoryAddress> {
    public val ICertificateFactory_Instance: ICertificateFactory by lazy {
      createICertificateFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICertificateFactory(): ICertificateFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.Certificate".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICertificateFactory.ABI.makeICertificateFactory(factoryActivatorPtr.value))
    }

    public fun activate(certBlob: IBuffer): JNAPointer? =
        ICertificateFactory_Instance.CreateCertificate(certBlob)?.pointer

    public override fun fromNative(segment: MemoryAddress): Certificate {
      val address = segment.toRawLongValue()
      return Certificate(Pointer(address))
    }

    public override fun toNative(obj: Certificate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
