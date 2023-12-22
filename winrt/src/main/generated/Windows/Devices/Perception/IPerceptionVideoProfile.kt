package Windows.Devices.Perception

import Windows.Foundation.TimeSpan
import Windows.Graphics.Imaging.BitmapAlphaMode
import Windows.Graphics.Imaging.BitmapPixelFormat
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

@ABIMarker(IPerceptionVideoProfile.ABI::class)
@Signature("{75763ea3-011a-470e-8225-6f05ade25648}")
@Guid("75763ea3011a470e82256f05ade25648")
@WinRTInterface("75763ea3011a470e82256f05ade25648")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionVideoProfile.ByReference::class)
public interface IPerceptionVideoProfile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BitmapPixelFormat(): BitmapPixelFormat?

  @InterfaceMethod(1)
  public fun get_BitmapAlphaMode(): BitmapAlphaMode?

  @InterfaceMethod(2)
  public fun get_Width(): Int

  @InterfaceMethod(3)
  public fun get_Height(): Int

  @InterfaceMethod(4)
  public fun get_FrameDuration(): TimeSpan?

  @InterfaceMethod(5)
  public fun IsEqual(other: PerceptionVideoProfile?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionVideoProfile> {
    public override fun getValue() = ABI.makeIPerceptionVideoProfile(pointer.getPointer(0))

    public fun setValue(value: IPerceptionVideoProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionVideoProfile {
    public val __460244091_Ptr: Pointer?

    public val _460244091_VtblPtr: Pointer?
      get() = __460244091_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BitmapPixelFormat(): BitmapPixelFormat? {
      val fnPtr = _460244091_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPixelFormat>()
      val hr = fn.invokeHR(arrayOf(__460244091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPixelFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BitmapAlphaMode(): BitmapAlphaMode? {
      val fnPtr = _460244091_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapAlphaMode>()
      val hr = fn.invokeHR(arrayOf(__460244091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapAlphaMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Width(): Int {
      val fnPtr = _460244091_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__460244091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Height(): Int {
      val fnPtr = _460244091_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__460244091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_FrameDuration(): TimeSpan? {
      val fnPtr = _460244091_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__460244091_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun IsEqual(other: PerceptionVideoProfile?): Boolean {
      val fnPtr = _460244091_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__460244091_Ptr, marshalToNative(other), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IPerceptionVideoProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __460244091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionVideoProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75763ea3011a470e82256f05ade25648")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionVideoProfile(ptr: Pointer?): WithDefault =
        IPerceptionVideoProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionVideoProfile {
      val address = segment.toRawLongValue()
      return makeIPerceptionVideoProfile(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionVideoProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__460244091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionVideoProfile): Array<IPerceptionVideoProfile?>
        = (elements as
        Array<IPerceptionVideoProfile?>).castToImpl<IPerceptionVideoProfile,IPerceptionVideoProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionVideoProfile?> =
        arrayOfNulls<IPerceptionVideoProfile_Impl>(size) as Array<IPerceptionVideoProfile?>
  }
}
