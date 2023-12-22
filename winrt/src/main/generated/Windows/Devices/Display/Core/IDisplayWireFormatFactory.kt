package Windows.Devices.Display.Core

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IDisplayWireFormatFactory.ABI::class)
@Signature("{b2efc8d5-09d6-55e6-ad22-9014b3d25229}")
@Guid("b2efc8d509d655e6ad229014b3d25229")
@WinRTInterface("b2efc8d509d655e6ad229014b3d25229")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayWireFormatFactory.ByReference::class)
public interface IDisplayWireFormatFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    pixelEncoding: DisplayWireFormatPixelEncoding?,
    bitsPerChannel: Int,
    colorSpace: DisplayWireFormatColorSpace?,
    eotf: DisplayWireFormatEotf?,
    hdrMetadata: DisplayWireFormatHdrMetadata?
  ): DisplayWireFormat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayWireFormatFactory> {
    public override fun getValue() = ABI.makeIDisplayWireFormatFactory(pointer.getPointer(0))

    public fun setValue(value: IDisplayWireFormatFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayWireFormatFactory {
    public val __425624942_Ptr: Pointer?

    public val _425624942_VtblPtr: Pointer?
      get() = __425624942_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      pixelEncoding: DisplayWireFormatPixelEncoding?,
      bitsPerChannel: Int,
      colorSpace: DisplayWireFormatColorSpace?,
      eotf: DisplayWireFormatEotf?,
      hdrMetadata: DisplayWireFormatHdrMetadata?
    ): DisplayWireFormat? {
      val fnPtr = _425624942_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayWireFormat>()
      val hr = fn.invokeHR(arrayOf(__425624942_Ptr, marshalToNative(pixelEncoding), bitsPerChannel,
          marshalToNative(colorSpace), marshalToNative(eotf), marshalToNative(hdrMetadata), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayWireFormat>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayWireFormatFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __425624942_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayWireFormatFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2efc8d509d655e6ad229014b3d25229")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayWireFormatFactory(ptr: Pointer?): WithDefault =
        IDisplayWireFormatFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayWireFormatFactory {
      val address = segment.toRawLongValue()
      return makeIDisplayWireFormatFactory(Pointer(address))
    }

    public override fun toNative(obj: IDisplayWireFormatFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__425624942_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayWireFormatFactory):
        Array<IDisplayWireFormatFactory?> = (elements as
        Array<IDisplayWireFormatFactory?>).castToImpl<IDisplayWireFormatFactory,IDisplayWireFormatFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayWireFormatFactory?> =
        arrayOfNulls<IDisplayWireFormatFactory_Impl>(size) as Array<IDisplayWireFormatFactory?>
  }
}
