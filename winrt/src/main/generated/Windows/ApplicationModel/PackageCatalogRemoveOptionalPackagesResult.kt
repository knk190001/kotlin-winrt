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

@ABIMarker(PackageCatalogRemoveOptionalPackagesResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageCatalogRemoveOptionalPackagesResult;{29d2f97b-d974-4e64-9359-22cadfd79828})")
@WinRTByReference(brClass = PackageCatalogRemoveOptionalPackagesResult.ByReference::class)
public class PackageCatalogRemoveOptionalPackagesResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageCatalogRemoveOptionalPackagesResult.WithDefault, IWinRTObject {
  private val __828431814_Interface: IPackageCatalogRemoveOptionalPackagesResult.WithDefault by
      lazy {
    as_828431814()
  }


  public override val __828431814_Ptr: JNAPointer? by lazy {
    __828431814_Interface.__828431814_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__828431814_Interface)

  private fun as_828431814(): IPackageCatalogRemoveOptionalPackagesResult.WithDefault {
    if(pointer == NULL) {
      return(IPackageCatalogRemoveOptionalPackagesResult.ABI.makeIPackageCatalogRemoveOptionalPackagesResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageCatalogRemoveOptionalPackagesResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageCatalogRemoveOptionalPackagesResult.ABI.makeIPackageCatalogRemoveOptionalPackagesResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageCatalogRemoveOptionalPackagesResult> {
    public override fun getValue() =
        PackageCatalogRemoveOptionalPackagesResult(pointer.getPointer(0))

    public fun setValue(value: PackageCatalogRemoveOptionalPackagesResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageCatalogRemoveOptionalPackagesResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PackageCatalogRemoveOptionalPackagesResult {
      val address = segment.toRawLongValue()
      return PackageCatalogRemoveOptionalPackagesResult(Pointer(address))
    }

    public override fun toNative(obj: PackageCatalogRemoveOptionalPackagesResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
