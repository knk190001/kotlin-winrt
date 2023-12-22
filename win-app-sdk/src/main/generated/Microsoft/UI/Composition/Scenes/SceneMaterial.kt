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

@ABIMarker(SceneMaterial.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneMaterial;{042142a7-bf6b-57ad-badc-f581f38edb48})")
@WinRTByReference(brClass = SceneMaterial.ByReference::class)
public open class SceneMaterial(
  ptr: JNAPointer? = NULL
) : SceneObject(ptr), ISceneMaterial.WithDefault, IWinRTObject {
  private val __574233135_Interface: ISceneMaterial.WithDefault by lazy {
    as_574233135()
  }


  public override val __574233135_Ptr: JNAPointer? by lazy {
    __574233135_Interface.__574233135_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__574233135_Interface)

  private fun as_574233135(): ISceneMaterial.WithDefault {
    if(pointer == NULL) {
      return(ISceneMaterial.ABI.makeISceneMaterial(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneMaterial>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneMaterial.ABI.makeISceneMaterial(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SceneMaterial>
      {
    public override fun getValue() = SceneMaterial(pointer.getPointer(0))

    public fun setValue(value: SceneMaterial): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneMaterial, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneMaterial {
      val address = segment.toRawLongValue()
      return SceneMaterial(Pointer(address))
    }

    public override fun toNative(obj: SceneMaterial): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
