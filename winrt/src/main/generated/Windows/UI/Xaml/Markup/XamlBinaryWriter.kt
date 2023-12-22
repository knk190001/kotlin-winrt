package Windows.UI.Xaml.Markup

import Windows.Foundation.Collections.IVector
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XamlBinaryWriter.ABI::class)
@Signature("rc(Windows.UI.Xaml.Markup.XamlBinaryWriter;{829d2ad3-620a-46f6-845d-436a05927100})")
@WinRTByReference(brClass = XamlBinaryWriter.ByReference::class)
public class XamlBinaryWriter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlBinaryWriter.WithDefault, IWinRTObject {
  private val __596788070_Interface: IXamlBinaryWriter.WithDefault by lazy {
    as_596788070()
  }


  public override val __596788070_Ptr: JNAPointer? by lazy {
    __596788070_Interface.__596788070_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__596788070_Interface)

  private fun as_596788070(): IXamlBinaryWriter.WithDefault {
    if(pointer == NULL) {
      return(IXamlBinaryWriter.ABI.makeIXamlBinaryWriter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlBinaryWriter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlBinaryWriter.ABI.makeIXamlBinaryWriter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlBinaryWriter> {
    public override fun getValue() = XamlBinaryWriter(pointer.getPointer(0))

    public fun setValue(value: XamlBinaryWriter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlBinaryWriter, MemoryAddress> {
    public val IXamlBinaryWriterStatics_Instance: IXamlBinaryWriterStatics by lazy {
      createIXamlBinaryWriterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXamlBinaryWriterStatics(): IXamlBinaryWriterStatics {
      val refiid = Guid.REFIID(IXamlBinaryWriterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Markup.XamlBinaryWriter".toHandle(),refiid,interfacePtr)
      val result = IXamlBinaryWriterStatics.ABI.makeIXamlBinaryWriterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XamlBinaryWriter {
      val address = segment.toRawLongValue()
      return XamlBinaryWriter(Pointer(address))
    }

    public override fun toNative(obj: XamlBinaryWriter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Write(
      inputStreams: IVector<IRandomAccessStream?>,
      outputStreams: IVector<IRandomAccessStream?>,
      xamlMetadataProvider: IXamlMetadataProvider
    ) = ABI.IXamlBinaryWriterStatics_Instance.Write(inputStreams, outputStreams,
        xamlMetadataProvider)
  }
}
