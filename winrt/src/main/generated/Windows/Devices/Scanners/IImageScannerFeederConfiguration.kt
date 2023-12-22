package Windows.Devices.Scanners

import Windows.Devices.Scanners.IImageScannerFormatConfiguration.ABI.IID
import Windows.Foundation.Size
import Windows.Graphics.Printing.PrintMediaSize
import Windows.Graphics.Printing.PrintOrientation
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IImageScannerFeederConfiguration.ABI::class)
@Signature("{74bdacee-fa97-4c17-8280-40e39c6dcc67}")
@Guid("74bdaceefa974c17828040e39c6dcc67")
@WinRTInterface("74bdaceefa974c17828040e39c6dcc67")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageScannerFeederConfiguration.ByReference::class)
public interface IImageScannerFeederConfiguration : NativeMapped, IWinRTInterface,
    IImageScannerFormatConfiguration, IImageScannerSourceConfiguration {
  @InterfaceMethod(0)
  public fun get_CanAutoDetectPageSize(): Boolean

  @InterfaceMethod(1)
  public fun get_AutoDetectPageSize(): Boolean

  @InterfaceMethod(2)
  public fun put_AutoDetectPageSize(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_PageSize(): PrintMediaSize?

  @InterfaceMethod(4)
  public fun put_PageSize(value: PrintMediaSize?): Unit

  @InterfaceMethod(5)
  public fun get_PageOrientation(): PrintOrientation?

  @InterfaceMethod(6)
  public fun put_PageOrientation(value: PrintOrientation?): Unit

  @InterfaceMethod(7)
  public fun get_PageSizeDimensions(): Size?

  @InterfaceMethod(8)
  public fun IsPageSizeSupported(pageSize: PrintMediaSize?, pageOrientation: PrintOrientation?):
      Boolean

  @InterfaceMethod(9)
  public fun get_MaxNumberOfPages(): WinDef.UINT

  @InterfaceMethod(10)
  public fun put_MaxNumberOfPages(value: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun get_CanScanDuplex(): Boolean

  @InterfaceMethod(12)
  public fun get_Duplex(): Boolean

  @InterfaceMethod(13)
  public fun put_Duplex(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_CanScanAhead(): Boolean

  @InterfaceMethod(15)
  public fun get_ScanAhead(): Boolean

  @InterfaceMethod(16)
  public fun put_ScanAhead(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageScannerFeederConfiguration> {
    public override fun getValue() = ABI.makeIImageScannerFeederConfiguration(pointer.getPointer(0))

    public fun setValue(value: IImageScannerFeederConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageScannerFeederConfiguration,
      IImageScannerFormatConfiguration.WithDefault, IImageScannerSourceConfiguration.WithDefault {
    public val __1068430896_Ptr: Pointer?

    public val _1068430896_VtblPtr: Pointer?
      get() = __1068430896_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanAutoDetectPageSize(): Boolean {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AutoDetectPageSize(): Boolean {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_AutoDetectPageSize(value: Boolean): Unit {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_PageSize(): PrintMediaSize? {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintMediaSize>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintMediaSize>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_PageSize(value: PrintMediaSize?): Unit {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PageOrientation(): PrintOrientation? {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintOrientation>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_PageOrientation(value: PrintOrientation?): Unit {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_PageSizeDimensions(): Size? {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun IsPageSizeSupported(pageSize: PrintMediaSize?,
        pageOrientation: PrintOrientation?): Boolean {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr, marshalToNative(pageSize),
          marshalToNative(pageOrientation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_MaxNumberOfPages(): WinDef.UINT {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_MaxNumberOfPages(value: WinDef.UINT): Unit {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_CanScanDuplex(): Boolean {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_Duplex(): Boolean {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_Duplex(value: Boolean): Unit {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_CanScanAhead(): Boolean {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_ScanAhead(): Boolean {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_ScanAhead(value: Boolean): Unit {
      val fnPtr = _1068430896_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1068430896_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IImageScannerFeederConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IImageScannerFormatConfiguration, IImageScannerSourceConfiguration {
    public override val __787293148_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1068430896_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __340313728_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IImageScannerSourceConfiguration.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1068430896_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1068430896_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageScannerFeederConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74bdaceefa974c17828040e39c6dcc67")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageScannerFeederConfiguration(ptr: Pointer?): WithDefault =
        IImageScannerFeederConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageScannerFeederConfiguration {
      val address = segment.toRawLongValue()
      return makeIImageScannerFeederConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IImageScannerFeederConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1068430896_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageScannerFeederConfiguration):
        Array<IImageScannerFeederConfiguration?> = (elements as
        Array<IImageScannerFeederConfiguration?>).castToImpl<IImageScannerFeederConfiguration,IImageScannerFeederConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageScannerFeederConfiguration?> =
        arrayOfNulls<IImageScannerFeederConfiguration_Impl>(size) as
        Array<IImageScannerFeederConfiguration?>
  }
}
