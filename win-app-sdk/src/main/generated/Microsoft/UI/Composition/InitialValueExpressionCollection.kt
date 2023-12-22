package Microsoft.UI.Composition

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

@ABIMarker(InitialValueExpressionCollection.ABI::class)
@Signature("rc(Microsoft.UI.Composition.InitialValueExpressionCollection;pinterface({3c2925fe-8519-45c1-aa79-197b6718c1c1};string;string))")
@WinRTByReference(brClass = InitialValueExpressionCollection.ByReference::class)
public class InitialValueExpressionCollection(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IMap<String?, String?>, IIterable<IKeyValuePair<String?, String?>?>,
    IWinRTObject {
  private val __8028824_Interface: IMap<String?, String?> by lazy {
    as_8028824()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, String?>?> by lazy {
    as_1449643190()
  }


  public override val __8028824_Type: KType = typeOf<IMap<String?, String?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      String?>?>>()

  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__8028824_Interface, __1449643190_Interface)

  private fun as_8028824(): IMap<String?, String?> {
    if(pointer == NULL) {
      return(IMap.ABI.makeIMap<String?, String?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMap<String?, String?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap.ABI.makeIMap<String?, String?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, String?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, String?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, String?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, String?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InitialValueExpressionCollection> {
    public override fun getValue() = InitialValueExpressionCollection(pointer.getPointer(0))

    public fun setValue(value: InitialValueExpressionCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InitialValueExpressionCollection, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InitialValueExpressionCollection {
      val address = segment.toRawLongValue()
      return InitialValueExpressionCollection(Pointer(address))
    }

    public override fun toNative(obj: InitialValueExpressionCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
