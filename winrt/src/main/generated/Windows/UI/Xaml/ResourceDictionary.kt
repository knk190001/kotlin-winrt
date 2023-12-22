package Windows.UI.Xaml

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.UI.Xaml.IResourceDictionaryFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(ResourceDictionary.ABI::class)
@Signature("rc(Windows.UI.Xaml.ResourceDictionary;{c1ea4f24-d6de-4191-8e3a-f48601f7489c})")
@WinRTByReference(brClass = ResourceDictionary.ByReference::class)
public open class ResourceDictionary(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IResourceDictionary.WithDefault, IMap<IUnknown?, IUnknown?>,
    IIterable<IKeyValuePair<IUnknown?, IUnknown?>?>, IWinRTObject {
  private val __1495700202_Interface: IResourceDictionary.WithDefault by lazy {
    as_1495700202()
  }


  private val __8028824_Interface: IMap<IUnknown?, IUnknown?> by lazy {
    as_8028824()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<IUnknown?, IUnknown?>?> by lazy {
    as_1449643190()
  }


  public override val __8028824_Type: KType = typeOf<IMap<IUnknown?, IUnknown?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<IUnknown?,
      IUnknown?>?>>()

  public override val __1495700202_Ptr: JNAPointer? by lazy {
    __1495700202_Interface.__1495700202_Ptr
  }


  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1495700202_Interface, __8028824_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1495700202(): IResourceDictionary.WithDefault {
    if(pointer == NULL) {
      return(IResourceDictionary.ABI.makeIResourceDictionary(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceDictionary>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceDictionary.ABI.makeIResourceDictionary(ref.value))
  }

  private fun as_8028824(): IMap<IUnknown?, IUnknown?> {
    if(pointer == NULL) {
      return(IMap.ABI.makeIMap<IUnknown?, IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMap<IUnknown?, IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap.ABI.makeIMap<IUnknown?, IUnknown?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<IUnknown?, IUnknown?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<IUnknown?, IUnknown?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<IUnknown?, IUnknown?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<IUnknown?, IUnknown?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceDictionary> {
    public override fun getValue() = ResourceDictionary(pointer.getPointer(0))

    public fun setValue(value: ResourceDictionary): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceDictionary, MemoryAddress> {
    public val IResourceDictionaryFactory_Instance: IResourceDictionaryFactory by lazy {
      createIResourceDictionaryFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIResourceDictionaryFactory(): IResourceDictionaryFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.ResourceDictionary".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IResourceDictionaryFactory.ABI.makeIResourceDictionaryFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IResourceDictionaryFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ResourceDictionary {
      val address = segment.toRawLongValue()
      return ResourceDictionary(Pointer(address))
    }

    public override fun toNative(obj: ResourceDictionary): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
