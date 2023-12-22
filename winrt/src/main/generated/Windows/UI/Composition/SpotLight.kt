package Windows.UI.Composition

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

@ABIMarker(SpotLight.ABI::class)
@Signature("rc(Windows.UI.Composition.SpotLight;{5a9fe273-44a1-4f95-a422-8fa5116bdb44})")
@WinRTByReference(brClass = SpotLight.ByReference::class)
public class SpotLight(
  ptr: JNAPointer? = NULL
) : CompositionLight(ptr), ISpotLight.WithDefault, ISpotLight2.WithDefault, ISpotLight3.WithDefault,
    IWinRTObject {
  private val __928417466_Interface: ISpotLight.WithDefault by lazy {
    as_928417466()
  }


  private val __1283829676_Interface: ISpotLight2.WithDefault by lazy {
    as_1283829676()
  }


  private val __1283829677_Interface: ISpotLight3.WithDefault by lazy {
    as_1283829677()
  }


  public override val __928417466_Ptr: JNAPointer? by lazy {
    __928417466_Interface.__928417466_Ptr
  }


  public override val __1283829676_Ptr: JNAPointer? by lazy {
    __1283829676_Interface.__1283829676_Ptr
  }


  public override val __1283829677_Ptr: JNAPointer? by lazy {
    __1283829677_Interface.__1283829677_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__928417466_Interface, __1283829676_Interface, __1283829677_Interface)

  private fun as_928417466(): ISpotLight.WithDefault {
    if(pointer == NULL) {
      return(ISpotLight.ABI.makeISpotLight(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpotLight>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpotLight.ABI.makeISpotLight(ref.value))
  }

  private fun as_1283829676(): ISpotLight2.WithDefault {
    if(pointer == NULL) {
      return(ISpotLight2.ABI.makeISpotLight2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpotLight2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpotLight2.ABI.makeISpotLight2(ref.value))
  }

  private fun as_1283829677(): ISpotLight3.WithDefault {
    if(pointer == NULL) {
      return(ISpotLight3.ABI.makeISpotLight3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpotLight3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpotLight3.ABI.makeISpotLight3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpotLight> {
    public override fun getValue() = SpotLight(pointer.getPointer(0))

    public fun setValue(value: SpotLight): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpotLight, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpotLight {
      val address = segment.toRawLongValue()
      return SpotLight(Pointer(address))
    }

    public override fun toNative(obj: SpotLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
