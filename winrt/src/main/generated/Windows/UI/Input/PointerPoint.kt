package Windows.UI.Input

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

@ABIMarker(PointerPoint.ABI::class)
@Signature("rc(Windows.UI.Input.PointerPoint;{e995317d-7296-42d9-8233-c5be73b74a4a})")
@WinRTByReference(brClass = PointerPoint.ByReference::class)
public class PointerPoint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPointerPoint.WithDefault, IWinRTObject {
  private val __1176154847_Interface: IPointerPoint.WithDefault by lazy {
    as_1176154847()
  }


  public override val __1176154847_Ptr: JNAPointer? by lazy {
    __1176154847_Interface.__1176154847_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1176154847_Interface)

  private fun as_1176154847(): IPointerPoint.WithDefault {
    if(pointer == NULL) {
      return(IPointerPoint.ABI.makeIPointerPoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerPoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerPoint.ABI.makeIPointerPoint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PointerPoint> {
    public override fun getValue() = PointerPoint(pointer.getPointer(0))

    public fun setValue(value: PointerPoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerPoint, MemoryAddress> {
    public val IPointerPointStatics_Instance: IPointerPointStatics by lazy {
      createIPointerPointStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPointerPointStatics(): IPointerPointStatics {
      val refiid = Guid.REFIID(IPointerPointStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.PointerPoint".toHandle(),refiid,interfacePtr)
      val result = IPointerPointStatics.ABI.makeIPointerPointStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PointerPoint {
      val address = segment.toRawLongValue()
      return PointerPoint(Pointer(address))
    }

    public override fun toNative(obj: PointerPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetCurrentPoint(pointerId: WinDef.UINT) =
        ABI.IPointerPointStatics_Instance.GetCurrentPoint(pointerId)

    public fun GetIntermediatePoints(pointerId: WinDef.UINT) =
        ABI.IPointerPointStatics_Instance.GetIntermediatePoints(pointerId)

    public fun GetCurrentPoint(pointerId: WinDef.UINT, transform: IPointerPointTransform) =
        ABI.IPointerPointStatics_Instance.GetCurrentPoint(pointerId, transform)

    public fun GetIntermediatePoints(pointerId: WinDef.UINT, transform: IPointerPointTransform) =
        ABI.IPointerPointStatics_Instance.GetIntermediatePoints(pointerId, transform)
  }
}
