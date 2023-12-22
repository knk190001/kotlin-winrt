package Windows.Graphics.Display

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

@ABIMarker(ColorOverrideSettings.ABI::class)
@Signature("rc(Windows.Graphics.Display.ColorOverrideSettings;{fbefa134-4a81-4c4d-a5b6-7d1b5c4bd00b})")
@WinRTByReference(brClass = ColorOverrideSettings.ByReference::class)
public class ColorOverrideSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IColorOverrideSettings.WithDefault, IWinRTObject {
  private val __1062309421_Interface: IColorOverrideSettings.WithDefault by lazy {
    as_1062309421()
  }


  public override val __1062309421_Ptr: JNAPointer? by lazy {
    __1062309421_Interface.__1062309421_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1062309421_Interface)

  private fun as_1062309421(): IColorOverrideSettings.WithDefault {
    if(pointer == NULL) {
      return(IColorOverrideSettings.ABI.makeIColorOverrideSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorOverrideSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorOverrideSettings.ABI.makeIColorOverrideSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorOverrideSettings> {
    public override fun getValue() = ColorOverrideSettings(pointer.getPointer(0))

    public fun setValue(value: ColorOverrideSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorOverrideSettings, MemoryAddress> {
    public val IColorOverrideSettingsStatics_Instance: IColorOverrideSettingsStatics by lazy {
      createIColorOverrideSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorOverrideSettingsStatics(): IColorOverrideSettingsStatics {
      val refiid = Guid.REFIID(IColorOverrideSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Display.ColorOverrideSettings".toHandle(),refiid,interfacePtr)
      val result =
          IColorOverrideSettingsStatics.ABI.makeIColorOverrideSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ColorOverrideSettings {
      val address = segment.toRawLongValue()
      return ColorOverrideSettings(Pointer(address))
    }

    public override fun toNative(obj: ColorOverrideSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public
        fun CreateFromDisplayColorOverrideScenario(overrideScenario: DisplayColorOverrideScenario) =
        ABI.IColorOverrideSettingsStatics_Instance.CreateFromDisplayColorOverrideScenario(overrideScenario)
  }
}
