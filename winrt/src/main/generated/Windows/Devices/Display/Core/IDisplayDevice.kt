package Windows.Devices.Display.Core

import Windows.Foundation.TimeSpan
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

@ABIMarker(IDisplayDevice.ABI::class)
@Signature("{a4c9b62c-335f-5731-8cb4-c1ccd4731070}")
@Guid("a4c9b62c335f57318cb4c1ccd4731070")
@WinRTInterface("a4c9b62c335f57318cb4c1ccd4731070")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayDevice.ByReference::class)
public interface IDisplayDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateScanoutSource(target: DisplayTarget?): DisplaySource?

  @InterfaceMethod(1)
  public fun CreatePrimary(target: DisplayTarget?, desc: DisplayPrimaryDescription?):
      DisplaySurface?

  @InterfaceMethod(2)
  public fun CreateTaskPool(): DisplayTaskPool?

  @InterfaceMethod(3)
  public fun CreatePeriodicFence(target: DisplayTarget?, offsetFromVBlank: TimeSpan?): DisplayFence?

  @InterfaceMethod(4)
  public fun WaitForVBlank(source: DisplaySource?): Unit

  @InterfaceMethod(5)
  public fun CreateSimpleScanout(
    pSource: DisplaySource?,
    pSurface: DisplaySurface?,
    SubResourceIndex: WinDef.UINT,
    SyncInterval: WinDef.UINT
  ): DisplayScanout?

  @InterfaceMethod(6)
  public fun IsCapabilitySupported(capability: DisplayDeviceCapability?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayDevice>
      {
    public override fun getValue() = ABI.makeIDisplayDevice(pointer.getPointer(0))

    public fun setValue(value: IDisplayDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayDevice {
    public val __770367862_Ptr: Pointer?

    public val _770367862_VtblPtr: Pointer?
      get() = __770367862_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateScanoutSource(target: DisplayTarget?): DisplaySource? {
      val fnPtr = _770367862_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplaySource>()
      val hr = fn.invokeHR(arrayOf(__770367862_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplaySource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreatePrimary(target: DisplayTarget?, desc: DisplayPrimaryDescription?):
        DisplaySurface? {
      val fnPtr = _770367862_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplaySurface>()
      val hr = fn.invokeHR(arrayOf(__770367862_Ptr, marshalToNative(target), marshalToNative(desc),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplaySurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateTaskPool(): DisplayTaskPool? {
      val fnPtr = _770367862_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayTaskPool>()
      val hr = fn.invokeHR(arrayOf(__770367862_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayTaskPool>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreatePeriodicFence(target: DisplayTarget?, offsetFromVBlank: TimeSpan?):
        DisplayFence? {
      val fnPtr = _770367862_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayFence>()
      val hr = fn.invokeHR(arrayOf(__770367862_Ptr, marshalToNative(target),
          marshalToNative(offsetFromVBlank), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayFence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun WaitForVBlank(source: DisplaySource?): Unit {
      val fnPtr = _770367862_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__770367862_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun CreateSimpleScanout(
      pSource: DisplaySource?,
      pSurface: DisplaySurface?,
      SubResourceIndex: WinDef.UINT,
      SyncInterval: WinDef.UINT
    ): DisplayScanout? {
      val fnPtr = _770367862_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayScanout>()
      val hr = fn.invokeHR(arrayOf(__770367862_Ptr, marshalToNative(pSource),
          marshalToNative(pSurface), SubResourceIndex, SyncInterval, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayScanout>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun IsCapabilitySupported(capability: DisplayDeviceCapability?): Boolean {
      val fnPtr = _770367862_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__770367862_Ptr, marshalToNative(capability), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDisplayDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __770367862_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4c9b62c335f57318cb4c1ccd4731070")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayDevice(ptr: Pointer?): WithDefault = IDisplayDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayDevice {
      val address = segment.toRawLongValue()
      return makeIDisplayDevice(Pointer(address))
    }

    public override fun toNative(obj: IDisplayDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__770367862_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayDevice): Array<IDisplayDevice?> = (elements as
        Array<IDisplayDevice?>).castToImpl<IDisplayDevice,IDisplayDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayDevice?> =
        arrayOfNulls<IDisplayDevice_Impl>(size) as Array<IDisplayDevice?>
  }
}
