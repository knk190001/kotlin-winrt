package Windows.UI.ApplicationSettings

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

@ABIMarker(SettingsPane.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.SettingsPane;{b1cd0932-4570-4c69-8d38-89446561ace0})")
@WinRTByReference(brClass = SettingsPane.ByReference::class)
public class SettingsPane(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISettingsPane.WithDefault, IWinRTObject {
  private val __1897491312_Interface: ISettingsPane.WithDefault by lazy {
    as_1897491312()
  }


  public override val __1897491312_Ptr: JNAPointer? by lazy {
    __1897491312_Interface.__1897491312_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1897491312_Interface)

  private fun as_1897491312(): ISettingsPane.WithDefault {
    if(pointer == NULL) {
      return(ISettingsPane.ABI.makeISettingsPane(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISettingsPane>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISettingsPane.ABI.makeISettingsPane(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SettingsPane> {
    public override fun getValue() = SettingsPane(pointer.getPointer(0))

    public fun setValue(value: SettingsPane): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SettingsPane, MemoryAddress> {
    public val ISettingsPaneStatics_Instance: ISettingsPaneStatics by lazy {
      createISettingsPaneStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISettingsPaneStatics(): ISettingsPaneStatics {
      val refiid = Guid.REFIID(ISettingsPaneStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ApplicationSettings.SettingsPane".toHandle(),refiid,interfacePtr)
      val result = ISettingsPaneStatics.ABI.makeISettingsPaneStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SettingsPane {
      val address = segment.toRawLongValue()
      return SettingsPane(Pointer(address))
    }

    public override fun toNative(obj: SettingsPane): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.ISettingsPaneStatics_Instance.GetForCurrentView()

    public fun Show() = ABI.ISettingsPaneStatics_Instance.Show()

    public fun get_Edge() = ABI.ISettingsPaneStatics_Instance.get_Edge()
  }
}
