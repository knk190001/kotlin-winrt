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

@ABIMarker(PackageCatalogAddResourcePackageResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageCatalogAddResourcePackageResult;{9636ce0d-3e17-493f-aa08-ccec6fdef699})")
@WinRTByReference(brClass = PackageCatalogAddResourcePackageResult.ByReference::class)
public class PackageCatalogAddResourcePackageResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageCatalogAddResourcePackageResult.WithDefault, IWinRTObject {
  private val __418333100_Interface: IPackageCatalogAddResourcePackageResult.WithDefault by lazy {
    as_418333100()
  }


  public override val __418333100_Ptr: JNAPointer? by lazy {
    __418333100_Interface.__418333100_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__418333100_Interface)

  private fun as_418333100(): IPackageCatalogAddResourcePackageResult.WithDefault {
    if(pointer == NULL) {
      return(IPackageCatalogAddResourcePackageResult.ABI.makeIPackageCatalogAddResourcePackageResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageCatalogAddResourcePackageResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageCatalogAddResourcePackageResult.ABI.makeIPackageCatalogAddResourcePackageResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageCatalogAddResourcePackageResult> {
    public override fun getValue() = PackageCatalogAddResourcePackageResult(pointer.getPointer(0))

    public fun setValue(value: PackageCatalogAddResourcePackageResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageCatalogAddResourcePackageResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageCatalogAddResourcePackageResult {
      val address = segment.toRawLongValue()
      return PackageCatalogAddResourcePackageResult(Pointer(address))
    }

    public override fun toNative(obj: PackageCatalogAddResourcePackageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
