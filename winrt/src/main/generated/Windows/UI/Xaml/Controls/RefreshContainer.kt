package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IRefreshContainerFactory.ABI.IID
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

@ABIMarker(RefreshContainer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RefreshContainer;{535dc413-b1d5-43c1-b057-8658ce1e0ba2})")
@WinRTByReference(brClass = RefreshContainer.ByReference::class)
public open class RefreshContainer(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IRefreshContainer.WithDefault, IWinRTObject {
  private val __934511618_Interface: IRefreshContainer.WithDefault by lazy {
    as_934511618()
  }


  public override val __934511618_Ptr: JNAPointer? by lazy {
    __934511618_Interface.__934511618_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__934511618_Interface)

  public constructor() : this(ABI.activate())

  private fun as_934511618(): IRefreshContainer.WithDefault {
    if(pointer == NULL) {
      return(IRefreshContainer.ABI.makeIRefreshContainer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRefreshContainer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRefreshContainer.ABI.makeIRefreshContainer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RefreshContainer> {
    public override fun getValue() = RefreshContainer(pointer.getPointer(0))

    public fun setValue(value: RefreshContainer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RefreshContainer, MemoryAddress> {
    public val IRefreshContainerStatics_Instance: IRefreshContainerStatics by lazy {
      createIRefreshContainerStatics()
    }


    public val IRefreshContainerFactory_Instance: IRefreshContainerFactory by lazy {
      createIRefreshContainerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRefreshContainerStatics(): IRefreshContainerStatics {
      val refiid = Guid.REFIID(IRefreshContainerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RefreshContainer".toHandle(),refiid,interfacePtr)
      val result = IRefreshContainerStatics.ABI.makeIRefreshContainerStatics(interfacePtr.value)
      return result
    }

    public fun createIRefreshContainerFactory(): IRefreshContainerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RefreshContainer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRefreshContainerFactory.ABI.makeIRefreshContainerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRefreshContainerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RefreshContainer {
      val address = segment.toRawLongValue()
      return RefreshContainer(Pointer(address))
    }

    public override fun toNative(obj: RefreshContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_VisualizerProperty() =
        ABI.IRefreshContainerStatics_Instance.get_VisualizerProperty()

    public fun get_PullDirectionProperty() =
        ABI.IRefreshContainerStatics_Instance.get_PullDirectionProperty()
  }
}
