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

@ABIMarker(PackageCatalog.ABI::class)
@Signature("rc(Windows.ApplicationModel.PackageCatalog;{230a3751-9de3-4445-be74-91fb325abefe})")
@WinRTByReference(brClass = PackageCatalog.ByReference::class)
public class PackageCatalog(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageCatalog.WithDefault, IPackageCatalog2.WithDefault,
    IPackageCatalog3.WithDefault, IPackageCatalog4.WithDefault, IWinRTObject {
  private val __686792984_Interface: IPackageCatalog.WithDefault by lazy {
    as_686792984()
  }


  private val __184253926_Interface: IPackageCatalog2.WithDefault by lazy {
    as_184253926()
  }


  private val __184253925_Interface: IPackageCatalog3.WithDefault by lazy {
    as_184253925()
  }


  private val __184253924_Interface: IPackageCatalog4.WithDefault by lazy {
    as_184253924()
  }


  public override val __686792984_Ptr: JNAPointer? by lazy {
    __686792984_Interface.__686792984_Ptr
  }


  public override val __184253926_Ptr: JNAPointer? by lazy {
    __184253926_Interface.__184253926_Ptr
  }


  public override val __184253925_Ptr: JNAPointer? by lazy {
    __184253925_Interface.__184253925_Ptr
  }


  public override val __184253924_Ptr: JNAPointer? by lazy {
    __184253924_Interface.__184253924_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__686792984_Interface, __184253926_Interface, __184253925_Interface,
        __184253924_Interface)

  private fun as_686792984(): IPackageCatalog.WithDefault {
    if(pointer == NULL) {
      return(IPackageCatalog.ABI.makeIPackageCatalog(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageCatalog>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageCatalog.ABI.makeIPackageCatalog(ref.value))
  }

  private fun as_184253926(): IPackageCatalog2.WithDefault {
    if(pointer == NULL) {
      return(IPackageCatalog2.ABI.makeIPackageCatalog2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageCatalog2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageCatalog2.ABI.makeIPackageCatalog2(ref.value))
  }

  private fun as_184253925(): IPackageCatalog3.WithDefault {
    if(pointer == NULL) {
      return(IPackageCatalog3.ABI.makeIPackageCatalog3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageCatalog3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageCatalog3.ABI.makeIPackageCatalog3(ref.value))
  }

  private fun as_184253924(): IPackageCatalog4.WithDefault {
    if(pointer == NULL) {
      return(IPackageCatalog4.ABI.makeIPackageCatalog4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageCatalog4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageCatalog4.ABI.makeIPackageCatalog4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PackageCatalog>
      {
    public override fun getValue() = PackageCatalog(pointer.getPointer(0))

    public fun setValue(value: PackageCatalog): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageCatalog, MemoryAddress> {
    public val IPackageCatalogStatics_Instance: IPackageCatalogStatics by lazy {
      createIPackageCatalogStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPackageCatalogStatics(): IPackageCatalogStatics {
      val refiid = Guid.REFIID(IPackageCatalogStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.PackageCatalog".toHandle(),refiid,interfacePtr)
      val result = IPackageCatalogStatics.ABI.makeIPackageCatalogStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PackageCatalog {
      val address = segment.toRawLongValue()
      return PackageCatalog(Pointer(address))
    }

    public override fun toNative(obj: PackageCatalog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun OpenForCurrentPackage() = ABI.IPackageCatalogStatics_Instance.OpenForCurrentPackage()

    public fun OpenForCurrentUser() = ABI.IPackageCatalogStatics_Instance.OpenForCurrentUser()
  }
}
