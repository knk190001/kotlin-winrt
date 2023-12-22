package Windows.Devices.Usb

import Windows.Foundation.IAsyncAction
import Windows.Storage.Streams.IInputStream
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbBulkInPipe.ABI::class)
@Signature("{f01d2d3b-4548-4d50-b326-d82cdabe1220}")
@Guid("f01d2d3b45484d50b326d82cdabe1220")
@WinRTInterface("f01d2d3b45484d50b326d82cdabe1220")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbBulkInPipe.ByReference::class)
public interface IUsbBulkInPipe : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxTransferSizeBytes(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_EndpointDescriptor(): UsbBulkInEndpointDescriptor?

  @InterfaceMethod(2)
  public fun ClearStallAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun put_ReadOptions(value: UsbReadOptions?): Unit

  @InterfaceMethod(4)
  public fun get_ReadOptions(): UsbReadOptions?

  @InterfaceMethod(5)
  public fun FlushBuffer(): Unit

  @InterfaceMethod(6)
  public fun get_InputStream(): IInputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUsbBulkInPipe>
      {
    public override fun getValue() = ABI.makeIUsbBulkInPipe(pointer.getPointer(0))

    public fun setValue(value: IUsbBulkInPipe_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbBulkInPipe {
    public val __1895698088_Ptr: Pointer?

    public val _1895698088_VtblPtr: Pointer?
      get() = __1895698088_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxTransferSizeBytes(): WinDef.UINT {
      val fnPtr = _1895698088_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1895698088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EndpointDescriptor(): UsbBulkInEndpointDescriptor? {
      val fnPtr = _1895698088_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbBulkInEndpointDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1895698088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbBulkInEndpointDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ClearStallAsync(): IAsyncAction? {
      val fnPtr = _1895698088_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1895698088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ReadOptions(value: UsbReadOptions?): Unit {
      val fnPtr = _1895698088_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1895698088_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ReadOptions(): UsbReadOptions? {
      val fnPtr = _1895698088_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbReadOptions>()
      val hr = fn.invokeHR(arrayOf(__1895698088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbReadOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FlushBuffer(): Unit {
      val fnPtr = _1895698088_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1895698088_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_InputStream(): IInputStream? {
      val fnPtr = _1895698088_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__1895698088_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }
  }

  public class IUsbBulkInPipe_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1895698088_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbBulkInPipe, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f01d2d3b45484d50b326d82cdabe1220")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbBulkInPipe(ptr: Pointer?): WithDefault = IUsbBulkInPipe_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbBulkInPipe {
      val address = segment.toRawLongValue()
      return makeIUsbBulkInPipe(Pointer(address))
    }

    public override fun toNative(obj: IUsbBulkInPipe): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1895698088_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbBulkInPipe): Array<IUsbBulkInPipe?> = (elements as
        Array<IUsbBulkInPipe?>).castToImpl<IUsbBulkInPipe,IUsbBulkInPipe_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbBulkInPipe?> =
        arrayOfNulls<IUsbBulkInPipe_Impl>(size) as Array<IUsbBulkInPipe?>
  }
}
