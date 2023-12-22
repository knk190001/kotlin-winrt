package Windows.Networking.Vpn

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(VpnRouteAssignment.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnRouteAssignment;{db64de22-ce39-4a76-9550-f61039f80e48})")
@WinRTByReference(brClass = VpnRouteAssignment.ByReference::class)
public class VpnRouteAssignment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnRouteAssignment.WithDefault, IWinRTObject {
  private val __1338935162_Interface: IVpnRouteAssignment.WithDefault by lazy {
    as_1338935162()
  }


  public override val __1338935162_Ptr: JNAPointer? by lazy {
    __1338935162_Interface.__1338935162_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1338935162_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1338935162(): IVpnRouteAssignment.WithDefault {
    if(pointer == NULL) {
      return(IVpnRouteAssignment.ABI.makeIVpnRouteAssignment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnRouteAssignment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnRouteAssignment.ABI.makeIVpnRouteAssignment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnRouteAssignment> {
    public override fun getValue() = VpnRouteAssignment(pointer.getPointer(0))

    public fun setValue(value: VpnRouteAssignment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnRouteAssignment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnRouteAssignment".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): VpnRouteAssignment {
      val address = segment.toRawLongValue()
      return VpnRouteAssignment(Pointer(address))
    }

    public override fun toNative(obj: VpnRouteAssignment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
