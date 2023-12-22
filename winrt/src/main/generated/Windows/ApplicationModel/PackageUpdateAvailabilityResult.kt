package Windows.ApplicationModel

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

@ABIMarker(PackageUpdateAvailabilityResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageUpdateAvailabilityResult;{114e5009-199a-48a1-a079-313c45634a71})")
@WinRTByReference(brClass = PackageUpdateAvailabilityResult.ByReference::class)
public class PackageUpdateAvailabilityResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageUpdateAvailabilityResult.WithDefault, IWinRTObject {
  private val __2123707678_Interface: IPackageUpdateAvailabilityResult.WithDefault by lazy {
    as_2123707678()
  }


  public override val __2123707678_Ptr: JNAPointer? by lazy {
    __2123707678_Interface.__2123707678_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2123707678_Interface)

  private fun as_2123707678(): IPackageUpdateAvailabilityResult.WithDefault {
    if(pointer == NULL) {
      return(IPackageUpdateAvailabilityResult.ABI.makeIPackageUpdateAvailabilityResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageUpdateAvailabilityResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageUpdateAvailabilityResult.ABI.makeIPackageUpdateAvailabilityResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageUpdateAvailabilityResult> {
    public override fun getValue() = PackageUpdateAvailabilityResult(pointer.getPointer(0))

    public fun setValue(value: PackageUpdateAvailabilityResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageUpdateAvailabilityResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageUpdateAvailabilityResult {
      val address = segment.toRawLongValue()
      return PackageUpdateAvailabilityResult(Pointer(address))
    }

    public override fun toNative(obj: PackageUpdateAvailabilityResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
