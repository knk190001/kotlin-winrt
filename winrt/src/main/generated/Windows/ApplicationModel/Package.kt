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

@ABIMarker(Package.ABI::class)
@Signature("rc(Windows.ApplicationModel.Package;{163c792f-bd75-413c-bf23-b1fe7b95d825})")
@WinRTByReference(brClass = Package.ByReference::class)
public class Package(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackage.WithDefault, IPackage2.WithDefault, IPackage3.WithDefault,
    IPackageWithMetadata.WithDefault, IPackage4.WithDefault, IPackage5.WithDefault,
    IPackage6.WithDefault, IPackage7.WithDefault, IPackage8.WithDefault, IWinRTObject {
  private val __1564423231_Interface: IPackage.WithDefault by lazy {
    as_1564423231()
  }


  private val __1252479855_Interface: IPackage2.WithDefault by lazy {
    as_1252479855()
  }


  private val __1252479854_Interface: IPackage3.WithDefault by lazy {
    as_1252479854()
  }


  private val __1090981770_Interface: IPackageWithMetadata.WithDefault by lazy {
    as_1090981770()
  }


  private val __1252479853_Interface: IPackage4.WithDefault by lazy {
    as_1252479853()
  }


  private val __1252479852_Interface: IPackage5.WithDefault by lazy {
    as_1252479852()
  }


  private val __1252479851_Interface: IPackage6.WithDefault by lazy {
    as_1252479851()
  }


  private val __1252479850_Interface: IPackage7.WithDefault by lazy {
    as_1252479850()
  }


  private val __1252479849_Interface: IPackage8.WithDefault by lazy {
    as_1252479849()
  }


  public override val __1564423231_Ptr: JNAPointer? by lazy {
    __1564423231_Interface.__1564423231_Ptr
  }


  public override val __1252479855_Ptr: JNAPointer? by lazy {
    __1252479855_Interface.__1252479855_Ptr
  }


  public override val __1252479854_Ptr: JNAPointer? by lazy {
    __1252479854_Interface.__1252479854_Ptr
  }


  public override val __1090981770_Ptr: JNAPointer? by lazy {
    __1090981770_Interface.__1090981770_Ptr
  }


  public override val __1252479853_Ptr: JNAPointer? by lazy {
    __1252479853_Interface.__1252479853_Ptr
  }


  public override val __1252479852_Ptr: JNAPointer? by lazy {
    __1252479852_Interface.__1252479852_Ptr
  }


  public override val __1252479851_Ptr: JNAPointer? by lazy {
    __1252479851_Interface.__1252479851_Ptr
  }


  public override val __1252479850_Ptr: JNAPointer? by lazy {
    __1252479850_Interface.__1252479850_Ptr
  }


  public override val __1252479849_Ptr: JNAPointer? by lazy {
    __1252479849_Interface.__1252479849_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1564423231_Interface, __1252479855_Interface, __1252479854_Interface,
        __1090981770_Interface, __1252479853_Interface, __1252479852_Interface,
        __1252479851_Interface, __1252479850_Interface, __1252479849_Interface)

  private fun as_1564423231(): IPackage.WithDefault {
    if(pointer == NULL) {
      return(IPackage.ABI.makeIPackage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage.ABI.makeIPackage(ref.value))
  }

  private fun as_1252479855(): IPackage2.WithDefault {
    if(pointer == NULL) {
      return(IPackage2.ABI.makeIPackage2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackage2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage2.ABI.makeIPackage2(ref.value))
  }

  private fun as_1252479854(): IPackage3.WithDefault {
    if(pointer == NULL) {
      return(IPackage3.ABI.makeIPackage3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackage3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage3.ABI.makeIPackage3(ref.value))
  }

  private fun as_1090981770(): IPackageWithMetadata.WithDefault {
    if(pointer == NULL) {
      return(IPackageWithMetadata.ABI.makeIPackageWithMetadata(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageWithMetadata>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageWithMetadata.ABI.makeIPackageWithMetadata(ref.value))
  }

  private fun as_1252479853(): IPackage4.WithDefault {
    if(pointer == NULL) {
      return(IPackage4.ABI.makeIPackage4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackage4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage4.ABI.makeIPackage4(ref.value))
  }

  private fun as_1252479852(): IPackage5.WithDefault {
    if(pointer == NULL) {
      return(IPackage5.ABI.makeIPackage5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackage5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage5.ABI.makeIPackage5(ref.value))
  }

  private fun as_1252479851(): IPackage6.WithDefault {
    if(pointer == NULL) {
      return(IPackage6.ABI.makeIPackage6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackage6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage6.ABI.makeIPackage6(ref.value))
  }

  private fun as_1252479850(): IPackage7.WithDefault {
    if(pointer == NULL) {
      return(IPackage7.ABI.makeIPackage7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackage7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage7.ABI.makeIPackage7(ref.value))
  }

  private fun as_1252479849(): IPackage8.WithDefault {
    if(pointer == NULL) {
      return(IPackage8.ABI.makeIPackage8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackage8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackage8.ABI.makeIPackage8(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Package> {
    public override fun getValue() = Package(pointer.getPointer(0))

    public fun setValue(value: Package): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Package, MemoryAddress> {
    public val IPackageStatics_Instance: IPackageStatics by lazy {
      createIPackageStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPackageStatics(): IPackageStatics {
      val refiid = Guid.REFIID(IPackageStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Package".toHandle(),refiid,interfacePtr)
      val result = IPackageStatics.ABI.makeIPackageStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Package {
      val address = segment.toRawLongValue()
      return Package(Pointer(address))
    }

    public override fun toNative(obj: Package): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Current() = ABI.IPackageStatics_Instance.get_Current()
  }
}
