package Microsoft.UI.Input.Experimental

import Microsoft.UI.Input.IPointerPointTransform
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ExpPointerPoint.ABI::class)
@Signature("rc(Microsoft.UI.Input.Experimental.ExpPointerPoint;{f9dc0c95-f286-5a1c-b038-7ff84a4e4af5})")
@WinRTByReference(brClass = ExpPointerPoint.ByReference::class)
public class ExpPointerPoint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExpPointerPoint.WithDefault, IWinRTObject {
  private val __1157994035_Interface: IExpPointerPoint.WithDefault by lazy {
    as_1157994035()
  }


  public override val __1157994035_Ptr: JNAPointer? by lazy {
    __1157994035_Interface.__1157994035_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1157994035_Interface)

  private fun as_1157994035(): IExpPointerPoint.WithDefault {
    if(pointer == NULL) {
      return(IExpPointerPoint.ABI.makeIExpPointerPoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpPointerPoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpPointerPoint.ABI.makeIExpPointerPoint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpPointerPoint> {
    public override fun getValue() = ExpPointerPoint(pointer.getPointer(0))

    public fun setValue(value: ExpPointerPoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpPointerPoint, MemoryAddress> {
    public val IExpPointerPointStatics_Instance: IExpPointerPointStatics by lazy {
      createIExpPointerPointStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIExpPointerPointStatics(): IExpPointerPointStatics {
      val refiid = Guid.REFIID(IExpPointerPointStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.Experimental.ExpPointerPoint".toHandle(),refiid,interfacePtr)
      val result = IExpPointerPointStatics.ABI.makeIExpPointerPointStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ExpPointerPoint {
      val address = segment.toRawLongValue()
      return ExpPointerPoint(Pointer(address))
    }

    public override fun toNative(obj: ExpPointerPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCurrentPoint(pointerId: WinDef.UINT) =
        ABI.IExpPointerPointStatics_Instance.GetCurrentPoint(pointerId)

    public fun GetCurrentPointTransformed(pointerId: WinDef.UINT, transform: IPointerPointTransform)
        = ABI.IExpPointerPointStatics_Instance.GetCurrentPointTransformed(pointerId, transform)

    public fun GetIntermediatePoints(pointerId: WinDef.UINT) =
        ABI.IExpPointerPointStatics_Instance.GetIntermediatePoints(pointerId)

    public fun GetIntermediatePointsTransformed(pointerId: WinDef.UINT,
        transform: IPointerPointTransform) =
        ABI.IExpPointerPointStatics_Instance.GetIntermediatePointsTransformed(pointerId, transform)
  }
}
