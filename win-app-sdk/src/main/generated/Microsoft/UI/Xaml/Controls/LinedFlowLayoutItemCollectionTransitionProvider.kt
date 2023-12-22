package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ILinedFlowLayoutItemCollectionTransitionProviderFactory.ABI.IID
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
import kotlin.reflect.typeOf

@ABIMarker(LinedFlowLayoutItemCollectionTransitionProvider.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.LinedFlowLayoutItemCollectionTransitionProvider;{a7c000de-2543-5dc2-a36d-5d69f4f55d61})")
@WinRTByReference(brClass = LinedFlowLayoutItemCollectionTransitionProvider.ByReference::class)
public open class LinedFlowLayoutItemCollectionTransitionProvider(
  ptr: JNAPointer? = NULL
) : ItemCollectionTransitionProvider(ptr),
    ILinedFlowLayoutItemCollectionTransitionProvider.WithDefault, IWinRTObject {
  private val __1881886424_Interface: ILinedFlowLayoutItemCollectionTransitionProvider.WithDefault
      by lazy {
    as_1881886424()
  }


  public override val __1881886424_Ptr: JNAPointer? by lazy {
    __1881886424_Interface.__1881886424_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1881886424_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1881886424(): ILinedFlowLayoutItemCollectionTransitionProvider.WithDefault {
    if(pointer == NULL) {
      return(ILinedFlowLayoutItemCollectionTransitionProvider.ABI.makeILinedFlowLayoutItemCollectionTransitionProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILinedFlowLayoutItemCollectionTransitionProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILinedFlowLayoutItemCollectionTransitionProvider.ABI.makeILinedFlowLayoutItemCollectionTransitionProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LinedFlowLayoutItemCollectionTransitionProvider> {
    public override fun getValue() =
        LinedFlowLayoutItemCollectionTransitionProvider(pointer.getPointer(0))

    public fun setValue(value: LinedFlowLayoutItemCollectionTransitionProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LinedFlowLayoutItemCollectionTransitionProvider, MemoryAddress> {
    public val ILinedFlowLayoutItemCollectionTransitionProviderFactory_Instance:
        ILinedFlowLayoutItemCollectionTransitionProviderFactory by lazy {
      createILinedFlowLayoutItemCollectionTransitionProviderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILinedFlowLayoutItemCollectionTransitionProviderFactory():
        ILinedFlowLayoutItemCollectionTransitionProviderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.LinedFlowLayoutItemCollectionTransitionProvider".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILinedFlowLayoutItemCollectionTransitionProviderFactory.ABI.makeILinedFlowLayoutItemCollectionTransitionProviderFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        ILinedFlowLayoutItemCollectionTransitionProviderFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress):
        LinedFlowLayoutItemCollectionTransitionProvider {
      val address = segment.toRawLongValue()
      return LinedFlowLayoutItemCollectionTransitionProvider(Pointer(address))
    }

    public override fun toNative(obj: LinedFlowLayoutItemCollectionTransitionProvider):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
