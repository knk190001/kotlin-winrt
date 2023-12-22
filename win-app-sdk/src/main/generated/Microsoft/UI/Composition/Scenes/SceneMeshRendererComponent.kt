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

@ABIMarker(SceneMeshRendererComponent.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneMeshRendererComponent;{d2be85a0-70a8-5c62-84d8-8ba55e4c64a9})")
@WinRTByReference(brClass = SceneMeshRendererComponent.ByReference::class)
public class SceneMeshRendererComponent(
  ptr: JNAPointer? = NULL
) : SceneRendererComponent(ptr), ISceneMeshRendererComponent.WithDefault, IWinRTObject {
  private val __3866885_Interface: ISceneMeshRendererComponent.WithDefault by lazy {
    as_3866885()
  }


  public override val __3866885_Ptr: JNAPointer? by lazy {
    __3866885_Interface.__3866885_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__3866885_Interface)

  private fun as_3866885(): ISceneMeshRendererComponent.WithDefault {
    if(pointer == NULL) {
      return(ISceneMeshRendererComponent.ABI.makeISceneMeshRendererComponent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneMeshRendererComponent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneMeshRendererComponent.ABI.makeISceneMeshRendererComponent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneMeshRendererComponent> {
    public override fun getValue() = SceneMeshRendererComponent(pointer.getPointer(0))

    public fun setValue(value: SceneMeshRendererComponent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneMeshRendererComponent, MemoryAddress> {
    public val ISceneMeshRendererComponentStatics_Instance: ISceneMeshRendererComponentStatics by
        lazy {
      createISceneMeshRendererComponentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISceneMeshRendererComponentStatics(): ISceneMeshRendererComponentStatics {
      val refiid = Guid.REFIID(ISceneMeshRendererComponentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Scenes.SceneMeshRendererComponent".toHandle(),refiid,interfacePtr)
      val result =
          ISceneMeshRendererComponentStatics.ABI.makeISceneMeshRendererComponentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SceneMeshRendererComponent {
      val address = segment.toRawLongValue()
      return SceneMeshRendererComponent(Pointer(address))
    }

    public override fun toNative(obj: SceneMeshRendererComponent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.ISceneMeshRendererComponentStatics_Instance.Create(compositor)
  }
}
