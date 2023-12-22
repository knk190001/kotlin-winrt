package Windows.UI.Composition.Scenes

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(SceneMeshMaterialAttributeMap.ABI::class)
@Signature("rc(Windows.UI.Composition.Scenes.SceneMeshMaterialAttributeMap;{ce843171-3d43-4855-aa69-31ff988d049d})")
@WinRTByReference(brClass = SceneMeshMaterialAttributeMap.ByReference::class)
public class SceneMeshMaterialAttributeMap(
  ptr: JNAPointer? = NULL
) : SceneObject(ptr), ISceneMeshMaterialAttributeMap.WithDefault, IMap<String?,
    SceneAttributeSemantic?>, IIterable<IKeyValuePair<String?, SceneAttributeSemantic?>?>,
    IWinRTObject {
  private val __1124412527_Interface: ISceneMeshMaterialAttributeMap.WithDefault by lazy {
    as_1124412527()
  }


  private val __8028824_Interface: IMap<String?, SceneAttributeSemantic?> by lazy {
    as_8028824()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, SceneAttributeSemantic?>?> by
      lazy {
    as_1449643190()
  }


  public override val __8028824_Type: KType = typeOf<IMap<String?, SceneAttributeSemantic?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      SceneAttributeSemantic?>?>>()

  public override val __1124412527_Ptr: JNAPointer? by lazy {
    __1124412527_Interface.__1124412527_Ptr
  }


  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1124412527_Interface, __8028824_Interface, __1449643190_Interface)

  private fun as_1124412527(): ISceneMeshMaterialAttributeMap.WithDefault {
    if(pointer == NULL) {
      return(ISceneMeshMaterialAttributeMap.ABI.makeISceneMeshMaterialAttributeMap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneMeshMaterialAttributeMap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneMeshMaterialAttributeMap.ABI.makeISceneMeshMaterialAttributeMap(ref.value))
  }

  private fun as_8028824(): IMap<String?, SceneAttributeSemantic?> {
    if(pointer == NULL) {
      return(IMap.ABI.makeIMap<String?, SceneAttributeSemantic?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMap<String?, SceneAttributeSemantic?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap.ABI.makeIMap<String?, SceneAttributeSemantic?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, SceneAttributeSemantic?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, SceneAttributeSemantic?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, SceneAttributeSemantic?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, SceneAttributeSemantic?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneMeshMaterialAttributeMap> {
    public override fun getValue() = SceneMeshMaterialAttributeMap(pointer.getPointer(0))

    public fun setValue(value: SceneMeshMaterialAttributeMap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneMeshMaterialAttributeMap, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneMeshMaterialAttributeMap {
      val address = segment.toRawLongValue()
      return SceneMeshMaterialAttributeMap(Pointer(address))
    }

    public override fun toNative(obj: SceneMeshMaterialAttributeMap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
