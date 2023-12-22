package Windows.Storage

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IObservableMap
import Windows.Foundation.Collections.IPropertySet
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ApplicationDataContainerSettings.ABI::class)
@Signature("rc(Windows.Storage.ApplicationDataContainerSettings;{8a43ed9f-f4e6-4421-acf9-1dab2986820c})")
@WinRTByReference(brClass = ApplicationDataContainerSettings.ByReference::class)
public class ApplicationDataContainerSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPropertySet.WithDefault, IObservableMap<String?, IUnknown?>, IMap<String?,
    IUnknown?>, IIterable<IKeyValuePair<String?, IUnknown?>?>, IWinRTObject {
  private val __759233417_Interface: IPropertySet.WithDefault by lazy {
    as_759233417()
  }


  private val __1606815573_Interface: IObservableMap<String?, IUnknown?> by lazy {
    as_1606815573()
  }


  private val __8028824_Interface: IMap<String?, IUnknown?> by lazy {
    as_8028824()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, IUnknown?>?> by lazy {
    as_1449643190()
  }


  public override val __1606815573_Type: KType = typeOf<IObservableMap<String?, IUnknown?>>()

  public override val __8028824_Type: KType = typeOf<IMap<String?, IUnknown?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      IUnknown?>?>>()

  public override val __759233417_Ptr: JNAPointer? by lazy {
    __759233417_Interface.__759233417_Ptr
  }


  public override val __1606815573_Ptr: JNAPointer? by lazy {
    __1606815573_Interface.__1606815573_Ptr
  }


  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__759233417_Interface, __1606815573_Interface, __8028824_Interface,
        __1449643190_Interface)

  private fun as_759233417(): IPropertySet.WithDefault {
    if(pointer == NULL) {
      return(IPropertySet.ABI.makeIPropertySet(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPropertySet>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPropertySet.ABI.makeIPropertySet(ref.value))
  }

  private fun as_1606815573(): IObservableMap<String?, IUnknown?> {
    if(pointer == NULL) {
      return(IObservableMap.ABI.makeIObservableMap<String?, IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IObservableMap<String?, IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IObservableMap.ABI.makeIObservableMap<String?, IUnknown?>(ref.value))
  }

  private fun as_8028824(): IMap<String?, IUnknown?> {
    if(pointer == NULL) {
      return(IMap.ABI.makeIMap<String?, IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMap<String?, IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap.ABI.makeIMap<String?, IUnknown?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, IUnknown?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IUnknown?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, IUnknown?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IUnknown?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationDataContainerSettings> {
    public override fun getValue() = ApplicationDataContainerSettings(pointer.getPointer(0))

    public fun setValue(value: ApplicationDataContainerSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationDataContainerSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ApplicationDataContainerSettings {
      val address = segment.toRawLongValue()
      return ApplicationDataContainerSettings(Pointer(address))
    }

    public override fun toNative(obj: ApplicationDataContainerSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
