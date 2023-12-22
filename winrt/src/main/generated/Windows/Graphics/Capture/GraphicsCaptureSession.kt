package Windows.Graphics.Capture

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(GraphicsCaptureSession.ABI::class)
@Signature("rc(Windows.Graphics.Capture.GraphicsCaptureSession;{814e42a9-f70f-4ad7-939b-fddcc6eb880d})")
@WinRTByReference(brClass = GraphicsCaptureSession.ByReference::class)
public class GraphicsCaptureSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGraphicsCaptureSession.WithDefault, IGraphicsCaptureSession2.WithDefault,
    IGraphicsCaptureSession3.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1850363722_Interface: IGraphicsCaptureSession.WithDefault by lazy {
    as_1850363722()
  }


  private val __1526700484_Interface: IGraphicsCaptureSession2.WithDefault by lazy {
    as_1526700484()
  }


  private val __1526700483_Interface: IGraphicsCaptureSession3.WithDefault by lazy {
    as_1526700483()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1850363722_Ptr: JNAPointer? by lazy {
    __1850363722_Interface.__1850363722_Ptr
  }


  public override val __1526700484_Ptr: JNAPointer? by lazy {
    __1526700484_Interface.__1526700484_Ptr
  }


  public override val __1526700483_Ptr: JNAPointer? by lazy {
    __1526700483_Interface.__1526700483_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1850363722_Interface, __1526700484_Interface, __1526700483_Interface,
        __1260617006_Interface)

  private fun as_1850363722(): IGraphicsCaptureSession.WithDefault {
    if(pointer == NULL) {
      return(IGraphicsCaptureSession.ABI.makeIGraphicsCaptureSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGraphicsCaptureSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGraphicsCaptureSession.ABI.makeIGraphicsCaptureSession(ref.value))
  }

  private fun as_1526700484(): IGraphicsCaptureSession2.WithDefault {
    if(pointer == NULL) {
      return(IGraphicsCaptureSession2.ABI.makeIGraphicsCaptureSession2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGraphicsCaptureSession2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGraphicsCaptureSession2.ABI.makeIGraphicsCaptureSession2(ref.value))
  }

  private fun as_1526700483(): IGraphicsCaptureSession3.WithDefault {
    if(pointer == NULL) {
      return(IGraphicsCaptureSession3.ABI.makeIGraphicsCaptureSession3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGraphicsCaptureSession3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGraphicsCaptureSession3.ABI.makeIGraphicsCaptureSession3(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GraphicsCaptureSession> {
    public override fun getValue() = GraphicsCaptureSession(pointer.getPointer(0))

    public fun setValue(value: GraphicsCaptureSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GraphicsCaptureSession, MemoryAddress> {
    public val IGraphicsCaptureSessionStatics_Instance: IGraphicsCaptureSessionStatics by lazy {
      createIGraphicsCaptureSessionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGraphicsCaptureSessionStatics(): IGraphicsCaptureSessionStatics {
      val refiid = Guid.REFIID(IGraphicsCaptureSessionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Capture.GraphicsCaptureSession".toHandle(),refiid,interfacePtr)
      val result =
          IGraphicsCaptureSessionStatics.ABI.makeIGraphicsCaptureSessionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GraphicsCaptureSession {
      val address = segment.toRawLongValue()
      return GraphicsCaptureSession(Pointer(address))
    }

    public override fun toNative(obj: GraphicsCaptureSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.IGraphicsCaptureSessionStatics_Instance.IsSupported()
  }
}
