package Microsoft.UI.Composition

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(CompositionColorGradientStopCollection.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionColorGradientStopCollection;{4794cb29-ce9d-5837-9fc9-847df3e197de})")
@WinRTByReference(brClass = CompositionColorGradientStopCollection.ByReference::class)
public class CompositionColorGradientStopCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositionColorGradientStopCollection.WithDefault,
    IIterable<CompositionColorGradientStop?>, IVector<CompositionColorGradientStop?>, IWinRTObject {
  private val __1871488990_Interface: ICompositionColorGradientStopCollection.WithDefault by lazy {
    as_1871488990()
  }


  private val __1449643190_Interface: IIterable<CompositionColorGradientStop?> by lazy {
    as_1449643190()
  }


  private val __1070388601_Interface: IVector<CompositionColorGradientStop?> by lazy {
    as_1070388601()
  }


  public override val __1449643190_Type: KType = typeOf<IIterable<CompositionColorGradientStop?>>()

  public override val __1070388601_Type: KType = typeOf<IVector<CompositionColorGradientStop?>>()

  public override val __1871488990_Ptr: JNAPointer? by lazy {
    __1871488990_Interface.__1871488990_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1871488990_Interface, __1449643190_Interface, __1070388601_Interface)

  private fun as_1871488990(): ICompositionColorGradientStopCollection.WithDefault {
    if(pointer == NULL) {
      return(ICompositionColorGradientStopCollection.ABI.makeICompositionColorGradientStopCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionColorGradientStopCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionColorGradientStopCollection.ABI.makeICompositionColorGradientStopCollection(ref.value))
  }

  private fun as_1449643190(): IIterable<CompositionColorGradientStop?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<CompositionColorGradientStop?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<CompositionColorGradientStop?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<CompositionColorGradientStop?>(ref.value))
  }

  private fun as_1070388601(): IVector<CompositionColorGradientStop?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<CompositionColorGradientStop?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<CompositionColorGradientStop?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<CompositionColorGradientStop?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionColorGradientStopCollection> {
    public override fun getValue() = CompositionColorGradientStopCollection(pointer.getPointer(0))

    public fun setValue(value: CompositionColorGradientStopCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionColorGradientStopCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionColorGradientStopCollection {
      val address = segment.toRawLongValue()
      return CompositionColorGradientStopCollection(Pointer(address))
    }

    public override fun toNative(obj: CompositionColorGradientStopCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
