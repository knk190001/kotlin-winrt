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

@ABIMarker(ThicknessHelper.ABI::class)
@Signature("rc(Windows.UI.Xaml.ThicknessHelper;{a86bae4b-1e8f-4eeb-9013-0b2838a97b34})")
@WinRTByReference(brClass = ThicknessHelper.ByReference::class)
public class ThicknessHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IThicknessHelper.WithDefault, IWinRTObject {
  private val __462886832_Interface: IThicknessHelper.WithDefault by lazy {
    as_462886832()
  }


  public override val __462886832_Ptr: JNAPointer? by lazy {
    __462886832_Interface.__462886832_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__462886832_Interface)

  private fun as_462886832(): IThicknessHelper.WithDefault {
    if(pointer == NULL) {
      return(IThicknessHelper.ABI.makeIThicknessHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IThicknessHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThicknessHelper.ABI.makeIThicknessHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ThicknessHelper> {
    public override fun getValue() = ThicknessHelper(pointer.getPointer(0))

    public fun setValue(value: ThicknessHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ThicknessHelper, MemoryAddress> {
    public val IThicknessHelperStatics_Instance: IThicknessHelperStatics by lazy {
      createIThicknessHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIThicknessHelperStatics(): IThicknessHelperStatics {
      val refiid = Guid.REFIID(IThicknessHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.ThicknessHelper".toHandle(),refiid,interfacePtr)
      val result = IThicknessHelperStatics.ABI.makeIThicknessHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ThicknessHelper {
      val address = segment.toRawLongValue()
      return ThicknessHelper(Pointer(address))
    }

    public override fun toNative(obj: ThicknessHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromLengths(
      left: Double,
      top: Double,
      right: Double,
      bottom: Double
    ) = ABI.IThicknessHelperStatics_Instance.FromLengths(left, top, right, bottom)

    public fun FromUniformLength(uniformLength: Double) =
        ABI.IThicknessHelperStatics_Instance.FromUniformLength(uniformLength)
  }
}
