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

@ABIMarker(CmsSignerInfo.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.CmsSignerInfo;{50d020db-1d2f-4c1a-b5c5-d0188ff91f47})")
@WinRTByReference(brClass = CmsSignerInfo.ByReference::class)
public class CmsSignerInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICmsSignerInfo.WithDefault, IWinRTObject {
  private val __1200696845_Interface: ICmsSignerInfo.WithDefault by lazy {
    as_1200696845()
  }


  public override val __1200696845_Ptr: JNAPointer? by lazy {
    __1200696845_Interface.__1200696845_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1200696845_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1200696845(): ICmsSignerInfo.WithDefault {
    if(pointer == NULL) {
      return(ICmsSignerInfo.ABI.makeICmsSignerInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICmsSignerInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICmsSignerInfo.ABI.makeICmsSignerInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CmsSignerInfo>
      {
    public override fun getValue() = CmsSignerInfo(pointer.getPointer(0))

    public fun setValue(value: CmsSignerInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CmsSignerInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.CmsSignerInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CmsSignerInfo {
      val address = segment.toRawLongValue()
      return CmsSignerInfo(Pointer(address))
    }

    public override fun toNative(obj: CmsSignerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
