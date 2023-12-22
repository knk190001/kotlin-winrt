package Windows.UI.Xaml.Markup

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XamlReader.ABI::class)
@Signature("rc(Windows.UI.Xaml.Markup.XamlReader;{24374cf1-cceb-48bf-a514-41b0186f84c2})")
@WinRTByReference(brClass = XamlReader.ByReference::class)
public class XamlReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlReader.WithDefault, IWinRTObject {
  private val __560244267_Interface: IXamlReader.WithDefault by lazy {
    as_560244267()
  }


  public override val __560244267_Ptr: JNAPointer? by lazy {
    __560244267_Interface.__560244267_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__560244267_Interface)

  private fun as_560244267(): IXamlReader.WithDefault {
    if(pointer == NULL) {
      return(IXamlReader.ABI.makeIXamlReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlReader.ABI.makeIXamlReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<XamlReader> {
    public override fun getValue() = XamlReader(pointer.getPointer(0))

    public fun setValue(value: XamlReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlReader, MemoryAddress> {
    public val IXamlReaderStatics_Instance: IXamlReaderStatics by lazy {
      createIXamlReaderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlReaderStatics(): IXamlReaderStatics {
      val refiid = Guid.REFIID(IXamlReaderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Markup.XamlReader".toHandle(),refiid,interfacePtr)
      val result = IXamlReaderStatics.ABI.makeIXamlReaderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XamlReader {
      val address = segment.toRawLongValue()
      return XamlReader(Pointer(address))
    }

    public override fun toNative(obj: XamlReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Load(xaml: String) = ABI.IXamlReaderStatics_Instance.Load(xaml)

    public fun LoadWithInitialTemplateValidation(xaml: String) =
        ABI.IXamlReaderStatics_Instance.LoadWithInitialTemplateValidation(xaml)
  }
}
