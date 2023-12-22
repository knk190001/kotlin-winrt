package Microsoft.UI.Composition

import Windows.Foundation.Collections.IIterable
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(CompositionProjectedShadowCasterCollection.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionProjectedShadowCasterCollection;{b120bfdc-533c-57a9-ae16-d43ba52472c4})")
@WinRTByReference(brClass = CompositionProjectedShadowCasterCollection.ByReference::class)
public class CompositionProjectedShadowCasterCollection(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionProjectedShadowCasterCollection.WithDefault,
    IIterable<CompositionProjectedShadowCaster?>, IWinRTObject {
  private val __1872167279_Interface: ICompositionProjectedShadowCasterCollection.WithDefault by
      lazy {
    as_1872167279()
  }


  private val __1449643190_Interface: IIterable<CompositionProjectedShadowCaster?> by lazy {
    as_1449643190()
  }


  public override val __1449643190_Type: KType =
      typeOf<IIterable<CompositionProjectedShadowCaster?>>()

  public override val __1872167279_Ptr: JNAPointer? by lazy {
    __1872167279_Interface.__1872167279_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1872167279_Interface, __1449643190_Interface)

  private fun as_1872167279(): ICompositionProjectedShadowCasterCollection.WithDefault {
    if(pointer == NULL) {
      return(ICompositionProjectedShadowCasterCollection.ABI.makeICompositionProjectedShadowCasterCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionProjectedShadowCasterCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionProjectedShadowCasterCollection.ABI.makeICompositionProjectedShadowCasterCollection(ref.value))
  }

  private fun as_1449643190(): IIterable<CompositionProjectedShadowCaster?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<CompositionProjectedShadowCaster?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<CompositionProjectedShadowCaster?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<CompositionProjectedShadowCaster?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionProjectedShadowCasterCollection> {
    public override fun getValue() =
        CompositionProjectedShadowCasterCollection(pointer.getPointer(0))

    public fun setValue(value: CompositionProjectedShadowCasterCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionProjectedShadowCasterCollection, MemoryAddress> {
    public val ICompositionProjectedShadowCasterCollectionStatics_Instance:
        ICompositionProjectedShadowCasterCollectionStatics by lazy {
      createICompositionProjectedShadowCasterCollectionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICompositionProjectedShadowCasterCollectionStatics():
        ICompositionProjectedShadowCasterCollectionStatics {
      val refiid = Guid.REFIID(ICompositionProjectedShadowCasterCollectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.CompositionProjectedShadowCasterCollection".toHandle(),refiid,interfacePtr)
      val result =
          ICompositionProjectedShadowCasterCollectionStatics.ABI.makeICompositionProjectedShadowCasterCollectionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        CompositionProjectedShadowCasterCollection {
      val address = segment.toRawLongValue()
      return CompositionProjectedShadowCasterCollection(Pointer(address))
    }

    public override fun toNative(obj: CompositionProjectedShadowCasterCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MaxRespectedCasters() =
        ABI.ICompositionProjectedShadowCasterCollectionStatics_Instance.get_MaxRespectedCasters()
  }
}
