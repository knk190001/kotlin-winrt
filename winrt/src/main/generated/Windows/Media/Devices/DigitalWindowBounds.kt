package Windows.Media.Devices

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

@ABIMarker(DigitalWindowBounds.ABI::class)
@Signature("rc(Windows.Media.Devices.DigitalWindowBounds;{dd4f21dd-d173-5c6b-8c25-bdd26d5122b1})")
@WinRTByReference(brClass = DigitalWindowBounds.ByReference::class)
public class DigitalWindowBounds(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDigitalWindowBounds.WithDefault, IWinRTObject {
  private val __590330428_Interface: IDigitalWindowBounds.WithDefault by lazy {
    as_590330428()
  }


  public override val __590330428_Ptr: JNAPointer? by lazy {
    __590330428_Interface.__590330428_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__590330428_Interface)

  public constructor() : this(ABI.activate())

  private fun as_590330428(): IDigitalWindowBounds.WithDefault {
    if(pointer == NULL) {
      return(IDigitalWindowBounds.ABI.makeIDigitalWindowBounds(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDigitalWindowBounds>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDigitalWindowBounds.ABI.makeIDigitalWindowBounds(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DigitalWindowBounds> {
    public override fun getValue() = DigitalWindowBounds(pointer.getPointer(0))

    public fun setValue(value: DigitalWindowBounds): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DigitalWindowBounds, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Devices.DigitalWindowBounds".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DigitalWindowBounds {
      val address = segment.toRawLongValue()
      return DigitalWindowBounds(Pointer(address))
    }

    public override fun toNative(obj: DigitalWindowBounds): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
