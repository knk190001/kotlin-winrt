package Windows.Phone.Management.Deployment

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

@ABIMarker(PackageInstallResult.ABI::class)
@Signature("rc(Windows.Phone.Management.Deployment.PackageInstallResult;{33e8eed5-0f7e-4473-967c-7d6e1c0e7de1})")
@WinRTByReference(brClass = PackageInstallResult.ByReference::class)
public class PackageInstallResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageInstallResult.WithDefault, IPackageInstallResult2.WithDefault,
    IWinRTObject {
  private val __20966998_Interface: IPackageInstallResult.WithDefault by lazy {
    as_20966998()
  }


  private val __649976988_Interface: IPackageInstallResult2.WithDefault by lazy {
    as_649976988()
  }


  public override val __20966998_Ptr: JNAPointer? by lazy {
    __20966998_Interface.__20966998_Ptr
  }


  public override val __649976988_Ptr: JNAPointer? by lazy {
    __649976988_Interface.__649976988_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__20966998_Interface, __649976988_Interface)

  private fun as_20966998(): IPackageInstallResult.WithDefault {
    if(pointer == NULL) {
      return(IPackageInstallResult.ABI.makeIPackageInstallResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageInstallResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageInstallResult.ABI.makeIPackageInstallResult(ref.value))
  }

  private fun as_649976988(): IPackageInstallResult2.WithDefault {
    if(pointer == NULL) {
      return(IPackageInstallResult2.ABI.makeIPackageInstallResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageInstallResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageInstallResult2.ABI.makeIPackageInstallResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageInstallResult> {
    public override fun getValue() = PackageInstallResult(pointer.getPointer(0))

    public fun setValue(value: PackageInstallResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageInstallResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageInstallResult {
      val address = segment.toRawLongValue()
      return PackageInstallResult(Pointer(address))
    }

    public override fun toNative(obj: PackageInstallResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
