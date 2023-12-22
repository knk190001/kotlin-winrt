package Windows.UI.Composition.Scenes

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(SceneNodeCollection.ABI::class)
@Signature("rc(Windows.UI.Composition.Scenes.SceneNodeCollection;{29ada101-2dd9-4332-be63-60d2cf4269f2})")
@WinRTByReference(brClass = SceneNodeCollection.ByReference::class)
public class SceneNodeCollection(
  ptr: JNAPointer? = NULL
) : SceneObject(ptr), ISceneNodeCollection.WithDefault, IVector<SceneNode?>, IIterable<SceneNode?>,
    IWinRTObject {
  private val __1464464227_Interface: ISceneNodeCollection.WithDefault by lazy {
    as_1464464227()
  }


  private val __1070388601_Interface: IVector<SceneNode?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<SceneNode?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<SceneNode?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<SceneNode?>>()

  public override val __1464464227_Ptr: JNAPointer? by lazy {
    __1464464227_Interface.__1464464227_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1464464227_Interface, __1070388601_Interface, __1449643190_Interface)

  private fun as_1464464227(): ISceneNodeCollection.WithDefault {
    if(pointer == NULL) {
      return(ISceneNodeCollection.ABI.makeISceneNodeCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISceneNodeCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISceneNodeCollection.ABI.makeISceneNodeCollection(ref.value))
  }

  private fun as_1070388601(): IVector<SceneNode?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<SceneNode?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<SceneNode?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<SceneNode?>(ref.value))
  }

  private fun as_1449643190(): IIterable<SceneNode?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<SceneNode?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<SceneNode?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<SceneNode?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SceneNodeCollection> {
    public override fun getValue() = SceneNodeCollection(pointer.getPointer(0))

    public fun setValue(value: SceneNodeCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SceneNodeCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SceneNodeCollection {
      val address = segment.toRawLongValue()
      return SceneNodeCollection(Pointer(address))
    }

    public override fun toNative(obj: SceneNodeCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
