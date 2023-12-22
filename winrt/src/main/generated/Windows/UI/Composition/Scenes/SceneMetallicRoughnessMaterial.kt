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

@ABIMarker(SceneMetallicRoughnessMaterial.ABI::class)
@Signature("rc(Windows.UI.Composition.Scenes.SceneMetallicRoughnessMaterial;{c1d91446-799c-429e-a4e4-5da645f18e61})")
@WinRTByReference(brClass = SceneMetallicRoughnessMaterial.ByReference::class)
public class SceneMetallicRoughnessMaterial(
  ptr: JNAPointer? = NULL
) : ScenePbrMaterial(ptr), ISceneMetallicRoughnessMaterial.WithDefault, IWinRTObject {
  private val __270339845_Interface: ISceneMetallicRoughnessMaterial.WithDefault by lazy {
    as_270339845()
  }


  public override val __270339845_Ptr: JNAPointer? by lazy {
    __270339845_Interface.__270339845_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__270339845_Interface)

  private fun as_270339845(): ISceneMetallicRoughnessMaterial.WithDefault {
    if(pointer == NULL) {
      return(ISceneMetallicRoughnessMaterial.ABI.makeISceneMetallicRoughnessMaterial(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneMetallicRoughnessMaterial>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneMetallicRoughnessMaterial.ABI.makeISceneMetallicRoughnessMaterial(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneMetallicRoughnessMaterial> {
    public override fun getValue() = SceneMetallicRoughnessMaterial(pointer.getPointer(0))

    public fun setValue(value: SceneMetallicRoughnessMaterial): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneMetallicRoughnessMaterial, MemoryAddress> {
    public val ISceneMetallicRoughnessMaterialStatics_Instance:
        ISceneMetallicRoughnessMaterialStatics by lazy {
      createISceneMetallicRoughnessMaterialStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISceneMetallicRoughnessMaterialStatics():
        ISceneMetallicRoughnessMaterialStatics {
      val refiid = Guid.REFIID(ISceneMetallicRoughnessMaterialStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Composition.Scenes.SceneMetallicRoughnessMaterial".toHandle(),refiid,interfacePtr)
      val result =
          ISceneMetallicRoughnessMaterialStatics.ABI.makeISceneMetallicRoughnessMaterialStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SceneMetallicRoughnessMaterial {
      val address = segment.toRawLongValue()
      return SceneMetallicRoughnessMaterial(Pointer(address))
    }

    public override fun toNative(obj: SceneMetallicRoughnessMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.ISceneMetallicRoughnessMaterialStatics_Instance.Create(compositor)
  }
}
