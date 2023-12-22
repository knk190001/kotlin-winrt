package Windows.UI.Input

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

@ABIMarker(RadialController.ABI::class)
@Signature("rc(Windows.UI.Input.RadialController;{3055d1c8-df51-43d4-b23b-0e1037467a09})")
@WinRTByReference(brClass = RadialController.ByReference::class)
public class RadialController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialController.WithDefault, IRadialController2.WithDefault, IWinRTObject {
  private val __987103255_Interface: IRadialController.WithDefault by lazy {
    as_987103255()
  }


  private val __535429783_Interface: IRadialController2.WithDefault by lazy {
    as_535429783()
  }


  public override val __987103255_Ptr: JNAPointer? by lazy {
    __987103255_Interface.__987103255_Ptr
  }


  public override val __535429783_Ptr: JNAPointer? by lazy {
    __535429783_Interface.__535429783_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__987103255_Interface, __535429783_Interface)

  private fun as_987103255(): IRadialController.WithDefault {
    if(pointer == NULL) {
      return(IRadialController.ABI.makeIRadialController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialController.ABI.makeIRadialController(ref.value))
  }

  private fun as_535429783(): IRadialController2.WithDefault {
    if(pointer == NULL) {
      return(IRadialController2.ABI.makeIRadialController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialController2.ABI.makeIRadialController2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialController> {
    public override fun getValue() = RadialController(pointer.getPointer(0))

    public fun setValue(value: RadialController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialController, MemoryAddress> {
    public val IRadialControllerStatics_Instance: IRadialControllerStatics by lazy {
      createIRadialControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRadialControllerStatics(): IRadialControllerStatics {
      val refiid = Guid.REFIID(IRadialControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.RadialController".toHandle(),refiid,interfacePtr)
      val result = IRadialControllerStatics.ABI.makeIRadialControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RadialController {
      val address = segment.toRawLongValue()
      return RadialController(Pointer(address))
    }

    public override fun toNative(obj: RadialController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.IRadialControllerStatics_Instance.IsSupported()

    public fun CreateForCurrentView() = ABI.IRadialControllerStatics_Instance.CreateForCurrentView()
  }
}
