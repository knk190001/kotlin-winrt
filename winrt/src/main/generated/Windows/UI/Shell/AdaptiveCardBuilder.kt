package Windows.UI.Shell

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

@ABIMarker(AdaptiveCardBuilder.ABI::class)
@WinRTByReference(brClass = AdaptiveCardBuilder.ByReference::class)
public class AdaptiveCardBuilder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveCardBuilder> {
    public override fun getValue() = AdaptiveCardBuilder(pointer.getPointer(0))

    public fun setValue(value: AdaptiveCardBuilder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveCardBuilder, MemoryAddress> {
    public val IAdaptiveCardBuilderStatics_Instance: IAdaptiveCardBuilderStatics by lazy {
      createIAdaptiveCardBuilderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAdaptiveCardBuilderStatics(): IAdaptiveCardBuilderStatics {
      val refiid = Guid.REFIID(IAdaptiveCardBuilderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Shell.AdaptiveCardBuilder".toHandle(),refiid,interfacePtr)
      val result =
          IAdaptiveCardBuilderStatics.ABI.makeIAdaptiveCardBuilderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AdaptiveCardBuilder {
      val address = segment.toRawLongValue()
      return AdaptiveCardBuilder(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveCardBuilder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAdaptiveCardFromJson(value: String) =
        ABI.IAdaptiveCardBuilderStatics_Instance.CreateAdaptiveCardFromJson(value)
  }
}
