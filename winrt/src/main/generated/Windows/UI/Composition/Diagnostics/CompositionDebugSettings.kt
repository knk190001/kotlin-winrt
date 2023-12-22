package Windows.UI.Composition.Diagnostics

import Windows.UI.Composition.Compositor
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

@ABIMarker(CompositionDebugSettings.ABI::class)
@Signature("rc(Windows.UI.Composition.Diagnostics.CompositionDebugSettings;{2831987e-1d82-4d38-b7b7-efd11c7bc3d1})")
@WinRTByReference(brClass = CompositionDebugSettings.ByReference::class)
public class CompositionDebugSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositionDebugSettings.WithDefault, IWinRTObject {
  private val __1404980900_Interface: ICompositionDebugSettings.WithDefault by lazy {
    as_1404980900()
  }


  public override val __1404980900_Ptr: JNAPointer? by lazy {
    __1404980900_Interface.__1404980900_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1404980900_Interface)

  private fun as_1404980900(): ICompositionDebugSettings.WithDefault {
    if(pointer == NULL) {
      return(ICompositionDebugSettings.ABI.makeICompositionDebugSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionDebugSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionDebugSettings.ABI.makeICompositionDebugSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionDebugSettings> {
    public override fun getValue() = CompositionDebugSettings(pointer.getPointer(0))

    public fun setValue(value: CompositionDebugSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionDebugSettings, MemoryAddress> {
    public val ICompositionDebugSettingsStatics_Instance: ICompositionDebugSettingsStatics by lazy {
      createICompositionDebugSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompositionDebugSettingsStatics(): ICompositionDebugSettingsStatics {
      val refiid = Guid.REFIID(ICompositionDebugSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Diagnostics.CompositionDebugSettings".toHandle(),refiid,interfacePtr)
      val result =
          ICompositionDebugSettingsStatics.ABI.makeICompositionDebugSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CompositionDebugSettings {
      val address = segment.toRawLongValue()
      return CompositionDebugSettings(Pointer(address))
    }

    public override fun toNative(obj: CompositionDebugSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryGetSettings(compositor: Compositor) =
        ABI.ICompositionDebugSettingsStatics_Instance.TryGetSettings(compositor)
  }
}
