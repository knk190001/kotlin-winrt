package Microsoft.UI.Composition

import Windows.Foundation.IClosable
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CompositionObject.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionObject;{0e583d49-fb5e-5481-a426-d3c41e059a5a})")
@WinRTByReference(brClass = CompositionObject.ByReference::class)
public open class CompositionObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositionObject.WithDefault, ICompositionObject2.WithDefault,
    ICompositionObject3.WithDefault, ICompositionObject4.WithDefault,
    ICompositionObject5.WithDefault, IClosable.WithDefault, IAnimationObject.WithDefault,
    IWinRTObject {
  private val __1124630160_Interface: ICompositionObject.WithDefault by lazy {
    as_1124630160()
  }


  private val __503796642_Interface: ICompositionObject2.WithDefault by lazy {
    as_503796642()
  }


  private val __503796643_Interface: ICompositionObject3.WithDefault by lazy {
    as_503796643()
  }


  private val __503796644_Interface: ICompositionObject4.WithDefault by lazy {
    as_503796644()
  }


  private val __503796645_Interface: ICompositionObject5.WithDefault by lazy {
    as_503796645()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __547366230_Interface: IAnimationObject.WithDefault by lazy {
    as_547366230()
  }


  public override val __1124630160_Ptr: JNAPointer? by lazy {
    __1124630160_Interface.__1124630160_Ptr
  }


  public override val __503796642_Ptr: JNAPointer? by lazy {
    __503796642_Interface.__503796642_Ptr
  }


  public override val __503796643_Ptr: JNAPointer? by lazy {
    __503796643_Interface.__503796643_Ptr
  }


  public override val __503796644_Ptr: JNAPointer? by lazy {
    __503796644_Interface.__503796644_Ptr
  }


  public override val __503796645_Ptr: JNAPointer? by lazy {
    __503796645_Interface.__503796645_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __547366230_Ptr: JNAPointer? by lazy {
    __547366230_Interface.__547366230_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1124630160_Interface, __503796642_Interface, __503796643_Interface,
        __503796644_Interface, __503796645_Interface, __1260617006_Interface, __547366230_Interface)

  private fun as_1124630160(): ICompositionObject.WithDefault {
    if(pointer == NULL) {
      return(ICompositionObject.ABI.makeICompositionObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionObject.ABI.makeICompositionObject(ref.value))
  }

  private fun as_503796642(): ICompositionObject2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionObject2.ABI.makeICompositionObject2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionObject2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionObject2.ABI.makeICompositionObject2(ref.value))
  }

  private fun as_503796643(): ICompositionObject3.WithDefault {
    if(pointer == NULL) {
      return(ICompositionObject3.ABI.makeICompositionObject3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionObject3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionObject3.ABI.makeICompositionObject3(ref.value))
  }

  private fun as_503796644(): ICompositionObject4.WithDefault {
    if(pointer == NULL) {
      return(ICompositionObject4.ABI.makeICompositionObject4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionObject4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionObject4.ABI.makeICompositionObject4(ref.value))
  }

  private fun as_503796645(): ICompositionObject5.WithDefault {
    if(pointer == NULL) {
      return(ICompositionObject5.ABI.makeICompositionObject5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionObject5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionObject5.ABI.makeICompositionObject5(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_547366230(): IAnimationObject.WithDefault {
    if(pointer == NULL) {
      return(IAnimationObject.ABI.makeIAnimationObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationObject.ABI.makeIAnimationObject(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionObject> {
    public override fun getValue() = CompositionObject(pointer.getPointer(0))

    public fun setValue(value: CompositionObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionObject, MemoryAddress> {
    public val ICompositionObjectStatics_Instance: ICompositionObjectStatics by lazy {
      createICompositionObjectStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompositionObjectStatics(): ICompositionObjectStatics {
      val refiid = Guid.REFIID(ICompositionObjectStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.CompositionObject".toHandle(),refiid,interfacePtr)
      val result = ICompositionObjectStatics.ABI.makeICompositionObjectStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CompositionObject {
      val address = segment.toRawLongValue()
      return CompositionObject(Pointer(address))
    }

    public override fun toNative(obj: CompositionObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun StartAnimationWithIAnimationObject(
      target: IAnimationObject,
      propertyName: String,
      animation: CompositionAnimation
    ) = ABI.ICompositionObjectStatics_Instance.StartAnimationWithIAnimationObject(target,
        propertyName, animation)

    public fun StartAnimationGroupWithIAnimationObject(target: IAnimationObject,
        animation: ICompositionAnimationBase) =
        ABI.ICompositionObjectStatics_Instance.StartAnimationGroupWithIAnimationObject(target,
        animation)
  }
}
