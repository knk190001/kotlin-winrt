package Windows.Devices.Input

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

@ABIMarker(MouseCapabilities.ABI::class)
@Signature("rc(Windows.Devices.Input.MouseCapabilities;{bca5e023-7dd9-4b6b-9a92-55d43cb38f73})")
@WinRTByReference(brClass = MouseCapabilities.ByReference::class)
public class MouseCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMouseCapabilities.WithDefault, IWinRTObject {
  private val __1095520032_Interface: IMouseCapabilities.WithDefault by lazy {
    as_1095520032()
  }


  public override val __1095520032_Ptr: JNAPointer? by lazy {
    __1095520032_Interface.__1095520032_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1095520032_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1095520032(): IMouseCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IMouseCapabilities.ABI.makeIMouseCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMouseCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMouseCapabilities.ABI.makeIMouseCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MouseCapabilities> {
    public override fun getValue() = MouseCapabilities(pointer.getPointer(0))

    public fun setValue(value: MouseCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MouseCapabilities, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Devices.Input.MouseCapabilities".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MouseCapabilities {
      val address = segment.toRawLongValue()
      return MouseCapabilities(Pointer(address))
    }

    public override fun toNative(obj: MouseCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
