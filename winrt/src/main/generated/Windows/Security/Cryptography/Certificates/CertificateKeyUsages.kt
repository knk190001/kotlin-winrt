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

@ABIMarker(CertificateKeyUsages.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.CertificateKeyUsages;{6ac6206f-e1cf-486a-b485-a69c83e46fd1})")
@WinRTByReference(brClass = CertificateKeyUsages.ByReference::class)
public class CertificateKeyUsages(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICertificateKeyUsages.WithDefault, IWinRTObject {
  private val __1667345736_Interface: ICertificateKeyUsages.WithDefault by lazy {
    as_1667345736()
  }


  public override val __1667345736_Ptr: JNAPointer? by lazy {
    __1667345736_Interface.__1667345736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1667345736_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1667345736(): ICertificateKeyUsages.WithDefault {
    if(pointer == NULL) {
      return(ICertificateKeyUsages.ABI.makeICertificateKeyUsages(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICertificateKeyUsages>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICertificateKeyUsages.ABI.makeICertificateKeyUsages(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CertificateKeyUsages> {
    public override fun getValue() = CertificateKeyUsages(pointer.getPointer(0))

    public fun setValue(value: CertificateKeyUsages): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CertificateKeyUsages, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CertificateKeyUsages".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CertificateKeyUsages {
      val address = segment.toRawLongValue()
      return CertificateKeyUsages(Pointer(address))
    }

    public override fun toNative(obj: CertificateKeyUsages): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
