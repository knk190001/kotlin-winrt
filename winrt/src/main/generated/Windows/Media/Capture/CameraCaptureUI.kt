package Windows.Media.Capture

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

@ABIMarker(CameraCaptureUI.ABI::class)
@Signature("rc(Windows.Media.Capture.CameraCaptureUI;{48587540-6f93-4bb4-b8f3-e89e48948c91})")
@WinRTByReference(brClass = CameraCaptureUI.ByReference::class)
public class CameraCaptureUI(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICameraCaptureUI.WithDefault, IWinRTObject {
  private val __153247779_Interface: ICameraCaptureUI.WithDefault by lazy {
    as_153247779()
  }


  public override val __153247779_Ptr: JNAPointer? by lazy {
    __153247779_Interface.__153247779_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__153247779_Interface)

  public constructor() : this(ABI.activate())

  private fun as_153247779(): ICameraCaptureUI.WithDefault {
    if(pointer == NULL) {
      return(ICameraCaptureUI.ABI.makeICameraCaptureUI(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICameraCaptureUI>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICameraCaptureUI.ABI.makeICameraCaptureUI(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CameraCaptureUI> {
    public override fun getValue() = CameraCaptureUI(pointer.getPointer(0))

    public fun setValue(value: CameraCaptureUI): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CameraCaptureUI, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Capture.CameraCaptureUI".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CameraCaptureUI {
      val address = segment.toRawLongValue()
      return CameraCaptureUI(Pointer(address))
    }

    public override fun toNative(obj: CameraCaptureUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
