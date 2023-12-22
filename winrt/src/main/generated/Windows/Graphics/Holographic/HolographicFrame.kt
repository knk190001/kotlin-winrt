package Windows.Graphics.Holographic

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

@ABIMarker(HolographicFrame.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicFrame;{c6988eb6-a8b9-3054-a6eb-d624b6536375})")
@WinRTByReference(brClass = HolographicFrame.ByReference::class)
public class HolographicFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicFrame.WithDefault, IHolographicFrame2.WithDefault,
    IHolographicFrame3.WithDefault, IWinRTObject {
  private val __1927308722_Interface: IHolographicFrame.WithDefault by lazy {
    as_1927308722()
  }


  private val __382971712_Interface: IHolographicFrame2.WithDefault by lazy {
    as_382971712()
  }


  private val __382971711_Interface: IHolographicFrame3.WithDefault by lazy {
    as_382971711()
  }


  public override val __1927308722_Ptr: JNAPointer? by lazy {
    __1927308722_Interface.__1927308722_Ptr
  }


  public override val __382971712_Ptr: JNAPointer? by lazy {
    __382971712_Interface.__382971712_Ptr
  }


  public override val __382971711_Ptr: JNAPointer? by lazy {
    __382971711_Interface.__382971711_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1927308722_Interface, __382971712_Interface, __382971711_Interface)

  private fun as_1927308722(): IHolographicFrame.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFrame.ABI.makeIHolographicFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFrame.ABI.makeIHolographicFrame(ref.value))
  }

  private fun as_382971712(): IHolographicFrame2.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFrame2.ABI.makeIHolographicFrame2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFrame2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFrame2.ABI.makeIHolographicFrame2(ref.value))
  }

  private fun as_382971711(): IHolographicFrame3.WithDefault {
    if(pointer == NULL) {
      return(IHolographicFrame3.ABI.makeIHolographicFrame3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicFrame3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicFrame3.ABI.makeIHolographicFrame3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicFrame> {
    public override fun getValue() = HolographicFrame(pointer.getPointer(0))

    public fun setValue(value: HolographicFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicFrame {
      val address = segment.toRawLongValue()
      return HolographicFrame(Pointer(address))
    }

    public override fun toNative(obj: HolographicFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
