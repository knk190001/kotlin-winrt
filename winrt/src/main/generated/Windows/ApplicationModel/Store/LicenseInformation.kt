package Windows.ApplicationModel.Store

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

@ABIMarker(LicenseInformation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.LicenseInformation;{8eb7dc30-f170-4ed5-8e21-1516da3fd367})")
@WinRTByReference(brClass = LicenseInformation.ByReference::class)
public class LicenseInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILicenseInformation.WithDefault, IWinRTObject {
  private val __1804464797_Interface: ILicenseInformation.WithDefault by lazy {
    as_1804464797()
  }


  public override val __1804464797_Ptr: JNAPointer? by lazy {
    __1804464797_Interface.__1804464797_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1804464797_Interface)

  private fun as_1804464797(): ILicenseInformation.WithDefault {
    if(pointer == NULL) {
      return(ILicenseInformation.ABI.makeILicenseInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILicenseInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILicenseInformation.ABI.makeILicenseInformation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LicenseInformation> {
    public override fun getValue() = LicenseInformation(pointer.getPointer(0))

    public fun setValue(value: LicenseInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LicenseInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LicenseInformation {
      val address = segment.toRawLongValue()
      return LicenseInformation(Pointer(address))
    }

    public override fun toNative(obj: LicenseInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
