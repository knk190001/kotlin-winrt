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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TileFlyoutUpdateManager.ABI::class)
@WinRTByReference(brClass = TileFlyoutUpdateManager.ByReference::class)
public class TileFlyoutUpdateManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TileFlyoutUpdateManager> {
    public override fun getValue() = TileFlyoutUpdateManager(pointer.getPointer(0))

    public fun setValue(value: TileFlyoutUpdateManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TileFlyoutUpdateManager, MemoryAddress> {
    public val ITileFlyoutUpdateManagerStatics_Instance: ITileFlyoutUpdateManagerStatics by lazy {
      createITileFlyoutUpdateManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITileFlyoutUpdateManagerStatics(): ITileFlyoutUpdateManagerStatics {
      val refiid = Guid.REFIID(ITileFlyoutUpdateManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.TileFlyoutUpdateManager".toHandle(),refiid,interfacePtr)
      val result =
          ITileFlyoutUpdateManagerStatics.ABI.makeITileFlyoutUpdateManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TileFlyoutUpdateManager {
      val address = segment.toRawLongValue()
      return TileFlyoutUpdateManager(Pointer(address))
    }

    public override fun toNative(obj: TileFlyoutUpdateManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateTileFlyoutUpdaterForApplication() =
        ABI.ITileFlyoutUpdateManagerStatics_Instance.CreateTileFlyoutUpdaterForApplication()

    public fun CreateTileFlyoutUpdaterForApplication(applicationId: String) =
        ABI.ITileFlyoutUpdateManagerStatics_Instance.CreateTileFlyoutUpdaterForApplication(applicationId)

    public fun CreateTileFlyoutUpdaterForSecondaryTile(tileId: String) =
        ABI.ITileFlyoutUpdateManagerStatics_Instance.CreateTileFlyoutUpdaterForSecondaryTile(tileId)

    public fun GetTemplateContent(type: TileFlyoutTemplateType) =
        ABI.ITileFlyoutUpdateManagerStatics_Instance.GetTemplateContent(type)
  }
}
