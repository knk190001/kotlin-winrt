package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(ResourceMap.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Core.ResourceMap;{72284824-db8c-42f8-b08c-53ff357dad82})")
@WinRTByReference(brClass = ResourceMap.ByReference::class)
public class ResourceMap(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceMap.WithDefault, IMapView<String?, NamedResource?>,
    IIterable<IKeyValuePair<String?, NamedResource?>?>, IWinRTObject {
  private val __2021954409_Interface: IResourceMap.WithDefault by lazy {
    as_2021954409()
  }


  private val __1676682589_Interface: IMapView<String?, NamedResource?> by lazy {
    as_1676682589()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, NamedResource?>?> by lazy {
    as_1449643190()
  }


  public override val __1676682589_Type: KType = typeOf<IMapView<String?, NamedResource?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      NamedResource?>?>>()

  public override val __2021954409_Ptr: JNAPointer? by lazy {
    __2021954409_Interface.__2021954409_Ptr
  }


  public override val __1676682589_Ptr: JNAPointer? by lazy {
    __1676682589_Interface.__1676682589_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2021954409_Interface, __1676682589_Interface, __1449643190_Interface)

  private fun as_2021954409(): IResourceMap.WithDefault {
    if(pointer == NULL) {
      return(IResourceMap.ABI.makeIResourceMap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceMap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceMap.ABI.makeIResourceMap(ref.value))
  }

  private fun as_1676682589(): IMapView<String?, NamedResource?> {
    if(pointer == NULL) {
      return(IMapView.ABI.makeIMapView<String?, NamedResource?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapView<String?, NamedResource?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapView.ABI.makeIMapView<String?, NamedResource?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, NamedResource?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, NamedResource?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, NamedResource?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, NamedResource?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ResourceMap> {
    public override fun getValue() = ResourceMap(pointer.getPointer(0))

    public fun setValue(value: ResourceMap): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceMap, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceMap {
      val address = segment.toRawLongValue()
      return ResourceMap(Pointer(address))
    }

    public override fun toNative(obj: ResourceMap): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
