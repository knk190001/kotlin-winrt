package Windows.UI.ViewManagement.Core

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

@ABIMarker(UISettingsController.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.Core.UISettingsController;{78a51ac4-15c0-5a1b-a75b-acbf9cb8bb9e})")
@WinRTByReference(brClass = UISettingsController.ByReference::class)
public class UISettingsController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUISettingsController.WithDefault, IWinRTObject {
  private val __1920231110_Interface: IUISettingsController.WithDefault by lazy {
    as_1920231110()
  }


  public override val __1920231110_Ptr: JNAPointer? by lazy {
    __1920231110_Interface.__1920231110_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1920231110_Interface)

  private fun as_1920231110(): IUISettingsController.WithDefault {
    if(pointer == NULL) {
      return(IUISettingsController.ABI.makeIUISettingsController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettingsController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettingsController.ABI.makeIUISettingsController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UISettingsController> {
    public override fun getValue() = UISettingsController(pointer.getPointer(0))

    public fun setValue(value: UISettingsController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UISettingsController, MemoryAddress> {
    public val IUISettingsControllerStatics_Instance: IUISettingsControllerStatics by lazy {
      createIUISettingsControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUISettingsControllerStatics(): IUISettingsControllerStatics {
      val refiid = Guid.REFIID(IUISettingsControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.Core.UISettingsController".toHandle(),refiid,interfacePtr)
      val result =
          IUISettingsControllerStatics.ABI.makeIUISettingsControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UISettingsController {
      val address = segment.toRawLongValue()
      return UISettingsController(Pointer(address))
    }

    public override fun toNative(obj: UISettingsController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RequestDefaultAsync() =
        ABI.IUISettingsControllerStatics_Instance.RequestDefaultAsync()
  }
}
