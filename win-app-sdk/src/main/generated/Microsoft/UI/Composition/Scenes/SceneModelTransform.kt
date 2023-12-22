package Microsoft.UI.Composition.Scenes

import Microsoft.UI.Composition.CompositionTransform
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

@ABIMarker(SceneModelTransform.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneModelTransform;{3f05555f-0f67-576e-9d8a-93c1f250c29f})")
@WinRTByReference(brClass = SceneModelTransform.ByReference::class)
public class SceneModelTransform(
  ptr: JNAPointer? = NULL
) : CompositionTransform(ptr), ISceneModelTransform.WithDefault, IWinRTObject {
  private val __906419531_Interface: ISceneModelTransform.WithDefault by lazy {
    as_906419531()
  }


  public override val __906419531_Ptr: JNAPointer? by lazy {
    __906419531_Interface.__906419531_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__906419531_Interface)

  private fun as_906419531(): ISceneModelTransform.WithDefault {
    if(pointer == NULL) {
      return(ISceneModelTransform.ABI.makeISceneModelTransform(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneModelTransform>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneModelTransform.ABI.makeISceneModelTransform(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneModelTransform> {
    public override fun getValue() = SceneModelTransform(pointer.getPointer(0))

    public fun setValue(value: SceneModelTransform): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneModelTransform, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneModelTransform {
      val address = segment.toRawLongValue()
      return SceneModelTransform(Pointer(address))
    }

    public override fun toNative(obj: SceneModelTransform): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
