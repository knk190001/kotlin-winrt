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

@ABIMarker(TouchCapabilities.ABI::class)
@Signature("rc(Windows.Devices.Input.TouchCapabilities;{20dd55f9-13f1-46c8-9285-2c05fa3eda6f})")
@WinRTByReference(brClass = TouchCapabilities.ByReference::class)
public class TouchCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITouchCapabilities.WithDefault, IWinRTObject {
  private val __597547706_Interface: ITouchCapabilities.WithDefault by lazy {
    as_597547706()
  }


  public override val __597547706_Ptr: JNAPointer? by lazy {
    __597547706_Interface.__597547706_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__597547706_Interface)

  public constructor() : this(ABI.activate())

  private fun as_597547706(): ITouchCapabilities.WithDefault {
    if(pointer == NULL) {
      return(ITouchCapabilities.ABI.makeITouchCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITouchCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITouchCapabilities.ABI.makeITouchCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TouchCapabilities> {
    public override fun getValue() = TouchCapabilities(pointer.getPointer(0))

    public fun setValue(value: TouchCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TouchCapabilities, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Devices.Input.TouchCapabilities".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): TouchCapabilities {
      val address = segment.toRawLongValue()
      return TouchCapabilities(Pointer(address))
    }

    public override fun toNative(obj: TouchCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
