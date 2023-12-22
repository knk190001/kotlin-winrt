package Microsoft.UI.Xaml

import Microsoft.UI.Xaml.IAdaptiveTriggerFactory.ABI.IID
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

@ABIMarker(AdaptiveTrigger.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.AdaptiveTrigger;{b2b18ae8-48d9-5a1d-a555-6685ddd4da80})")
@WinRTByReference(brClass = AdaptiveTrigger.ByReference::class)
public open class AdaptiveTrigger(
  ptr: JNAPointer? = NULL
) : StateTriggerBase(ptr), IAdaptiveTrigger.WithDefault, IWinRTObject {
  private val __1164650693_Interface: IAdaptiveTrigger.WithDefault by lazy {
    as_1164650693()
  }


  public override val __1164650693_Ptr: JNAPointer? by lazy {
    __1164650693_Interface.__1164650693_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1164650693_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1164650693(): IAdaptiveTrigger.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveTrigger.ABI.makeIAdaptiveTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveTrigger.ABI.makeIAdaptiveTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveTrigger> {
    public override fun getValue() = AdaptiveTrigger(pointer.getPointer(0))

    public fun setValue(value: AdaptiveTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveTrigger, MemoryAddress> {
    public val IAdaptiveTriggerStatics_Instance: IAdaptiveTriggerStatics by lazy {
      createIAdaptiveTriggerStatics()
    }


    public val IAdaptiveTriggerFactory_Instance: IAdaptiveTriggerFactory by lazy {
      createIAdaptiveTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAdaptiveTriggerStatics(): IAdaptiveTriggerStatics {
      val refiid = Guid.REFIID(IAdaptiveTriggerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.AdaptiveTrigger".toHandle(),refiid,interfacePtr)
      val result = IAdaptiveTriggerStatics.ABI.makeIAdaptiveTriggerStatics(interfacePtr.value)
      return result
    }

    public fun createIAdaptiveTriggerFactory(): IAdaptiveTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.AdaptiveTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAdaptiveTriggerFactory.ABI.makeIAdaptiveTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAdaptiveTriggerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AdaptiveTrigger {
      val address = segment.toRawLongValue()
      return AdaptiveTrigger(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MinWindowWidthProperty() =
        ABI.IAdaptiveTriggerStatics_Instance.get_MinWindowWidthProperty()

    public fun get_MinWindowHeightProperty() =
        ABI.IAdaptiveTriggerStatics_Instance.get_MinWindowHeightProperty()
  }
}
