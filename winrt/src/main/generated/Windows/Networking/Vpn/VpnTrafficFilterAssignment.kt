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

@ABIMarker(VpnTrafficFilterAssignment.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnTrafficFilterAssignment;{56ccd45c-e664-471e-89cd-601603b9e0f3})")
@WinRTByReference(brClass = VpnTrafficFilterAssignment.ByReference::class)
public class VpnTrafficFilterAssignment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnTrafficFilterAssignment.WithDefault, IWinRTObject {
  private val __750100718_Interface: IVpnTrafficFilterAssignment.WithDefault by lazy {
    as_750100718()
  }


  public override val __750100718_Ptr: JNAPointer? by lazy {
    __750100718_Interface.__750100718_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__750100718_Interface)

  public constructor() : this(ABI.activate())

  private fun as_750100718(): IVpnTrafficFilterAssignment.WithDefault {
    if(pointer == NULL) {
      return(IVpnTrafficFilterAssignment.ABI.makeIVpnTrafficFilterAssignment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnTrafficFilterAssignment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnTrafficFilterAssignment.ABI.makeIVpnTrafficFilterAssignment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnTrafficFilterAssignment> {
    public override fun getValue() = VpnTrafficFilterAssignment(pointer.getPointer(0))

    public fun setValue(value: VpnTrafficFilterAssignment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnTrafficFilterAssignment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnTrafficFilterAssignment".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VpnTrafficFilterAssignment {
      val address = segment.toRawLongValue()
      return VpnTrafficFilterAssignment(Pointer(address))
    }

    public override fun toNative(obj: VpnTrafficFilterAssignment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
