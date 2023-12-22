package Microsoft.UI.Composition.Scenes

import Microsoft.UI.Composition.CompositionObject
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

@ABIMarker(SceneObject.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneObject;{4333e514-4fc7-521e-8bca-11c51fbcaf1e})")
@WinRTByReference(brClass = SceneObject.ByReference::class)
public open class SceneObject(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ISceneObject.WithDefault, IWinRTObject {
  private val __438368839_Interface: ISceneObject.WithDefault by lazy {
    as_438368839()
  }


  public override val __438368839_Ptr: JNAPointer? by lazy {
    __438368839_Interface.__438368839_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__438368839_Interface)

  private fun as_438368839(): ISceneObject.WithDefault {
    if(pointer == NULL) {
      return(ISceneObject.ABI.makeISceneObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneObject.ABI.makeISceneObject(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SceneObject> {
    public override fun getValue() = SceneObject(pointer.getPointer(0))

    public fun setValue(value: SceneObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneObject, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneObject {
      val address = segment.toRawLongValue()
      return SceneObject(Pointer(address))
    }

    public override fun toNative(obj: SceneObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
