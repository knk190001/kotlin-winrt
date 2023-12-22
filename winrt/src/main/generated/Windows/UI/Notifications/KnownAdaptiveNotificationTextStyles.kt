package Windows.UI.Notifications

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(KnownAdaptiveNotificationTextStyles.ABI::class)
@WinRTByReference(brClass = KnownAdaptiveNotificationTextStyles.ByReference::class)
public class KnownAdaptiveNotificationTextStyles(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownAdaptiveNotificationTextStyles> {
    public override fun getValue() = KnownAdaptiveNotificationTextStyles(pointer.getPointer(0))

    public fun setValue(value: KnownAdaptiveNotificationTextStyles): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownAdaptiveNotificationTextStyles, MemoryAddress> {
    public val IKnownAdaptiveNotificationTextStylesStatics_Instance:
        IKnownAdaptiveNotificationTextStylesStatics by lazy {
      createIKnownAdaptiveNotificationTextStylesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownAdaptiveNotificationTextStylesStatics():
        IKnownAdaptiveNotificationTextStylesStatics {
      val refiid = Guid.REFIID(IKnownAdaptiveNotificationTextStylesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.KnownAdaptiveNotificationTextStyles".toHandle(),refiid,interfacePtr)
      val result =
          IKnownAdaptiveNotificationTextStylesStatics.ABI.makeIKnownAdaptiveNotificationTextStylesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownAdaptiveNotificationTextStyles {
      val address = segment.toRawLongValue()
      return KnownAdaptiveNotificationTextStyles(Pointer(address))
    }

    public override fun toNative(obj: KnownAdaptiveNotificationTextStyles): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Caption() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_Caption()

    public fun get_Body() = ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_Body()

    public fun get_Base() = ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_Base()

    public fun get_Subtitle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_Subtitle()

    public fun get_Title() = ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_Title()

    public fun get_Subheader() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_Subheader()

    public fun get_Header() = ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_Header()

    public fun get_TitleNumeral() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_TitleNumeral()

    public fun get_SubheaderNumeral() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_SubheaderNumeral()

    public fun get_HeaderNumeral() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_HeaderNumeral()

    public fun get_CaptionSubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_CaptionSubtle()

    public fun get_BodySubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_BodySubtle()

    public fun get_BaseSubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_BaseSubtle()

    public fun get_SubtitleSubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_SubtitleSubtle()

    public fun get_TitleSubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_TitleSubtle()

    public fun get_SubheaderSubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_SubheaderSubtle()

    public fun get_SubheaderNumeralSubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_SubheaderNumeralSubtle()

    public fun get_HeaderSubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_HeaderSubtle()

    public fun get_HeaderNumeralSubtle() =
        ABI.IKnownAdaptiveNotificationTextStylesStatics_Instance.get_HeaderNumeralSubtle()
  }
}
