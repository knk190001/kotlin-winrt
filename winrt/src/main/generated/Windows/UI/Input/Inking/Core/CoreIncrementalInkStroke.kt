package Windows.UI.Input.Inking.Core

import Windows.Foundation.Numerics.Matrix3x2
import Windows.UI.Input.Inking.Core.ICoreIncrementalInkStrokeFactory.ABI.IID
import Windows.UI.Input.Inking.InkDrawingAttributes
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

@ABIMarker(CoreIncrementalInkStroke.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.Core.CoreIncrementalInkStroke;{fda015d3-9d66-4f7d-a57f-cc70b9cfaa76})")
@WinRTByReference(brClass = CoreIncrementalInkStroke.ByReference::class)
public class CoreIncrementalInkStroke(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreIncrementalInkStroke.WithDefault, IWinRTObject {
  private val __1044058418_Interface: ICoreIncrementalInkStroke.WithDefault by lazy {
    as_1044058418()
  }


  public override val __1044058418_Ptr: JNAPointer? by lazy {
    __1044058418_Interface.__1044058418_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1044058418_Interface)

  public constructor(drawingAttributes: InkDrawingAttributes, pointTransform: Matrix3x2) :
      this(ABI.activate(drawingAttributes, pointTransform))

  private fun as_1044058418(): ICoreIncrementalInkStroke.WithDefault {
    if(pointer == NULL) {
      return(ICoreIncrementalInkStroke.ABI.makeICoreIncrementalInkStroke(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreIncrementalInkStroke>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreIncrementalInkStroke.ABI.makeICoreIncrementalInkStroke(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreIncrementalInkStroke> {
    public override fun getValue() = CoreIncrementalInkStroke(pointer.getPointer(0))

    public fun setValue(value: CoreIncrementalInkStroke): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreIncrementalInkStroke, MemoryAddress> {
    public val ICoreIncrementalInkStrokeFactory_Instance: ICoreIncrementalInkStrokeFactory by lazy {
      createICoreIncrementalInkStrokeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreIncrementalInkStrokeFactory(): ICoreIncrementalInkStrokeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.Core.CoreIncrementalInkStroke".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICoreIncrementalInkStrokeFactory.ABI.makeICoreIncrementalInkStrokeFactory(factoryActivatorPtr.value))
    }

    public fun activate(drawingAttributes: InkDrawingAttributes, pointTransform: Matrix3x2):
        JNAPointer? = ICoreIncrementalInkStrokeFactory_Instance.Create(drawingAttributes,
        pointTransform)?.pointer

    public override fun fromNative(segment: MemoryAddress): CoreIncrementalInkStroke {
      val address = segment.toRawLongValue()
      return CoreIncrementalInkStroke(Pointer(address))
    }

    public override fun toNative(obj: CoreIncrementalInkStroke): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
