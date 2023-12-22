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

@ABIMarker(PackageContentGroupStagingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageContentGroupStagingEventArgs;{3d7bc27e-6f27-446c-986e-d4733d4d9113})")
@WinRTByReference(brClass = PackageContentGroupStagingEventArgs.ByReference::class)
public class PackageContentGroupStagingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageContentGroupStagingEventArgs.WithDefault, IWinRTObject {
  private val __1818376541_Interface: IPackageContentGroupStagingEventArgs.WithDefault by lazy {
    as_1818376541()
  }


  public override val __1818376541_Ptr: JNAPointer? by lazy {
    __1818376541_Interface.__1818376541_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1818376541_Interface)

  private fun as_1818376541(): IPackageContentGroupStagingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPackageContentGroupStagingEventArgs.ABI.makeIPackageContentGroupStagingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageContentGroupStagingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageContentGroupStagingEventArgs.ABI.makeIPackageContentGroupStagingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageContentGroupStagingEventArgs> {
    public override fun getValue() = PackageContentGroupStagingEventArgs(pointer.getPointer(0))

    public fun setValue(value: PackageContentGroupStagingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageContentGroupStagingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageContentGroupStagingEventArgs {
      val address = segment.toRawLongValue()
      return PackageContentGroupStagingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PackageContentGroupStagingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
