package Windows.Media.Protection

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

@ABIMarker(RevocationAndRenewalInformation.ABI::class)
@Signature("rc(Windows.Media.Protection.RevocationAndRenewalInformation;{f3a1937b-2501-439e-a6e7-6fc95e175fcf})")
@WinRTByReference(brClass = RevocationAndRenewalInformation.ByReference::class)
public class RevocationAndRenewalInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRevocationAndRenewalInformation.WithDefault, IWinRTObject {
  private val __1791173074_Interface: IRevocationAndRenewalInformation.WithDefault by lazy {
    as_1791173074()
  }


  public override val __1791173074_Ptr: JNAPointer? by lazy {
    __1791173074_Interface.__1791173074_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1791173074_Interface)

  private fun as_1791173074(): IRevocationAndRenewalInformation.WithDefault {
    if(pointer == NULL) {
      return(IRevocationAndRenewalInformation.ABI.makeIRevocationAndRenewalInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRevocationAndRenewalInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRevocationAndRenewalInformation.ABI.makeIRevocationAndRenewalInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RevocationAndRenewalInformation> {
    public override fun getValue() = RevocationAndRenewalInformation(pointer.getPointer(0))

    public fun setValue(value: RevocationAndRenewalInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RevocationAndRenewalInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RevocationAndRenewalInformation {
      val address = segment.toRawLongValue()
      return RevocationAndRenewalInformation(Pointer(address))
    }

    public override fun toNative(obj: RevocationAndRenewalInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
