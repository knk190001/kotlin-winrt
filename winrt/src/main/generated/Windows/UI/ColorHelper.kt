package Windows.UI

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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ColorHelper.ABI::class)
@Signature("rc(Windows.UI.ColorHelper;{193cfbe7-65c7-4540-ad08-6283ba76879a})")
@WinRTByReference(brClass = ColorHelper.ByReference::class)
public class ColorHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IColorHelper.WithDefault, IWinRTObject {
  private val __1300964249_Interface: IColorHelper.WithDefault by lazy {
    as_1300964249()
  }


  public override val __1300964249_Ptr: JNAPointer? by lazy {
    __1300964249_Interface.__1300964249_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1300964249_Interface)

  private fun as_1300964249(): IColorHelper.WithDefault {
    if(pointer == NULL) {
      return(IColorHelper.ABI.makeIColorHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorHelper.ABI.makeIColorHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ColorHelper> {
    public override fun getValue() = ColorHelper(pointer.getPointer(0))

    public fun setValue(value: ColorHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorHelper, MemoryAddress> {
    public val IColorHelperStatics2_Instance: IColorHelperStatics2 by lazy {
      createIColorHelperStatics2()
    }


    public val IColorHelperStatics_Instance: IColorHelperStatics by lazy {
      createIColorHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIColorHelperStatics2(): IColorHelperStatics2 {
      val refiid = Guid.REFIID(IColorHelperStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ColorHelper".toHandle(),refiid,interfacePtr)
      val result = IColorHelperStatics2.ABI.makeIColorHelperStatics2(interfacePtr.value)
      return result
    }

    public fun createIColorHelperStatics(): IColorHelperStatics {
      val refiid = Guid.REFIID(IColorHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ColorHelper".toHandle(),refiid,interfacePtr)
      val result = IColorHelperStatics.ABI.makeIColorHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ColorHelper {
      val address = segment.toRawLongValue()
      return ColorHelper(Pointer(address))
    }

    public override fun toNative(obj: ColorHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ToDisplayName(color: Color) = ABI.IColorHelperStatics2_Instance.ToDisplayName(color)

    public fun FromArgb(
      a: Byte,
      r: Byte,
      g: Byte,
      b: Byte
    ) = ABI.IColorHelperStatics_Instance.FromArgb(a, r, g, b)
  }
}
