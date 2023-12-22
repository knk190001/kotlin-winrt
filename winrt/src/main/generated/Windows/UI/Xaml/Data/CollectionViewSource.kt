package Windows.UI.Xaml.Data

import Windows.UI.Xaml.DependencyObject
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CollectionViewSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Data.CollectionViewSource;{a66a1146-d2fb-4ead-be9f-3578a466dcfe})")
@WinRTByReference(brClass = CollectionViewSource.ByReference::class)
public class CollectionViewSource(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), ICollectionViewSource.WithDefault, IWinRTObject {
  private val __1042872698_Interface: ICollectionViewSource.WithDefault by lazy {
    as_1042872698()
  }


  public override val __1042872698_Ptr: JNAPointer? by lazy {
    __1042872698_Interface.__1042872698_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1042872698_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1042872698(): ICollectionViewSource.WithDefault {
    if(pointer == NULL) {
      return(ICollectionViewSource.ABI.makeICollectionViewSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICollectionViewSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICollectionViewSource.ABI.makeICollectionViewSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CollectionViewSource> {
    public override fun getValue() = CollectionViewSource(pointer.getPointer(0))

    public fun setValue(value: CollectionViewSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CollectionViewSource, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICollectionViewSourceStatics_Instance: ICollectionViewSourceStatics by lazy {
      createICollectionViewSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Data.CollectionViewSource".toHandle(),
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

    public fun createICollectionViewSourceStatics(): ICollectionViewSourceStatics {
      val refiid = Guid.REFIID(ICollectionViewSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Data.CollectionViewSource".toHandle(),refiid,interfacePtr)
      val result =
          ICollectionViewSourceStatics.ABI.makeICollectionViewSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CollectionViewSource {
      val address = segment.toRawLongValue()
      return CollectionViewSource(Pointer(address))
    }

    public override fun toNative(obj: CollectionViewSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceProperty() = ABI.ICollectionViewSourceStatics_Instance.get_SourceProperty()

    public fun get_ViewProperty() = ABI.ICollectionViewSourceStatics_Instance.get_ViewProperty()

    public fun get_IsSourceGroupedProperty() =
        ABI.ICollectionViewSourceStatics_Instance.get_IsSourceGroupedProperty()

    public fun get_ItemsPathProperty() =
        ABI.ICollectionViewSourceStatics_Instance.get_ItemsPathProperty()
  }
}
