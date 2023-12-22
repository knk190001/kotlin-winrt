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

@ABIMarker(VpnPlugInProfile.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnPlugInProfile;{0edf0da4-4f00-4589-8d7b-4bf988f6542c})")
@WinRTByReference(brClass = VpnPlugInProfile.ByReference::class)
public class VpnPlugInProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnPlugInProfile.WithDefault, IVpnProfile.WithDefault,
    IVpnPlugInProfile2.WithDefault, IWinRTObject {
  private val __1317719706_Interface: IVpnPlugInProfile.WithDefault by lazy {
    as_1317719706()
  }


  private val __1256391737_Interface: IVpnProfile.WithDefault by lazy {
    as_1256391737()
  }


  private val __2100362124_Interface: IVpnPlugInProfile2.WithDefault by lazy {
    as_2100362124()
  }


  public override val __1317719706_Ptr: JNAPointer? by lazy {
    __1317719706_Interface.__1317719706_Ptr
  }


  public override val __1256391737_Ptr: JNAPointer? by lazy {
    __1256391737_Interface.__1256391737_Ptr
  }


  public override val __2100362124_Ptr: JNAPointer? by lazy {
    __2100362124_Interface.__2100362124_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1317719706_Interface, __1256391737_Interface, __2100362124_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1317719706(): IVpnPlugInProfile.WithDefault {
    if(pointer == NULL) {
      return(IVpnPlugInProfile.ABI.makeIVpnPlugInProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnPlugInProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnPlugInProfile.ABI.makeIVpnPlugInProfile(ref.value))
  }

  private fun as_1256391737(): IVpnProfile.WithDefault {
    if(pointer == NULL) {
      return(IVpnProfile.ABI.makeIVpnProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnProfile.ABI.makeIVpnProfile(ref.value))
  }

  private fun as_2100362124(): IVpnPlugInProfile2.WithDefault {
    if(pointer == NULL) {
      return(IVpnPlugInProfile2.ABI.makeIVpnPlugInProfile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnPlugInProfile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnPlugInProfile2.ABI.makeIVpnPlugInProfile2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnPlugInProfile> {
    public override fun getValue() = VpnPlugInProfile(pointer.getPointer(0))

    public fun setValue(value: VpnPlugInProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnPlugInProfile, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnPlugInProfile".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VpnPlugInProfile {
      val address = segment.toRawLongValue()
      return VpnPlugInProfile(Pointer(address))
    }

    public override fun toNative(obj: VpnPlugInProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
