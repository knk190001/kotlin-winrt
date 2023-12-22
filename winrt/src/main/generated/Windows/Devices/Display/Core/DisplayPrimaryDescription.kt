package Windows.Devices.Display.Core

import Windows.Devices.Display.Core.IDisplayPrimaryDescriptionFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Graphics.DirectX.Direct3D11.Direct3DMultisampleDescription
import Windows.Graphics.DirectX.DirectXColorSpace
import Windows.Graphics.DirectX.DirectXPixelFormat
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DisplayPrimaryDescription.ABI::class)
@Signature("rc(Windows.Devices.Display.Core.DisplayPrimaryDescription;{872591d2-d533-50ff-a85e-06696194b77c})")
@WinRTByReference(brClass = DisplayPrimaryDescription.ByReference::class)
public class DisplayPrimaryDescription(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDisplayPrimaryDescription.WithDefault, IWinRTObject {
  private val __217793606_Interface: IDisplayPrimaryDescription.WithDefault by lazy {
    as_217793606()
  }


  public override val __217793606_Ptr: JNAPointer? by lazy {
    __217793606_Interface.__217793606_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__217793606_Interface)

  public constructor(
    width: WinDef.UINT,
    height: WinDef.UINT,
    pixelFormat: DirectXPixelFormat,
    colorSpace: DirectXColorSpace,
    isStereo: Boolean,
    multisampleDescription: Direct3DMultisampleDescription
  ) : this(ABI.activate(width, height, pixelFormat, colorSpace, isStereo, multisampleDescription))

  private fun as_217793606(): IDisplayPrimaryDescription.WithDefault {
    if(pointer == NULL) {
      return(IDisplayPrimaryDescription.ABI.makeIDisplayPrimaryDescription(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDisplayPrimaryDescription>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDisplayPrimaryDescription.ABI.makeIDisplayPrimaryDescription(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DisplayPrimaryDescription> {
    public override fun getValue() = DisplayPrimaryDescription(pointer.getPointer(0))

    public fun setValue(value: DisplayPrimaryDescription): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DisplayPrimaryDescription, MemoryAddress> {
    public val IDisplayPrimaryDescriptionStatics_Instance: IDisplayPrimaryDescriptionStatics by
        lazy {
      createIDisplayPrimaryDescriptionStatics()
    }


    public val IDisplayPrimaryDescriptionFactory_Instance: IDisplayPrimaryDescriptionFactory by
        lazy {
      createIDisplayPrimaryDescriptionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDisplayPrimaryDescriptionStatics(): IDisplayPrimaryDescriptionStatics {
      val refiid = Guid.REFIID(IDisplayPrimaryDescriptionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Display.Core.DisplayPrimaryDescription".toHandle(),refiid,interfacePtr)
      val result =
          IDisplayPrimaryDescriptionStatics.ABI.makeIDisplayPrimaryDescriptionStatics(interfacePtr.value)
      return result
    }

    public fun createIDisplayPrimaryDescriptionFactory(): IDisplayPrimaryDescriptionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Display.Core.DisplayPrimaryDescription".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDisplayPrimaryDescriptionFactory.ABI.makeIDisplayPrimaryDescriptionFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      width: WinDef.UINT,
      height: WinDef.UINT,
      pixelFormat: DirectXPixelFormat,
      colorSpace: DirectXColorSpace,
      isStereo: Boolean,
      multisampleDescription: Direct3DMultisampleDescription
    ): JNAPointer? = IDisplayPrimaryDescriptionFactory_Instance.CreateInstance(width, height,
        pixelFormat, colorSpace, isStereo, multisampleDescription)?.pointer

    public override fun fromNative(segment: MemoryAddress): DisplayPrimaryDescription {
      val address = segment.toRawLongValue()
      return DisplayPrimaryDescription(Pointer(address))
    }

    public override fun toNative(obj: DisplayPrimaryDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateWithProperties(
      extraProperties: IIterable<IKeyValuePair<Guid.GUID?, IUnknown?>?>,
      width: WinDef.UINT,
      height: WinDef.UINT,
      pixelFormat: DirectXPixelFormat,
      colorSpace: DirectXColorSpace,
      isStereo: Boolean,
      multisampleDescription: Direct3DMultisampleDescription
    ) = ABI.IDisplayPrimaryDescriptionStatics_Instance.CreateWithProperties(extraProperties, width,
        height, pixelFormat, colorSpace, isStereo, multisampleDescription)
  }
}
