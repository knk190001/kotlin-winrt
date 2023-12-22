package Windows.UI.Xaml

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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GridLengthHelper.ABI::class)
@Signature("rc(Windows.UI.Xaml.GridLengthHelper;{7a826ce1-07a0-4083-b6d1-b1d917b976ac})")
@WinRTByReference(brClass = GridLengthHelper.ByReference::class)
public class GridLengthHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGridLengthHelper.WithDefault, IWinRTObject {
  private val __1617757460_Interface: IGridLengthHelper.WithDefault by lazy {
    as_1617757460()
  }


  public override val __1617757460_Ptr: JNAPointer? by lazy {
    __1617757460_Interface.__1617757460_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1617757460_Interface)

  private fun as_1617757460(): IGridLengthHelper.WithDefault {
    if(pointer == NULL) {
      return(IGridLengthHelper.ABI.makeIGridLengthHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridLengthHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridLengthHelper.ABI.makeIGridLengthHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GridLengthHelper> {
    public override fun getValue() = GridLengthHelper(pointer.getPointer(0))

    public fun setValue(value: GridLengthHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridLengthHelper, MemoryAddress> {
    public val IGridLengthHelperStatics_Instance: IGridLengthHelperStatics by lazy {
      createIGridLengthHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridLengthHelperStatics(): IGridLengthHelperStatics {
      val refiid = Guid.REFIID(IGridLengthHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.GridLengthHelper".toHandle(),refiid,interfacePtr)
      val result = IGridLengthHelperStatics.ABI.makeIGridLengthHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GridLengthHelper {
      val address = segment.toRawLongValue()
      return GridLengthHelper(Pointer(address))
    }

    public override fun toNative(obj: GridLengthHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Auto() = ABI.IGridLengthHelperStatics_Instance.get_Auto()

    public fun FromPixels(pixels: Double) = ABI.IGridLengthHelperStatics_Instance.FromPixels(pixels)

    public fun FromValueAndType(value: Double, type: GridUnitType) =
        ABI.IGridLengthHelperStatics_Instance.FromValueAndType(value, type)

    public fun GetIsAbsolute(target: GridLength) =
        ABI.IGridLengthHelperStatics_Instance.GetIsAbsolute(target)

    public fun GetIsAuto(target: GridLength) =
        ABI.IGridLengthHelperStatics_Instance.GetIsAuto(target)

    public fun GetIsStar(target: GridLength) =
        ABI.IGridLengthHelperStatics_Instance.GetIsStar(target)

    public fun Equals(target: GridLength, value: GridLength) =
        ABI.IGridLengthHelperStatics_Instance.Equals(target, value)
  }
}
