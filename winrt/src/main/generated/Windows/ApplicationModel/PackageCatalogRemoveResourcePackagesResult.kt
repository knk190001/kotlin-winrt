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

@ABIMarker(PackageCatalogRemoveResourcePackagesResult.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageCatalogRemoveResourcePackagesResult;{ae719709-1a52-4321-87b3-e5a1a17981a7})")
@WinRTByReference(brClass = PackageCatalogRemoveResourcePackagesResult.ByReference::class)
public class PackageCatalogRemoveResourcePackagesResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageCatalogRemoveResourcePackagesResult.WithDefault, IWinRTObject {
  private val __1358073332_Interface: IPackageCatalogRemoveResourcePackagesResult.WithDefault by
      lazy {
    as_1358073332()
  }


  public override val __1358073332_Ptr: JNAPointer? by lazy {
    __1358073332_Interface.__1358073332_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1358073332_Interface)

  private fun as_1358073332(): IPackageCatalogRemoveResourcePackagesResult.WithDefault {
    if(pointer == NULL) {
      return(IPackageCatalogRemoveResourcePackagesResult.ABI.makeIPackageCatalogRemoveResourcePackagesResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageCatalogRemoveResourcePackagesResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageCatalogRemoveResourcePackagesResult.ABI.makeIPackageCatalogRemoveResourcePackagesResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageCatalogRemoveResourcePackagesResult> {
    public override fun getValue() =
        PackageCatalogRemoveResourcePackagesResult(pointer.getPointer(0))

    public fun setValue(value: PackageCatalogRemoveResourcePackagesResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageCatalogRemoveResourcePackagesResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        PackageCatalogRemoveResourcePackagesResult {
      val address = segment.toRawLongValue()
      return PackageCatalogRemoveResourcePackagesResult(Pointer(address))
    }

    public override fun toNative(obj: PackageCatalogRemoveResourcePackagesResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
