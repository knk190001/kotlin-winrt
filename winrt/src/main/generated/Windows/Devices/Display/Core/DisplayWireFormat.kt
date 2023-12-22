package Windows.Devices.Display.Core

import Windows.Devices.Display.Core.IDisplayWireFormatFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DisplayWireFormat.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayWireFormat;{1acc967d-872c-5a38-bbb9-1d4872b76255})")
@WinRTByReference(brClass = DisplayWireFormat.ByReference::class)
public class DisplayWireFormat(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayWireFormat.WithDefault, IWinRTObject {
  private val __1623101436_Interface: IDisplayWireFormat.WithDefault by lazy {
    as_1623101436()
  }


  public override val __1623101436_Ptr: JNAPointer? by lazy {
    __1623101436_Interface.__1623101436_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1623101436_Interface)

  public constructor(
    pixelEncoding: DisplayWireFormatPixelEncoding,
    bitsPerChannel: Int,
    colorSpace: DisplayWireFormatColorSpace,
    eotf: DisplayWireFormatEotf,
    hdrMetadata: DisplayWireFormatHdrMetadata
  ) : this(ABI.activate(pixelEncoding, bitsPerChannel, colorSpace, eotf, hdrMetadata))

  private fun as_1623101436(): IDisplayWireFormat.WithDefault {
    if(pointer == NULL) {
      return(IDisplayWireFormat.ABI.makeIDisplayWireFormat(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayWireFormat>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayWireFormat.ABI.makeIDisplayWireFormat(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayWireFormat> {
    public override fun getValue() = DisplayWireFormat(pointer.getPointer(0))

    public fun setValue(value: DisplayWireFormat): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayWireFormat, MemoryAddress> {
    public val IDisplayWireFormatStatics_Instance: IDisplayWireFormatStatics by lazy {
      createIDisplayWireFormatStatics()
    }


    public val IDisplayWireFormatFactory_Instance: IDisplayWireFormatFactory by lazy {
      createIDisplayWireFormatFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayWireFormatStatics(): IDisplayWireFormatStatics {
      val refiid = Guid.REFIID(IDisplayWireFormatStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Display.Core.DisplayWireFormat".toHandle(),refiid,interfacePtr)
      val result = IDisplayWireFormatStatics.ABI.makeIDisplayWireFormatStatics(interfacePtr.value)
      return result
    }

    public fun createIDisplayWireFormatFactory(): IDisplayWireFormatFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Display.Core.DisplayWireFormat".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDisplayWireFormatFactory.ABI.makeIDisplayWireFormatFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      pixelEncoding: DisplayWireFormatPixelEncoding,
      bitsPerChannel: Int,
      colorSpace: DisplayWireFormatColorSpace,
      eotf: DisplayWireFormatEotf,
      hdrMetadata: DisplayWireFormatHdrMetadata
    ): JNAPointer? = IDisplayWireFormatFactory_Instance.CreateInstance(pixelEncoding,
        bitsPerChannel, colorSpace, eotf, hdrMetadata)?.pointer

    public override fun fromNative(segment: MemoryAddress): DisplayWireFormat {
      val address = segment.toRawLongValue()
      return DisplayWireFormat(Pointer(address))
    }

    public override fun toNative(obj: DisplayWireFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateWithProperties(
      extraProperties: IIterable<IKeyValuePair<Guid.GUID?, IUnknown?>?>,
      pixelEncoding: DisplayWireFormatPixelEncoding,
      bitsPerChannel: Int,
      colorSpace: DisplayWireFormatColorSpace,
      eotf: DisplayWireFormatEotf,
      hdrMetadata: DisplayWireFormatHdrMetadata
    ) = ABI.IDisplayWireFormatStatics_Instance.CreateWithProperties(extraProperties, pixelEncoding,
        bitsPerChannel, colorSpace, eotf, hdrMetadata)
  }
}
