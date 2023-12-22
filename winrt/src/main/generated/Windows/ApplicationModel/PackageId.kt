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

@ABIMarker(PackageId.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageId;{1adb665e-37c7-4790-9980-dd7ae74e8bb2})")
@WinRTByReference(brClass = PackageId.ByReference::class)
public class PackageId(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageId.WithDefault, IPackageIdWithMetadata.WithDefault, IWinRTObject {
  private val __172169028_Interface: IPackageId.WithDefault by lazy {
    as_172169028()
  }


  private val __1490916111_Interface: IPackageIdWithMetadata.WithDefault by lazy {
    as_1490916111()
  }


  public override val __172169028_Ptr: JNAPointer? by lazy {
    __172169028_Interface.__172169028_Ptr
  }


  public override val __1490916111_Ptr: JNAPointer? by lazy {
    __1490916111_Interface.__1490916111_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__172169028_Interface, __1490916111_Interface)

  private fun as_172169028(): IPackageId.WithDefault {
    if(pointer == NULL) {
      return(IPackageId.ABI.makeIPackageId(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageId>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageId.ABI.makeIPackageId(ref.value))
  }

  private fun as_1490916111(): IPackageIdWithMetadata.WithDefault {
    if(pointer == NULL) {
      return(IPackageIdWithMetadata.ABI.makeIPackageIdWithMetadata(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageIdWithMetadata>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageIdWithMetadata.ABI.makeIPackageIdWithMetadata(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PackageId> {
    public override fun getValue() = PackageId(pointer.getPointer(0))

    public fun setValue(value: PackageId): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageId, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageId {
      val address = segment.toRawLongValue()
      return PackageId(Pointer(address))
    }

    public override fun toNative(obj: PackageId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
