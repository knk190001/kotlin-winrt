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

@ABIMarker(ScenePbrMaterial.ABI::class)
@Signature("rc(Windows.UI.Composition.Scenes.ScenePbrMaterial;{aab6ebbe-d680-46df-8294-b6800a9f95e7})")
@WinRTByReference(brClass = ScenePbrMaterial.ByReference::class)
public open class ScenePbrMaterial(
  ptr: JNAPointer? = NULL
) : SceneMaterial(ptr), IScenePbrMaterial.WithDefault, IWinRTObject {
  private val __2146218186_Interface: IScenePbrMaterial.WithDefault by lazy {
    as_2146218186()
  }


  public override val __2146218186_Ptr: JNAPointer? by lazy {
    __2146218186_Interface.__2146218186_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2146218186_Interface)

  private fun as_2146218186(): IScenePbrMaterial.WithDefault {
    if(pointer == NULL) {
      return(IScenePbrMaterial.ABI.makeIScenePbrMaterial(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScenePbrMaterial>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScenePbrMaterial.ABI.makeIScenePbrMaterial(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScenePbrMaterial> {
    public override fun getValue() = ScenePbrMaterial(pointer.getPointer(0))

    public fun setValue(value: ScenePbrMaterial): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScenePbrMaterial, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScenePbrMaterial {
      val address = segment.toRawLongValue()
      return ScenePbrMaterial(Pointer(address))
    }

    public override fun toNative(obj: ScenePbrMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
