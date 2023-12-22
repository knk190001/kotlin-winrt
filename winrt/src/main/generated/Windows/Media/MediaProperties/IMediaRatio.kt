package Windows.Media.MediaProperties

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

@ABIMarker(IMediaRatio.ABI::class)
@Signature("{d2d0fee5-8929-401d-ac78-7d357e378163}")
@Guid("d2d0fee58929401dac787d357e378163")
@WinRTInterface("d2d0fee58929401dac787d357e378163")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaRatio.ByReference::class)
public interface IMediaRatio : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Numerator(value: WinDef.UINT): Unit

  @InterfaceMethod(1)
  public fun get_Numerator(): WinDef.UINT

  @InterfaceMethod(2)
  public fun put_Denominator(value: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun get_Denominator(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaRatio> {
    public override fun getValue() = ABI.makeIMediaRatio(pointer.getPointer(0))

    public fun setValue(value: IMediaRatio_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaRatio {
    public val __697096654_Ptr: Pointer?

    public val _697096654_VtblPtr: Pointer?
      get() = __697096654_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Numerator(value: WinDef.UINT): Unit {
      val fnPtr = _697096654_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697096654_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Numerator(): WinDef.UINT {
      val fnPtr = _697096654_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__697096654_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Denominator(value: WinDef.UINT): Unit {
      val fnPtr = _697096654_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__697096654_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Denominator(): WinDef.UINT {
      val fnPtr = _697096654_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__697096654_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IMediaRatio_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __697096654_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaRatio, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2d0fee58929401dac787d357e378163")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaRatio(ptr: Pointer?): WithDefault = IMediaRatio_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaRatio {
      val address = segment.toRawLongValue()
      return makeIMediaRatio(Pointer(address))
    }

    public override fun toNative(obj: IMediaRatio): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__697096654_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaRatio): Array<IMediaRatio?> = (elements as
        Array<IMediaRatio?>).castToImpl<IMediaRatio,IMediaRatio_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaRatio?> =
        arrayOfNulls<IMediaRatio_Impl>(size) as Array<IMediaRatio?>
  }
}
