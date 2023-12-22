package Windows.UI.Composition.Scenes

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

@ABIMarker(SceneMaterialInput.ABI::class)
@Signature("rc(Windows.UI.Composition.Scenes.SceneMaterialInput;{422a1642-1ef1-485c-97e9-ae6f95ad812f})")
@WinRTByReference(brClass = SceneMaterialInput.ByReference::class)
public open class SceneMaterialInput(
  ptr: JNAPointer? = NULL
) : SceneObject(ptr), ISceneMaterialInput.WithDefault, IWinRTObject {
  private val __146770714_Interface: ISceneMaterialInput.WithDefault by lazy {
    as_146770714()
  }


  public override val __146770714_Ptr: JNAPointer? by lazy {
    __146770714_Interface.__146770714_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__146770714_Interface)

  private fun as_146770714(): ISceneMaterialInput.WithDefault {
    if(pointer == NULL) {
      return(ISceneMaterialInput.ABI.makeISceneMaterialInput(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneMaterialInput>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneMaterialInput.ABI.makeISceneMaterialInput(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneMaterialInput> {
    public override fun getValue() = SceneMaterialInput(pointer.getPointer(0))

    public fun setValue(value: SceneMaterialInput): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneMaterialInput, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneMaterialInput {
      val address = segment.toRawLongValue()
      return SceneMaterialInput(Pointer(address))
    }

    public override fun toNative(obj: SceneMaterialInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
