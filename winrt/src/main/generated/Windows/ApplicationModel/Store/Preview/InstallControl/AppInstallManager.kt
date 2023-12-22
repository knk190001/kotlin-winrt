package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(AppInstallManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallManager;{9353e170-8441-4b45-bd72-7c2fa925beee})")
@WinRTByReference(brClass = AppInstallManager.ByReference::class)
public class AppInstallManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstallManager.WithDefault, IAppInstallManager2.WithDefault,
    IAppInstallManager3.WithDefault, IAppInstallManager4.WithDefault,
    IAppInstallManager5.WithDefault, IAppInstallManager6.WithDefault,
    IAppInstallManager7.WithDefault, IWinRTObject {
  private val __808790761_Interface: IAppInstallManager.WithDefault by lazy {
    as_808790761()
  }


  private val __697290135_Interface: IAppInstallManager2.WithDefault by lazy {
    as_697290135()
  }


  private val __697290134_Interface: IAppInstallManager3.WithDefault by lazy {
    as_697290134()
  }


  private val __697290133_Interface: IAppInstallManager4.WithDefault by lazy {
    as_697290133()
  }


  private val __697290132_Interface: IAppInstallManager5.WithDefault by lazy {
    as_697290132()
  }


  private val __697290131_Interface: IAppInstallManager6.WithDefault by lazy {
    as_697290131()
  }


  private val __697290130_Interface: IAppInstallManager7.WithDefault by lazy {
    as_697290130()
  }


  public override val __808790761_Ptr: JNAPointer? by lazy {
    __808790761_Interface.__808790761_Ptr
  }


  public override val __697290135_Ptr: JNAPointer? by lazy {
    __697290135_Interface.__697290135_Ptr
  }


  public override val __697290134_Ptr: JNAPointer? by lazy {
    __697290134_Interface.__697290134_Ptr
  }


  public override val __697290133_Ptr: JNAPointer? by lazy {
    __697290133_Interface.__697290133_Ptr
  }


  public override val __697290132_Ptr: JNAPointer? by lazy {
    __697290132_Interface.__697290132_Ptr
  }


  public override val __697290131_Ptr: JNAPointer? by lazy {
    __697290131_Interface.__697290131_Ptr
  }


  public override val __697290130_Ptr: JNAPointer? by lazy {
    __697290130_Interface.__697290130_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__808790761_Interface, __697290135_Interface, __697290134_Interface,
        __697290133_Interface, __697290132_Interface, __697290131_Interface, __697290130_Interface)

  public constructor() : this(ABI.activate())

  private fun as_808790761(): IAppInstallManager.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallManager.ABI.makeIAppInstallManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallManager.ABI.makeIAppInstallManager(ref.value))
  }

  private fun as_697290135(): IAppInstallManager2.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallManager2.ABI.makeIAppInstallManager2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallManager2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallManager2.ABI.makeIAppInstallManager2(ref.value))
  }

  private fun as_697290134(): IAppInstallManager3.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallManager3.ABI.makeIAppInstallManager3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallManager3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallManager3.ABI.makeIAppInstallManager3(ref.value))
  }

  private fun as_697290133(): IAppInstallManager4.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallManager4.ABI.makeIAppInstallManager4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallManager4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallManager4.ABI.makeIAppInstallManager4(ref.value))
  }

  private fun as_697290132(): IAppInstallManager5.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallManager5.ABI.makeIAppInstallManager5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallManager5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallManager5.ABI.makeIAppInstallManager5(ref.value))
  }

  private fun as_697290131(): IAppInstallManager6.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallManager6.ABI.makeIAppInstallManager6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallManager6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallManager6.ABI.makeIAppInstallManager6(ref.value))
  }

  private fun as_697290130(): IAppInstallManager7.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallManager7.ABI.makeIAppInstallManager7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallManager7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallManager7.ABI.makeIAppInstallManager7(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppInstallManager> {
    public override fun getValue() = AppInstallManager(pointer.getPointer(0))

    public fun setValue(value: AppInstallManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInstallManager, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallManager".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): AppInstallManager {
      val address = segment.toRawLongValue()
      return AppInstallManager(Pointer(address))
    }

    public override fun toNative(obj: AppInstallManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
