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

@ABIMarker(SceneNode.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneNode;{a1bce140-79c2-59e6-9b68-63b1bab0e2a6})")
@WinRTByReference(brClass = SceneNode.ByReference::class)
public class SceneNode(
  ptr: JNAPointer? = NULL
) : SceneObject(ptr), ISceneNode.WithDefault, IWinRTObject {
  private val __468834550_Interface: ISceneNode.WithDefault by lazy {
    as_468834550()
  }


  public override val __468834550_Ptr: JNAPointer? by lazy {
    __468834550_Interface.__468834550_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__468834550_Interface)

  private fun as_468834550(): ISceneNode.WithDefault {
    if(pointer == NULL) {
      return(ISceneNode.ABI.makeISceneNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneNode.ABI.makeISceneNode(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SceneNode> {
    public override fun getValue() = SceneNode(pointer.getPointer(0))

    public fun setValue(value: SceneNode): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneNode, MemoryAddress> {
    public val ISceneNodeStatics_Instance: ISceneNodeStatics by lazy {
      createISceneNodeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISceneNodeStatics(): ISceneNodeStatics {
      val refiid = Guid.REFIID(ISceneNodeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Scenes.SceneNode".toHandle(),refiid,interfacePtr)
      val result = ISceneNodeStatics.ABI.makeISceneNodeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SceneNode {
      val address = segment.toRawLongValue()
      return SceneNode(Pointer(address))
    }

    public override fun toNative(obj: SceneNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) = ABI.ISceneNodeStatics_Instance.Create(compositor)
  }
}
