package Microsoft.UI.Composition.SystemBackdrops

import Microsoft.UI.IClosableNotifier
import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(DesktopAcrylicController.ABI::class)
@Signature("rc(Microsoft.UI.Composition.SystemBackdrops.DesktopAcrylicController;{7c20a6af-8eb3-5f08-bdfc-6d35e35dfe45})")
@WinRTByReference(brClass = DesktopAcrylicController.ByReference::class)
public class DesktopAcrylicController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDesktopAcrylicController.WithDefault, IDesktopAcrylicController2.WithDefault,
    IDesktopAcrylicController3.WithDefault, ISystemBackdropController.WithDefault,
    IClosable.WithDefault, ISystemBackdropControllerWithTargets.WithDefault,
    IClosableNotifier.WithDefault, IWinRTObject {
  private val __1946645622_Interface: IDesktopAcrylicController.WithDefault by lazy {
    as_1946645622()
  }


  private val __216472188_Interface: IDesktopAcrylicController2.WithDefault by lazy {
    as_216472188()
  }


  private val __216472189_Interface: IDesktopAcrylicController3.WithDefault by lazy {
    as_216472189()
  }


  private val __1664869082_Interface: ISystemBackdropController.WithDefault by lazy {
    as_1664869082()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1896265250_Interface: ISystemBackdropControllerWithTargets.WithDefault by lazy {
    as_1896265250()
  }


  private val __105354978_Interface: IClosableNotifier.WithDefault by lazy {
    as_105354978()
  }


  public override val __1946645622_Ptr: JNAPointer? by lazy {
    __1946645622_Interface.__1946645622_Ptr
  }


  public override val __216472188_Ptr: JNAPointer? by lazy {
    __216472188_Interface.__216472188_Ptr
  }


  public override val __216472189_Ptr: JNAPointer? by lazy {
    __216472189_Interface.__216472189_Ptr
  }


  public override val __1664869082_Ptr: JNAPointer? by lazy {
    __1664869082_Interface.__1664869082_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1896265250_Ptr: JNAPointer? by lazy {
    __1896265250_Interface.__1896265250_Ptr
  }


  public override val __105354978_Ptr: JNAPointer? by lazy {
    __105354978_Interface.__105354978_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1946645622_Interface, __216472188_Interface, __216472189_Interface,
        __1664869082_Interface, __1260617006_Interface, __1896265250_Interface,
        __105354978_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1946645622(): IDesktopAcrylicController.WithDefault {
    if(pointer == NULL) {
      return(IDesktopAcrylicController.ABI.makeIDesktopAcrylicController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopAcrylicController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopAcrylicController.ABI.makeIDesktopAcrylicController(ref.value))
  }

  private fun as_216472188(): IDesktopAcrylicController2.WithDefault {
    if(pointer == NULL) {
      return(IDesktopAcrylicController2.ABI.makeIDesktopAcrylicController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopAcrylicController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopAcrylicController2.ABI.makeIDesktopAcrylicController2(ref.value))
  }

  private fun as_216472189(): IDesktopAcrylicController3.WithDefault {
    if(pointer == NULL) {
      return(IDesktopAcrylicController3.ABI.makeIDesktopAcrylicController3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopAcrylicController3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopAcrylicController3.ABI.makeIDesktopAcrylicController3(ref.value))
  }

  private fun as_1664869082(): ISystemBackdropController.WithDefault {
    if(pointer == NULL) {
      return(ISystemBackdropController.ABI.makeISystemBackdropController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemBackdropController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemBackdropController.ABI.makeISystemBackdropController(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_1896265250(): ISystemBackdropControllerWithTargets.WithDefault {
    if(pointer == NULL) {
      return(ISystemBackdropControllerWithTargets.ABI.makeISystemBackdropControllerWithTargets(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemBackdropControllerWithTargets>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemBackdropControllerWithTargets.ABI.makeISystemBackdropControllerWithTargets(ref.value))
  }

  private fun as_105354978(): IClosableNotifier.WithDefault {
    if(pointer == NULL) {
      return(IClosableNotifier.ABI.makeIClosableNotifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosableNotifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosableNotifier.ABI.makeIClosableNotifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesktopAcrylicController> {
    public override fun getValue() = DesktopAcrylicController(pointer.getPointer(0))

    public fun setValue(value: DesktopAcrylicController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesktopAcrylicController, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDesktopAcrylicControllerStatics_Instance: IDesktopAcrylicControllerStatics by lazy {
      createIDesktopAcrylicControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.SystemBackdrops.DesktopAcrylicController".toHandle(),
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

    public fun createIDesktopAcrylicControllerStatics(): IDesktopAcrylicControllerStatics {
      val refiid = Guid.REFIID(IDesktopAcrylicControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.SystemBackdrops.DesktopAcrylicController".toHandle(),refiid,interfacePtr)
      val result =
          IDesktopAcrylicControllerStatics.ABI.makeIDesktopAcrylicControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DesktopAcrylicController {
      val address = segment.toRawLongValue()
      return DesktopAcrylicController(Pointer(address))
    }

    public override fun toNative(obj: DesktopAcrylicController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.IDesktopAcrylicControllerStatics_Instance.IsSupported()
  }
}
