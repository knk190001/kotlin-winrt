package Windows.Data.Html

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

@ABIMarker(HtmlUtilities.ABI::class)
@WinRTByReference(brClass = HtmlUtilities.ByReference::class)
public class HtmlUtilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HtmlUtilities>
      {
    public override fun getValue() = HtmlUtilities(pointer.getPointer(0))

    public fun setValue(value: HtmlUtilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HtmlUtilities, MemoryAddress> {
    public val IHtmlUtilities_Instance: IHtmlUtilities by lazy {
      createIHtmlUtilities()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHtmlUtilities(): IHtmlUtilities {
      val refiid = Guid.REFIID(IHtmlUtilities.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Html.HtmlUtilities".toHandle(),refiid,interfacePtr)
      val result = IHtmlUtilities.ABI.makeIHtmlUtilities(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HtmlUtilities {
      val address = segment.toRawLongValue()
      return HtmlUtilities(Pointer(address))
    }

    public override fun toNative(obj: HtmlUtilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun ConvertToText(html: String) = ABI.IHtmlUtilities_Instance.ConvertToText(html)
  }
}
