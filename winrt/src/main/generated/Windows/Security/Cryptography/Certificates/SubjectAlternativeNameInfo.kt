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

@ABIMarker(SubjectAlternativeNameInfo.ABI::class)
@Signature("rc(Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo;{582859f1-569d-4c20-be7b-4e1c9a0bc52b})")
@WinRTByReference(brClass = SubjectAlternativeNameInfo.ByReference::class)
public class SubjectAlternativeNameInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISubjectAlternativeNameInfo.WithDefault,
    ISubjectAlternativeNameInfo2.WithDefault, IWinRTObject {
  private val __1812128696_Interface: ISubjectAlternativeNameInfo.WithDefault by lazy {
    as_1812128696()
  }


  private val __341414678_Interface: ISubjectAlternativeNameInfo2.WithDefault by lazy {
    as_341414678()
  }


  public override val __1812128696_Ptr: JNAPointer? by lazy {
    __1812128696_Interface.__1812128696_Ptr
  }


  public override val __341414678_Ptr: JNAPointer? by lazy {
    __341414678_Interface.__341414678_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1812128696_Interface, __341414678_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1812128696(): ISubjectAlternativeNameInfo.WithDefault {
    if(pointer == NULL) {
      return(ISubjectAlternativeNameInfo.ABI.makeISubjectAlternativeNameInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISubjectAlternativeNameInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISubjectAlternativeNameInfo.ABI.makeISubjectAlternativeNameInfo(ref.value))
  }

  private fun as_341414678(): ISubjectAlternativeNameInfo2.WithDefault {
    if(pointer == NULL) {
      return(ISubjectAlternativeNameInfo2.ABI.makeISubjectAlternativeNameInfo2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISubjectAlternativeNameInfo2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISubjectAlternativeNameInfo2.ABI.makeISubjectAlternativeNameInfo2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SubjectAlternativeNameInfo> {
    public override fun getValue() = SubjectAlternativeNameInfo(pointer.getPointer(0))

    public fun setValue(value: SubjectAlternativeNameInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SubjectAlternativeNameInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Cryptography.Certificates.SubjectAlternativeNameInfo".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SubjectAlternativeNameInfo {
      val address = segment.toRawLongValue()
      return SubjectAlternativeNameInfo(Pointer(address))
    }

    public override fun toNative(obj: SubjectAlternativeNameInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
