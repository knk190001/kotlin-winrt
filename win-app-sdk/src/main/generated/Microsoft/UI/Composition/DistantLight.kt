package Microsoft.UI.Composition

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

@ABIMarker(DistantLight.ABI::class)
@Signature("rc(Microsoft.UI.Composition.DistantLight;{125ef556-56ee-5c60-b944-571928ca03f5})")
@WinRTByReference(brClass = DistantLight.ByReference::class)
public class DistantLight(
  ptr: JNAPointer? = NULL
) : CompositionLight(ptr), IDistantLight.WithDefault, IDistantLight2.WithDefault, IWinRTObject {
  private val __1444959662_Interface: IDistantLight.WithDefault by lazy {
    as_1444959662()
  }


  private val __1844076612_Interface: IDistantLight2.WithDefault by lazy {
    as_1844076612()
  }


  public override val __1444959662_Ptr: JNAPointer? by lazy {
    __1444959662_Interface.__1444959662_Ptr
  }


  public override val __1844076612_Ptr: JNAPointer? by lazy {
    __1844076612_Interface.__1844076612_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1444959662_Interface, __1844076612_Interface)

  private fun as_1444959662(): IDistantLight.WithDefault {
    if(pointer == NULL) {
      return(IDistantLight.ABI.makeIDistantLight(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDistantLight>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDistantLight.ABI.makeIDistantLight(ref.value))
  }

  private fun as_1844076612(): IDistantLight2.WithDefault {
    if(pointer == NULL) {
      return(IDistantLight2.ABI.makeIDistantLight2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDistantLight2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDistantLight2.ABI.makeIDistantLight2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DistantLight> {
    public override fun getValue() = DistantLight(pointer.getPointer(0))

    public fun setValue(value: DistantLight): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DistantLight, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DistantLight {
      val address = segment.toRawLongValue()
      return DistantLight(Pointer(address))
    }

    public override fun toNative(obj: DistantLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
