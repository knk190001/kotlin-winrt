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

@ABIMarker(PackageUpdatingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageUpdatingEventArgs;{cd7b4228-fd74-443e-b114-23e677b0e86f})")
@WinRTByReference(brClass = PackageUpdatingEventArgs.ByReference::class)
public class PackageUpdatingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageUpdatingEventArgs.WithDefault, IWinRTObject {
  private val __886493232_Interface: IPackageUpdatingEventArgs.WithDefault by lazy {
    as_886493232()
  }


  public override val __886493232_Ptr: JNAPointer? by lazy {
    __886493232_Interface.__886493232_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__886493232_Interface)

  private fun as_886493232(): IPackageUpdatingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPackageUpdatingEventArgs.ABI.makeIPackageUpdatingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageUpdatingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageUpdatingEventArgs.ABI.makeIPackageUpdatingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageUpdatingEventArgs> {
    public override fun getValue() = PackageUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: PackageUpdatingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageUpdatingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return PackageUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PackageUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
