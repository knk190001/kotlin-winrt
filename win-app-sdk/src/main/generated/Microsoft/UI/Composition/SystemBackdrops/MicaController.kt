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

@ABIMarker(MicaController.ABI::class)
@Signature("rc(Microsoft.UI.Composition.SystemBackdrops.MicaController;{2de996a9-0a2a-5889-a89c-1f84060a8cab})")
@WinRTByReference(brClass = MicaController.ByReference::class)
public class MicaController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMicaController.WithDefault, IMicaController2.WithDefault,
    ISystemBackdropController.WithDefault, IClosable.WithDefault,
    ISystemBackdropControllerWithTargets.WithDefault, IClosableNotifier.WithDefault, IWinRTObject {
  private val __1167663919_Interface: IMicaController.WithDefault by lazy {
    as_1167663919()
  }


  private val __1837843171_Interface: IMicaController2.WithDefault by lazy {
    as_1837843171()
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


  public override val __1167663919_Ptr: JNAPointer? by lazy {
    __1167663919_Interface.__1167663919_Ptr
  }


  public override val __1837843171_Ptr: JNAPointer? by lazy {
    __1837843171_Interface.__1837843171_Ptr
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
    get() = arrayOf(__1167663919_Interface, __1837843171_Interface, __1664869082_Interface,
        __1260617006_Interface, __1896265250_Interface, __105354978_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1167663919(): IMicaController.WithDefault {
    if(pointer == NULL) {
      return(IMicaController.ABI.makeIMicaController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMicaController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMicaController.ABI.makeIMicaController(ref.value))
  }

  private fun as_1837843171(): IMicaController2.WithDefault {
    if(pointer == NULL) {
      return(IMicaController2.ABI.makeIMicaController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMicaController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMicaController2.ABI.makeIMicaController2(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MicaController>
      {
    public override fun getValue() = MicaController(pointer.getPointer(0))

    public fun setValue(value: MicaController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MicaController, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IMicaControllerStatics_Instance: IMicaControllerStatics by lazy {
      createIMicaControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.SystemBackdrops.MicaController".toHandle(),
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

    public fun createIMicaControllerStatics(): IMicaControllerStatics {
      val refiid = Guid.REFIID(IMicaControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.SystemBackdrops.MicaController".toHandle(),refiid,interfacePtr)
      val result = IMicaControllerStatics.ABI.makeIMicaControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MicaController {
      val address = segment.toRawLongValue()
      return MicaController(Pointer(address))
    }

    public override fun toNative(obj: MicaController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.IMicaControllerStatics_Instance.IsSupported()
  }
}
