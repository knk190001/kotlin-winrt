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

@ABIMarker(PackageCatalogAddOptionalPackageResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageCatalogAddOptionalPackageResult;{3bf10cd4-b4df-47b3-a963-e2fa832f7dd3})")
@WinRTByReference(brClass = PackageCatalogAddOptionalPackageResult.ByReference::class)
public class PackageCatalogAddOptionalPackageResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageCatalogAddOptionalPackageResult.WithDefault, IWinRTObject {
  private val __678342554_Interface: IPackageCatalogAddOptionalPackageResult.WithDefault by lazy {
    as_678342554()
  }


  public override val __678342554_Ptr: JNAPointer? by lazy {
    __678342554_Interface.__678342554_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__678342554_Interface)

  private fun as_678342554(): IPackageCatalogAddOptionalPackageResult.WithDefault {
    if(pointer == NULL) {
      return(IPackageCatalogAddOptionalPackageResult.ABI.makeIPackageCatalogAddOptionalPackageResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageCatalogAddOptionalPackageResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageCatalogAddOptionalPackageResult.ABI.makeIPackageCatalogAddOptionalPackageResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageCatalogAddOptionalPackageResult> {
    public override fun getValue() = PackageCatalogAddOptionalPackageResult(pointer.getPointer(0))

    public fun setValue(value: PackageCatalogAddOptionalPackageResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageCatalogAddOptionalPackageResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageCatalogAddOptionalPackageResult {
      val address = segment.toRawLongValue()
      return PackageCatalogAddOptionalPackageResult(Pointer(address))
    }

    public override fun toNative(obj: PackageCatalogAddOptionalPackageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
