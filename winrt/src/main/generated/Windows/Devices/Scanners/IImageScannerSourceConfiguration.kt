package Windows.Devices.Scanners

import Windows.Devices.Scanners.IImageScannerFormatConfiguration.ABI.IID
import Windows.Foundation.Rect
import Windows.Foundation.Size
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

@ABIMarker(IImageScannerSourceConfiguration.ABI::class)
@Signature("{bfb50055-0b44-4c82-9e89-205f9c234e59}")
@Guid("bfb500550b444c829e89205f9c234e59")
@WinRTInterface("bfb500550b444c829e89205f9c234e59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageScannerSourceConfiguration.ByReference::class)
public interface IImageScannerSourceConfiguration : NativeMapped, IWinRTInterface,
    IImageScannerFormatConfiguration {
  @InterfaceMethod(0)
  public fun get_MinScanArea(): Size?

  @InterfaceMethod(1)
  public fun get_MaxScanArea(): Size?

  @InterfaceMethod(2)
  public fun get_SelectedScanRegion(): Rect?

  @InterfaceMethod(3)
  public fun put_SelectedScanRegion(value: Rect?): Unit

  @InterfaceMethod(4)
  public fun get_AutoCroppingMode(): ImageScannerAutoCroppingMode?

  @InterfaceMethod(5)
  public fun put_AutoCroppingMode(value: ImageScannerAutoCroppingMode?): Unit

  @InterfaceMethod(6)
  public fun IsAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode?): Boolean

  @InterfaceMethod(7)
  public fun get_MinResolution(): ImageScannerResolution?

  @InterfaceMethod(8)
  public fun get_MaxResolution(): ImageScannerResolution?

  @InterfaceMethod(9)
  public fun get_OpticalResolution(): ImageScannerResolution?

  @InterfaceMethod(10)
  public fun get_DesiredResolution(): ImageScannerResolution?

  @InterfaceMethod(11)
  public fun put_DesiredResolution(value: ImageScannerResolution?): Unit

  @InterfaceMethod(12)
  public fun get_ActualResolution(): ImageScannerResolution?

  @InterfaceMethod(13)
  public fun get_DefaultColorMode(): ImageScannerColorMode?

  @InterfaceMethod(14)
  public fun get_ColorMode(): ImageScannerColorMode?

  @InterfaceMethod(15)
  public fun put_ColorMode(value: ImageScannerColorMode?): Unit

  @InterfaceMethod(16)
  public fun IsColorModeSupported(value: ImageScannerColorMode?): Boolean

  @InterfaceMethod(17)
  public fun get_MinBrightness(): Int

  @InterfaceMethod(18)
  public fun get_MaxBrightness(): Int

  @InterfaceMethod(19)
  public fun get_BrightnessStep(): WinDef.UINT

  @InterfaceMethod(20)
  public fun get_DefaultBrightness(): Int

  @InterfaceMethod(21)
  public fun get_Brightness(): Int

  @InterfaceMethod(22)
  public fun put_Brightness(value: Int): Unit

  @InterfaceMethod(23)
  public fun get_MinContrast(): Int

  @InterfaceMethod(24)
  public fun get_MaxContrast(): Int

  @InterfaceMethod(25)
  public fun get_ContrastStep(): WinDef.UINT

  @InterfaceMethod(26)
  public fun get_DefaultContrast(): Int

  @InterfaceMethod(27)
  public fun get_Contrast(): Int

  @InterfaceMethod(28)
  public fun put_Contrast(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageScannerSourceConfiguration> {
    public override fun getValue() = ABI.makeIImageScannerSourceConfiguration(pointer.getPointer(0))

    public fun setValue(value: IImageScannerSourceConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageScannerSourceConfiguration,
      IImageScannerFormatConfiguration.WithDefault {
    public val __340313728_Ptr: Pointer?

    public val _340313728_VtblPtr: Pointer?
      get() = __340313728_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MinScanArea(): Size? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxScanArea(): Size? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SelectedScanRegion(): Rect? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SelectedScanRegion(value: Rect?): Unit {
      val fnPtr = _340313728_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AutoCroppingMode(): ImageScannerAutoCroppingMode? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerAutoCroppingMode>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerAutoCroppingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_AutoCroppingMode(value: ImageScannerAutoCroppingMode?): Unit {
      val fnPtr = _340313728_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun IsAutoCroppingModeSupported(value: ImageScannerAutoCroppingMode?): Boolean {
      val fnPtr = _340313728_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_MinResolution(): ImageScannerResolution? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerResolution>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerResolution>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_MaxResolution(): ImageScannerResolution? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerResolution>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerResolution>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_OpticalResolution(): ImageScannerResolution? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerResolution>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerResolution>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_DesiredResolution(): ImageScannerResolution? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerResolution>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerResolution>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DesiredResolution(value: ImageScannerResolution?): Unit {
      val fnPtr = _340313728_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ActualResolution(): ImageScannerResolution? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerResolution>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerResolution>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_DefaultColorMode(): ImageScannerColorMode? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerColorMode>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerColorMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_ColorMode(): ImageScannerColorMode? {
      val fnPtr = _340313728_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerColorMode>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerColorMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ColorMode(value: ImageScannerColorMode?): Unit {
      val fnPtr = _340313728_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun IsColorModeSupported(value: ImageScannerColorMode?): Boolean {
      val fnPtr = _340313728_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_MinBrightness(): Int {
      val fnPtr = _340313728_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun get_MaxBrightness(): Int {
      val fnPtr = _340313728_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun get_BrightnessStep(): WinDef.UINT {
      val fnPtr = _340313728_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(20)
    public override fun get_DefaultBrightness(): Int {
      val fnPtr = _340313728_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun get_Brightness(): Int {
      val fnPtr = _340313728_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(22)
    public override fun put_Brightness(value: Int): Unit {
      val fnPtr = _340313728_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_MinContrast(): Int {
      val fnPtr = _340313728_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun get_MaxContrast(): Int {
      val fnPtr = _340313728_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun get_ContrastStep(): WinDef.UINT {
      val fnPtr = _340313728_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun get_DefaultContrast(): Int {
      val fnPtr = _340313728_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun get_Contrast(): Int {
      val fnPtr = _340313728_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(28)
    public override fun put_Contrast(value: Int): Unit {
      val fnPtr = _340313728_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__340313728_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IImageScannerSourceConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IImageScannerFormatConfiguration
      {
    public override val __787293148_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_340313728_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __340313728_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageScannerSourceConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bfb500550b444c829e89205f9c234e59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageScannerSourceConfiguration(ptr: Pointer?): WithDefault =
        IImageScannerSourceConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageScannerSourceConfiguration {
      val address = segment.toRawLongValue()
      return makeIImageScannerSourceConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IImageScannerSourceConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__340313728_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageScannerSourceConfiguration):
        Array<IImageScannerSourceConfiguration?> = (elements as
        Array<IImageScannerSourceConfiguration?>).castToImpl<IImageScannerSourceConfiguration,IImageScannerSourceConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageScannerSourceConfiguration?> =
        arrayOfNulls<IImageScannerSourceConfiguration_Impl>(size) as
        Array<IImageScannerSourceConfiguration?>
  }
}
