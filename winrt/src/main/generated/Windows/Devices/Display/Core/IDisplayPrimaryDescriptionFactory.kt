package Windows.Devices.Display.Core

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

@ABIMarker(IDisplayPrimaryDescriptionFactory.ABI::class)
@Signature("{1a6aff7b-3637-5c46-b479-76d576216e65}")
@Guid("1a6aff7b36375c46b47976d576216e65")
@WinRTInterface("1a6aff7b36375c46b47976d576216e65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayPrimaryDescriptionFactory.ByReference::class)
public interface IDisplayPrimaryDescriptionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    width: WinDef.UINT,
    height: WinDef.UINT,
    pixelFormat: DirectXPixelFormat?,
    colorSpace: DirectXColorSpace?,
    isStereo: Boolean,
    multisampleDescription: Direct3DMultisampleDescription?
  ): DisplayPrimaryDescription?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayPrimaryDescriptionFactory> {
    public override fun getValue() =
        ABI.makeIDisplayPrimaryDescriptionFactory(pointer.getPointer(0))

    public fun setValue(value: IDisplayPrimaryDescriptionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayPrimaryDescriptionFactory {
    public val __2013349872_Ptr: Pointer?

    public val _2013349872_VtblPtr: Pointer?
      get() = __2013349872_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      width: WinDef.UINT,
      height: WinDef.UINT,
      pixelFormat: DirectXPixelFormat?,
      colorSpace: DirectXColorSpace?,
      isStereo: Boolean,
      multisampleDescription: Direct3DMultisampleDescription?
    ): DisplayPrimaryDescription? {
      val fnPtr = _2013349872_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPrimaryDescription>()
      val hr = fn.invokeHR(arrayOf(__2013349872_Ptr, width, height, marshalToNative(pixelFormat),
          marshalToNative(colorSpace), isStereo, marshalToNative(multisampleDescription), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPrimaryDescription>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayPrimaryDescriptionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2013349872_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayPrimaryDescriptionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a6aff7b36375c46b47976d576216e65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayPrimaryDescriptionFactory(ptr: Pointer?): WithDefault =
        IDisplayPrimaryDescriptionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayPrimaryDescriptionFactory {
      val address = segment.toRawLongValue()
      return makeIDisplayPrimaryDescriptionFactory(Pointer(address))
    }

    public override fun toNative(obj: IDisplayPrimaryDescriptionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2013349872_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayPrimaryDescriptionFactory):
        Array<IDisplayPrimaryDescriptionFactory?> = (elements as
        Array<IDisplayPrimaryDescriptionFactory?>).castToImpl<IDisplayPrimaryDescriptionFactory,IDisplayPrimaryDescriptionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayPrimaryDescriptionFactory?> =
        arrayOfNulls<IDisplayPrimaryDescriptionFactory_Impl>(size) as
        Array<IDisplayPrimaryDescriptionFactory?>
  }
}
