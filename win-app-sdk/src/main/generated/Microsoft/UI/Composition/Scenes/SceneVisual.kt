package Microsoft.UI.Composition.Scenes

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.Composition.ContainerVisual
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

@ABIMarker(SceneVisual.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneVisual;{0144d7ad-6a7d-59cb-a0f9-74a04e85352c})")
@WinRTByReference(brClass = SceneVisual.ByReference::class)
public class SceneVisual(
  ptr: JNAPointer? = NULL
) : ContainerVisual(ptr), ISceneVisual.WithDefault, IWinRTObject {
  private val __645520968_Interface: ISceneVisual.WithDefault by lazy {
    as_645520968()
  }


  public override val __645520968_Ptr: JNAPointer? by lazy {
    __645520968_Interface.__645520968_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__645520968_Interface)

  private fun as_645520968(): ISceneVisual.WithDefault {
    if(pointer == NULL) {
      return(ISceneVisual.ABI.makeISceneVisual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneVisual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneVisual.ABI.makeISceneVisual(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SceneVisual> {
    public override fun getValue() = SceneVisual(pointer.getPointer(0))

    public fun setValue(value: SceneVisual): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneVisual, MemoryAddress> {
    public val ISceneVisualStatics_Instance: ISceneVisualStatics by lazy {
      createISceneVisualStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISceneVisualStatics(): ISceneVisualStatics {
      val refiid = Guid.REFIID(ISceneVisualStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Scenes.SceneVisual".toHandle(),refiid,interfacePtr)
      val result = ISceneVisualStatics.ABI.makeISceneVisualStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SceneVisual {
      val address = segment.toRawLongValue()
      return SceneVisual(Pointer(address))
    }

    public override fun toNative(obj: SceneVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) = ABI.ISceneVisualStatics_Instance.Create(compositor)
  }
}
