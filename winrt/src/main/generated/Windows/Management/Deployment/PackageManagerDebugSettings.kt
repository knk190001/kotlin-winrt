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

@ABIMarker(PackageManagerDebugSettings.ABI::class)
@Signature("rc(Windows.Management.Deployment.PackageManagerDebugSettings;{1a611683-a988-4fcf-8f0f-ce175898e8eb})")
@WinRTByReference(brClass = PackageManagerDebugSettings.ByReference::class)
public class PackageManagerDebugSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageManagerDebugSettings.WithDefault, IWinRTObject {
  private val __813355723_Interface: IPackageManagerDebugSettings.WithDefault by lazy {
    as_813355723()
  }


  public override val __813355723_Ptr: JNAPointer? by lazy {
    __813355723_Interface.__813355723_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__813355723_Interface)

  private fun as_813355723(): IPackageManagerDebugSettings.WithDefault {
    if(pointer == NULL) {
      return(IPackageManagerDebugSettings.ABI.makeIPackageManagerDebugSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManagerDebugSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManagerDebugSettings.ABI.makeIPackageManagerDebugSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageManagerDebugSettings> {
    public override fun getValue() = PackageManagerDebugSettings(pointer.getPointer(0))

    public fun setValue(value: PackageManagerDebugSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageManagerDebugSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PackageManagerDebugSettings {
      val address = segment.toRawLongValue()
      return PackageManagerDebugSettings(Pointer(address))
    }

    public override fun toNative(obj: PackageManagerDebugSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
