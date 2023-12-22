package Windows.Networking.Connectivity

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

@ABIMarker(ConnectionProfile.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.ConnectionProfile;{71ba143c-598e-49d0-84eb-8febaedcc195})")
@WinRTByReference(brClass = ConnectionProfile.ByReference::class)
public class ConnectionProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectionProfile.WithDefault, IConnectionProfile2.WithDefault,
    IConnectionProfile3.WithDefault, IConnectionProfile4.WithDefault,
    IConnectionProfile5.WithDefault, IWinRTObject {
  private val __1868952056_Interface: IConnectionProfile.WithDefault by lazy {
    as_1868952056()
  }


  private val __2102938838_Interface: IConnectionProfile2.WithDefault by lazy {
    as_2102938838()
  }


  private val __2102938837_Interface: IConnectionProfile3.WithDefault by lazy {
    as_2102938837()
  }


  private val __2102938836_Interface: IConnectionProfile4.WithDefault by lazy {
    as_2102938836()
  }


  private val __2102938835_Interface: IConnectionProfile5.WithDefault by lazy {
    as_2102938835()
  }


  public override val __1868952056_Ptr: JNAPointer? by lazy {
    __1868952056_Interface.__1868952056_Ptr
  }


  public override val __2102938838_Ptr: JNAPointer? by lazy {
    __2102938838_Interface.__2102938838_Ptr
  }


  public override val __2102938837_Ptr: JNAPointer? by lazy {
    __2102938837_Interface.__2102938837_Ptr
  }


  public override val __2102938836_Ptr: JNAPointer? by lazy {
    __2102938836_Interface.__2102938836_Ptr
  }


  public override val __2102938835_Ptr: JNAPointer? by lazy {
    __2102938835_Interface.__2102938835_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1868952056_Interface, __2102938838_Interface, __2102938837_Interface,
        __2102938836_Interface, __2102938835_Interface)

  private fun as_1868952056(): IConnectionProfile.WithDefault {
    if(pointer == NULL) {
      return(IConnectionProfile.ABI.makeIConnectionProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionProfile.ABI.makeIConnectionProfile(ref.value))
  }

  private fun as_2102938838(): IConnectionProfile2.WithDefault {
    if(pointer == NULL) {
      return(IConnectionProfile2.ABI.makeIConnectionProfile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionProfile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionProfile2.ABI.makeIConnectionProfile2(ref.value))
  }

  private fun as_2102938837(): IConnectionProfile3.WithDefault {
    if(pointer == NULL) {
      return(IConnectionProfile3.ABI.makeIConnectionProfile3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionProfile3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionProfile3.ABI.makeIConnectionProfile3(ref.value))
  }

  private fun as_2102938836(): IConnectionProfile4.WithDefault {
    if(pointer == NULL) {
      return(IConnectionProfile4.ABI.makeIConnectionProfile4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionProfile4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionProfile4.ABI.makeIConnectionProfile4(ref.value))
  }

  private fun as_2102938835(): IConnectionProfile5.WithDefault {
    if(pointer == NULL) {
      return(IConnectionProfile5.ABI.makeIConnectionProfile5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionProfile5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionProfile5.ABI.makeIConnectionProfile5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConnectionProfile> {
    public override fun getValue() = ConnectionProfile(pointer.getPointer(0))

    public fun setValue(value: ConnectionProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectionProfile, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ConnectionProfile {
      val address = segment.toRawLongValue()
      return ConnectionProfile(Pointer(address))
    }

    public override fun toNative(obj: ConnectionProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
