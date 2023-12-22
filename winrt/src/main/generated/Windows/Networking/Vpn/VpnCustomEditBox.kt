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

@ABIMarker(VpnCustomEditBox.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnCustomEditBox;{3002d9a0-cfbf-4c0b-8f3c-66f503c20b39})")
@WinRTByReference(brClass = VpnCustomEditBox.ByReference::class)
public class VpnCustomEditBox(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnCustomEditBox.WithDefault, IVpnCustomPrompt.WithDefault, IWinRTObject {
  private val __1412312384_Interface: IVpnCustomEditBox.WithDefault by lazy {
    as_1412312384()
  }


  private val __235034533_Interface: IVpnCustomPrompt.WithDefault by lazy {
    as_235034533()
  }


  public override val __1412312384_Ptr: JNAPointer? by lazy {
    __1412312384_Interface.__1412312384_Ptr
  }


  public override val __235034533_Ptr: JNAPointer? by lazy {
    __235034533_Interface.__235034533_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1412312384_Interface, __235034533_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1412312384(): IVpnCustomEditBox.WithDefault {
    if(pointer == NULL) {
      return(IVpnCustomEditBox.ABI.makeIVpnCustomEditBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnCustomEditBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnCustomEditBox.ABI.makeIVpnCustomEditBox(ref.value))
  }

  private fun as_235034533(): IVpnCustomPrompt.WithDefault {
    if(pointer == NULL) {
      return(IVpnCustomPrompt.ABI.makeIVpnCustomPrompt(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnCustomPrompt>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnCustomPrompt.ABI.makeIVpnCustomPrompt(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VpnCustomEditBox> {
    public override fun getValue() = VpnCustomEditBox(pointer.getPointer(0))

    public fun setValue(value: VpnCustomEditBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnCustomEditBox, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnCustomEditBox".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VpnCustomEditBox {
      val address = segment.toRawLongValue()
      return VpnCustomEditBox(Pointer(address))
    }

    public override fun toNative(obj: VpnCustomEditBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
