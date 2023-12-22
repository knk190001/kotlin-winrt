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

@ABIMarker(VpnCustomPromptBooleanInput.ABI::class)
@Signature("rc(Windows.Networking.Vpn.VpnCustomPromptBooleanInput;{c4c9a69e-ff47-4527-9f27-a49292019979})")
@WinRTByReference(brClass = VpnCustomPromptBooleanInput.ByReference::class)
public class VpnCustomPromptBooleanInput(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVpnCustomPromptBooleanInput.WithDefault, IVpnCustomPromptElement.WithDefault,
    IWinRTObject {
  private val __660123847_Interface: IVpnCustomPromptBooleanInput.WithDefault by lazy {
    as_660123847()
  }


  private val __104557463_Interface: IVpnCustomPromptElement.WithDefault by lazy {
    as_104557463()
  }


  public override val __660123847_Ptr: JNAPointer? by lazy {
    __660123847_Interface.__660123847_Ptr
  }


  public override val __104557463_Ptr: JNAPointer? by lazy {
    __104557463_Interface.__104557463_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__660123847_Interface, __104557463_Interface)

  public constructor() : this(ABI.activate())

  private fun as_660123847(): IVpnCustomPromptBooleanInput.WithDefault {
    if(pointer == NULL) {
      return(IVpnCustomPromptBooleanInput.ABI.makeIVpnCustomPromptBooleanInput(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVpnCustomPromptBooleanInput>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVpnCustomPromptBooleanInput.ABI.makeIVpnCustomPromptBooleanInput(ref.value))
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
      IByReference<VpnCustomPromptBooleanInput> {
    public override fun getValue() = VpnCustomPromptBooleanInput(pointer.getPointer(0))

    public fun setValue(value: VpnCustomPromptBooleanInput): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VpnCustomPromptBooleanInput, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Vpn.VpnCustomPromptBooleanInput".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VpnCustomPromptBooleanInput {
      val address = segment.toRawLongValue()
      return VpnCustomPromptBooleanInput(Pointer(address))
    }

    public override fun toNative(obj: VpnCustomPromptBooleanInput): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
