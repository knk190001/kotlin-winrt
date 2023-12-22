package Windows.Management.Deployment

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(PackageManager.ABI::class)
@Signature("rc(Windows.Management.Deployment.PackageManager;{9a7d4b65-5e8f-4fc7-a2e5-7f6925cb8b53})")
@WinRTByReference(brClass = PackageManager.ByReference::class)
public class PackageManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPackageManager.WithDefault, IPackageManager2.WithDefault,
    IPackageManager3.WithDefault, IPackageManager4.WithDefault, IPackageManager5.WithDefault,
    IPackageManager6.WithDefault, IPackageManager7.WithDefault, IPackageManager8.WithDefault,
    IPackageManager9.WithDefault, IPackageManager10.WithDefault, IWinRTObject {
  private val __1676724875_Interface: IPackageManager.WithDefault by lazy {
    as_1676724875()
  }


  private val __438863623_Interface: IPackageManager2.WithDefault by lazy {
    as_438863623()
  }


  private val __438863624_Interface: IPackageManager3.WithDefault by lazy {
    as_438863624()
  }


  private val __438863625_Interface: IPackageManager4.WithDefault by lazy {
    as_438863625()
  }


  private val __438863626_Interface: IPackageManager5.WithDefault by lazy {
    as_438863626()
  }


  private val __438863627_Interface: IPackageManager6.WithDefault by lazy {
    as_438863627()
  }


  private val __438863628_Interface: IPackageManager7.WithDefault by lazy {
    as_438863628()
  }


  private val __438863629_Interface: IPackageManager8.WithDefault by lazy {
    as_438863629()
  }


  private val __438863630_Interface: IPackageManager9.WithDefault by lazy {
    as_438863630()
  }


  private val __719870442_Interface: IPackageManager10.WithDefault by lazy {
    as_719870442()
  }


  public override val __1676724875_Ptr: JNAPointer? by lazy {
    __1676724875_Interface.__1676724875_Ptr
  }


  public override val __438863623_Ptr: JNAPointer? by lazy {
    __438863623_Interface.__438863623_Ptr
  }


  public override val __438863624_Ptr: JNAPointer? by lazy {
    __438863624_Interface.__438863624_Ptr
  }


  public override val __438863625_Ptr: JNAPointer? by lazy {
    __438863625_Interface.__438863625_Ptr
  }


  public override val __438863626_Ptr: JNAPointer? by lazy {
    __438863626_Interface.__438863626_Ptr
  }


  public override val __438863627_Ptr: JNAPointer? by lazy {
    __438863627_Interface.__438863627_Ptr
  }


  public override val __438863628_Ptr: JNAPointer? by lazy {
    __438863628_Interface.__438863628_Ptr
  }


  public override val __438863629_Ptr: JNAPointer? by lazy {
    __438863629_Interface.__438863629_Ptr
  }


  public override val __438863630_Ptr: JNAPointer? by lazy {
    __438863630_Interface.__438863630_Ptr
  }


  public override val __719870442_Ptr: JNAPointer? by lazy {
    __719870442_Interface.__719870442_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1676724875_Interface, __438863623_Interface, __438863624_Interface,
        __438863625_Interface, __438863626_Interface, __438863627_Interface, __438863628_Interface,
        __438863629_Interface, __438863630_Interface, __719870442_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1676724875(): IPackageManager.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager.ABI.makeIPackageManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager.ABI.makeIPackageManager(ref.value))
  }

  private fun as_438863623(): IPackageManager2.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager2.ABI.makeIPackageManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager2.ABI.makeIPackageManager2(ref.value))
  }

  private fun as_438863624(): IPackageManager3.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager3.ABI.makeIPackageManager3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager3.ABI.makeIPackageManager3(ref.value))
  }

  private fun as_438863625(): IPackageManager4.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager4.ABI.makeIPackageManager4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager4.ABI.makeIPackageManager4(ref.value))
  }

  private fun as_438863626(): IPackageManager5.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager5.ABI.makeIPackageManager5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager5.ABI.makeIPackageManager5(ref.value))
  }

  private fun as_438863627(): IPackageManager6.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager6.ABI.makeIPackageManager6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager6.ABI.makeIPackageManager6(ref.value))
  }

  private fun as_438863628(): IPackageManager7.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager7.ABI.makeIPackageManager7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager7.ABI.makeIPackageManager7(ref.value))
  }

  private fun as_438863629(): IPackageManager8.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager8.ABI.makeIPackageManager8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager8.ABI.makeIPackageManager8(ref.value))
  }

  private fun as_438863630(): IPackageManager9.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager9.ABI.makeIPackageManager9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager9.ABI.makeIPackageManager9(ref.value))
  }

  private fun as_719870442(): IPackageManager10.WithDefault {
    if(pointer == NULL) {
      return(IPackageManager10.ABI.makeIPackageManager10(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPackageManager10>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPackageManager10.ABI.makeIPackageManager10(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PackageManager>
      {
    public override fun getValue() = PackageManager(pointer.getPointer(0))

    public fun setValue(value: PackageManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PackageManager, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Management.Deployment.PackageManager".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): PackageManager {
      val address = segment.toRawLongValue()
      return PackageManager(Pointer(address))
    }

    public override fun toNative(obj: PackageManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
