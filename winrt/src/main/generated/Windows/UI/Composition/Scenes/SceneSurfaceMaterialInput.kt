package Windows.UI.Composition.Scenes

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SceneSurfaceMaterialInput.ABI::class)
@Signature("rc(Windows.UI.Composition.Scenes.SceneSurfaceMaterialInput;{9937da5c-a9ca-4cfc-b3aa-088356518742})")
@WinRTByReference(brClass = SceneSurfaceMaterialInput.ByReference::class)
public class SceneSurfaceMaterialInput(
  ptr: JNAPointer? = NULL
) : SceneMaterialInput(ptr), ISceneSurfaceMaterialInput.WithDefault, IWinRTObject {
  private val __555017261_Interface: ISceneSurfaceMaterialInput.WithDefault by lazy {
    as_555017261()
  }


  public override val __555017261_Ptr: JNAPointer? by lazy {
    __555017261_Interface.__555017261_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__555017261_Interface)

  private fun as_555017261(): ISceneSurfaceMaterialInput.WithDefault {
    if(pointer == NULL) {
      return(ISceneSurfaceMaterialInput.ABI.makeISceneSurfaceMaterialInput(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneSurfaceMaterialInput>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneSurfaceMaterialInput.ABI.makeISceneSurfaceMaterialInput(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneSurfaceMaterialInput> {
    public override fun getValue() = SceneSurfaceMaterialInput(pointer.getPointer(0))

    public fun setValue(value: SceneSurfaceMaterialInput): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneSurfaceMaterialInput, MemoryAddress> {
    public val ISceneSurfaceMaterialInputStatics_Instance: ISceneSurfaceMaterialInputStatics by
        lazy {
      createISceneSurfaceMaterialInputStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISceneSurfaceMaterialInputStatics(): ISceneSurfaceMaterialInputStatics {
      val refiid = Guid.REFIID(ISceneSurfaceMaterialInputStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Scenes.SceneSurfaceMaterialInput".toHandle(),refiid,interfacePtr)
      val result =
          ISceneSurfaceMaterialInputStatics.ABI.makeISceneSurfaceMaterialInputStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SceneSurfaceMaterialInput {
      val address = segment.toRawLongValue()
      return SceneSurfaceMaterialInput(Pointer(address))
    }

    public override fun toNative(obj: SceneSurfaceMaterialInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.ISceneSurfaceMaterialInputStatics_Instance.Create(compositor)
  }
}
