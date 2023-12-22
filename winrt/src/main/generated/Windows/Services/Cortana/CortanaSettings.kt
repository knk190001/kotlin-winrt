package Windows.Services.Cortana

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

@ABIMarker(CortanaSettings.ABI::class)
@Signature("rc(Windows.Services.Cortana.CortanaSettings;{54d571a7-8062-40f4-abe7-dedfd697b019})")
@WinRTByReference(brClass = CortanaSettings.ByReference::class)
public class CortanaSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICortanaSettings.WithDefault, IWinRTObject {
  private val __1889380831_Interface: ICortanaSettings.WithDefault by lazy {
    as_1889380831()
  }


  public override val __1889380831_Ptr: JNAPointer? by lazy {
    __1889380831_Interface.__1889380831_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1889380831_Interface)

  private fun as_1889380831(): ICortanaSettings.WithDefault {
    if(pointer == NULL) {
      return(ICortanaSettings.ABI.makeICortanaSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICortanaSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICortanaSettings.ABI.makeICortanaSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CortanaSettings> {
    public override fun getValue() = CortanaSettings(pointer.getPointer(0))

    public fun setValue(value: CortanaSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CortanaSettings, MemoryAddress> {
    public val ICortanaSettingsStatics_Instance: ICortanaSettingsStatics by lazy {
      createICortanaSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICortanaSettingsStatics(): ICortanaSettingsStatics {
      val refiid = Guid.REFIID(ICortanaSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Cortana.CortanaSettings".toHandle(),refiid,interfacePtr)
      val result = ICortanaSettingsStatics.ABI.makeICortanaSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CortanaSettings {
      val address = segment.toRawLongValue()
      return CortanaSettings(Pointer(address))
    }

    public override fun toNative(obj: CortanaSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.ICortanaSettingsStatics_Instance.IsSupported()

    public fun GetDefault() = ABI.ICortanaSettingsStatics_Instance.GetDefault()
  }
}
