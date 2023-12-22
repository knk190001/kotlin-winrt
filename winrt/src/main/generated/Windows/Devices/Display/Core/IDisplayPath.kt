package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IReference
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.SizeInt32
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayPath.ABI::class)
@Signature("{b3dfd64a-7460-5cde-811b-d5ae9f3d9f84}")
@Guid("b3dfd64a74605cde811bd5ae9f3d9f84")
@WinRTInterface("b3dfd64a74605cde811bd5ae9f3d9f84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayPath.ByReference::class)
public interface IDisplayPath : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_View(): DisplayView?

  @InterfaceMethod(1)
  public fun get_Target(): DisplayTarget?

  @InterfaceMethod(2)
  public fun get_Status(): DisplayPathStatus?

  @InterfaceMethod(3)
  public fun get_SourceResolution(): IReference<SizeInt32?>?

  @InterfaceMethod(4)
  public fun put_SourceResolution(value: IReference<SizeInt32?>?): Unit

  @InterfaceMethod(5)
  public fun get_SourcePixelFormat(): DirectXPixelFormat?

  @InterfaceMethod(6)
  public fun put_SourcePixelFormat(value: DirectXPixelFormat?): Unit

  @InterfaceMethod(7)
  public fun get_IsStereo(): Boolean

  @InterfaceMethod(8)
  public fun put_IsStereo(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_TargetResolution(): IReference<SizeInt32?>?

  @InterfaceMethod(10)
  public fun put_TargetResolution(value: IReference<SizeInt32?>?): Unit

  @InterfaceMethod(11)
  public fun get_PresentationRate(): IReference<DisplayPresentationRate?>?

  @InterfaceMethod(12)
  public fun put_PresentationRate(value: IReference<DisplayPresentationRate?>?): Unit

  @InterfaceMethod(13)
  public fun get_IsInterlaced(): IReference<Boolean>?

  @InterfaceMethod(14)
  public fun put_IsInterlaced(value: IReference<Boolean>?): Unit

  @InterfaceMethod(15)
  public fun get_WireFormat(): DisplayWireFormat?

  @InterfaceMethod(16)
  public fun put_WireFormat(value: DisplayWireFormat?): Unit

  @InterfaceMethod(17)
  public fun get_Rotation(): DisplayRotation?

  @InterfaceMethod(18)
  public fun put_Rotation(value: DisplayRotation?): Unit

  @InterfaceMethod(19)
  public fun get_Scaling(): DisplayPathScaling?

  @InterfaceMethod(20)
  public fun put_Scaling(value: DisplayPathScaling?): Unit

  @InterfaceMethod(21)
  public fun FindModes(flags: DisplayModeQueryOptions?): IVectorView<DisplayModeInfo?>?

  @InterfaceMethod(22)
  public fun ApplyPropertiesFromMode(modeResult: DisplayModeInfo?): Unit

  @InterfaceMethod(23)
  public fun get_Properties(): IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayPath> {
    public override fun getValue() = ABI.makeIDisplayPath(pointer.getPointer(0))

    public fun setValue(value: IDisplayPath_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayPath {
    public val __620073147_Ptr: Pointer?

    public val _620073147_VtblPtr: Pointer?
      get() = __620073147_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_View(): DisplayView? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayView>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Target(): DisplayTarget? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayTarget>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayTarget>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Status(): DisplayPathStatus? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPathStatus>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPathStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SourceResolution(): IReference<SizeInt32?>? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<SizeInt32?>>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<SizeInt32?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_SourceResolution(value: IReference<SizeInt32?>?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_SourcePixelFormat(): DirectXPixelFormat? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DirectXPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DirectXPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_SourcePixelFormat(value: DirectXPixelFormat?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_IsStereo(): Boolean {
      val fnPtr = _620073147_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_IsStereo(value: Boolean): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_TargetResolution(): IReference<SizeInt32?>? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<SizeInt32?>>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<SizeInt32?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_TargetResolution(value: IReference<SizeInt32?>?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_PresentationRate(): IReference<DisplayPresentationRate?>? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<DisplayPresentationRate?>>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<DisplayPresentationRate?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_PresentationRate(value: IReference<DisplayPresentationRate?>?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_IsInterlaced(): IReference<Boolean>? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_IsInterlaced(value: IReference<Boolean>?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_WireFormat(): DisplayWireFormat? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayWireFormat>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayWireFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun put_WireFormat(value: DisplayWireFormat?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_Rotation(): DisplayRotation? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayRotation>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayRotation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun put_Rotation(value: DisplayRotation?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_Scaling(): DisplayPathScaling? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPathScaling>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPathScaling>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun put_Scaling(value: DisplayPathScaling?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun FindModes(flags: DisplayModeQueryOptions?): IVectorView<DisplayModeInfo?>? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayModeInfo?>>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(flags), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayModeInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun ApplyPropertiesFromMode(modeResult: DisplayModeInfo?): Unit {
      val fnPtr = _620073147_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr, marshalToNative(modeResult),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun get_Properties(): IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>? {
      val fnPtr = _620073147_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__620073147_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayPath_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __620073147_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayPath, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3dfd64a74605cde811bd5ae9f3d9f84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayPath(ptr: Pointer?): WithDefault = IDisplayPath_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayPath {
      val address = segment.toRawLongValue()
      return makeIDisplayPath(Pointer(address))
    }

    public override fun toNative(obj: IDisplayPath): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__620073147_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayPath): Array<IDisplayPath?> = (elements as
        Array<IDisplayPath?>).castToImpl<IDisplayPath,IDisplayPath_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayPath?> =
        arrayOfNulls<IDisplayPath_Impl>(size) as Array<IDisplayPath?>
  }
}
