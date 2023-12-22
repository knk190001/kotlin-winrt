package Windows.UI.Input

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

@ABIMarker(RadialControllerScreenContact.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerScreenContact;{206aa434-e651-11e5-bf62-2c27d7404e85})")
@WinRTByReference(brClass = RadialControllerScreenContact.ByReference::class)
public class RadialControllerScreenContact(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerScreenContact.WithDefault, IWinRTObject {
  private val __556204885_Interface: IRadialControllerScreenContact.WithDefault by lazy {
    as_556204885()
  }


  public override val __556204885_Ptr: JNAPointer? by lazy {
    __556204885_Interface.__556204885_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__556204885_Interface)

  private fun as_556204885(): IRadialControllerScreenContact.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerScreenContact.ABI.makeIRadialControllerScreenContact(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerScreenContact>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerScreenContact.ABI.makeIRadialControllerScreenContact(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerScreenContact> {
    public override fun getValue() = RadialControllerScreenContact(pointer.getPointer(0))

    public fun setValue(value: RadialControllerScreenContact): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerScreenContact, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RadialControllerScreenContact {
      val address = segment.toRawLongValue()
      return RadialControllerScreenContact(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerScreenContact): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
