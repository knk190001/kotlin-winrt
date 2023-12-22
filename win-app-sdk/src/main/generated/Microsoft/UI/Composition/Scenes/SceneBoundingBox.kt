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

@ABIMarker(SceneBoundingBox.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Scenes.SceneBoundingBox;{39fb48e0-216a-5608-9186-6ba9f98b5c67})")
@WinRTByReference(brClass = SceneBoundingBox.ByReference::class)
public class SceneBoundingBox(
  ptr: JNAPointer? = NULL
) : SceneObject(ptr), ISceneBoundingBox.WithDefault, IWinRTObject {
  private val __1424702335_Interface: ISceneBoundingBox.WithDefault by lazy {
    as_1424702335()
  }


  public override val __1424702335_Ptr: JNAPointer? by lazy {
    __1424702335_Interface.__1424702335_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1424702335_Interface)

  private fun as_1424702335(): ISceneBoundingBox.WithDefault {
    if(pointer == NULL) {
      return(ISceneBoundingBox.ABI.makeISceneBoundingBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneBoundingBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneBoundingBox.ABI.makeISceneBoundingBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneBoundingBox> {
    public override fun getValue() = SceneBoundingBox(pointer.getPointer(0))

    public fun setValue(value: SceneBoundingBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneBoundingBox, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneBoundingBox {
      val address = segment.toRawLongValue()
      return SceneBoundingBox(Pointer(address))
    }

    public override fun toNative(obj: SceneBoundingBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
