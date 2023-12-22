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

@ABIMarker(VpnCustomPromptOptionSelector.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnCustomPromptOptionSelector;{3b8f34d9-8ec1-4e95-9a4e-7ba64d38f330})")
@WinRTByReference(brClass = VpnCustomPromptOptionSelector.ByReference::class)
public class VpnCustomPromptOptionSelector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnCustomPromptOptionSelector.WithDefault,
    IVpnCustomPromptElement.WithDefault, IWinRTObject {
  private val __1698298489_Interface: IVpnCustomPromptOptionSelector.WithDefault by lazy {
    as_1698298489()
  }


  private val __104557463_Interface: IVpnCustomPromptElement.WithDefault by lazy {
    as_104557463()
  }


  public override val __1698298489_Ptr: JNAPointer? by lazy {
    __1698298489_Interface.__1698298489_Ptr
  }


  public override val __104557463_Ptr: JNAPointer? by lazy {
    __104557463_Interface.__104557463_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1698298489_Interface, __104557463_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1698298489(): IVpnCustomPromptOptionSelector.WithDefault {
    if(pointer == NULL) {
      return(IVpnCustomPromptOptionSelector.ABI.makeIVpnCustomPromptOptionSelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnCustomPromptOptionSelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnCustomPromptOptionSelector.ABI.makeIVpnCustomPromptOptionSelector(ref.value))
  }

  private fun as_104557463(): IVpnCustomPromptElement.WithDefault {
    if(pointer == NULL) {
      return(IVpnCustomPromptElement.ABI.makeIVpnCustomPromptElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnCustomPromptElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnCustomPromptElement.ABI.makeIVpnCustomPromptElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnCustomPromptOptionSelector> {
    public override fun getValue() = VpnCustomPromptOptionSelector(pointer.getPointer(0))

    public fun setValue(value: VpnCustomPromptOptionSelector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnCustomPromptOptionSelector, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnCustomPromptOptionSelector".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VpnCustomPromptOptionSelector {
      val address = segment.toRawLongValue()
      return VpnCustomPromptOptionSelector(Pointer(address))
    }

    public override fun toNative(obj: VpnCustomPromptOptionSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
