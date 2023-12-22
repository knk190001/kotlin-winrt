package Windows.UI.Input.Inking

import Windows.Foundation.Point
import Windows.UI.Input.Inking.IInkPointFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Float
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InkPoint.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkPoint;{9f87272b-858c-46a5-9b41-d195970459fd})")
@WinRTByReference(brClass = InkPoint.ByReference::class)
public class InkPoint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkPoint.WithDefault, IInkPoint2.WithDefault, IWinRTObject {
  private val __441255140_Interface: IInkPoint.WithDefault by lazy {
    as_441255140()
  }


  private val __794007502_Interface: IInkPoint2.WithDefault by lazy {
    as_794007502()
  }


  public override val __441255140_Ptr: JNAPointer? by lazy {
    __441255140_Interface.__441255140_Ptr
  }


  public override val __794007502_Ptr: JNAPointer? by lazy {
    __794007502_Interface.__794007502_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__441255140_Interface, __794007502_Interface)

  public constructor(position: Point, pressure: Float) : this(ABI.activate(position, pressure))

  public constructor(
    position: Point,
    pressure: Float,
    tiltX: Float,
    tiltY: Float,
    timestamp: WinDef.ULONG
  ) : this(ABI.activate(position, pressure, tiltX, tiltY, timestamp))

  private fun as_441255140(): IInkPoint.WithDefault {
    if(pointer == NULL) {
      return(IInkPoint.ABI.makeIInkPoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPoint.ABI.makeIInkPoint(ref.value))
  }

  private fun as_794007502(): IInkPoint2.WithDefault {
    if(pointer == NULL) {
      return(IInkPoint2.ABI.makeIInkPoint2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkPoint2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkPoint2.ABI.makeIInkPoint2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<InkPoint> {
    public override fun getValue() = InkPoint(pointer.getPointer(0))

    public fun setValue(value: InkPoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkPoint, MemoryAddress> {
    public val IInkPointFactory_Instance: IInkPointFactory by lazy {
      createIInkPointFactory()
    }


    public val IInkPointFactory2_Instance: IInkPointFactory2 by lazy {
      createIInkPointFactory2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkPointFactory(): IInkPointFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkPoint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkPointFactory.ABI.makeIInkPointFactory(factoryActivatorPtr.value))
    }

    public fun createIInkPointFactory2(): IInkPointFactory2 {
      val refiid = Guid.REFIID(IInkPointFactory2.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Inking.InkPoint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkPointFactory2.ABI.makeIInkPointFactory2(factoryActivatorPtr.value))
    }

    public fun activate(position: Point, pressure: Float): JNAPointer? =
        IInkPointFactory_Instance.CreateInkPoint(position, pressure)?.pointer

    public fun activate(
      position: Point,
      pressure: Float,
      tiltX: Float,
      tiltY: Float,
      timestamp: WinDef.ULONG
    ): JNAPointer? = IInkPointFactory2_Instance.CreateInkPointWithTiltAndTimestamp(position,
        pressure, tiltX, tiltY, timestamp)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkPoint {
      val address = segment.toRawLongValue()
      return InkPoint(Pointer(address))
    }

    public override fun toNative(obj: InkPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
