package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IMapView
import Windows.Graphics.DisplayAdapterId
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayAdapter.ABI::class)
@Signature("{a56f5287-f000-5f2e-b5ac-3783a2b69af5}")
@Guid("a56f5287f0005f2eb5ac3783a2b69af5")
@WinRTInterface("a56f5287f0005f2eb5ac3783a2b69af5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayAdapter.ByReference::class)
public interface IDisplayAdapter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): DisplayAdapterId?

  @InterfaceMethod(1)
  public fun get_DeviceInterfacePath(): String?

  @InterfaceMethod(2)
  public fun get_SourceCount(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_PciVendorId(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_PciDeviceId(): WinDef.UINT

  @InterfaceMethod(5)
  public fun get_PciSubSystemId(): WinDef.UINT

  @InterfaceMethod(6)
  public fun get_PciRevision(): WinDef.UINT

  @InterfaceMethod(7)
  public fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayAdapter> {
    public override fun getValue() = ABI.makeIDisplayAdapter(pointer.getPointer(0))

    public fun setValue(value: IDisplayAdapter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayAdapter {
    public val __303741905_Ptr: Pointer?

    public val _303741905_VtblPtr: Pointer?
      get() = __303741905_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): DisplayAdapterId? {
      val fnPtr = _303741905_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAdapterId>()
      val hr = fn.invokeHR(arrayOf(__303741905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAdapterId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceInterfacePath(): String? {
      val fnPtr = _303741905_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__303741905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SourceCount(): WinDef.UINT {
      val fnPtr = _303741905_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__303741905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PciVendorId(): WinDef.UINT {
      val fnPtr = _303741905_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__303741905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PciDeviceId(): WinDef.UINT {
      val fnPtr = _303741905_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__303741905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_PciSubSystemId(): WinDef.UINT {
      val fnPtr = _303741905_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__303741905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_PciRevision(): WinDef.UINT {
      val fnPtr = _303741905_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__303741905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_Properties(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        IUnknown?>? {
      val fnPtr = _303741905_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__303741905_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayAdapter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __303741905_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayAdapter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a56f5287f0005f2eb5ac3783a2b69af5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayAdapter(ptr: Pointer?): WithDefault = IDisplayAdapter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayAdapter {
      val address = segment.toRawLongValue()
      return makeIDisplayAdapter(Pointer(address))
    }

    public override fun toNative(obj: IDisplayAdapter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__303741905_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayAdapter): Array<IDisplayAdapter?> = (elements as
        Array<IDisplayAdapter?>).castToImpl<IDisplayAdapter,IDisplayAdapter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayAdapter?> =
        arrayOfNulls<IDisplayAdapter_Impl>(size) as Array<IDisplayAdapter?>
  }
}
