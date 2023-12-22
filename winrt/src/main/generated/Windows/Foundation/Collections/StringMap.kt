package Windows.Foundation.Collections

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(StringMap.ABI::class)
@Signature("rc(Windows.Foundation.Collections.StringMap;pinterface({3c2925fe-8519-45c1-aa79-197b6718c1c1};string;string))")
@WinRTByReference(brClass = StringMap.ByReference::class)
public class StringMap(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMap<String?, String?>, IIterable<IKeyValuePair<String?, String?>?>,
    IObservableMap<String?, String?>, IWinRTObject {
  private val __8028824_Interface: IMap<String?, String?> by lazy {
    as_8028824()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, String?>?> by lazy {
    as_1449643190()
  }


  private val __1606815573_Interface: IObservableMap<String?, String?> by lazy {
    as_1606815573()
  }


  public override val __8028824_Type: KType = typeOf<IMap<String?, String?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      String?>?>>()

  public override val __1606815573_Type: KType = typeOf<IObservableMap<String?, String?>>()

  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __1606815573_Ptr: JNAPointer? by lazy {
    __1606815573_Interface.__1606815573_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__8028824_Interface, __1449643190_Interface, __1606815573_Interface)

  public constructor() : this(ABI.activate())

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

  private fun as_1606815573(): IObservableMap<String?, String?> {
    if(pointer == NULL) {
      return(IObservableMap.ABI.makeIObservableMap<String?, String?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IObservableMap<String?, String?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IObservableMap.ABI.makeIObservableMap<String?, String?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StringMap> {
    public override fun getValue() = StringMap(pointer.getPointer(0))

    public fun setValue(value: StringMap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StringMap, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Collections.StringMap".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): StringMap {
      val address = segment.toRawLongValue()
      return StringMap(Pointer(address))
    }

    public override fun toNative(obj: StringMap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
