package Windows.Graphics.Display

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DisplayEnhancementOverride.ABI::class)
@Signature("rc(Windows.Graphics.Display.DisplayEnhancementOverride;{429594cf-d97a-4b02-a428-5c4292f7f522})")
@WinRTByReference(brClass = DisplayEnhancementOverride.ByReference::class)
public class DisplayEnhancementOverride(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayEnhancementOverride.WithDefault, IWinRTObject {
  private val __1739502901_Interface: IDisplayEnhancementOverride.WithDefault by lazy {
    as_1739502901()
  }


  public override val __1739502901_Ptr: JNAPointer? by lazy {
    __1739502901_Interface.__1739502901_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1739502901_Interface)

  private fun as_1739502901(): IDisplayEnhancementOverride.WithDefault {
    if(pointer == NULL) {
      return(IDisplayEnhancementOverride.ABI.makeIDisplayEnhancementOverride(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayEnhancementOverride>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayEnhancementOverride.ABI.makeIDisplayEnhancementOverride(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayEnhancementOverride> {
    public override fun getValue() = DisplayEnhancementOverride(pointer.getPointer(0))

    public fun setValue(value: DisplayEnhancementOverride): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayEnhancementOverride, MemoryAddress> {
    public val IDisplayEnhancementOverrideStatics_Instance: IDisplayEnhancementOverrideStatics by
        lazy {
      createIDisplayEnhancementOverrideStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayEnhancementOverrideStatics(): IDisplayEnhancementOverrideStatics {
      val refiid = Guid.REFIID(IDisplayEnhancementOverrideStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Display.DisplayEnhancementOverride".toHandle(),refiid,interfacePtr)
      val result =
          IDisplayEnhancementOverrideStatics.ABI.makeIDisplayEnhancementOverrideStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DisplayEnhancementOverride {
      val address = segment.toRawLongValue()
      return DisplayEnhancementOverride(Pointer(address))
    }

    public override fun toNative(obj: DisplayEnhancementOverride): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() =
        ABI.IDisplayEnhancementOverrideStatics_Instance.GetForCurrentView()
  }
}
