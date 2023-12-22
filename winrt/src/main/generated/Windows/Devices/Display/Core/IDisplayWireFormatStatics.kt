package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayWireFormatStatics.ABI::class)
@Signature("{c575a22d-c3e6-5f7a-bdfb-87c6ab8661d5}")
@Guid("c575a22dc3e65f7abdfb87c6ab8661d5")
@WinRTInterface("c575a22dc3e65f7abdfb87c6ab8661d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayWireFormatStatics.ByReference::class)
public interface IDisplayWireFormatStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithProperties(
    extraProperties: IIterable<IKeyValuePair<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?>?,
    pixelEncoding: DisplayWireFormatPixelEncoding?,
    bitsPerChannel: Int,
    colorSpace: DisplayWireFormatColorSpace?,
    eotf: DisplayWireFormatEotf?,
    hdrMetadata: DisplayWireFormatHdrMetadata?
  ): DisplayWireFormat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayWireFormatStatics> {
    public override fun getValue() = ABI.makeIDisplayWireFormatStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayWireFormatStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayWireFormatStatics {
    public val __379628503_Ptr: Pointer?

    public val _379628503_VtblPtr: Pointer?
      get() = __379628503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithProperties(
      extraProperties: IIterable<IKeyValuePair<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?>?,
      pixelEncoding: DisplayWireFormatPixelEncoding?,
      bitsPerChannel: Int,
      colorSpace: DisplayWireFormatColorSpace?,
      eotf: DisplayWireFormatEotf?,
      hdrMetadata: DisplayWireFormatHdrMetadata?
    ): DisplayWireFormat? {
      val fnPtr = _379628503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayWireFormat>()
      val hr = fn.invokeHR(arrayOf(__379628503_Ptr, marshalToNative(extraProperties),
          marshalToNative(pixelEncoding), bitsPerChannel, marshalToNative(colorSpace),
          marshalToNative(eotf), marshalToNative(hdrMetadata), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayWireFormat>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayWireFormatStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __379628503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayWireFormatStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c575a22dc3e65f7abdfb87c6ab8661d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayWireFormatStatics(ptr: Pointer?): WithDefault =
        IDisplayWireFormatStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayWireFormatStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayWireFormatStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayWireFormatStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__379628503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayWireFormatStatics):
        Array<IDisplayWireFormatStatics?> = (elements as
        Array<IDisplayWireFormatStatics?>).castToImpl<IDisplayWireFormatStatics,IDisplayWireFormatStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayWireFormatStatics?> =
        arrayOfNulls<IDisplayWireFormatStatics_Impl>(size) as Array<IDisplayWireFormatStatics?>
  }
}
