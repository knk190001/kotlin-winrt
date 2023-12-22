package Windows.Media.Devices.Core

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

@ABIMarker(FrameController.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.FrameController;{c16459d9-baef-4052-9177-48aff2af7522})")
@WinRTByReference(brClass = FrameController.ByReference::class)
public class FrameController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFrameController.WithDefault, IFrameController2.WithDefault, IWinRTObject {
  private val __1600570629_Interface: IFrameController.WithDefault by lazy {
    as_1600570629()
  }


  private val __1921918003_Interface: IFrameController2.WithDefault by lazy {
    as_1921918003()
  }


  public override val __1600570629_Ptr: JNAPointer? by lazy {
    __1600570629_Interface.__1600570629_Ptr
  }


  public override val __1921918003_Ptr: JNAPointer? by lazy {
    __1921918003_Interface.__1921918003_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1600570629_Interface, __1921918003_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1600570629(): IFrameController.WithDefault {
    if(pointer == NULL) {
      return(IFrameController.ABI.makeIFrameController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameController.ABI.makeIFrameController(ref.value))
  }

  private fun as_1921918003(): IFrameController2.WithDefault {
    if(pointer == NULL) {
      return(IFrameController2.ABI.makeIFrameController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFrameController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFrameController2.ABI.makeIFrameController2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FrameController> {
    public override fun getValue() = FrameController(pointer.getPointer(0))

    public fun setValue(value: FrameController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FrameController, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Devices.Core.FrameController".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): FrameController {
      val address = segment.toRawLongValue()
      return FrameController(Pointer(address))
    }

    public override fun toNative(obj: FrameController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
