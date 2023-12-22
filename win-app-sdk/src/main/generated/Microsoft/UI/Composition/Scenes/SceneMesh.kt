package Microsoft.UI.Composition.Scenes

import Microsoft.UI.Composition.Compositor
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

@ABIMarker(SceneMesh.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneMesh;{5cf846aa-f53f-555e-a3ad-f5bc52ca32fb})")
@WinRTByReference(brClass = SceneMesh.ByReference::class)
public class SceneMesh(
  ptr: JNAPointer? = NULL
) : SceneObject(ptr), ISceneMesh.WithDefault, IWinRTObject {
  private val __468873483_Interface: ISceneMesh.WithDefault by lazy {
    as_468873483()
  }


  public override val __468873483_Ptr: JNAPointer? by lazy {
    __468873483_Interface.__468873483_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__468873483_Interface)

  private fun as_468873483(): ISceneMesh.WithDefault {
    if(pointer == NULL) {
      return(ISceneMesh.ABI.makeISceneMesh(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneMesh>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneMesh.ABI.makeISceneMesh(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SceneMesh> {
    public override fun getValue() = SceneMesh(pointer.getPointer(0))

    public fun setValue(value: SceneMesh): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneMesh, MemoryAddress> {
    public val ISceneMeshStatics_Instance: ISceneMeshStatics by lazy {
      createISceneMeshStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISceneMeshStatics(): ISceneMeshStatics {
      val refiid = Guid.REFIID(ISceneMeshStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Scenes.SceneMesh".toHandle(),refiid,interfacePtr)
      val result = ISceneMeshStatics.ABI.makeISceneMeshStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SceneMesh {
      val address = segment.toRawLongValue()
      return SceneMesh(Pointer(address))
    }

    public override fun toNative(obj: SceneMesh): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) = ABI.ISceneMeshStatics_Instance.Create(compositor)
  }
}
