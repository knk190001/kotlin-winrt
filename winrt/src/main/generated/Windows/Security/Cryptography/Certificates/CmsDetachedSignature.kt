package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IIterable
import Windows.Security.Cryptography.Certificates.ICmsDetachedSignatureFactory.ABI.IID
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(CmsDetachedSignature.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.CmsDetachedSignature;{0f1ef154-f65e-4536-8339-5944081db2ca})")
@WinRTByReference(brClass = CmsDetachedSignature.ByReference::class)
public class CmsDetachedSignature(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICmsDetachedSignature.WithDefault, IWinRTObject {
  private val __93257227_Interface: ICmsDetachedSignature.WithDefault by lazy {
    as_93257227()
  }


  public override val __93257227_Ptr: JNAPointer? by lazy {
    __93257227_Interface.__93257227_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__93257227_Interface)

  public constructor(inputBlob: IBuffer) : this(ABI.activate(inputBlob))

  private fun as_93257227(): ICmsDetachedSignature.WithDefault {
    if(pointer == NULL) {
      return(ICmsDetachedSignature.ABI.makeICmsDetachedSignature(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICmsDetachedSignature>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICmsDetachedSignature.ABI.makeICmsDetachedSignature(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CmsDetachedSignature> {
    public override fun getValue() = CmsDetachedSignature(pointer.getPointer(0))

    public fun setValue(value: CmsDetachedSignature): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CmsDetachedSignature, MemoryAddress> {
    public val ICmsDetachedSignatureStatics_Instance: ICmsDetachedSignatureStatics by lazy {
      createICmsDetachedSignatureStatics()
    }


    public val ICmsDetachedSignatureFactory_Instance: ICmsDetachedSignatureFactory by lazy {
      createICmsDetachedSignatureFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICmsDetachedSignatureStatics(): ICmsDetachedSignatureStatics {
      val refiid = Guid.REFIID(ICmsDetachedSignatureStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CmsDetachedSignature".toHandle(),refiid,interfacePtr)
      val result =
          ICmsDetachedSignatureStatics.ABI.makeICmsDetachedSignatureStatics(interfacePtr.value)
      return result
    }

    public fun createICmsDetachedSignatureFactory(): ICmsDetachedSignatureFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CmsDetachedSignature".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICmsDetachedSignatureFactory.ABI.makeICmsDetachedSignatureFactory(factoryActivatorPtr.value))
    }

    public fun activate(inputBlob: IBuffer): JNAPointer? =
        ICmsDetachedSignatureFactory_Instance.CreateCmsDetachedSignature(inputBlob)?.pointer

    public override fun fromNative(segment: MemoryAddress): CmsDetachedSignature {
      val address = segment.toRawLongValue()
      return CmsDetachedSignature(Pointer(address))
    }

    public override fun toNative(obj: CmsDetachedSignature): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GenerateSignatureAsync(
      `data`: IInputStream,
      signers: IIterable<CmsSignerInfo?>,
      certificates: IIterable<Certificate?>
    ) = ABI.ICmsDetachedSignatureStatics_Instance.GenerateSignatureAsync(data, signers,
        certificates)
  }
}
