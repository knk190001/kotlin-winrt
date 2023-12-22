package Microsoft.Windows.ApplicationModel.DynamicDependency

import Windows.ApplicationModel.PackageVersion
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PackageDependency.ABI::class)
@Signature("rc(Microsoft.Windows.ApplicationModel.DynamicDependency.PackageDependency;{32ae7b95-e358-5a48-9669-c97d85ad6556})")
@WinRTByReference(brClass = PackageDependency.ByReference::class)
public class PackageDependency(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageDependency.WithDefault, IWinRTObject {
  private val __2007838056_Interface: IPackageDependency.WithDefault by lazy {
    as_2007838056()
  }


  public override val __2007838056_Ptr: JNAPointer? by lazy {
    __2007838056_Interface.__2007838056_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2007838056_Interface)

  private fun as_2007838056(): IPackageDependency.WithDefault {
    if(pointer == NULL) {
      return(IPackageDependency.ABI.makeIPackageDependency(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageDependency>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageDependency.ABI.makeIPackageDependency(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PackageDependency> {
    public override fun getValue() = PackageDependency(pointer.getPointer(0))

    public fun setValue(value: PackageDependency): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageDependency, MemoryAddress> {
    public val IPackageDependencyStatics_Instance: IPackageDependencyStatics by lazy {
      createIPackageDependencyStatics()
    }


    public val IPackageDependencyStatics2_Instance: IPackageDependencyStatics2 by lazy {
      createIPackageDependencyStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPackageDependencyStatics(): IPackageDependencyStatics {
      val refiid = Guid.REFIID(IPackageDependencyStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.DynamicDependency.PackageDependency".toHandle(),refiid,interfacePtr)
      val result = IPackageDependencyStatics.ABI.makeIPackageDependencyStatics(interfacePtr.value)
      return result
    }

    public fun createIPackageDependencyStatics2(): IPackageDependencyStatics2 {
      val refiid = Guid.REFIID(IPackageDependencyStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.ApplicationModel.DynamicDependency.PackageDependency".toHandle(),refiid,interfacePtr)
      val result = IPackageDependencyStatics2.ABI.makeIPackageDependencyStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PackageDependency {
      val address = segment.toRawLongValue()
      return PackageDependency(Pointer(address))
    }

    public override fun toNative(obj: PackageDependency): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetFromId(id: String) = ABI.IPackageDependencyStatics_Instance.GetFromId(id)

    public fun GetFromIdForSystem(id: String) =
        ABI.IPackageDependencyStatics_Instance.GetFromIdForSystem(id)

    public fun Create(packageFamilyName: String, minVersion: PackageVersion) =
        ABI.IPackageDependencyStatics_Instance.Create(packageFamilyName, minVersion)

    public fun Create(
      packageFamilyName: String,
      minVersion: PackageVersion,
      options: CreatePackageDependencyOptions
    ) = ABI.IPackageDependencyStatics_Instance.Create(packageFamilyName, minVersion, options)

    public fun CreateForSystem(
      packageFamilyName: String,
      minVersion: PackageVersion,
      options: CreatePackageDependencyOptions
    ) = ABI.IPackageDependencyStatics_Instance.CreateForSystem(packageFamilyName, minVersion,
        options)

    public fun get_GenerationId() = ABI.IPackageDependencyStatics_Instance.get_GenerationId()

    public fun get_PackageGraphRevisionId() =
        ABI.IPackageDependencyStatics2_Instance.get_PackageGraphRevisionId()
  }
}
