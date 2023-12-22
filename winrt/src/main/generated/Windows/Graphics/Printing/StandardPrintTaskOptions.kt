package Windows.Graphics.Printing

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(StandardPrintTaskOptions.ABI::class)
@WinRTByReference(brClass = StandardPrintTaskOptions.ByReference::class)
public class StandardPrintTaskOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StandardPrintTaskOptions> {
    public override fun getValue() = StandardPrintTaskOptions(pointer.getPointer(0))

    public fun setValue(value: StandardPrintTaskOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StandardPrintTaskOptions, MemoryAddress> {
    public val IStandardPrintTaskOptionsStatic3_Instance: IStandardPrintTaskOptionsStatic3 by lazy {
      createIStandardPrintTaskOptionsStatic3()
    }


    public val IStandardPrintTaskOptionsStatic2_Instance: IStandardPrintTaskOptionsStatic2 by lazy {
      createIStandardPrintTaskOptionsStatic2()
    }


    public val IStandardPrintTaskOptionsStatic_Instance: IStandardPrintTaskOptionsStatic by lazy {
      createIStandardPrintTaskOptionsStatic()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStandardPrintTaskOptionsStatic3(): IStandardPrintTaskOptionsStatic3 {
      val refiid = Guid.REFIID(IStandardPrintTaskOptionsStatic3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing.StandardPrintTaskOptions".toHandle(),refiid,interfacePtr)
      val result =
          IStandardPrintTaskOptionsStatic3.ABI.makeIStandardPrintTaskOptionsStatic3(interfacePtr.value)
      return result
    }

    public fun createIStandardPrintTaskOptionsStatic2(): IStandardPrintTaskOptionsStatic2 {
      val refiid = Guid.REFIID(IStandardPrintTaskOptionsStatic2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing.StandardPrintTaskOptions".toHandle(),refiid,interfacePtr)
      val result =
          IStandardPrintTaskOptionsStatic2.ABI.makeIStandardPrintTaskOptionsStatic2(interfacePtr.value)
      return result
    }

    public fun createIStandardPrintTaskOptionsStatic(): IStandardPrintTaskOptionsStatic {
      val refiid = Guid.REFIID(IStandardPrintTaskOptionsStatic.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing.StandardPrintTaskOptions".toHandle(),refiid,interfacePtr)
      val result =
          IStandardPrintTaskOptionsStatic.ABI.makeIStandardPrintTaskOptionsStatic(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StandardPrintTaskOptions {
      val address = segment.toRawLongValue()
      return StandardPrintTaskOptions(Pointer(address))
    }

    public override fun toNative(obj: StandardPrintTaskOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CustomPageRanges() =
        ABI.IStandardPrintTaskOptionsStatic3_Instance.get_CustomPageRanges()

    public fun get_Bordering() = ABI.IStandardPrintTaskOptionsStatic2_Instance.get_Bordering()

    public fun get_MediaSize() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_MediaSize()

    public fun get_MediaType() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_MediaType()

    public fun get_Orientation() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_Orientation()

    public fun get_PrintQuality() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_PrintQuality()

    public fun get_ColorMode() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_ColorMode()

    public fun get_Duplex() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_Duplex()

    public fun get_Collation() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_Collation()

    public fun get_Staple() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_Staple()

    public fun get_HolePunch() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_HolePunch()

    public fun get_Binding() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_Binding()

    public fun get_Copies() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_Copies()

    public fun get_NUp() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_NUp()

    public fun get_InputBin() = ABI.IStandardPrintTaskOptionsStatic_Instance.get_InputBin()
  }
}
