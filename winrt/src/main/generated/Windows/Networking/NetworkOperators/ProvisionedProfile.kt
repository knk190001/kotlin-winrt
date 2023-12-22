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

@ABIMarker(ProvisionedProfile.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ProvisionedProfile;{217700e0-8202-11df-adb9-f4ce462d9137})")
@WinRTByReference(brClass = ProvisionedProfile.ByReference::class)
public class ProvisionedProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProvisionedProfile.WithDefault, IWinRTObject {
  private val __861945714_Interface: IProvisionedProfile.WithDefault by lazy {
    as_861945714()
  }


  public override val __861945714_Ptr: JNAPointer? by lazy {
    __861945714_Interface.__861945714_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__861945714_Interface)

  private fun as_861945714(): IProvisionedProfile.WithDefault {
    if(pointer == NULL) {
      return(IProvisionedProfile.ABI.makeIProvisionedProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProvisionedProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProvisionedProfile.ABI.makeIProvisionedProfile(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProvisionedProfile> {
    public override fun getValue() = ProvisionedProfile(pointer.getPointer(0))

    public fun setValue(value: ProvisionedProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProvisionedProfile, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProvisionedProfile {
      val address = segment.toRawLongValue()
      return ProvisionedProfile(Pointer(address))
    }

    public override fun toNative(obj: ProvisionedProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
