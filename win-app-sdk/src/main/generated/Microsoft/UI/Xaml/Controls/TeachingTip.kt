package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.ITeachingTipFactory.ABI.IID
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

@ABIMarker(TeachingTip.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.TeachingTip;{daebd5f7-3b47-5b12-b804-f4e1442b2113})")
@WinRTByReference(brClass = TeachingTip.ByReference::class)
public open class TeachingTip(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), ITeachingTip.WithDefault, IWinRTObject {
  private val __208521703_Interface: ITeachingTip.WithDefault by lazy {
    as_208521703()
  }


  public override val __208521703_Ptr: JNAPointer? by lazy {
    __208521703_Interface.__208521703_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__208521703_Interface)

  public constructor() : this(ABI.activate())

  private fun as_208521703(): ITeachingTip.WithDefault {
    if(pointer == NULL) {
      return(ITeachingTip.ABI.makeITeachingTip(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITeachingTip>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITeachingTip.ABI.makeITeachingTip(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TeachingTip> {
    public override fun getValue() = TeachingTip(pointer.getPointer(0))

    public fun setValue(value: TeachingTip): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TeachingTip, MemoryAddress> {
    public val ITeachingTipStatics_Instance: ITeachingTipStatics by lazy {
      createITeachingTipStatics()
    }


    public val ITeachingTipFactory_Instance: ITeachingTipFactory by lazy {
      createITeachingTipFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITeachingTipStatics(): ITeachingTipStatics {
      val refiid = Guid.REFIID(ITeachingTipStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TeachingTip".toHandle(),refiid,interfacePtr)
      val result = ITeachingTipStatics.ABI.makeITeachingTipStatics(interfacePtr.value)
      return result
    }

    public fun createITeachingTipFactory(): ITeachingTipFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.TeachingTip".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITeachingTipFactory.ABI.makeITeachingTipFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ITeachingTipFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): TeachingTip {
      val address = segment.toRawLongValue()
      return TeachingTip(Pointer(address))
    }

    public override fun toNative(obj: TeachingTip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsOpenProperty() = ABI.ITeachingTipStatics_Instance.get_IsOpenProperty()

    public fun get_TargetProperty() = ABI.ITeachingTipStatics_Instance.get_TargetProperty()

    public fun get_TailVisibilityProperty() =
        ABI.ITeachingTipStatics_Instance.get_TailVisibilityProperty()

    public fun get_TitleProperty() = ABI.ITeachingTipStatics_Instance.get_TitleProperty()

    public fun get_SubtitleProperty() = ABI.ITeachingTipStatics_Instance.get_SubtitleProperty()

    public fun get_ActionButtonContentProperty() =
        ABI.ITeachingTipStatics_Instance.get_ActionButtonContentProperty()

    public fun get_ActionButtonStyleProperty() =
        ABI.ITeachingTipStatics_Instance.get_ActionButtonStyleProperty()

    public fun get_ActionButtonCommandProperty() =
        ABI.ITeachingTipStatics_Instance.get_ActionButtonCommandProperty()

    public fun get_ActionButtonCommandParameterProperty() =
        ABI.ITeachingTipStatics_Instance.get_ActionButtonCommandParameterProperty()

    public fun get_CloseButtonContentProperty() =
        ABI.ITeachingTipStatics_Instance.get_CloseButtonContentProperty()

    public fun get_CloseButtonStyleProperty() =
        ABI.ITeachingTipStatics_Instance.get_CloseButtonStyleProperty()

    public fun get_CloseButtonCommandProperty() =
        ABI.ITeachingTipStatics_Instance.get_CloseButtonCommandProperty()

    public fun get_CloseButtonCommandParameterProperty() =
        ABI.ITeachingTipStatics_Instance.get_CloseButtonCommandParameterProperty()

    public fun get_PlacementMarginProperty() =
        ABI.ITeachingTipStatics_Instance.get_PlacementMarginProperty()

    public fun get_ShouldConstrainToRootBoundsProperty() =
        ABI.ITeachingTipStatics_Instance.get_ShouldConstrainToRootBoundsProperty()

    public fun get_IsLightDismissEnabledProperty() =
        ABI.ITeachingTipStatics_Instance.get_IsLightDismissEnabledProperty()

    public fun get_PreferredPlacementProperty() =
        ABI.ITeachingTipStatics_Instance.get_PreferredPlacementProperty()

    public fun get_HeroContentPlacementProperty() =
        ABI.ITeachingTipStatics_Instance.get_HeroContentPlacementProperty()

    public fun get_HeroContentProperty() =
        ABI.ITeachingTipStatics_Instance.get_HeroContentProperty()

    public fun get_IconSourceProperty() = ABI.ITeachingTipStatics_Instance.get_IconSourceProperty()

    public fun get_TemplateSettingsProperty() =
        ABI.ITeachingTipStatics_Instance.get_TemplateSettingsProperty()
  }
}
