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

@ABIMarker(PackageInstallingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageInstallingEventArgs;{97741eb7-ab7a-401a-8b61-eb0e7faff237})")
@WinRTByReference(brClass = PackageInstallingEventArgs.ByReference::class)
public class PackageInstallingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageInstallingEventArgs.WithDefault, IWinRTObject {
  private val __1138651247_Interface: IPackageInstallingEventArgs.WithDefault by lazy {
    as_1138651247()
  }


  public override val __1138651247_Ptr: JNAPointer? by lazy {
    __1138651247_Interface.__1138651247_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1138651247_Interface)

  private fun as_1138651247(): IPackageInstallingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPackageInstallingEventArgs.ABI.makeIPackageInstallingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageInstallingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageInstallingEventArgs.ABI.makeIPackageInstallingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageInstallingEventArgs> {
    public override fun getValue() = PackageInstallingEventArgs(pointer.getPointer(0))

    public fun setValue(value: PackageInstallingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageInstallingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageInstallingEventArgs {
      val address = segment.toRawLongValue()
      return PackageInstallingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PackageInstallingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
