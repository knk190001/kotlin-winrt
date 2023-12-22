package Windows.UI.ViewManagement

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

@ABIMarker(UIViewSettings.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.UIViewSettings;{c63657f6-8850-470d-88f8-455e16ea2c26})")
@WinRTByReference(brClass = UIViewSettings.ByReference::class)
public class UIViewSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUIViewSettings.WithDefault, IWinRTObject {
  private val __1145691762_Interface: IUIViewSettings.WithDefault by lazy {
    as_1145691762()
  }


  public override val __1145691762_Ptr: JNAPointer? by lazy {
    __1145691762_Interface.__1145691762_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1145691762_Interface)

  private fun as_1145691762(): IUIViewSettings.WithDefault {
    if(pointer == NULL) {
      return(IUIViewSettings.ABI.makeIUIViewSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUIViewSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUIViewSettings.ABI.makeIUIViewSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UIViewSettings>
      {
    public override fun getValue() = UIViewSettings(pointer.getPointer(0))

    public fun setValue(value: UIViewSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UIViewSettings, MemoryAddress> {
    public val IUIViewSettingsStatics_Instance: IUIViewSettingsStatics by lazy {
      createIUIViewSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUIViewSettingsStatics(): IUIViewSettingsStatics {
      val refiid = Guid.REFIID(IUIViewSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.UIViewSettings".toHandle(),refiid,interfacePtr)
      val result = IUIViewSettingsStatics.ABI.makeIUIViewSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UIViewSettings {
      val address = segment.toRawLongValue()
      return UIViewSettings(Pointer(address))
    }

    public override fun toNative(obj: UIViewSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.IUIViewSettingsStatics_Instance.GetForCurrentView()
  }
}
