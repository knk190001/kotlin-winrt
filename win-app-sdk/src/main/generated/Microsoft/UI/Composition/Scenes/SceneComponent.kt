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

@ABIMarker(SceneComponent.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneComponent;{f73361cb-8027-50e2-98ee-b2e3ea050a54})")
@WinRTByReference(brClass = SceneComponent.ByReference::class)
public open class SceneComponent(
  ptr: JNAPointer? = NULL
) : SceneObject(ptr), ISceneComponent.WithDefault, IWinRTObject {
  private val __1459681035_Interface: ISceneComponent.WithDefault by lazy {
    as_1459681035()
  }


  public override val __1459681035_Ptr: JNAPointer? by lazy {
    __1459681035_Interface.__1459681035_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1459681035_Interface)

  private fun as_1459681035(): ISceneComponent.WithDefault {
    if(pointer == NULL) {
      return(ISceneComponent.ABI.makeISceneComponent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneComponent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneComponent.ABI.makeISceneComponent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SceneComponent>
      {
    public override fun getValue() = SceneComponent(pointer.getPointer(0))

    public fun setValue(value: SceneComponent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneComponent, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneComponent {
      val address = segment.toRawLongValue()
      return SceneComponent(Pointer(address))
    }

    public override fun toNative(obj: SceneComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
