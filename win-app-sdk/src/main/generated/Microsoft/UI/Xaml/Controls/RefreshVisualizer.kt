package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IRefreshVisualizerFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(RefreshVisualizer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.RefreshVisualizer;{d6c55db6-d82d-5b68-ba1d-28593fb0ab12})")
@WinRTByReference(brClass = RefreshVisualizer.ByReference::class)
public open class RefreshVisualizer(
  ptr: JNAPointer? = NULL
) : Control(ptr), IRefreshVisualizer.WithDefault, IWinRTObject {
  private val __626857166_Interface: IRefreshVisualizer.WithDefault by lazy {
    as_626857166()
  }


  public override val __626857166_Ptr: JNAPointer? by lazy {
    __626857166_Interface.__626857166_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__626857166_Interface)

  public constructor() : this(ABI.activate())

  private fun as_626857166(): IRefreshVisualizer.WithDefault {
    if(pointer == NULL) {
      return(IRefreshVisualizer.ABI.makeIRefreshVisualizer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRefreshVisualizer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRefreshVisualizer.ABI.makeIRefreshVisualizer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RefreshVisualizer> {
    public override fun getValue() = RefreshVisualizer(pointer.getPointer(0))

    public fun setValue(value: RefreshVisualizer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RefreshVisualizer, MemoryAddress> {
    public val IRefreshVisualizerStatics_Instance: IRefreshVisualizerStatics by lazy {
      createIRefreshVisualizerStatics()
    }


    public val IRefreshVisualizerFactory_Instance: IRefreshVisualizerFactory by lazy {
      createIRefreshVisualizerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRefreshVisualizerStatics(): IRefreshVisualizerStatics {
      val refiid = Guid.REFIID(IRefreshVisualizerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RefreshVisualizer".toHandle(),refiid,interfacePtr)
      val result = IRefreshVisualizerStatics.ABI.makeIRefreshVisualizerStatics(interfacePtr.value)
      return result
    }

    public fun createIRefreshVisualizerFactory(): IRefreshVisualizerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.RefreshVisualizer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRefreshVisualizerFactory.ABI.makeIRefreshVisualizerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRefreshVisualizerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RefreshVisualizer {
      val address = segment.toRawLongValue()
      return RefreshVisualizer(Pointer(address))
    }

    public override fun toNative(obj: RefreshVisualizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_InfoProviderProperty() =
        ABI.IRefreshVisualizerStatics_Instance.get_InfoProviderProperty()

    public fun get_OrientationProperty() =
        ABI.IRefreshVisualizerStatics_Instance.get_OrientationProperty()

    public fun get_ContentProperty() = ABI.IRefreshVisualizerStatics_Instance.get_ContentProperty()

    public fun get_StateProperty() = ABI.IRefreshVisualizerStatics_Instance.get_StateProperty()
  }
}
