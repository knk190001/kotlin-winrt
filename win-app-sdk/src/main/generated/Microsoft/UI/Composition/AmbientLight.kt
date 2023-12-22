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

@ABIMarker(AmbientLight.ABI::class)
@Signature("rc(Microsoft.UI.Composition.AmbientLight;{4540525e-b70d-5a14-bbfa-63bef42313c7})")
@WinRTByReference(brClass = AmbientLight.ByReference::class)
public class AmbientLight(
  ptr: JNAPointer? = NULL
) : CompositionLight(ptr), IAmbientLight.WithDefault, IAmbientLight2.WithDefault, IWinRTObject {
  private val __1705927689_Interface: IAmbientLight.WithDefault by lazy {
    as_1705927689()
  }


  private val __1344150757_Interface: IAmbientLight2.WithDefault by lazy {
    as_1344150757()
  }


  public override val __1705927689_Ptr: JNAPointer? by lazy {
    __1705927689_Interface.__1705927689_Ptr
  }


  public override val __1344150757_Ptr: JNAPointer? by lazy {
    __1344150757_Interface.__1344150757_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1705927689_Interface, __1344150757_Interface)

  private fun as_1705927689(): IAmbientLight.WithDefault {
    if(pointer == NULL) {
      return(IAmbientLight.ABI.makeIAmbientLight(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAmbientLight>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAmbientLight.ABI.makeIAmbientLight(ref.value))
  }

  private fun as_1344150757(): IAmbientLight2.WithDefault {
    if(pointer == NULL) {
      return(IAmbientLight2.ABI.makeIAmbientLight2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAmbientLight2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAmbientLight2.ABI.makeIAmbientLight2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AmbientLight> {
    public override fun getValue() = AmbientLight(pointer.getPointer(0))

    public fun setValue(value: AmbientLight): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AmbientLight, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AmbientLight {
      val address = segment.toRawLongValue()
      return AmbientLight(Pointer(address))
    }

    public override fun toNative(obj: AmbientLight): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
