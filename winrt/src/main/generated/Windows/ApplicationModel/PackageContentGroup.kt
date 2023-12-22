package Windows.ApplicationModel

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(PackageContentGroup.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageContentGroup;{8f62695d-120a-4798-b5e1-5800dda8f2e1})")
@WinRTByReference(brClass = PackageContentGroup.ByReference::class)
public class PackageContentGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageContentGroup.WithDefault, IWinRTObject {
  private val __1941781479_Interface: IPackageContentGroup.WithDefault by lazy {
    as_1941781479()
  }


  public override val __1941781479_Ptr: JNAPointer? by lazy {
    __1941781479_Interface.__1941781479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1941781479_Interface)

  private fun as_1941781479(): IPackageContentGroup.WithDefault {
    if(pointer == NULL) {
      return(IPackageContentGroup.ABI.makeIPackageContentGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageContentGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageContentGroup.ABI.makeIPackageContentGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageContentGroup> {
    public override fun getValue() = PackageContentGroup(pointer.getPointer(0))

    public fun setValue(value: PackageContentGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageContentGroup, MemoryAddress> {
    public val IPackageContentGroupStatics_Instance: IPackageContentGroupStatics by lazy {
      createIPackageContentGroupStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPackageContentGroupStatics(): IPackageContentGroupStatics {
      val refiid = Guid.REFIID(IPackageContentGroupStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.PackageContentGroup".toHandle(),refiid,interfacePtr)
      val result =
          IPackageContentGroupStatics.ABI.makeIPackageContentGroupStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PackageContentGroup {
      val address = segment.toRawLongValue()
      return PackageContentGroup(Pointer(address))
    }

    public override fun toNative(obj: PackageContentGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_RequiredGroupName() =
        ABI.IPackageContentGroupStatics_Instance.get_RequiredGroupName()
  }
}
