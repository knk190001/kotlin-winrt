package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IMapView
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

@ABIMarker(IDisplayPrimaryDescription.ABI::class)
@Signature("{872591d2-d533-50ff-a85e-06696194b77c}")
@Guid("872591d2d53350ffa85e06696194b77c")
@WinRTInterface("872591d2d53350ffa85e06696194b77c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayPrimaryDescription.ByReference::class)
public interface IDisplayPrimaryDescription : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Height(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Format(): DirectXPixelFormat?

  @InterfaceMethod(3)
  public fun get_ColorSpace(): DirectXColorSpace?

  @InterfaceMethod(4)
  public fun get_IsStereo(): Boolean

  @InterfaceMethod(5)
  public fun get_MultisampleDescription(): Direct3DMultisampleDescription?

  @InterfaceMethod(6)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayPrimaryDescription> {
    public override fun getValue() = ABI.makeIDisplayPrimaryDescription(pointer.getPointer(0))

    public fun setValue(value: IDisplayPrimaryDescription_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayPrimaryDescription {
    public val __217793606_Ptr: Pointer?

    public val _217793606_VtblPtr: Pointer?
      get() = __217793606_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _217793606_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__217793606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _217793606_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__217793606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Format(): DirectXPixelFormat? {
      val fnPtr = _217793606_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__217793606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ColorSpace(): DirectXColorSpace? {
      val fnPtr = _217793606_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXColorSpace>()
      val hr = fn.invokeHR(arrayOf(__217793606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXColorSpace>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsStereo(): Boolean {
      val fnPtr = _217793606_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__217793606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_MultisampleDescription(): Direct3DMultisampleDescription? {
      val fnPtr = _217793606_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Direct3DMultisampleDescription>()
      val hr = fn.invokeHR(arrayOf(__217793606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Direct3DMultisampleDescription>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _217793606_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__217793606_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayPrimaryDescription_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __217793606_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayPrimaryDescription, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("872591d2d53350ffa85e06696194b77c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayPrimaryDescription(ptr: Pointer?): WithDefault =
        IDisplayPrimaryDescription_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayPrimaryDescription {
      val address = segment.toRawLongValue()
      return makeIDisplayPrimaryDescription(Pointer(address))
    }

    public override fun toNative(obj: IDisplayPrimaryDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__217793606_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayPrimaryDescription):
        Array<IDisplayPrimaryDescription?> = (elements as
        Array<IDisplayPrimaryDescription?>).castToImpl<IDisplayPrimaryDescription,IDisplayPrimaryDescription_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayPrimaryDescription?> =
        arrayOfNulls<IDisplayPrimaryDescription_Impl>(size) as Array<IDisplayPrimaryDescription?>
  }
}
