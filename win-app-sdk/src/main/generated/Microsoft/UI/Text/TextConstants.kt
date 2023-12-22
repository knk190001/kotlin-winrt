package Microsoft.UI.Text

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(TextConstants.ABI::class)
@WinRTByReference(brClass = TextConstants.ByReference::class)
public class TextConstants(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TextConstants>
      {
    public override fun getValue() = TextConstants(pointer.getPointer(0))

    public fun setValue(value: TextConstants): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextConstants, MemoryAddress> {
    public val ITextConstantsStatics_Instance: ITextConstantsStatics by lazy {
      createITextConstantsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextConstantsStatics(): ITextConstantsStatics {
      val refiid = Guid.REFIID(ITextConstantsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Text.TextConstants".toHandle(),refiid,interfacePtr)
      val result = ITextConstantsStatics.ABI.makeITextConstantsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TextConstants {
      val address = segment.toRawLongValue()
      return TextConstants(Pointer(address))
    }

    public override fun toNative(obj: TextConstants): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AutoColor() = ABI.ITextConstantsStatics_Instance.get_AutoColor()

    public fun get_MinUnitCount() = ABI.ITextConstantsStatics_Instance.get_MinUnitCount()

    public fun get_MaxUnitCount() = ABI.ITextConstantsStatics_Instance.get_MaxUnitCount()

    public fun get_UndefinedColor() = ABI.ITextConstantsStatics_Instance.get_UndefinedColor()

    public fun get_UndefinedFloatValue() =
        ABI.ITextConstantsStatics_Instance.get_UndefinedFloatValue()

    public fun get_UndefinedInt32Value() =
        ABI.ITextConstantsStatics_Instance.get_UndefinedInt32Value()

    public fun get_UndefinedFontStretch() =
        ABI.ITextConstantsStatics_Instance.get_UndefinedFontStretch()

    public fun get_UndefinedFontStyle() =
        ABI.ITextConstantsStatics_Instance.get_UndefinedFontStyle()
  }
}
