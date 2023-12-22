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

@ABIMarker(HolographicViewConfiguration.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicViewConfiguration;{5c1de6e6-67e9-5004-b02c-67a3a122b576})")
@WinRTByReference(brClass = HolographicViewConfiguration.ByReference::class)
public class HolographicViewConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicViewConfiguration.WithDefault,
    IHolographicViewConfiguration2.WithDefault, IWinRTObject {
  private val __1958667498_Interface: IHolographicViewConfiguration.WithDefault by lazy {
    as_1958667498()
  }


  private val __589150244_Interface: IHolographicViewConfiguration2.WithDefault by lazy {
    as_589150244()
  }


  public override val __1958667498_Ptr: JNAPointer? by lazy {
    __1958667498_Interface.__1958667498_Ptr
  }


  public override val __589150244_Ptr: JNAPointer? by lazy {
    __589150244_Interface.__589150244_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1958667498_Interface, __589150244_Interface)

  private fun as_1958667498(): IHolographicViewConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IHolographicViewConfiguration.ABI.makeIHolographicViewConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicViewConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicViewConfiguration.ABI.makeIHolographicViewConfiguration(ref.value))
  }

  private fun as_589150244(): IHolographicViewConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(IHolographicViewConfiguration2.ABI.makeIHolographicViewConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicViewConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicViewConfiguration2.ABI.makeIHolographicViewConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicViewConfiguration> {
    public override fun getValue() = HolographicViewConfiguration(pointer.getPointer(0))

    public fun setValue(value: HolographicViewConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicViewConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicViewConfiguration {
      val address = segment.toRawLongValue()
      return HolographicViewConfiguration(Pointer(address))
    }

    public override fun toNative(obj: HolographicViewConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
