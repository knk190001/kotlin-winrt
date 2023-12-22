package Windows.Security.Cryptography.Certificates

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(CertificateRequestProperties.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.CertificateRequestProperties;{487e84f6-94e2-4dce-8833-1a700a37a29a})")
@WinRTByReference(brClass = CertificateRequestProperties.ByReference::class)
public class CertificateRequestProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICertificateRequestProperties.WithDefault,
    ICertificateRequestProperties2.WithDefault, ICertificateRequestProperties3.WithDefault,
    ICertificateRequestProperties4.WithDefault, IWinRTObject {
  private val __1493114169_Interface: ICertificateRequestProperties.WithDefault by lazy {
    as_1493114169()
  }


  private val __958100967_Interface: ICertificateRequestProperties2.WithDefault by lazy {
    as_958100967()
  }


  private val __958100966_Interface: ICertificateRequestProperties3.WithDefault by lazy {
    as_958100966()
  }


  private val __958100965_Interface: ICertificateRequestProperties4.WithDefault by lazy {
    as_958100965()
  }


  public override val __1493114169_Ptr: JNAPointer? by lazy {
    __1493114169_Interface.__1493114169_Ptr
  }


  public override val __958100967_Ptr: JNAPointer? by lazy {
    __958100967_Interface.__958100967_Ptr
  }


  public override val __958100966_Ptr: JNAPointer? by lazy {
    __958100966_Interface.__958100966_Ptr
  }


  public override val __958100965_Ptr: JNAPointer? by lazy {
    __958100965_Interface.__958100965_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1493114169_Interface, __958100967_Interface, __958100966_Interface,
        __958100965_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1493114169(): ICertificateRequestProperties.WithDefault {
    if(pointer == NULL) {
      return(ICertificateRequestProperties.ABI.makeICertificateRequestProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateRequestProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateRequestProperties.ABI.makeICertificateRequestProperties(ref.value))
  }

  private fun as_958100967(): ICertificateRequestProperties2.WithDefault {
    if(pointer == NULL) {
      return(ICertificateRequestProperties2.ABI.makeICertificateRequestProperties2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateRequestProperties2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateRequestProperties2.ABI.makeICertificateRequestProperties2(ref.value))
  }

  private fun as_958100966(): ICertificateRequestProperties3.WithDefault {
    if(pointer == NULL) {
      return(ICertificateRequestProperties3.ABI.makeICertificateRequestProperties3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateRequestProperties3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateRequestProperties3.ABI.makeICertificateRequestProperties3(ref.value))
  }

  private fun as_958100965(): ICertificateRequestProperties4.WithDefault {
    if(pointer == NULL) {
      return(ICertificateRequestProperties4.ABI.makeICertificateRequestProperties4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateRequestProperties4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateRequestProperties4.ABI.makeICertificateRequestProperties4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CertificateRequestProperties> {
    public override fun getValue() = CertificateRequestProperties(pointer.getPointer(0))

    public fun setValue(value: CertificateRequestProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CertificateRequestProperties, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CertificateRequestProperties".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): CertificateRequestProperties {
      val address = segment.toRawLongValue()
      return CertificateRequestProperties(Pointer(address))
    }

    public override fun toNative(obj: CertificateRequestProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
