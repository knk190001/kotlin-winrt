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

@ABIMarker(PointerVisualizationSettings.ABI::class)
@Signature("rc(Windows.UI.Input.PointerVisualizationSettings;{4d1e6461-84f7-499d-bd91-2a36e2b7aaa2})")
@WinRTByReference(brClass = PointerVisualizationSettings.ByReference::class)
public class PointerVisualizationSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPointerVisualizationSettings.WithDefault, IWinRTObject {
  private val __1473378568_Interface: IPointerVisualizationSettings.WithDefault by lazy {
    as_1473378568()
  }


  public override val __1473378568_Ptr: JNAPointer? by lazy {
    __1473378568_Interface.__1473378568_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1473378568_Interface)

  private fun as_1473378568(): IPointerVisualizationSettings.WithDefault {
    if(pointer == NULL) {
      return(IPointerVisualizationSettings.ABI.makeIPointerVisualizationSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerVisualizationSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerVisualizationSettings.ABI.makeIPointerVisualizationSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PointerVisualizationSettings> {
    public override fun getValue() = PointerVisualizationSettings(pointer.getPointer(0))

    public fun setValue(value: PointerVisualizationSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerVisualizationSettings, MemoryAddress> {
    public val IPointerVisualizationSettingsStatics_Instance: IPointerVisualizationSettingsStatics
        by lazy {
      createIPointerVisualizationSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPointerVisualizationSettingsStatics(): IPointerVisualizationSettingsStatics {
      val refiid = Guid.REFIID(IPointerVisualizationSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.PointerVisualizationSettings".toHandle(),refiid,interfacePtr)
      val result =
          IPointerVisualizationSettingsStatics.ABI.makeIPointerVisualizationSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PointerVisualizationSettings {
      val address = segment.toRawLongValue()
      return PointerVisualizationSettings(Pointer(address))
    }

    public override fun toNative(obj: PointerVisualizationSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.IPointerVisualizationSettingsStatics_Instance.GetForCurrentView()
  }
}
