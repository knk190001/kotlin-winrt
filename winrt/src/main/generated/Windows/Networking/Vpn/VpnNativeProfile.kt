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

@ABIMarker(VpnNativeProfile.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnNativeProfile;{a4aee29e-6417-4333-9842-f0a66db69802})")
@WinRTByReference(brClass = VpnNativeProfile.ByReference::class)
public class VpnNativeProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnNativeProfile.WithDefault, IVpnProfile.WithDefault,
    IVpnNativeProfile2.WithDefault, IWinRTObject {
  private val __1016604706_Interface: IVpnNativeProfile.WithDefault by lazy {
    as_1016604706()
  }


  private val __1256391737_Interface: IVpnProfile.WithDefault by lazy {
    as_1256391737()
  }


  private val __1449974864_Interface: IVpnNativeProfile2.WithDefault by lazy {
    as_1449974864()
  }


  public override val __1016604706_Ptr: JNAPointer? by lazy {
    __1016604706_Interface.__1016604706_Ptr
  }


  public override val __1256391737_Ptr: JNAPointer? by lazy {
    __1256391737_Interface.__1256391737_Ptr
  }


  public override val __1449974864_Ptr: JNAPointer? by lazy {
    __1449974864_Interface.__1449974864_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1016604706_Interface, __1256391737_Interface, __1449974864_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1016604706(): IVpnNativeProfile.WithDefault {
    if(pointer == NULL) {
      return(IVpnNativeProfile.ABI.makeIVpnNativeProfile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnNativeProfile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnNativeProfile.ABI.makeIVpnNativeProfile(ref.value))
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

  private fun as_1449974864(): IVpnNativeProfile2.WithDefault {
    if(pointer == NULL) {
      return(IVpnNativeProfile2.ABI.makeIVpnNativeProfile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnNativeProfile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnNativeProfile2.ABI.makeIVpnNativeProfile2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnNativeProfile> {
    public override fun getValue() = VpnNativeProfile(pointer.getPointer(0))

    public fun setValue(value: VpnNativeProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnNativeProfile, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnNativeProfile".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VpnNativeProfile {
      val address = segment.toRawLongValue()
      return VpnNativeProfile(Pointer(address))
    }

    public override fun toNative(obj: VpnNativeProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
