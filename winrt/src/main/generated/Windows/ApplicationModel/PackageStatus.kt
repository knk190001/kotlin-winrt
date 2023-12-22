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

@ABIMarker(PackageStatus.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageStatus;{5fe74f71-a365-4c09-a02d-046d525ea1da})")
@WinRTByReference(brClass = PackageStatus.ByReference::class)
public class PackageStatus(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageStatus.WithDefault, IPackageStatus2.WithDefault, IWinRTObject {
  private val __1719536877_Interface: IPackageStatus.WithDefault by lazy {
    as_1719536877()
  }


  private val __1766035585_Interface: IPackageStatus2.WithDefault by lazy {
    as_1766035585()
  }


  public override val __1719536877_Ptr: JNAPointer? by lazy {
    __1719536877_Interface.__1719536877_Ptr
  }


  public override val __1766035585_Ptr: JNAPointer? by lazy {
    __1766035585_Interface.__1766035585_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1719536877_Interface, __1766035585_Interface)

  private fun as_1719536877(): IPackageStatus.WithDefault {
    if(pointer == NULL) {
      return(IPackageStatus.ABI.makeIPackageStatus(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageStatus>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageStatus.ABI.makeIPackageStatus(ref.value))
  }

  private fun as_1766035585(): IPackageStatus2.WithDefault {
    if(pointer == NULL) {
      return(IPackageStatus2.ABI.makeIPackageStatus2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageStatus2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageStatus2.ABI.makeIPackageStatus2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PackageStatus>
      {
    public override fun getValue() = PackageStatus(pointer.getPointer(0))

    public fun setValue(value: PackageStatus): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageStatus, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageStatus {
      val address = segment.toRawLongValue()
      return PackageStatus(Pointer(address))
    }

    public override fun toNative(obj: PackageStatus): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
