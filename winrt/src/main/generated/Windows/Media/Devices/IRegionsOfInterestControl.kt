package Windows.Media.Devices

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IRegionsOfInterestControl.ABI::class)
@Signature("{c323f527-ab0b-4558-8b5b-df5693db0378}")
@Guid("c323f527ab0b45588b5bdf5693db0378")
@WinRTInterface("c323f527ab0b45588b5bdf5693db0378")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRegionsOfInterestControl.ByReference::class)
public interface IRegionsOfInterestControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxRegions(): WinDef.UINT

  @InterfaceMethod(1)
  public fun SetRegionsAsync(regions: IIterable<RegionOfInterest?>?): IAsyncAction?

  @InterfaceMethod(2)
  public fun SetRegionsAsync(regions: IIterable<RegionOfInterest?>?, lockValues: Boolean):
      IAsyncAction?

  @InterfaceMethod(3)
  public fun ClearRegionsAsync(): IAsyncAction?

  @InterfaceMethod(4)
  public fun get_AutoFocusSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_AutoWhiteBalanceSupported(): Boolean

  @InterfaceMethod(6)
  public fun get_AutoExposureSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRegionsOfInterestControl> {
    public override fun getValue() = ABI.makeIRegionsOfInterestControl(pointer.getPointer(0))

    public fun setValue(value: IRegionsOfInterestControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRegionsOfInterestControl {
    public val __683214882_Ptr: Pointer?

    public val _683214882_VtblPtr: Pointer?
      get() = __683214882_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxRegions(): WinDef.UINT {
      val fnPtr = _683214882_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__683214882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun SetRegionsAsync(regions: IIterable<RegionOfInterest?>?): IAsyncAction? {
      val fnPtr = _683214882_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__683214882_Ptr, marshalToNative(regions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetRegionsAsync(regions: IIterable<RegionOfInterest?>?,
        lockValues: Boolean): IAsyncAction? {
      val fnPtr = _683214882_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__683214882_Ptr, marshalToNative(regions), lockValues, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ClearRegionsAsync(): IAsyncAction? {
      val fnPtr = _683214882_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__683214882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AutoFocusSupported(): Boolean {
      val fnPtr = _683214882_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__683214882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_AutoWhiteBalanceSupported(): Boolean {
      val fnPtr = _683214882_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__683214882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_AutoExposureSupported(): Boolean {
      val fnPtr = _683214882_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__683214882_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRegionsOfInterestControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __683214882_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRegionsOfInterestControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c323f527ab0b45588b5bdf5693db0378")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRegionsOfInterestControl(ptr: Pointer?): WithDefault =
        IRegionsOfInterestControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRegionsOfInterestControl {
      val address = segment.toRawLongValue()
      return makeIRegionsOfInterestControl(Pointer(address))
    }

    public override fun toNative(obj: IRegionsOfInterestControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__683214882_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRegionsOfInterestControl):
        Array<IRegionsOfInterestControl?> = (elements as
        Array<IRegionsOfInterestControl?>).castToImpl<IRegionsOfInterestControl,IRegionsOfInterestControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRegionsOfInterestControl?> =
        arrayOfNulls<IRegionsOfInterestControl_Impl>(size) as Array<IRegionsOfInterestControl?>
  }
}
