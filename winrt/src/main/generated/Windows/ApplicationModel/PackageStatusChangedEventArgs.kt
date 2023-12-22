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

@ABIMarker(PackageStatusChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageStatusChangedEventArgs;{437d714d-bd80-4a70-bc50-f6e796509575})")
@WinRTByReference(brClass = PackageStatusChangedEventArgs.ByReference::class)
public class PackageStatusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageStatusChangedEventArgs.WithDefault, IWinRTObject {
  private val __170595190_Interface: IPackageStatusChangedEventArgs.WithDefault by lazy {
    as_170595190()
  }


  public override val __170595190_Ptr: JNAPointer? by lazy {
    __170595190_Interface.__170595190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__170595190_Interface)

  private fun as_170595190(): IPackageStatusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPackageStatusChangedEventArgs.ABI.makeIPackageStatusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageStatusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageStatusChangedEventArgs.ABI.makeIPackageStatusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageStatusChangedEventArgs> {
    public override fun getValue() = PackageStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PackageStatusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageStatusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return PackageStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PackageStatusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
