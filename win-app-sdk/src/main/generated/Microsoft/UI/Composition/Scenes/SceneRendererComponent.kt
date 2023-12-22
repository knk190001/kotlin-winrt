package Microsoft.UI.Composition.Scenes

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

@ABIMarker(SceneRendererComponent.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneRendererComponent;{6bab8030-89c1-5dbc-a48e-1805ddf9cdd1})")
@WinRTByReference(brClass = SceneRendererComponent.ByReference::class)
public open class SceneRendererComponent(
  ptr: JNAPointer? = NULL
) : SceneComponent(ptr), ISceneRendererComponent.WithDefault, IWinRTObject {
  private val __2072405134_Interface: ISceneRendererComponent.WithDefault by lazy {
    as_2072405134()
  }


  public override val __2072405134_Ptr: JNAPointer? by lazy {
    __2072405134_Interface.__2072405134_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2072405134_Interface)

  private fun as_2072405134(): ISceneRendererComponent.WithDefault {
    if(pointer == NULL) {
      return(ISceneRendererComponent.ABI.makeISceneRendererComponent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneRendererComponent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneRendererComponent.ABI.makeISceneRendererComponent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneRendererComponent> {
    public override fun getValue() = SceneRendererComponent(pointer.getPointer(0))

    public fun setValue(value: SceneRendererComponent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneRendererComponent, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneRendererComponent {
      val address = segment.toRawLongValue()
      return SceneRendererComponent(Pointer(address))
    }

    public override fun toNative(obj: SceneRendererComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
