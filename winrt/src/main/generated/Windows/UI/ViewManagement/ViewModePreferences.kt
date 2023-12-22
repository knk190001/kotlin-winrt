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

@ABIMarker(ViewModePreferences.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.ViewModePreferences;{878fcd3a-0b99-42c9-84d0-d3f1d403554b})")
@WinRTByReference(brClass = ViewModePreferences.ByReference::class)
public class ViewModePreferences(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IViewModePreferences.WithDefault, IWinRTObject {
  private val __1689840670_Interface: IViewModePreferences.WithDefault by lazy {
    as_1689840670()
  }


  public override val __1689840670_Ptr: JNAPointer? by lazy {
    __1689840670_Interface.__1689840670_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1689840670_Interface)

  private fun as_1689840670(): IViewModePreferences.WithDefault {
    if(pointer == NULL) {
      return(IViewModePreferences.ABI.makeIViewModePreferences(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IViewModePreferences>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IViewModePreferences.ABI.makeIViewModePreferences(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ViewModePreferences> {
    public override fun getValue() = ViewModePreferences(pointer.getPointer(0))

    public fun setValue(value: ViewModePreferences): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ViewModePreferences, MemoryAddress> {
    public val IViewModePreferencesStatics_Instance: IViewModePreferencesStatics by lazy {
      createIViewModePreferencesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIViewModePreferencesStatics(): IViewModePreferencesStatics {
      val refiid = Guid.REFIID(IViewModePreferencesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ViewModePreferences".toHandle(),refiid,interfacePtr)
      val result =
          IViewModePreferencesStatics.ABI.makeIViewModePreferencesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ViewModePreferences {
      val address = segment.toRawLongValue()
      return ViewModePreferences(Pointer(address))
    }

    public override fun toNative(obj: ViewModePreferences): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateDefault(mode: ApplicationViewMode) =
        ABI.IViewModePreferencesStatics_Instance.CreateDefault(mode)
  }
}
