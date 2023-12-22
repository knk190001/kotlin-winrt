package Windows.Networking.Vpn

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgsWithUser
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

@ABIMarker(VpnForegroundActivatedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnForegroundActivatedEventArgs;{85b465b0-cadb-4d70-ac92-543a24dc9ebc})")
@WinRTByReference(brClass = VpnForegroundActivatedEventArgs.ByReference::class)
public class VpnForegroundActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnForegroundActivatedEventArgs.WithDefault, IActivatedEventArgs.WithDefault,
    IActivatedEventArgsWithUser.WithDefault, IWinRTObject {
  private val __1471276505_Interface: IVpnForegroundActivatedEventArgs.WithDefault by lazy {
    as_1471276505()
  }


  private val __1721660047_Interface: IActivatedEventArgs.WithDefault by lazy {
    as_1721660047()
  }


  private val __988512_Interface: IActivatedEventArgsWithUser.WithDefault by lazy {
    as_988512()
  }


  public override val __1471276505_Ptr: JNAPointer? by lazy {
    __1471276505_Interface.__1471276505_Ptr
  }


  public override val __1721660047_Ptr: JNAPointer? by lazy {
    __1721660047_Interface.__1721660047_Ptr
  }


  public override val __988512_Ptr: JNAPointer? by lazy {
    __988512_Interface.__988512_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1471276505_Interface, __1721660047_Interface, __988512_Interface)

  private fun as_1471276505(): IVpnForegroundActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVpnForegroundActivatedEventArgs.ABI.makeIVpnForegroundActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnForegroundActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnForegroundActivatedEventArgs.ABI.makeIVpnForegroundActivatedEventArgs(ref.value))
  }

  private fun as_1721660047(): IActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgs.ABI.makeIActivatedEventArgs(ref.value))
  }

  private fun as_988512(): IActivatedEventArgsWithUser.WithDefault {
    if(pointer == NULL) {
      return(IActivatedEventArgsWithUser.ABI.makeIActivatedEventArgsWithUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivatedEventArgsWithUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivatedEventArgsWithUser.ABI.makeIActivatedEventArgsWithUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnForegroundActivatedEventArgs> {
    public override fun getValue() = VpnForegroundActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VpnForegroundActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnForegroundActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VpnForegroundActivatedEventArgs {
      val address = segment.toRawLongValue()
      return VpnForegroundActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VpnForegroundActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
