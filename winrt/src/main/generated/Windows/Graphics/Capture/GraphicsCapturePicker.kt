package Windows.Graphics.Capture

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

@ABIMarker(GraphicsCapturePicker.ABI::class)
@Signature("rc(Windows.Graphics.Capture.GraphicsCapturePicker;{5a1711b3-ad79-4b4a-9336-1318fdde3539})")
@WinRTByReference(brClass = GraphicsCapturePicker.ByReference::class)
public class GraphicsCapturePicker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGraphicsCapturePicker.WithDefault, IWinRTObject {
  private val __280914322_Interface: IGraphicsCapturePicker.WithDefault by lazy {
    as_280914322()
  }


  public override val __280914322_Ptr: JNAPointer? by lazy {
    __280914322_Interface.__280914322_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__280914322_Interface)

  public constructor() : this(ABI.activate())

  private fun as_280914322(): IGraphicsCapturePicker.WithDefault {
    if(pointer == NULL) {
      return(IGraphicsCapturePicker.ABI.makeIGraphicsCapturePicker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGraphicsCapturePicker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGraphicsCapturePicker.ABI.makeIGraphicsCapturePicker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GraphicsCapturePicker> {
    public override fun getValue() = GraphicsCapturePicker(pointer.getPointer(0))

    public fun setValue(value: GraphicsCapturePicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GraphicsCapturePicker, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Capture.GraphicsCapturePicker".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): GraphicsCapturePicker {
      val address = segment.toRawLongValue()
      return GraphicsCapturePicker(Pointer(address))
    }

    public override fun toNative(obj: GraphicsCapturePicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
