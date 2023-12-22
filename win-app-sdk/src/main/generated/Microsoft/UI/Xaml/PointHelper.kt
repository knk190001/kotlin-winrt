package Microsoft.UI.Xaml

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
import kotlin.Float
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PointHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.PointHelper;{06fcc7a4-6099-5f2e-83a5-f3be0e2c90aa})")
@WinRTByReference(brClass = PointHelper.ByReference::class)
public class PointHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPointHelper.WithDefault, IWinRTObject {
  private val __1776153929_Interface: IPointHelper.WithDefault by lazy {
    as_1776153929()
  }


  public override val __1776153929_Ptr: JNAPointer? by lazy {
    __1776153929_Interface.__1776153929_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1776153929_Interface)

  private fun as_1776153929(): IPointHelper.WithDefault {
    if(pointer == NULL) {
      return(IPointHelper.ABI.makeIPointHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointHelper.ABI.makeIPointHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PointHelper> {
    public override fun getValue() = PointHelper(pointer.getPointer(0))

    public fun setValue(value: PointHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointHelper, MemoryAddress> {
    public val IPointHelperStatics_Instance: IPointHelperStatics by lazy {
      createIPointHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPointHelperStatics(): IPointHelperStatics {
      val refiid = Guid.REFIID(IPointHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.PointHelper".toHandle(),refiid,interfacePtr)
      val result = IPointHelperStatics.ABI.makeIPointHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PointHelper {
      val address = segment.toRawLongValue()
      return PointHelper(Pointer(address))
    }

    public override fun toNative(obj: PointHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromCoordinates(x: Float, y: Float) =
        ABI.IPointHelperStatics_Instance.FromCoordinates(x, y)
  }
}
