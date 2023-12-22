package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IInfoBadgeFactory.ABI.IID
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

@ABIMarker(InfoBadge.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.InfoBadge;{82104d7f-03d4-5ea4-872e-f9ecab758601})")
@WinRTByReference(brClass = InfoBadge.ByReference::class)
public open class InfoBadge(
  ptr: JNAPointer? = NULL
) : Control(ptr), IInfoBadge.WithDefault, IWinRTObject {
  private val __621659566_Interface: IInfoBadge.WithDefault by lazy {
    as_621659566()
  }


  public override val __621659566_Ptr: JNAPointer? by lazy {
    __621659566_Interface.__621659566_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__621659566_Interface)

  public constructor() : this(ABI.activate())

  private fun as_621659566(): IInfoBadge.WithDefault {
    if(pointer == NULL) {
      return(IInfoBadge.ABI.makeIInfoBadge(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInfoBadge>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInfoBadge.ABI.makeIInfoBadge(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InfoBadge> {
    public override fun getValue() = InfoBadge(pointer.getPointer(0))

    public fun setValue(value: InfoBadge): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InfoBadge, MemoryAddress> {
    public val IInfoBadgeStatics_Instance: IInfoBadgeStatics by lazy {
      createIInfoBadgeStatics()
    }


    public val IInfoBadgeFactory_Instance: IInfoBadgeFactory by lazy {
      createIInfoBadgeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInfoBadgeStatics(): IInfoBadgeStatics {
      val refiid = Guid.REFIID(IInfoBadgeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.InfoBadge".toHandle(),refiid,interfacePtr)
      val result = IInfoBadgeStatics.ABI.makeIInfoBadgeStatics(interfacePtr.value)
      return result
    }

    public fun createIInfoBadgeFactory(): IInfoBadgeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.InfoBadge".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInfoBadgeFactory.ABI.makeIInfoBadgeFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInfoBadgeFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InfoBadge {
      val address = segment.toRawLongValue()
      return InfoBadge(Pointer(address))
    }

    public override fun toNative(obj: InfoBadge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ValueProperty() = ABI.IInfoBadgeStatics_Instance.get_ValueProperty()

    public fun get_IconSourceProperty() = ABI.IInfoBadgeStatics_Instance.get_IconSourceProperty()

    public fun get_TemplateSettingsProperty() =
        ABI.IInfoBadgeStatics_Instance.get_TemplateSettingsProperty()
  }
}
