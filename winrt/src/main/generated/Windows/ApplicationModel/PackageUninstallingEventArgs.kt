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

@ABIMarker(PackageUninstallingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageUninstallingEventArgs;{4443aa52-ab22-44cd-82bb-4ec9b827367a})")
@WinRTByReference(brClass = PackageUninstallingEventArgs.ByReference::class)
public class PackageUninstallingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageUninstallingEventArgs.WithDefault, IWinRTObject {
  private val __548659850_Interface: IPackageUninstallingEventArgs.WithDefault by lazy {
    as_548659850()
  }


  public override val __548659850_Ptr: JNAPointer? by lazy {
    __548659850_Interface.__548659850_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__548659850_Interface)

  private fun as_548659850(): IPackageUninstallingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPackageUninstallingEventArgs.ABI.makeIPackageUninstallingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageUninstallingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageUninstallingEventArgs.ABI.makeIPackageUninstallingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageUninstallingEventArgs> {
    public override fun getValue() = PackageUninstallingEventArgs(pointer.getPointer(0))

    public fun setValue(value: PackageUninstallingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageUninstallingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageUninstallingEventArgs {
      val address = segment.toRawLongValue()
      return PackageUninstallingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PackageUninstallingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
