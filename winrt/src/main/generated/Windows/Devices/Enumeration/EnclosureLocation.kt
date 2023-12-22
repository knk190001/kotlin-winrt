package Windows.Devices.Enumeration

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

@ABIMarker(EnclosureLocation.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.EnclosureLocation;{42340a27-5810-459c-aabb-c65e1f813ecf})")
@WinRTByReference(brClass = EnclosureLocation.ByReference::class)
public class EnclosureLocation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEnclosureLocation.WithDefault, IEnclosureLocation2.WithDefault, IWinRTObject
    {
  private val __186011561_Interface: IEnclosureLocation.WithDefault by lazy {
    as_186011561()
  }


  private val __1471391145_Interface: IEnclosureLocation2.WithDefault by lazy {
    as_1471391145()
  }


  public override val __186011561_Ptr: JNAPointer? by lazy {
    __186011561_Interface.__186011561_Ptr
  }


  public override val __1471391145_Ptr: JNAPointer? by lazy {
    __1471391145_Interface.__1471391145_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__186011561_Interface, __1471391145_Interface)

  private fun as_186011561(): IEnclosureLocation.WithDefault {
    if(pointer == NULL) {
      return(IEnclosureLocation.ABI.makeIEnclosureLocation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnclosureLocation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnclosureLocation.ABI.makeIEnclosureLocation(ref.value))
  }

  private fun as_1471391145(): IEnclosureLocation2.WithDefault {
    if(pointer == NULL) {
      return(IEnclosureLocation2.ABI.makeIEnclosureLocation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnclosureLocation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnclosureLocation2.ABI.makeIEnclosureLocation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnclosureLocation> {
    public override fun getValue() = EnclosureLocation(pointer.getPointer(0))

    public fun setValue(value: EnclosureLocation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EnclosureLocation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EnclosureLocation {
      val address = segment.toRawLongValue()
      return EnclosureLocation(Pointer(address))
    }

    public override fun toNative(obj: EnclosureLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
