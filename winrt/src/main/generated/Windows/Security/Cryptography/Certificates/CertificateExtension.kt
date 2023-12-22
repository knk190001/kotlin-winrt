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

@ABIMarker(CertificateExtension.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.CertificateExtension;{84cf0656-a9e6-454d-8e45-2ea7c4bcd53b})")
@WinRTByReference(brClass = CertificateExtension.ByReference::class)
public class CertificateExtension(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICertificateExtension.WithDefault, IWinRTObject {
  private val __1307735210_Interface: ICertificateExtension.WithDefault by lazy {
    as_1307735210()
  }


  public override val __1307735210_Ptr: JNAPointer? by lazy {
    __1307735210_Interface.__1307735210_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1307735210_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1307735210(): ICertificateExtension.WithDefault {
    if(pointer == NULL) {
      return(ICertificateExtension.ABI.makeICertificateExtension(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateExtension>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateExtension.ABI.makeICertificateExtension(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CertificateExtension> {
    public override fun getValue() = CertificateExtension(pointer.getPointer(0))

    public fun setValue(value: CertificateExtension): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CertificateExtension, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CertificateExtension".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CertificateExtension {
      val address = segment.toRawLongValue()
      return CertificateExtension(Pointer(address))
    }

    public override fun toNative(obj: CertificateExtension): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
