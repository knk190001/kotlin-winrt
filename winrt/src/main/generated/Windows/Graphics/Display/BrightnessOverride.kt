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

@ABIMarker(BrightnessOverride.ABI::class)
@Signature("rc(Windows.Graphics.Display.BrightnessOverride;{96c9621a-c143-4392-bedd-4a7e9574c8fd})")
@WinRTByReference(brClass = BrightnessOverride.ByReference::class)
public class BrightnessOverride(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBrightnessOverride.WithDefault, IWinRTObject {
  private val __1755948700_Interface: IBrightnessOverride.WithDefault by lazy {
    as_1755948700()
  }


  public override val __1755948700_Ptr: JNAPointer? by lazy {
    __1755948700_Interface.__1755948700_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1755948700_Interface)

  private fun as_1755948700(): IBrightnessOverride.WithDefault {
    if(pointer == NULL) {
      return(IBrightnessOverride.ABI.makeIBrightnessOverride(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBrightnessOverride>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBrightnessOverride.ABI.makeIBrightnessOverride(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BrightnessOverride> {
    public override fun getValue() = BrightnessOverride(pointer.getPointer(0))

    public fun setValue(value: BrightnessOverride): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BrightnessOverride, MemoryAddress> {
    public val IBrightnessOverrideStatics_Instance: IBrightnessOverrideStatics by lazy {
      createIBrightnessOverrideStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBrightnessOverrideStatics(): IBrightnessOverrideStatics {
      val refiid = Guid.REFIID(IBrightnessOverrideStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Display.BrightnessOverride".toHandle(),refiid,interfacePtr)
      val result = IBrightnessOverrideStatics.ABI.makeIBrightnessOverrideStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BrightnessOverride {
      val address = segment.toRawLongValue()
      return BrightnessOverride(Pointer(address))
    }

    public override fun toNative(obj: BrightnessOverride): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultForSystem() = ABI.IBrightnessOverrideStatics_Instance.GetDefaultForSystem()

    public fun GetForCurrentView() = ABI.IBrightnessOverrideStatics_Instance.GetForCurrentView()

    public fun SaveForSystemAsync(value: BrightnessOverride) =
        ABI.IBrightnessOverrideStatics_Instance.SaveForSystemAsync(value)
  }
}
