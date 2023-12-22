package Windows.Media.Devices

import Windows.Foundation.Rect
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

@ABIMarker(IRegionOfInterest.ABI::class)
@Signature("{e5ecc834-ce66-4e05-a78f-cf391a5ec2d1}")
@Guid("e5ecc834ce664e05a78fcf391a5ec2d1")
@WinRTInterface("e5ecc834ce664e05a78fcf391a5ec2d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRegionOfInterest.ByReference::class)
public interface IRegionOfInterest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutoFocusEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_AutoFocusEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_AutoWhiteBalanceEnabled(): Boolean

  @InterfaceMethod(3)
  public fun put_AutoWhiteBalanceEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_AutoExposureEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_AutoExposureEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_Bounds(): Rect?

  @InterfaceMethod(7)
  public fun put_Bounds(value: Rect?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRegionOfInterest> {
    public override fun getValue() = ABI.makeIRegionOfInterest(pointer.getPointer(0))

    public fun setValue(value: IRegionOfInterest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRegionOfInterest {
    public val __1999242070_Ptr: Pointer?

    public val _1999242070_VtblPtr: Pointer?
      get() = __1999242070_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutoFocusEnabled(): Boolean {
      val fnPtr = _1999242070_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1999242070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AutoFocusEnabled(value: Boolean): Unit {
      val fnPtr = _1999242070_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1999242070_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AutoWhiteBalanceEnabled(): Boolean {
      val fnPtr = _1999242070_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1999242070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AutoWhiteBalanceEnabled(value: Boolean): Unit {
      val fnPtr = _1999242070_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1999242070_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AutoExposureEnabled(): Boolean {
      val fnPtr = _1999242070_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1999242070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AutoExposureEnabled(value: Boolean): Unit {
      val fnPtr = _1999242070_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1999242070_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Bounds(): Rect? {
      val fnPtr = _1999242070_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1999242070_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Bounds(value: Rect?): Unit {
      val fnPtr = _1999242070_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1999242070_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRegionOfInterest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1999242070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRegionOfInterest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5ecc834ce664e05a78fcf391a5ec2d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRegionOfInterest(ptr: Pointer?): WithDefault = IRegionOfInterest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRegionOfInterest {
      val address = segment.toRawLongValue()
      return makeIRegionOfInterest(Pointer(address))
    }

    public override fun toNative(obj: IRegionOfInterest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1999242070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRegionOfInterest): Array<IRegionOfInterest?> = (elements
        as Array<IRegionOfInterest?>).castToImpl<IRegionOfInterest,IRegionOfInterest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRegionOfInterest?> =
        arrayOfNulls<IRegionOfInterest_Impl>(size) as Array<IRegionOfInterest?>
  }
}
