package Windows.Graphics.Holographic

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

@ABIMarker(HolographicDisplay.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicDisplay;{9acea414-1d9f-4090-a388-90c06f6eae9c})")
@WinRTByReference(brClass = HolographicDisplay.ByReference::class)
public class HolographicDisplay(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicDisplay.WithDefault, IHolographicDisplay2.WithDefault,
    IHolographicDisplay3.WithDefault, IWinRTObject {
  private val __1003169849_Interface: IHolographicDisplay.WithDefault by lazy {
    as_1003169849()
  }


  private val __1033494197_Interface: IHolographicDisplay2.WithDefault by lazy {
    as_1033494197()
  }


  private val __1033494196_Interface: IHolographicDisplay3.WithDefault by lazy {
    as_1033494196()
  }


  public override val __1003169849_Ptr: JNAPointer? by lazy {
    __1003169849_Interface.__1003169849_Ptr
  }


  public override val __1033494197_Ptr: JNAPointer? by lazy {
    __1033494197_Interface.__1033494197_Ptr
  }


  public override val __1033494196_Ptr: JNAPointer? by lazy {
    __1033494196_Interface.__1033494196_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1003169849_Interface, __1033494197_Interface, __1033494196_Interface)

  private fun as_1003169849(): IHolographicDisplay.WithDefault {
    if(pointer == NULL) {
      return(IHolographicDisplay.ABI.makeIHolographicDisplay(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicDisplay>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicDisplay.ABI.makeIHolographicDisplay(ref.value))
  }

  private fun as_1033494197(): IHolographicDisplay2.WithDefault {
    if(pointer == NULL) {
      return(IHolographicDisplay2.ABI.makeIHolographicDisplay2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicDisplay2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicDisplay2.ABI.makeIHolographicDisplay2(ref.value))
  }

  private fun as_1033494196(): IHolographicDisplay3.WithDefault {
    if(pointer == NULL) {
      return(IHolographicDisplay3.ABI.makeIHolographicDisplay3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicDisplay3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicDisplay3.ABI.makeIHolographicDisplay3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicDisplay> {
    public override fun getValue() = HolographicDisplay(pointer.getPointer(0))

    public fun setValue(value: HolographicDisplay): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicDisplay, MemoryAddress> {
    public val IHolographicDisplayStatics_Instance: IHolographicDisplayStatics by lazy {
      createIHolographicDisplayStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHolographicDisplayStatics(): IHolographicDisplayStatics {
      val refiid = Guid.REFIID(IHolographicDisplayStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Holographic.HolographicDisplay".toHandle(),refiid,interfacePtr)
      val result = IHolographicDisplayStatics.ABI.makeIHolographicDisplayStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HolographicDisplay {
      val address = segment.toRawLongValue()
      return HolographicDisplay(Pointer(address))
    }

    public override fun toNative(obj: HolographicDisplay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IHolographicDisplayStatics_Instance.GetDefault()
  }
}
