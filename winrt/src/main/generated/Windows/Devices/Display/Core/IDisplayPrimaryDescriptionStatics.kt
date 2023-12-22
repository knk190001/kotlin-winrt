package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Graphics.DirectX.Direct3D11.Direct3DMultisampleDescription
import Windows.Graphics.DirectX.DirectXColorSpace
import Windows.Graphics.DirectX.DirectXPixelFormat
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayPrimaryDescriptionStatics.ABI::class)
@Signature("{e60e4cfb-36c9-56dd-8fa1-6ff8c4e0ff07}")
@Guid("e60e4cfb36c956dd8fa16ff8c4e0ff07")
@WinRTInterface("e60e4cfb36c956dd8fa16ff8c4e0ff07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayPrimaryDescriptionStatics.ByReference::class)
public interface IDisplayPrimaryDescriptionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithProperties(
    extraProperties: IIterable<IKeyValuePair<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?>?,
    width: WinDef.UINT,
    height: WinDef.UINT,
    pixelFormat: DirectXPixelFormat?,
    colorSpace: DirectXColorSpace?,
    isStereo: Boolean,
    multisampleDescription: Direct3DMultisampleDescription?
  ): DisplayPrimaryDescription?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayPrimaryDescriptionStatics> {
    public override fun getValue() =
        ABI.makeIDisplayPrimaryDescriptionStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayPrimaryDescriptionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayPrimaryDescriptionStatics {
    public val __1208096427_Ptr: Pointer?

    public val _1208096427_VtblPtr: Pointer?
      get() = __1208096427_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithProperties(
      extraProperties: IIterable<IKeyValuePair<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?>?,
      width: WinDef.UINT,
      height: WinDef.UINT,
      pixelFormat: DirectXPixelFormat?,
      colorSpace: DirectXColorSpace?,
      isStereo: Boolean,
      multisampleDescription: Direct3DMultisampleDescription?
    ): DisplayPrimaryDescription? {
      val fnPtr = _1208096427_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPrimaryDescription>()
      val hr = fn.invokeHR(arrayOf(__1208096427_Ptr, marshalToNative(extraProperties), width,
          height, marshalToNative(pixelFormat), marshalToNative(colorSpace), isStereo,
          marshalToNative(multisampleDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPrimaryDescription>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayPrimaryDescriptionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1208096427_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayPrimaryDescriptionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e60e4cfb36c956dd8fa16ff8c4e0ff07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayPrimaryDescriptionStatics(ptr: Pointer?): WithDefault =
        IDisplayPrimaryDescriptionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayPrimaryDescriptionStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayPrimaryDescriptionStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayPrimaryDescriptionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1208096427_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayPrimaryDescriptionStatics):
        Array<IDisplayPrimaryDescriptionStatics?> = (elements as
        Array<IDisplayPrimaryDescriptionStatics?>).castToImpl<IDisplayPrimaryDescriptionStatics,IDisplayPrimaryDescriptionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayPrimaryDescriptionStatics?> =
        arrayOfNulls<IDisplayPrimaryDescriptionStatics_Impl>(size) as
        Array<IDisplayPrimaryDescriptionStatics?>
  }
}
