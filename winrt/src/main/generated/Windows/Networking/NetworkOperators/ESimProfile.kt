package Windows.Networking.NetworkOperators

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

@ABIMarker(ESimProfile.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimProfile;{ee1e7880-06a9-4027-b4f8-ddb23d7810e0})")
@WinRTByReference(brClass = ESimProfile.ByReference::class)
public class ESimProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimProfile.WithDefault, IWinRTObject {
  private val __713408642_Interface: IESimProfile.WithDefault by lazy {
    as_713408642()
  }


  public override val __713408642_Ptr: JNAPointer? by lazy {
    __713408642_Interface.__713408642_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__713408642_Interface)

  private fun as_713408642(): IESimProfile.WithDefault {
    if(pointer == NULL) {
      return(IESimProfile.ABI.makeIESimProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimProfile.ABI.makeIESimProfile(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ESimProfile> {
    public override fun getValue() = ESimProfile(pointer.getPointer(0))

    public fun setValue(value: ESimProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimProfile, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimProfile {
      val address = segment.toRawLongValue()
      return ESimProfile(Pointer(address))
    }

    public override fun toNative(obj: ESimProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
