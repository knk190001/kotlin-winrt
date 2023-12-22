package Windows.ApplicationModel.DataTransfer

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HtmlFormatHelper.ABI::class)
@WinRTByReference(brClass = HtmlFormatHelper.ByReference::class)
public class HtmlFormatHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HtmlFormatHelper> {
    public override fun getValue() = HtmlFormatHelper(pointer.getPointer(0))

    public fun setValue(value: HtmlFormatHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HtmlFormatHelper, MemoryAddress> {
    public val IHtmlFormatHelperStatics_Instance: IHtmlFormatHelperStatics by lazy {
      createIHtmlFormatHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHtmlFormatHelperStatics(): IHtmlFormatHelperStatics {
      val refiid = Guid.REFIID(IHtmlFormatHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.DataTransfer.HtmlFormatHelper".toHandle(),refiid,interfacePtr)
      val result = IHtmlFormatHelperStatics.ABI.makeIHtmlFormatHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HtmlFormatHelper {
      val address = segment.toRawLongValue()
      return HtmlFormatHelper(Pointer(address))
    }

    public override fun toNative(obj: HtmlFormatHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetStaticFragment(htmlFormat: String) =
        ABI.IHtmlFormatHelperStatics_Instance.GetStaticFragment(htmlFormat)

    public fun CreateHtmlFormat(htmlFragment: String) =
        ABI.IHtmlFormatHelperStatics_Instance.CreateHtmlFormat(htmlFragment)
  }
}
