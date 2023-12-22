package Windows.Management.Deployment

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

@ABIMarker(PackageVolume.ABI::class)
@Signature("rc(Windows.Management.Deployment.PackageVolume;{cf2672c3-1a40-4450-9739-2ace2e898853})")
@WinRTByReference(brClass = PackageVolume.ByReference::class)
public class PackageVolume(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageVolume.WithDefault, IPackageVolume2.WithDefault, IWinRTObject {
  private val __229549956_Interface: IPackageVolume.WithDefault by lazy {
    as_229549956()
  }


  private val __1473886006_Interface: IPackageVolume2.WithDefault by lazy {
    as_1473886006()
  }


  public override val __229549956_Ptr: JNAPointer? by lazy {
    __229549956_Interface.__229549956_Ptr
  }


  public override val __1473886006_Ptr: JNAPointer? by lazy {
    __1473886006_Interface.__1473886006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__229549956_Interface, __1473886006_Interface)

  private fun as_229549956(): IPackageVolume.WithDefault {
    if(pointer == NULL) {
      return(IPackageVolume.ABI.makeIPackageVolume(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageVolume>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageVolume.ABI.makeIPackageVolume(ref.value))
  }

  private fun as_1473886006(): IPackageVolume2.WithDefault {
    if(pointer == NULL) {
      return(IPackageVolume2.ABI.makeIPackageVolume2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageVolume2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageVolume2.ABI.makeIPackageVolume2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PackageVolume>
      {
    public override fun getValue() = PackageVolume(pointer.getPointer(0))

    public fun setValue(value: PackageVolume): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageVolume, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageVolume {
      val address = segment.toRawLongValue()
      return PackageVolume(Pointer(address))
    }

    public override fun toNative(obj: PackageVolume): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
