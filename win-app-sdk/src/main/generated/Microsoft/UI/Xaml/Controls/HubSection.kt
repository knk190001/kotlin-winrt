package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IHubSectionFactory.ABI.IID
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

@ABIMarker(HubSection.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.HubSection;{9904a65b-89ff-5644-8961-9adbd0135324})")
@WinRTByReference(brClass = HubSection.ByReference::class)
public open class HubSection(
  ptr: JNAPointer? = NULL
) : Control(ptr), IHubSection.WithDefault, IWinRTObject {
  private val __1768584503_Interface: IHubSection.WithDefault by lazy {
    as_1768584503()
  }


  public override val __1768584503_Ptr: JNAPointer? by lazy {
    __1768584503_Interface.__1768584503_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1768584503_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1768584503(): IHubSection.WithDefault {
    if(pointer == NULL) {
      return(IHubSection.ABI.makeIHubSection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHubSection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHubSection.ABI.makeIHubSection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HubSection> {
    public override fun getValue() = HubSection(pointer.getPointer(0))

    public fun setValue(value: HubSection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HubSection, MemoryAddress> {
    public val IHubSectionStatics_Instance: IHubSectionStatics by lazy {
      createIHubSectionStatics()
    }


    public val IHubSectionFactory_Instance: IHubSectionFactory by lazy {
      createIHubSectionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHubSectionStatics(): IHubSectionStatics {
      val refiid = Guid.REFIID(IHubSectionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.HubSection".toHandle(),refiid,interfacePtr)
      val result = IHubSectionStatics.ABI.makeIHubSectionStatics(interfacePtr.value)
      return result
    }

    public fun createIHubSectionFactory(): IHubSectionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.HubSection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHubSectionFactory.ABI.makeIHubSectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IHubSectionFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): HubSection {
      val address = segment.toRawLongValue()
      return HubSection(Pointer(address))
    }

    public override fun toNative(obj: HubSection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.IHubSectionStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IHubSectionStatics_Instance.get_HeaderTemplateProperty()

    public fun get_ContentTemplateProperty() =
        ABI.IHubSectionStatics_Instance.get_ContentTemplateProperty()

    public fun get_IsHeaderInteractiveProperty() =
        ABI.IHubSectionStatics_Instance.get_IsHeaderInteractiveProperty()
  }
}
