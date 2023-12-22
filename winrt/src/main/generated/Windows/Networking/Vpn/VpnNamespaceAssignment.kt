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

@ABIMarker(VpnNamespaceAssignment.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnNamespaceAssignment;{d7f7db18-307d-4c0e-bd62-8fa270bbadd6})")
@WinRTByReference(brClass = VpnNamespaceAssignment.ByReference::class)
public class VpnNamespaceAssignment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnNamespaceAssignment.WithDefault, IWinRTObject {
  private val __978901736_Interface: IVpnNamespaceAssignment.WithDefault by lazy {
    as_978901736()
  }


  public override val __978901736_Ptr: JNAPointer? by lazy {
    __978901736_Interface.__978901736_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__978901736_Interface)

  public constructor() : this(ABI.activate())

  private fun as_978901736(): IVpnNamespaceAssignment.WithDefault {
    if(pointer == NULL) {
      return(IVpnNamespaceAssignment.ABI.makeIVpnNamespaceAssignment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnNamespaceAssignment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnNamespaceAssignment.ABI.makeIVpnNamespaceAssignment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnNamespaceAssignment> {
    public override fun getValue() = VpnNamespaceAssignment(pointer.getPointer(0))

    public fun setValue(value: VpnNamespaceAssignment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnNamespaceAssignment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnNamespaceAssignment".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VpnNamespaceAssignment {
      val address = segment.toRawLongValue()
      return VpnNamespaceAssignment(Pointer(address))
    }

    public override fun toNative(obj: VpnNamespaceAssignment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
