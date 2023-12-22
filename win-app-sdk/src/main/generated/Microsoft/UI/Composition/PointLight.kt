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

@ABIMarker(PointLight.ABI::class)
@Signature("rc(Microsoft.UI.Composition.PointLight;{ed5cc102-f0ac-59a8-8678-ce54146e7be8})")
@WinRTByReference(brClass = PointLight.ByReference::class)
public class PointLight(
  ptr: JNAPointer? = NULL
) : CompositionLight(ptr), IPointLight.WithDefault, IPointLight2.WithDefault,
    IPointLight3.WithDefault, IWinRTObject {
  private val __2095130175_Interface: IPointLight.WithDefault by lazy {
    as_2095130175()
  }


  private val __524526035_Interface: IPointLight2.WithDefault by lazy {
    as_524526035()
  }


  private val __524526036_Interface: IPointLight3.WithDefault by lazy {
    as_524526036()
  }


  public override val __2095130175_Ptr: JNAPointer? by lazy {
    __2095130175_Interface.__2095130175_Ptr
  }


  public override val __524526035_Ptr: JNAPointer? by lazy {
    __524526035_Interface.__524526035_Ptr
  }


  public override val __524526036_Ptr: JNAPointer? by lazy {
    __524526036_Interface.__524526036_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2095130175_Interface, __524526035_Interface, __524526036_Interface)

  private fun as_2095130175(): IPointLight.WithDefault {
    if(pointer == NULL) {
      return(IPointLight.ABI.makeIPointLight(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointLight>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointLight.ABI.makeIPointLight(ref.value))
  }

  private fun as_524526035(): IPointLight2.WithDefault {
    if(pointer == NULL) {
      return(IPointLight2.ABI.makeIPointLight2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointLight2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointLight2.ABI.makeIPointLight2(ref.value))
  }

  private fun as_524526036(): IPointLight3.WithDefault {
    if(pointer == NULL) {
      return(IPointLight3.ABI.makeIPointLight3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointLight3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointLight3.ABI.makeIPointLight3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PointLight> {
    public override fun getValue() = PointLight(pointer.getPointer(0))

    public fun setValue(value: PointLight): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointLight, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PointLight {
      val address = segment.toRawLongValue()
      return PointLight(Pointer(address))
    }

    public override fun toNative(obj: PointLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
